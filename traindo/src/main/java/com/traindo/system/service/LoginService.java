package com.traindo.system.service;

import javax.servlet.http.HttpServletRequest;

import com.traindo.mapper.entity.SysUser;

public interface LoginService {

	/**
	 * 登录
	 * @param username
	 * @param password
	 * @throws Exception
	 */
	SysUser login(HttpServletRequest request,String username, String password) throws Exception;

	/**
	 * 登出
	 * @param request
	 * @param inData
	 * @throws Exception
	 */
	void loginOut(HttpServletRequest request, SysUser inData) throws Exception;

}
