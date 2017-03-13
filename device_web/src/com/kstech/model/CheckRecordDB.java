package com.kstech.model;

import java.util.Date;

public class CheckRecordDB {
	//机型检测记录ID ：一个机型完整的检测数据对应一条 机型检测记录
    private Integer excId;
    
    //机型检测记录名称，一般与机器出厂编号对应
    private String excName;

    //检测过程中用到的 机型配置信息ID 在Device——cfg表中
    private Integer deviceId;

    //检测过程中用到的 机型配置信息名称
    private String deviceNum;

    //检验员工号
    private Integer checkerCode;

    //检验员名称
    private String checkerName;

    //当前机型检测状态 0：未开始 。1：未完成 。2：未合格 。3：合格 。4：强制合格 。
    private Integer checkExcStatus;

    //该机型检测开始时间
    private Date checkDateStart;

    //该机型检测完成时间
    private Date checkDateFinish;

    //对于该检测记录结果的描述
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