package com.jse.member;

import javax.swing.JOptionPane;
import com.jse.util.Constants;

public class MemberController {
public static void main(String[] args) {
		
		MemberService memberservice = new MemberServiceImpl();
		Member member = null;
		while(true) {	
			
			switch(JOptionPane.showInputDialog(Constants.MEMBER_MENU)) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료합니다.");
				return;
			case "1":
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.MEMBER_INPUT).split(",");	
					member = new Member();
					member.setUserid(values[0]);
					member.setPasswd(values[1]);
					member.setName(values[2]);
					member.setAge(Integer.parseInt(values[3]));
					memberservice.add(member);						
				}	
				break;
			case "2":
				JOptionPane.showMessageDialog(null, memberservice.printMembers());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, memberservice.ranking());
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}			
			
		}
		
	}
}
