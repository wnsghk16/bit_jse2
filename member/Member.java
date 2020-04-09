package com.jse.member;

public class Member {
	private String userid;
	private String passwd;
	private String name;
	private int age;
		
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(String userid, String passwd, String name, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
