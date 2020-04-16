package com.jse.member;

import java.util.Scanner;

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
	public Member[] searchByName(String name, int searchCount) {
		Member[] result = null;
		if(searchCount != 0) {
			result = new Member[searchCount];
			int j = 0;
			for(int i=0; i<count; i++) {
				if(name.equals(members[i].getName())) {
					result[j] = new Member();
					result[j] = members[i];
					j++;
					if(j == searchCount) {
						break;
					}
				}
			}
		}
		return result;
	}
	@Override
	public Member[] searchByGender(String gender) {
		String[] ssn = new String[count];
		String[] result= new String[count];
		for(int i=0; i<count; i++) {
			ssn[i] = members[i].getSsn();
			char ch = ssn[i].charAt(7);
			switch(ch) {
			case '1': case'3':
				result[i] = "남성";//1,3
				break;
			case '2': case'4':
				result[i] = "여성";//2,4
				break;
			case '5': case'6':
				result[i] = "외국인";//5,6
				break;
			default:
				result[i] = "잘못입력한 값";//0,7,8,9
				break;			
			}
		}
		
		
		return null;
	}
	@Override
	public Member detail(String userid) {
		Member result = null;
		for(int i=0; i<count; i++) { 
			if(userid.equals(members[i].getUserid())) {
				result = new Member();
				result = members[i];
				break;
			}
		}		
		return result;
	}
	@Override
	public int count() {
		return count;
	}
	@Override
	public int count(String name) {
		int returnCount = 0;
		for(int i=0; i<count; i++) {
			if(name.equals(members[i].getName())) {
				returnCount++;
			}
		}
		return returnCount;
	}
	@Override
	public int count(Member member) {
		int returnCount = 0;
		for(int i=0; i<count; i++) {				
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				returnCount++;				
			}
		}
		return returnCount;
	}
	@Override
	public Member login(Member member) {
		Member result = null; // 주소값없음
		for(int i=0; i<count; i++) {
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
	@Override
	public void update(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
				break;
			}
		}
	}	
	@Override
	public void delete(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&&  
					member.getPasswd().equals(members[i].getPasswd())) {
				members[i] = members[count-1];
				members[count-1] = null;
				count --;
				
			}
			
		}
	}	
	@Override
	public Member[] delete(Member member, int deleteCount) {
		Member[] result = null;
		if(deleteCount != 0) {
			for(int i=0; i<count; i++) {				
				if(member.getUserid().equals(members[i].getUserid())
						&& member.getPasswd().equals(members[i].getPasswd())) {
					members[i] = members[count-1];
					members[count-1] = null;						
					count--;				
				}
			}
			result = members;
			String message = "";
			for(int i=0; i<count;i++) {
				message = result[i]+"\n";
			}
		}
		return result;
	}
}
