package com.traindo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.traindo.mapper.entity.SysMenu;

public interface SysMenuMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long menuId);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysMenu record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysMenu record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysMenu selectByPrimaryKey(Long menuId);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysMenu record);

    /**
     * 获取菜单列表
     * @param userId
     * @return
     */
	List<SysMenu> getList(@Param("userId") Long userId);
}