package com.qfedu.entity;

import java.io.Serializable;

/**
 * (Score)实体类
 *
 * @author makejava
 * @since 2020-03-31 10:45:59
 */
public class Score implements Serializable {
    private static final long serialVersionUID = 100345657841012463L;
    
    private Integer scId;
    
    private Integer sId;
    
    private Integer suId;
    
    private Double scScore;
    
    private String scDesc;


    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Integer getSuId() {
        return suId;
    }

    public void setSuId(Integer suId) {
        this.suId = suId;
    }

    public Double getScScore() {
        return scScore;
    }

    public void setScScore(Double scScore) {
        this.scScore = scScore;
    }

    public String getScDesc() {
        return scDesc;
    }

    public void setScDesc(String scDesc) {
        this.scDesc = scDesc;
    }

}