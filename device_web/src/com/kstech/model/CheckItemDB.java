package com.kstech.model;

import java.util.Date;

public class CheckItemDB {
	//�����Ŀid
    private Integer itemId;
    
    //���ͼ���¼ID
    private Integer excId;
    
    //����¼����
    private String excName;
    
    //�����Ŀ����
    private String itemName;
    
    //�����Ŀ�������� json��ʽ 
    private String paramData;
    
    //�ü����Ŀ�Ƿ��������  0δ���� ��1 ����
    private Integer itemSkip;
    
    //������ ��д����ԭ��
    private String itemDesc;
    
    //�����Ŀ���ʱ��
    private Date itemChecktime;
    
    //�����Ŀ�ļ�����
    private Integer itemTimes;

    //�����Ŀ�Ľ��ȣ�����PC�� �鿴������
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