package com.jse.grade;

import java.util.Scanner;

import com.jse.member.Member;
import com.jse.member.MemberService;


public class GradeController {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GradeService gradeservice = new GradeService();
		Grade[] grades = gradeservice.getGrade();
		MemberService memberservice = new MemberService();
		Member[] members = memberservice.getMember();
		
	
		while(true) {
			System.out.println("\n아래의 숫자중에서 선택해주세요.");
			System.out.println("0.종료 "
					+ "1.성적표입력 "
					+ "2.성적표출력 "
					+ "3.등수확인 "
					+ "4.회원가입 "
					+ "5.회원목록 "
					+ "6.회원정렬(나이순)");			
			
			switch(scanner.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("성적표입력");	
				for(int i=0; i<3; i++) {
					System.out.println("이름, 국어, 영어, 수학 학점을 입력해주세요 : ");
					gradeservice.add(new Grade(scanner.next(),
							scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
				}
				break;
			case 2:				
				System.out.println("성적표출력");
				for(int i=0; i<3; i++) {
					System.out.println(String.format("[%s : 총점 %d점, "
							+ "평균 %d점, "
							+ "학점 : %s]", 
							grades[i].getName(), grades[i].total(), grades[i].avg(), grades[i].grade()));
				}
				break;
			case 3:
				System.out.println("등수확인"); //총점별로 등수 나열하기 이름
				
				for (int i=0; i < 3 ; i++ ){
					for (int j =i+1; j <3 ; j++ ){
						if (grades[j].total()>grades[i].total()){
							Grade tmp = new Grade("",0,0,0);
							tmp = grades[i];
							grades[i] = grades[j];
							grades[j] = tmp;									
						}
					}
				}
				
				for(int i=0; i<3; i++) {
					System.out.println(String.format("%d등 : %s",i+1, grades[i].getName()));										
				}

				
				break;
			case 4:
				System.out.println("회원가입");	
				for(int i=0; i<3; i++) {
					System.out.println("아이디, 비밀번호, 이름, 나이를 입력해주세요 : ");
					memberservice.add(new Member(scanner.next(),
							scanner.next(),scanner.next(),scanner.nextInt()));						
				}						
				break;
			case 5:
				System.out.println("회원목록");
				for(int i=0; i<3; i++) {
					System.out.println(String.format("[아이디 : %s, "
							+ "비밀번호 : %s, "
							+ "이름 : %s]", 
							members[i].getUserid(),members[i].getPasswd(), members[i].getName()));
				}
				break;
			case 6:
				System.out.println("회원정렬(나이순)"); //나이순으로 이름 나열하기
				
				for (int i=0; i < 3 ; i++ ){
					for (int j =i+1; j <3 ; j++ ){
						if (members[j].getAge()>members[i].getAge()){
							Member tmp = new Member("","","",0);
							tmp = members[i];
							members[i] = members[j];
							members[j] = tmp;									
						}
					}
				}
				
				for(int i=0; i<3; i++) {
					System.out.println(String.format("%d등 : %s(나이:%d)"
							,i+1, members[i].getName(),members[i].getAge()));										
				}
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}			
			
		}
		
	}
}
