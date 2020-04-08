package com.jse.inheritance;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		PhoneService phoneservice = new PhoneService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("아래의 숫자중에 선택해 주세요.\n"
					+ "0.Exit "
					+ "1.전화번호입력 "
					+ "2.전화번호목록 "
					+ "3.휴대전화입력 "
					+ "4.휴대전화목록")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료합니다.");
				return;
			case "1":
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호, 이름, 회사를 입력해 주세요.").split(",");
					phoneservice.add(new Phone(values[0],values[1],values[2]));
				}
				break;
			case "2":
				Phone [] phones = phoneservice.getPhone();
				String message ="";
				for(int i=0; i<3; i++) {
					message += String.format("[전화번호 : %s, 이름 : %s, 회사 : %s]\n",
							phones[i].getPhonenumber(),phones[i].getName(),phones[i].getCompany());					
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for(int i=0; i<3; i++) {
					String[] cvalues = JOptionPane.showInputDialog("전화번호, "
							+ "이름, 회사를 입력해 주세요.").split(",");
					phoneservice.addCelphone(new CelPhone(cvalues[0],cvalues[1],cvalues[2],true));
				}
				break;
			case "4":
				CelPhone [] celphones = phoneservice.getCelPhones();
				String msg = "";
				for(int i=0; i<3; i++) {
					msg += String.format("[전화번호 : %s, 이름 : %s, 회사 : %s, %s]\n",
							celphones[i].getPhonenumber(),celphones[i].getName(),
							celphones[i].getCompany(),celphones[i].getMove());
				}
				JOptionPane.showMessageDialog(null,msg);
				break;
				default:
					break;
			}
		}
	}
}
