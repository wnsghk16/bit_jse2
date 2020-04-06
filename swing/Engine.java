package com.jse.swing;
import java.util.Scanner;
import com.jse.swing.Grade;

public class Engine {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Grade grade = null;
		
	
		while(true) {
			System.out.println("\n아래의 숫자중에서 선택해주세요.");
			System.out.println("0.종료 "
					+ "1.성적표");			
			
			switch(scanner.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				grade = new Grade();
				System.out.println("성적표");
				System.out.println("이름을 입력해주세요 : ");
				String name = scanner.next();
				grade.setName(name);
				System.out.println("국어, 영어, 수학 학점을 입력해주세요 : ");
				int korean = scanner.nextInt();	
				int english = scanner.nextInt();
				int math = scanner.nextInt();	
				if((grade.error(korean)==0)|(grade.error(english)==0)|(grade.error(math)==0)) 
					break;	
				grade.setScore(korean, english, math);				
				System.out.println(String.format("[%s : 총점 %d점, "
						+ "평균 %d점, "
						+ "학점 : %s]", 
						grade.getName(), grade.total(), grade.avg(), grade.grade()));
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			
		}
	}

}
