package com.traindo.mapper;

import com.traindo.mapper.entity.SysFile;

public interface SysFileMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SysFile record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SysFile record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    SysFile selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKeySelective(SysFile record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int updateByPrimaryKey(SysFile record);
}