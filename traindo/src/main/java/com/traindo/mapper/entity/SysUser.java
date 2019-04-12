package com.traindo.mapper.entity;

import java.util.Date;

public class SysUser {
    /**
     * 
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 
     */
    private Long deptId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态 0:禁用，1:正常
     */
    private Byte status;

    /**
     * 创建用户id
     */
    private Long userIdCreate;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 性别
     */
    private Long sex;

    /**
     * 出身日期
     */
    private Date birth;

    /**
     * 
     */
    private Long picId;

    /**
     * 现居住地
     */
    private String liveAddress;

    /**
     * 爱好
     */
    private String hobby;

    /**
     * 省份
     */
    private String province;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 所在地区
     */
    private String district;

    /**
     * 
     * @return user_id 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
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
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return dept_id 
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 
     * @param deptId 
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 手机号
     * @return mobile 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 状态 0:禁用，1:正常
     * @return status 状态 0:禁用，1:正常
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态 0:禁用，1:正常
     * @param status 状态 0:禁用，1:正常
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 创建用户id
     * @return user_id_create 创建用户id
     */
    public Long getUserIdCreate() {
        return userIdCreate;
    }

    /**
     * 创建用户id
     * @param userIdCreate 创建用户id
     */
    public void setUserIdCreate(Long userIdCreate) {
        this.userIdCreate = userIdCreate;
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

    /**
     * 修改时间
     * @return gmt_modified 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 修改时间
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 性别
     * @return sex 性别
     */
    public Long getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(Long sex) {
        this.sex = sex;
    }

    /**
     * 出身日期
     * @return birth 出身日期
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 出身日期
     * @param birth 出身日期
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * 
     * @return pic_id 
     */
    public Long getPicId() {
        return picId;
    }

    /**
     * 
     * @param picId 
     */
    public void setPicId(Long picId) {
        this.picId = picId;
    }

    /**
     * 现居住地
     * @return live_address 现居住地
     */
    public String getLiveAddress() {
        return liveAddress;
    }

    /**
     * 现居住地
     * @param liveAddress 现居住地
     */
    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    /**
     * 爱好
     * @return hobby 爱好
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 爱好
     * @param hobby 爱好
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * 省份
     * @return province 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省份
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 所在城市
     * @return city 所在城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 所在城市
     * @param city 所在城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 所在地区
     * @return district 所在地区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 所在地区
     * @param district 所在地区
     */
    public void setDistrict(String district) {
        this.district = district;
    }
}