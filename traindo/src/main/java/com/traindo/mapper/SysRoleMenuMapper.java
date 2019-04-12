package com.traindo.mapper;

import com.traindo.mapper.entity.SysRoleMenu;

public interface SysRoleMenuMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysRoleMenu record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysRoleMenu record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysRoleMenu selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysRoleMenu record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysRoleMenu record);
}