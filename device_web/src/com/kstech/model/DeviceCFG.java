package com.kstech.model;

public class DeviceCFG {
    private Integer deviceId;

    private String deviceNum;

    private String dateCreate;

    private String dsitemIdGroup;

    private String pgnIdGroup;

    private String qcIdGroup;

    private String deviceRealtime;

    public DeviceCFG() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeviceCFG(String deviceNum, String dateCreate,
			String dsitemIdGroup, String pgnIdGroup, String qcIdGroup,
			String deviceRealtime) {
		super();
		this.deviceId = null;
		this.deviceNum = deviceNum;
		this.dateCreate = dateCreate;
		this.dsitemIdGroup = dsitemIdGroup;
		this.pgnIdGroup = pgnIdGroup;
		this.qcIdGroup = qcIdGroup;
		this.deviceRealtime = deviceRealtime;
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

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate == null ? null : dateCreate.trim();
    }

    public String getDsitemIdGroup() {
        return dsitemIdGroup;
    }

    public void setDsitemIdGroup(String dsitemIdGroup) {
        this.dsitemIdGroup = dsitemIdGroup == null ? null : dsitemIdGroup.trim();
    }

    public String getPgnIdGroup() {
        return pgnIdGroup;
    }

    public void setPgnIdGroup(String pgnIdGroup) {
        this.pgnIdGroup = pgnIdGroup == null ? null : pgnIdGroup.trim();
    }

    public String getQcIdGroup() {
        return qcIdGroup;
    }

    public void setQcIdGroup(String qcIdGroup) {
        this.qcIdGroup = qcIdGroup == null ? null : qcIdGroup.trim();
    }

    public String getDeviceRealtime() {
        return deviceRealtime;
    }

    public void setDeviceRealtime(String deviceRealtime) {
        this.deviceRealtime = deviceRealtime == null ? null : deviceRealtime.trim();
    }
}