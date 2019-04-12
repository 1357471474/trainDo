package com.traindo.mapper.entity;

import java.util.Date;

public class SysTask {
    /**
     * 
     */
    private Long id;

    /**
     * cron表达式
     */
    private String cronExpression;

    /**
     * 任务调用的方法名
     */
    private String methodName;

    /**
     * 任务是否有状态
     */
    private String isConcurrent;

    /**
     * 任务描述
     */
    private String description;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 任务执行时调用哪个类的方法 包名+类名
     */
    private String beanClass;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 任务状态
     */
    private String jobStatus;

    /**
     * 任务分组
     */
    private String jobGroup;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * Spring bean
     */
    private String springBean;

    /**
     * 任务名
     */
    private String jobName;

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
     * cron表达式
     * @return cron_expression cron表达式
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * cron表达式
     * @param cronExpression cron表达式
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * 任务调用的方法名
     * @return method_name 任务调用的方法名
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 任务调用的方法名
     * @param methodName 任务调用的方法名
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * 任务是否有状态
     * @return is_concurrent 任务是否有状态
     */
    public String getIsConcurrent() {
        return isConcurrent;
    }

    /**
     * 任务是否有状态
     * @param isConcurrent 任务是否有状态
     */
    public void setIsConcurrent(String isConcurrent) {
        this.isConcurrent = isConcurrent;
    }

    /**
     * 任务描述
     * @return description 任务描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 任务描述
     * @param description 任务描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 更新者
     * @return update_by 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新者
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 任务执行时调用哪个类的方法 包名+类名
     * @return bean_class 任务执行时调用哪个类的方法 包名+类名
     */
    public String getBeanClass() {
        return beanClass;
    }

    /**
     * 任务执行时调用哪个类的方法 包名+类名
     * @param beanClass 任务执行时调用哪个类的方法 包名+类名
     */
    public void setBeanClass(String beanClass) {
        this.beanClass = beanClass;
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

    /**
     * 任务状态
     * @return job_status 任务状态
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * 任务状态
     * @param jobStatus 任务状态
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * 任务分组
     * @return job_group 任务分组
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * 任务分组
     * @param jobGroup 任务分组
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * 更新时间
     * @return update_date 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 创建者
     * @return create_by 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建者
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * Spring bean
     * @return spring_bean Spring bean
     */
    public String getSpringBean() {
        return springBean;
    }

    /**
     * Spring bean
     * @param springBean Spring bean
     */
    public void setSpringBean(String springBean) {
        this.springBean = springBean;
    }

    /**
     * 任务名
     * @return job_name 任务名
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 任务名
     * @param jobName 任务名
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}