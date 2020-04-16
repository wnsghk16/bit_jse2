package com.jse.member;

import javax.swing.JOptionPane;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	int count;
	
	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	@Override
	public Member[] list() {		
		return members;
	}
	@Override
	public Member detail(Member member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count() {
		return count;
	}
	@Override
	public Member login(Member member) {
		Member result = null; // 주소값없음
		for(int i=0; i<members.length; i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				result = new Member(); // 주소값 생김
				result = members[i];
				break;
			}	
		}
		return result;
	}
	@Override
	public void update(Member member) {
		
	}	
	@Override
	public void delete(Member member) {
		
	}
	
	@Override
	public String printMembers() {
		String result="";
		for(int i=0; i<3; i++) {
			result += String.format("[아이디 : %s, 비밀번호 : %s, 이름 : %s, 나이 : %d]\n", 
					members[i].getUserid(),members[i].getPasswd(), members[i].getName(), members[i].getAge());
		}
		return result;
	}

	@Override
	public String ranking() {
		for (int i=0; i < 3 ; i++ ){
			for (int j =i+1; j <3 ; j++ ){
				if (members[j].getAge()>members[i].getAge()){
					Member tmp = new Member();
					tmp = members[i];
					members[i] = members[j];
					members[j] = tmp;									
				}
			}
		}
		String result = "";
		for(int i=0; i<3; i++) {
			result += String.format("%d등 : %s(나이:%d)\n"
					,i+1, members[i].getName(),members[i].getAge());										
		}
		return result;
	}
}
