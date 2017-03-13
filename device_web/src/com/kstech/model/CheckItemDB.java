package com.kstech.model;

public class CheckItemDB {
    private Integer itemId;

    private Integer excId;

    private String excName;

    private String itemName;

    private String paramData;

    private Integer itemSkip;

    private String itemDesc;

    private Integer itemChecktimes;

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

    public Integer getItemChecktimes() {
        return itemChecktimes;
    }

    public void setItemChecktimes(Integer itemChecktimes) {
        this.itemChecktimes = itemChecktimes;
    }
}