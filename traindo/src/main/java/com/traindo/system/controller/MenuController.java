package com.traindo.system.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traindo.common.Json;
import com.traindo.system.service.MenuService;

/**
 * 菜单控制器
 * @author zfg
 * @date 2019年3月19日
 */
@RestController
@RequestMapping("/sys/menu")
public class MenuController {

	@Resource
	private MenuService menuService;
	
	/**
	 * 根据用户获取对应的菜单列表
	 * @param userId
	 * @return
	 */
	@RequestMapping("/getList")
	public Json getList(HttpServletRequest request) {
		Json json = new Json();
		try {
			HttpSession session = request.getSession();
			json.setObj(menuService.getList((Long)session.getAttribute("loginUserId")));
			json.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
		}
		return json;
	}
}
