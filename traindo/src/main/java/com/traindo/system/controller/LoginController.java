package com.traindo.system.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traindo.common.Json;
import com.traindo.common.PassToken;
import com.traindo.mapper.entity.SysUser;
import com.traindo.system.service.LoginService;

/**
 * 登录
 * @author zfg
 * @date 2019年3月18日
 */
@RestController
@RequestMapping("/api")
public class LoginController {

	
	@Resource
	private LoginService loginService;
	
	/**
	 * 登录
	 * @param request
	 * @param username
	 * @param password
	 * @return
	 */
	@PassToken
	@RequestMapping("/login")
	public Json login(HttpServletRequest request,String username,String password) {
		Json json = new Json();
		try {
			SysUser user = loginService.login(request,username,password);
			json.setObj(user);
	        json.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
		}
		return json;
	}
	
	/**
	 * 登出
	 * 
	 * @param request
	 * @param inData
	 * @return
	 * @throws Exception
	 */
	@PassToken
	@RequestMapping("/loginOut")
	public Json loginOut(HttpServletRequest request, SysUser inData) throws Exception {
		Json json = new Json();
		try {
			loginService.loginOut(request,inData);
			json.setSuccess(true);
		} catch (Exception e) {
			e.getMessage();
			json.setMsg("退出失败！");
		}
		return json;
	}
	
	@RequestMapping("/getUserInfo")
    public Json get(long userId){
		Json json = new Json();
		json.setMsg("成功!");
		json.setSuccess(true);
		return json;
    }
	
}
