package com.jse.swing;

import java.util.Scanner;
import com.jse.swing.Grade;
import com.jse.swing.Member;

public class Engine {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Grade[] gArr = new Grade[10];
		Grade grade = new Grade();
		Member[] members = new Member[10];
		Member member = new Member();
	
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
					if(gArr[i].flag!=0){
						System.out.println(String.format("[%s : 총점 %d점, "
								+ "평균 %d점, "
								+ "학점 : %s]", 
								gArr[i].getName(), gArr[i].total(), gArr[i].avg(), gArr[i].grade()));
					}					
				}
				break;
			case 3:
				System.out.println("등수확인"); //총점별로 등수 나열하기 이름
				
				for (int i=0; i < grade.getStudent() ; i++ ){
					for (int j =i+1; j <grade.getStudent() ; j++ ){
						if (gArr[j].total()>gArr[i].total()){
							//이름, 국어, 영어, 수학, 총점, 평균 다 바꿔야함
							String str = gArr[i].getName();
							gArr[i].setName(gArr[j].getName());
							gArr[j].setName(str);

							int temp = gArr[i].getKorean();
							gArr[i].setKorean(gArr[j].getKorean());
							gArr[j].setKorean(temp);

							temp = gArr[i].getEnglish();
							gArr[i].setEnglish(gArr[j].getEnglish());
							gArr[j].setEnglish(temp);

							temp = gArr[i].getMath();
							gArr[i].setMath(gArr[j].getMath());
							gArr[j].setMath(temp);

							temp = gArr[i].total();
							gArr[i].total = gArr[j].total;
							gArr[j].total = temp;

							temp = gArr[i].avg;
							gArr[i].avg = gArr[j].avg;
							gArr[j].avg = temp;							
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
	static Grade input(Scanner scanner){
		Grade grade = new Grade();
		System.out.println("이름을 입력해주세요 : ");
		String name = scanner.next();
		grade.setName(name);
		System.out.println("국어, 영어, 수학 학점을 입력해주세요 : ");
		int korean = scanner.nextInt();	
		int english = scanner.nextInt();
		int math = scanner.nextInt();	
		
		//if((grade.error(korean)==0)|(grade.error(english)==0)|(grade.error(math)==0)) 
			//return ;	->try catch로 해야함
		grade.setScore(korean, english, math);
		return grade;
		
	}
	static Member join(Scanner scanner) {
		Member member = new Member();
		System.out.println("아이디를 입력해주세요 : ");
		String userid = scanner.next();
		member.setUserid(userid);
		System.out.println("비밀번호를 입력해주세요 : ");
		String passwd = scanner.next();
		member.setPasswd(passwd);
		System.out.println("이름을 입력해주세요 : ");
		String name = scanner.next();
		member.setName(name);
		
		return member;
	}

}
