package com.kstech.model;

import java.util.Date;

public class CheckRecordDB {
	//���ͼ���¼ID ��һ�����������ļ�����ݶ�Ӧһ�� ���ͼ���¼
    private Integer excId;
    
    //���ͼ���¼���ƣ�һ�������������Ŷ�Ӧ
    private String excName;

    //���������õ��� ����������ϢID ��Device����cfg����
    private Integer deviceId;

    //���������õ��� ����������Ϣ����
    private String deviceNum;

    //����Ա����
    private Integer checkerCode;

    //����Ա����
    private String checkerName;

    //��ǰ���ͼ��״̬ 0��δ��ʼ ��1��δ��� ��2��δ�ϸ� ��3���ϸ� ��4��ǿ�ƺϸ� ��
    private Integer checkExcStatus;

    //�û��ͼ�⿪ʼʱ��
    private Date checkDateStart;

    //�û��ͼ�����ʱ��
    private Date checkDateFinish;

    //���ڸü���¼���������
    private String checkResult;

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

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    public Integer getCheckerCode() {
        return checkerCode;
    }

    public void setCheckerCode(Integer checkerCode) {
        this.checkerCode = checkerCode;
    }

    public String getCheckerName() {
        return checkerName;
    }

    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName == null ? null : checkerName.trim();
    }

    public Integer getCheckExcStatus() {
        return checkExcStatus;
    }

    public void setCheckExcStatus(Integer checkExcStatus) {
        this.checkExcStatus = checkExcStatus;
    }

    public Date getCheckDateStart() {
        return checkDateStart;
    }

    public void setCheckDateStart(Date checkDateStart) {
        this.checkDateStart = checkDateStart;
    }

    public Date getCheckDateFinish() {
        return checkDateFinish;
    }

    public void setCheckDateFinish(Date checkDateFinish) {
        this.checkDateFinish = checkDateFinish;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult == null ? null : checkResult.trim();
    }
}