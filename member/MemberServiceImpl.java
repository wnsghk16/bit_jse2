package com.jse.member;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	int count;
	
	public MemberServiceImpl() {
		members = new Member[10];
		count = 0;
	}

	@Override
	public void setMember(Member[] members) {
		this.members = members;
		
	}

	@Override
	public Member[] getMember() {
		return members;
	}

	@Override
	public void setCount(int count) {
		this.count = count;
		
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
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
