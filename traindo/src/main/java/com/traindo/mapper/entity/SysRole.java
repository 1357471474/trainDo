package com.traindo.mapper.entity;

import java.util.Date;

public class SysRole {
    /**
     * 
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色标识
     */
    private String roleSign;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建用户id
     */
    private Long userIdCreate;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 创建时间
     */
    private Date gmtModified;

    /**
     * 
     * @return role_id 
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 
     * @param roleId 
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 角色名称
     * @return role_name 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 角色标识
     * @return role_sign 角色标识
     */
    public String getRoleSign() {
        return roleSign;
    }

    /**
     * 角色标识
     * @param roleSign 角色标识
     */
    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
     * 创建时间
     * @return gmt_modified 创建时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 创建时间
     * @param gmtModified 创建时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}