package com.jse.inheritance;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		PhoneService phoneservice = new PhoneService();
		String message ="";
		
		while(true) {
			switch(JOptionPane.showInputDialog("아래의 숫자중에 선택해 주세요.\n"
					+ "0.Exit "
					+ "1.전화번호입력 "
					+ "2.전화번호목록 "
					+ "3.휴대전화입력 "
					+ "4.휴대전화목록 "
					+ "5.아이폰입력 "
					+ "6.아이폰목록 "
					+ "7.갤럭시입력 "
					+ "8.갤럭시목록")) {
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
				for(int i=0; i<3; i++) {
					message += String.format("[전화번호 : %s, 이름 : %s, 회사 : %s]\n",
							phones[i].getPhonenumber(),phones[i].getName(),phones[i].getCompany());					
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				phoneservice.resetCount();
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호, "
							+ "이름, 회사, 휴대여부(true,false)를 입력해 주세요.").split(",");
					phoneservice.addCelphone(new CelPhone(values[0],values[1],
							values[2],Boolean.parseBoolean(values[3])));
				}
				break;
			case "4":
				CelPhone [] celphones = phoneservice.getCelPhones();
				for(int i=0; i<3; i++) {
					message += String.format("[전화번호 : %s, 이름 : %s, 회사 : %s, %s]\n",
							celphones[i].getPhonenumber(),celphones[i].getName(),
							celphones[i].getCompany(),celphones[i].getMove());
				}
				JOptionPane.showMessageDialog(null,message);
				break;
			case "5":
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호, "
							+ "이름, 회사, 인터넷검색여부(o,x)를 입력해 주세요.").split(",");
					phoneservice.addIphone(new Iphone(values[0],values[1],values[2],
							Boolean.parseBoolean(values[3]),values[4]));
				}
				break;
			case "6":
				Iphone[] iphones = phoneservice.getIphones();
				for(int i=0; i<3; i++) {
					message += String.format("[전화번호 : %s, 이름 : %s, 회사 : %s, %s, %s]\n",
							iphones[i].getPhonenumber(),iphones[i].getName(),
							iphones[i].getCompany(),iphones[i].getMove(),iphones[i].getSearch());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "7":
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호, "
							+ "이름, 회사, 인터넷검색(o,x), 큰스트린화면(o,x)를 입력해 주세요.").split(",");
					phoneservice.addGalxynotes(new GalaxyNote(values[0],values[1],
							values[2],Boolean.parseBoolean(values[3]),values[4],values[5]));
				}
				break;
			case "8":
				GalaxyNote[] galaxynotes = phoneservice.getGalaxynotes();
				for(int i=0; i<3; i++) {
					message += String.format("[전화번호 : %s, 이름 : %s, 회사 : %s, %s, %s, %s]\n",
							galaxynotes[i].getPhonenumber(),galaxynotes[i].getName(),
							galaxynotes[i].getCompany(),galaxynotes[i].getMove(),
							galaxynotes[i].getSearch(),galaxynotes[i].getBigsize());					
				}
				JOptionPane.showMessageDialog(null, message);
				break;
				default:
					break;
			}
		}
	}
}
