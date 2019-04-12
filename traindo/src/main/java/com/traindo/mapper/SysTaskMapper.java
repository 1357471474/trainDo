package com.traindo.mapper;

import com.traindo.mapper.entity.SysTask;

public interface SysTaskMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysTask record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysTask record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysTask selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysTask record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysTask record);
}