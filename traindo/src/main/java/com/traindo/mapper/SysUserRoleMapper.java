package com.traindo.mapper;

import com.traindo.mapper.entity.SysUserRole;

public interface SysUserRoleMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysUserRole record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysUserRole record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysUserRole selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysUserRole record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysUserRole record);
}