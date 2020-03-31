package com.qfedu.entity;

import java.io.Serializable;

/**
 * (Subject)实体类
 *
 * @author makejava
 * @since 2020-03-31 10:45:59
 */
public class Subject implements Serializable {
    private static final long serialVersionUID = 672874412658177881L;
    
    private Integer suId;
    
    private String suName;
    
    private Integer suDegree;


    public Integer getSuId() {
        return suId;
    }

    public void setSuId(Integer suId) {
        this.suId = suId;
    }

    public String getSuName() {
        return suName;
    }

    public void setSuName(String suName) {
        this.suName = suName;
    }

    public Integer getSuDegree() {
        return suDegree;
    }

    public void setSuDegree(Integer suDegree) {
        this.suDegree = suDegree;
    }

}