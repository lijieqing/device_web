package com.kstech.model;

import java.util.Date;

public class CheckItemDB {
	//检测项目id
    private Integer itemId;
    
    //机型检测记录ID
    private Integer excId;
    
    //检测记录名称
    private String excName;
    
    //检测项目名称
    private String itemName;
    
    //检测项目参数数据 json格式 
    private String paramData;
    
    //该检测项目是否跳过检测  0未跳过 。1 跳过
    private Integer itemSkip;
    
    //若跳过 填写跳过原因
    private String itemDesc;
    
    //检测项目完成时间
    private Date itemChecktime;
    
    //检测项目的检测次数
    private Integer itemTimes;

    //检测项目的进度，用于PC端 查看检测情况
    private Integer itemProgress;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getExcId() {
        return excId;
    }

    public void setExcId(Integer excId) {
        this.excId = excId;
    }

    public String getExcName() {
        return excName;
    }

    public void setExcName(String excName) {
        this.excName = excName == null ? null : excName.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }

    public Integer getItemSkip() {
        return itemSkip;
    }

    public void setItemSkip(Integer itemSkip) {
        this.itemSkip = itemSkip;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }

    public Date getItemChecktime() {
        return itemChecktime;
    }

    public void setItemChecktime(Date itemChecktime) {
        this.itemChecktime = itemChecktime;
    }

    public Integer getItemTimes() {
        return itemTimes;
    }

    public void setItemTimes(Integer itemTimes) {
        this.itemTimes = itemTimes;
    }

    public Integer getItemProgress() {
        return itemProgress;
    }

    public void setItemProgress(Integer itemProgress) {
        this.itemProgress = itemProgress;
    }
}