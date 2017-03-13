package com.kstech.model;

public class RealTime {
    private Integer realtimeId;

    private String deviceNum;

    private String realtimeName;

    public RealTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealTime(String deviceNum, String realtimeName) {
		super();
		this.realtimeId = null;
		this.deviceNum = deviceNum;
		this.realtimeName = realtimeName;
	}

	public Integer getRealtimeId() {
        return realtimeId;
    }

    public void setRealtimeId(Integer realtimeId) {
        this.realtimeId = realtimeId;
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    public String getRealtimeName() {
        return realtimeName;
    }

    public void setRealtimeName(String realtimeName) {
        this.realtimeName = realtimeName == null ? null : realtimeName.trim();
    }
}