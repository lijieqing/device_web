package com.kstech.model;

import java.util.Date;

public class UserDetail {
    private Integer userdetailId;

    private String userCode;

    private Date userCreatetime;

    private Date userInvalidtime;

    private Date userLogintime;

    private String creatorCode;

    private String stoperCode;

    private Integer unfinishItemId;

    private String unfinshDesc;

    public UserDetail(String userCode,
			Date userCreatetime,
			String creatorCode) {
		super();
		this.userdetailId = null;
		this.userCode = userCode;
		this.userCreatetime = userCreatetime;
		this.userInvalidtime = null;
		this.userLogintime = null;
		this.creatorCode = creatorCode;
		this.stoperCode = null;
		this.unfinishItemId = null;
		this.unfinshDesc = null;
	}

	public Integer getUserdetailId() {
        return userdetailId;
    }

    public void setUserdetailId(Integer userdetailId) {
        this.userdetailId = userdetailId;
    }

    public String getUserId() {
        return userCode;
    }

    public void setUserId(String userCode) {
        this.userCode = userCode;
    }

    public Date getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime == null ? null : userCreatetime;
    }

    public Date getUserInvalidtime() {
        return userInvalidtime;
    }

    public void setUserInvalidtime(Date userInvalidtime) {
        this.userInvalidtime = userInvalidtime == null ? null : userInvalidtime;
    }

    public Date getUserLogintime() {
        return userLogintime;
    }

    public void setUserLogintime(Date userLogintime) {
        this.userLogintime = userLogintime == null ? null : userLogintime;
    }

    public String getCreatorCode() {
        return creatorCode;
    }

    public void setCreatorCode(String creatorCode) {
        this.creatorCode = creatorCode;
    }

    public String getStoperCode() {
        return stoperCode;
    }

    public void setStoperCode(String stoperCode) {
        this.stoperCode = stoperCode;
    }

    public Integer getUnfinishItemId() {
        return unfinishItemId;
    }

    public void setUnfinishItemId(Integer unfinishItemId) {
        this.unfinishItemId = unfinishItemId;
    }

    public String getUnfinshDesc() {
        return unfinshDesc;
    }

    public void setUnfinshDesc(String unfinshDesc) {
        this.unfinshDesc = unfinshDesc == null ? null : unfinshDesc.trim();
    }
}