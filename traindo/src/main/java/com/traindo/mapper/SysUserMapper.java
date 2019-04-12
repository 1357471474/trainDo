package com.traindo.mapper;

import com.traindo.mapper.entity.SysUser;

public interface SysUserMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long userId);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysUser record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysUser record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysUser selectByPrimaryKey(Long userId);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysUser record);

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
	SysUser getUserByName(String username);
}