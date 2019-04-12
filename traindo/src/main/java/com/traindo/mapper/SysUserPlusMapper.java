package com.traindo.mapper;

import com.traindo.mapper.entity.SysUserPlus;

public interface SysUserPlusMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysUserPlus record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysUserPlus record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysUserPlus selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysUserPlus record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysUserPlus record);
}