package com.jse.member;

public interface MemberService {
	public void setMember(Member[] members);
	public Member[] getMember();
	public void setCount(int count);
	public int getCount();
	public void add(Member member);
	public String printMembers();
	public String ranking();
}
