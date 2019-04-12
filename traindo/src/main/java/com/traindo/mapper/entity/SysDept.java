package com.traindo.mapper.entity;

public class SysDept {
    /**
     * 
     */
    private Long deptId;

    /**
     * 上级部门ID，一级部门为0
     */
    private Long parentId;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * 是否删除  0：已删除  1：正常
     */
    private Byte delFlag;

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
     * 上级部门ID，一级部门为0
     * @return parent_id 上级部门ID，一级部门为0
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 上级部门ID，一级部门为0
     * @param parentId 上级部门ID，一级部门为0
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 部门名称
     * @return name 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 部门名称
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 排序
     * @return order_num 排序
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 排序
     * @param orderNum 排序
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 是否删除  0：已删除  1：正常
     * @return del_flag 是否删除  0：已删除  1：正常
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * 是否删除  0：已删除  1：正常
     * @param delFlag 是否删除  0：已删除  1：正常
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}