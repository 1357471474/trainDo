package com.traindo.system.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.traindo.common.Tree;
import com.traindo.mapper.SysMenuMapper;
import com.traindo.mapper.entity.SysMenu;
import com.traindo.system.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

	@Resource
	private SysMenuMapper sysMenuMapper;
	@Override
	public Tree<SysMenu> getList(Long userId) throws Exception {
//		List<SysMenu> menu = sysMenuMapper.getList(userId);
		return null;
	}

}
