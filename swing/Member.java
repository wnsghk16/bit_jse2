package com.jse.swing;

public class Member {
	private String userid;
	private String passwd;
	private String name;
	private int count;
	
	public void setUserid(String userid){
		this.userid = userid;
	}
	public String getUserid() {
		return userid;
	}
	public void setPasswd(String passwd){
		this.passwd = passwd;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCount(int count){
		this.count += count;
	}
	public int getCount() {
		return count;
	}
}
