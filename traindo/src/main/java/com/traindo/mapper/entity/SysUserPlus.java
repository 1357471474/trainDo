package com.traindo.mapper.entity;

public class SysUserPlus {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long userId;

    /**
     * 
     */
    private Double payment;

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
     * 
     * @return payment 
     */
    public Double getPayment() {
        return payment;
    }

    /**
     * 
     * @param payment 
     */
    public void setPayment(Double payment) {
        this.payment = payment;
    }
}