package com.kstech.model;


public class SPN {
    private Integer spId;

    private String spSpn;

    private String spBits;

    private String spBytes;

    private String spOff;

    private String spRef;

    private String spRes;

    private String spSbit;

    private String spSbyte;

    private String spType;

    private String pgnNum;

    public SPN(String spSpn, String spBits, String spBytes,
			String spOff, String spRef, String spRes, String spSbit,
			String spSbyte, String spType, String pgnNum) {
		super();
		this.spId = null;
		this.spSpn = spSpn;
		this.spBits = spBits;
		this.spBytes = spBytes;
		this.spOff = spOff;
		this.spRef = spRef;
		this.spRes = spRes;
		this.spSbit = spSbit;
		this.spSbyte = spSbyte;
		this.spType = spType;
		this.pgnNum = pgnNum;
	}

	public SPN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpSpn() {
        return spSpn;
    }

    public void setSpSpn(String spSpn) {
        this.spSpn = spSpn == null ? null : spSpn.trim();
    }

    public String getSpBits() {
        return spBits;
    }

    public void setSpBits(String spBits) {
        this.spBits = spBits == null ? null : spBits.trim();
    }

    public String getSpBytes() {
        return spBytes;
    }

    public void setSpBytes(String spBytes) {
        this.spBytes = spBytes == null ? null : spBytes.trim();
    }

    public String getSpOff() {
        return spOff;
    }

    public void setSpOff(String spOff) {
        this.spOff = spOff == null ? null : spOff.trim();
    }

    public String getSpRef() {
        return spRef;
    }

    public void setSpRef(String spRef) {
        this.spRef = spRef == null ? null : spRef.trim();
    }

    public String getSpRes() {
        return spRes;
    }

    public void setSpRes(String spRes) {
        this.spRes = spRes == null ? null : spRes.trim();
    }

    public String getSpSbit() {
        return spSbit;
    }

    public void setSpSbit(String spSbit) {
        this.spSbit = spSbit == null ? null : spSbit.trim();
    }

    public String getSpSbyte() {
        return spSbyte;
    }

    public void setSpSbyte(String spSbyte) {
        this.spSbyte = spSbyte == null ? null : spSbyte.trim();
    }

    public String getSpType() {
        return spType;
    }

    public void setSpType(String spType) {
        this.spType = spType == null ? null : spType.trim();
    }

    public String getPgnNum() {
        return pgnNum;
    }

    public void setPgnNum(String pgnNum) {
        this.pgnNum = pgnNum == null ? null : pgnNum.trim();
    }
}