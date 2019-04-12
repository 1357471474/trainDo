package com.traindo.mapper;

import com.traindo.mapper.entity.SysLog;

public interface SysLogMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysLog record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysLog record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysLog selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysLog record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysLog record);
}