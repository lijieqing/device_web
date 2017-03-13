package com.kstech.model;

public enum USERROLE {
	MANAGER("管理员",0),CHECKER("检验员",1);
	private String name;
	private int code;
	private USERROLE(String name,int code){
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}	
}
