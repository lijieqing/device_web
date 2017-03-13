package com.kstech.model;

public class DeviceCFG {
	//机型 检测设备配置表ID
    private Integer deviceId;
    
    //机型 检测设备配置表名称
    private String deviceNum;

    //机型检测配置文件生成时间
    private String dateCreate;

    //该机型 包含DSItem 的ID集合 
    private String dsitemIdGroup;

    //该机型 包含PGN 的ID集合
    private String pgnIdGroup;

    //该机型 包含QCItem 的ID集合
    private String qcIdGroup;

    //该机型 包含Realtime 的ID集合
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