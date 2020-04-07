package com.jse.swing;

public class MemberService{
	private MemberBean[] members;
	int count;
	
	public MemberService() {
		members = new MemberBean[10];
		count = 0;
	}
	public void setMember(MemberBean[] members) {
		this.members = members;
	}
	public MemberBean[] getMember() {
		return members;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void add(MemberBean member) {
		members[count] = member;
		count++;
	}

}
