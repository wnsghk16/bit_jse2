package com.jse.swing;

public class MemberBean {
	private String userid;
	private String passwd;
	private String name;
	private int count;
	
	public MemberBean() {
		// TODO Auto-generated constructor stub
	}
	public MemberBean(String userid, String passwd, String name) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public String getPasswd() {
		return passwd;
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
