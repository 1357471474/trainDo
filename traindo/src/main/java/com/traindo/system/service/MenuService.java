package com.traindo.system.service;

import com.traindo.common.Tree;
import com.traindo.mapper.entity.SysMenu;

public interface MenuService {

	/**
	 * 根据人员获取菜单列表
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	Tree<SysMenu> getList(Long userId) throws Exception;

}
