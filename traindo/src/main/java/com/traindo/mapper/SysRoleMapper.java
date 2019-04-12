package com.traindo.mapper;

import com.traindo.mapper.entity.SysRole;

public interface SysRoleMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long roleId);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysRole record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysRole record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysRole selectByPrimaryKey(Long roleId);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysRole record);
}