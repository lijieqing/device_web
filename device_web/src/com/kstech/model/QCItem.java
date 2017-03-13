package com.kstech.model;

public class QCItem {
    private Integer qcId;

    private String deviceNum;

    private String qcitemId;

    private String qcName;

    private String qctimeout;

    private String qctimes;

    private String qcReadytimeout;

    private String qcRequire;

    private String qcParams;

    private String qcMsg;

    private String qcEnvparam;
    

    public QCItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QCItem(String deviceNum, String qcitemId,
			String qcName, String qctimeout, String qctimes,
			String qcReadytimeout, String qcRequire, String qcParams,
			String qcEnvparam,String qcMsg) {
		super();
		this.qcId = null;
		this.deviceNum = deviceNum;
		this.qcitemId = qcitemId;
		this.qcName = qcName;
		this.qctimeout = qctimeout;
		this.qctimes = qctimes;
		this.qcReadytimeout = qcReadytimeout;
		this.qcRequire = qcRequire;
		this.qcParams = qcParams;
		this.qcMsg = qcMsg;
		this.qcEnvparam = qcEnvparam;
	}

	public Integer getQcId() {
        return qcId;
    }

    public void setQcId(Integer qcId) {
        this.qcId = qcId;
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    public String getQcitemId() {
        return qcitemId;
    }

    public void setQcitemId(String qcitemId) {
        this.qcitemId = qcitemId == null ? null : qcitemId.trim();
    }

    public String getQcName() {
        return qcName;
    }

    public void setQcName(String qcName) {
        this.qcName = qcName == null ? null : qcName.trim();
    }

    public String getQctimeout() {
        return qctimeout;
    }

    public void setQctimeout(String qctimeout) {
        this.qctimeout = qctimeout == null ? null : qctimeout.trim();
    }

    public String getQctimes() {
        return qctimes;
    }

    public void setQctimes(String qctimes) {
        this.qctimes = qctimes == null ? null : qctimes.trim();
    }

    public String getQcReadytimeout() {
        return qcReadytimeout;
    }

    public void setQcReadytimeout(String qcReadytimeout) {
        this.qcReadytimeout = qcReadytimeout == null ? null : qcReadytimeout.trim();
    }

    public String getQcRequire() {
        return qcRequire;
    }

    public void setQcRequire(String qcRequire) {
        this.qcRequire = qcRequire == null ? null : qcRequire.trim();
    }

    public String getQcParams() {
        return qcParams;
    }

    public void setQcParams(String qcParams) {
        this.qcParams = qcParams == null ? null : qcParams.trim();
    }

    public String getQcMsg() {
        return qcMsg;
    }

    public void setQcMsg(String qcMsg) {
        this.qcMsg = qcMsg == null ? null : qcMsg.trim();
    }

    public String getQcEnvparam() {
        return qcEnvparam;
    }

    public void setQcEnvparam(String qcEnvparam) {
        this.qcEnvparam = qcEnvparam == null ? null : qcEnvparam.trim();
    }
}