package com.kstech.model;

public enum USERROLE {
	MANAGER("����Ա",0),CHECKER("����Ա",1);
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
