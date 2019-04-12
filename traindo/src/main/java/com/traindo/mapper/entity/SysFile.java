package com.traindo.mapper.entity;

import java.util.Date;

public class SysFile {
    /**
     * 
     */
    private Long id;

    /**
     * 文件类型
     */
    private Integer type;

    /**
     * URL地址
     */
    private String url;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 文件类型
     * @return type 文件类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 文件类型
     * @param type 文件类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * URL地址
     * @return url URL地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * URL地址
     * @param url URL地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}