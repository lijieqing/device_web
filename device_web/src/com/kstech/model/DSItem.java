package com.kstech.model;

public class DSItem {
	//DSItem ID
    private Integer dsitemId;

    //机型配置信息 名称
    private String deviceNum;

    //数据类型
    private String datatype;

    //精度
    private String declen;

    private String linkto;

    private String dsitemName;

    private String dsitemUint;

    //内容格式 为 数组 
    private String dsitemGroupData;
    
    private String dsitemValue;
    public DSItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DSItem(String deviceNum, String datatype,
			String declen, String linkto, String dsitemName, String dsitemUint,
			String dsitemGroupData,String dsitemValue) {
		super();
		this.dsitemId = null;
		this.deviceNum = deviceNum;
		this.datatype = datatype;
		this.declen = declen;
		this.linkto = linkto;
		this.dsitemName = dsitemName;
		this.dsitemUint = dsitemUint;
		this.dsitemGroupData = dsitemGroupData;
		this.dsitemValue = dsitemValue;
	}

	public Integer getDsitemId() {
        return dsitemId;
    }

    public void setDsitemId(Integer dsitemId) {
        this.dsitemId = dsitemId;
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype == null ? null : datatype.trim();
    }

    public String getDeclen() {
        return declen;
    }

    public void setDeclen(String declen) {
        this.declen = declen == null ? null : declen.trim();
    }

    public String getLinkto() {
        return linkto;
    }

    public void setLinkto(String linkto) {
        this.linkto = linkto == null ? null : linkto.trim();
    }

    public String getDsitemName() {
        return dsitemName;
    }

    public void setDsitemName(String dsitemName) {
        this.dsitemName = dsitemName == null ? null : dsitemName.trim();
    }

    public String getDsitemUint() {
        return dsitemUint;
    }

    public void setDsitemUint(String dsitemUint) {
        this.dsitemUint = dsitemUint == null ? null : dsitemUint.trim();
    }

    public String getDsitemGroupData() {
        return dsitemGroupData;
    }

    public void setDsitemGroupData(String dsitemGroupData) {
        this.dsitemGroupData = dsitemGroupData == null ? null : dsitemGroupData.trim();
    }  
    public String getDsitemValue() {
        return dsitemValue;
    }

    public void setDsitemValue(String dsitemValue) {
        this.dsitemValue = dsitemValue == null ? null : dsitemValue.trim();
    }
}