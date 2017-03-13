package com.kstech.model;

public class User {


	private Integer userId;

    private String userName;

    private String userCode;

    private String password;

    private Integer priority;

    private Integer userStatus;

    
    
    public User() {
	}

	public User(String userName, String userCode,
			String password, Integer priority) {
		super();
		this.userId = null;
		this.userName = userName;
		this.userCode = userCode;
		this.password = password;
		this.priority = priority;
		this.userStatus = 0;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
    
    @Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userCode=" + userCode + ", password=" + password
				+ ", priority=" + priority + ", userStatus=" + userStatus + "]";
	}
}