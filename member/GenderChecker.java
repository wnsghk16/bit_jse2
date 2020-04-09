package com.jse.member;
import java.util.Scanner;

public class GenderChecker {
	public static void main(String[] args) {
		find();
	}
	static void find() {
		System.out.println("주민번호를 입력하세요 ex)900101-123456");
		Scanner scanner = new Scanner(System.in);
		String ssn = scanner.next();//"900101-123456"
		System.out.println(String.format("당신의 주민번호는 %s입니다.",ssn));
		char ch = ssn.charAt(7);
		
		String gender="";
		switch(ch) {
		case '1': case'3':
			gender = "남성";//1,3
			break;
		case '2': case'4':
			gender = "여성";//2,4
			break;
		case '5': case'6':
			gender = "외국인";//5,6
			break;
		default:
			gender = "잘못입력한 값";//0,7,8,9
			break;			
		}
		
		System.out.println(String.format("당신은 %s입니다.",gender));
					
	}

}
