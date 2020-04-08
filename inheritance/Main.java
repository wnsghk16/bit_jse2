package com.jse.inheritance;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		PhoneService phoneservice = new PhoneService();
		
		while(true) {
			System.out.println("\n아래의 숫자중에 선택해 주세요.");
			System.out.println("0.Exit "
					+ "1.전화번호입력"
					+ " 2.전화번호목록");
			switch(scanner.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("전화번호입력");
				for(int i=0; i<3; i++) {
					System.out.println("전화번호, 이름, 회사를 입력해 주세요.");
					phoneservice.add(new Phone(scanner.next(),scanner.next(),scanner.next()));
				}
				break;
			case 2:
				System.out.println("전화번호목록");
				for(int i=0; i<3; i++) {
					Phone [] phones = phoneservice.getPhone();
					System.out.println(String.format("[전화번호 : %s, 이름 : %s, 회사 : %s]",
							phones[i].getPhonenumber(),phones[i].getName(),phones[i].getCompany()));
				}
				break;
				default:
					break;
			}
		}
	}
}