package com.jse.swing;

import java.util.Scanner;
import com.jse.swing.GradeBean;
import com.jse.swing.MemberBean;

public class Engine {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GradeBean[] gArr = new GradeBean[10];
		GradeBean grade = new GradeBean();
		MemberBean[] members = new MemberBean[10];
		MemberBean member = new MemberBean();
	
		while(true) {
			System.out.println("\n아래의 숫자중에서 선택해주세요.");
			System.out.println("0.종료 "
					+ "1.성적표입력 "
					+ "2.성적표출력 "
					+ "3.등수확인 "
					+ "4.회원가입 "
					+ "5.회원목록 ");			
			
			switch(scanner.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("성적표입력");	
				System.out.print("학생수를 입력해주세요(총 최대10명) : ");
				int num = grade.getStudent(); // 추가전 학생수
				grade.setStudent(scanner.nextInt());
				
				for(int i=num; i<grade.getStudent(); i++) {
					gArr[i] = input(scanner);
				}
				break;
			case 2:
				System.out.println("성적표출력");
				for(int i=0; i<grade.getStudent(); i++) {
					System.out.println(String.format("[%s : 총점 %d점, "
							+ "평균 %d점, "
							+ "학점 : %s]", 
							gArr[i].getName(), gArr[i].getTotal(), gArr[i].getAvg(), gArr[i].grade()));
				}
				break;
			case 3:
				System.out.println("등수확인"); //총점별로 등수 나열하기 이름
				
				for (int i=0; i < grade.getStudent() ; i++ ){
					for (int j =i+1; j <grade.getStudent() ; j++ ){
						if (gArr[j].getTotal()>gArr[i].getTotal()){
							GradeBean tmp = new GradeBean("",0,0,0);
							tmp = gArr[i];
							gArr[i] = gArr[j];
							gArr[j] = tmp;									
						}
					}
				}
				
				for(int i=0; i<grade.getStudent(); i++) {
					System.out.println(String.format("%d등 : %s",i+1, gArr[i].getName()));										
				}

				
				break;
			case 4:
				System.out.println("회원가입");	
				System.out.print("회원수를 입력해주세요(총 최대10명) : ");
				int num2 = member.getCount(); // 추가전 회원수
				member.setCount(scanner.nextInt());
				for(int i=num2; i<member.getCount(); i++) {
					members[i] = join(scanner);
				}		
				
				break;
			case 5:
				System.out.println("회원목록");
				for(int i=0; i<member.getCount(); i++) {
					System.out.println(String.format("[아이디 : %s, "
							+ "비밀번호 : %s, "
							+ "이름 : %s]", 
							members[i].getUserid(),members[i].getPasswd(), members[i].getName()));

				}
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}			
			
		}
		
	}
	static GradeBean input(Scanner scanner){
		System.out.println("이름, 국어, 영어, 수학 학점을 입력해주세요 : ");
		GradeBean grade = new GradeBean(scanner.next(),
				scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		
		grade.total();
		grade.avg();
		return grade;
		
	}
	static MemberBean join(Scanner scanner) {
		
		System.out.println("아이디, 비밀번호, 이름을 입력해주세요 : ");
		MemberBean member = new MemberBean(scanner.next(),scanner.next(),scanner.next());	
		
		return member;
	}

}
