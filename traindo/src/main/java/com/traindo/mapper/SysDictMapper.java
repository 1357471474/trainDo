package com.traindo.mapper;

import com.traindo.mapper.entity.SysDict;

public interface SysDictMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysDict record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysDict record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysDict selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysDict record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysDict record);
}