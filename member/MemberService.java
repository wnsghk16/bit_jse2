package com.jse.member;

public interface MemberService {
	public String printMembers();
	public String ranking();
	public void add(Member member);
	public Member[] list();
	public Member[] searchByName(String name, int searchCount);
	public Member[] searchByGender(String gender);
	public Member detail(String userid);
	public int count();
	public int count(String name);
	public int count(Member member);
	public Member login(Member member);
	public void update(Member member);
	public void delete(Member member);
	public Member[] delete(Member member, int deleteCount);
}
