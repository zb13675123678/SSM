package com.qfedu.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2020-03-31 10:45:59
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 517660099962669064L;
    
    private Integer sId;
    
    private String sName;
    
    private String sPass;
    
    private String sTel;
    
    private String sAddr;
    
    private Integer sAge;


    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSPass() {
        return sPass;
    }

    public void setSPass(String sPass) {
        this.sPass = sPass;
    }

    public String getSTel() {
        return sTel;
    }

    public void setSTel(String sTel) {
        this.sTel = sTel;
    }

    public String getSAddr() {
        return sAddr;
    }

    public void setSAddr(String sAddr) {
        this.sAddr = sAddr;
    }

    public Integer getSAge() {
        return sAge;
    }

    public void setSAge(Integer sAge) {
        this.sAge = sAge;
    }

}