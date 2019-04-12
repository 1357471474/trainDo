package com.traindo.mapper.entity;

import java.util.Date;

public class SysLog {
    /**
     * 
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户操作
     */
    private String operation;

    /**
     * 响应时间
     */
    private Integer time;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求参数
     */
    private String params;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 创建时间
     */
    private Date gmtCreate;

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
     * 用户id
     * @return user_id 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 用户名
     * @return username 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 用户操作
     * @return operation 用户操作
     */
    public String getOperation() {
        return operation;
    }

    /**
     * 用户操作
     * @param operation 用户操作
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * 响应时间
     * @return time 响应时间
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 响应时间
     * @param time 响应时间
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 请求方法
     * @return method 请求方法
     */
    public String getMethod() {
        return method;
    }

    /**
     * 请求方法
     * @param method 请求方法
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 请求参数
     * @return params 请求参数
     */
    public String getParams() {
        return params;
    }

    /**
     * 请求参数
     * @param params 请求参数
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * IP地址
     * @return ip IP地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * IP地址
     * @param ip IP地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 创建时间
     * @return gmt_create 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 创建时间
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}