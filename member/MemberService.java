package com.jse.member;

public class MemberService{
	private Member[] members;
	int count;
	
	public MemberService() {
		members = new Member[10];
		count = 0;
	}
	public void setMember(Member[] members) {
		this.members = members;
	}
	public Member[] getMember() {
		return members;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void add(Member member) {
		members[count] = member;
		count++;
	}

}
