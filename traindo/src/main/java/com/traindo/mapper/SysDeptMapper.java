package com.traindo.mapper;

import com.traindo.mapper.entity.SysDept;

public interface SysDeptMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long deptId);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysDept record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysDept record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysDept selectByPrimaryKey(Long deptId);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysDept record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysDept record);
}