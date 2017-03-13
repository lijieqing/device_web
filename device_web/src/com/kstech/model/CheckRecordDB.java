package com.kstech.model;

import java.util.Date;

public class CheckRecordDB {
    private Integer excId;

    private String excName;

    private Integer deviceId;

    private String deviceNum;

    private Integer checkerCode;

    private String checkerName;

    private Integer checkExcStatus;

    private Date checkDateStart;

    private Date checkDateFinish;

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