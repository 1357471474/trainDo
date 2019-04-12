package com.traindo.system.service.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import com.traindo.common.RedisUtil;
import com.traindo.common.ServiceException;
import com.traindo.common.TokenUtil;
import com.traindo.mapper.SysUserMapper;
import com.traindo.mapper.entity.SysUser;
import com.traindo.system.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Resource
	private SysUserMapper sysUserMapper;
	@Resource
	private RedisUtil redisUtil;
	
	@Override
	public SysUser login(HttpServletRequest request,String username, String password) throws Exception {
		SysUser user = sysUserMapper.getUserByName(username);
		String salt = "今天你过得好吗？";
		String md5 = DigestUtils.md5Hex(password+salt);
		if(user!=null) {
			//用户数据存在
			 if(!user.getPassword().equals(md5)) {
				//密码不匹配抛出异常
				throw new ServiceException("密码不匹配");
			}else {
				//密码匹配，登录成功(生成token以密码作为密钥)
				user.setPassword(TokenUtil.getToken(user.getUserId().toString(), user.getPassword()));
		        redisUtil.set(user.getUserId().toString(), user, 3600L);
		        return user;
			}
		}else {
			//用户数据不存在抛出异常
			throw new ServiceException("用户还未注册！");
		}
	}
	
	@Override
	public void loginOut(HttpServletRequest request, SysUser inData) throws Exception {
		HttpSession session = request.getSession();
		if (session != null) {
			// 注销session
			session.removeAttribute("loginUserId");
			redisUtil.del(inData.getUserId().toString());
		}else {
			throw new ServiceException("退出失败！");
		}
	}

}
