package com.jse.member;

public interface MemberService {
	public String printMembers();
	public String ranking();
	public void add(Member member);
	public Member[] list();
	public Member detail(Member member);
	public int count();
	public Member login(Member member);
	public void update(Member member);
	public void delete(Member member);
}
