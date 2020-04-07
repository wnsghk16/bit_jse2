package com.jse.swing;
/*
 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 
 * * 이름과 국,영,수 세과목점수를 입력받아서() 
 * [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 
 * 단) 평균은 소수점이하는 절삭합니다
 *  평균점수가 90점 이상 A * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 
 *  50점 미만이면 F 학점입니다라고 출력되게 해주세요
 */
public class GradeBean {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int student;
	private int total;
	private int avg;
	
	public GradeBean() {
		// TODO Auto-generated constructor stub
	}
	public GradeBean(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}	
	public int getKorean() {
		return korean;
	}	
	public int getEnglish() {
		return english;
	}
	public int getMath() {
		return math;
	}
	public int getTotal() {
		return total;
	}
	public int getAvg() {
		return avg;
	}
	
	public void total() {
		total = korean+english+math;
	}
	public void avg() {
		avg = total/3;
	}
	public void setStudent(int student){
		this.student += student;
	}
	public int getStudent() {
		return student;
	}
	public String grade() {
		String grd = "";
		
		switch(avg/10) {
			case 9 : 
				grd = "A";
				break;
			case 8 : 
				grd = "B";
				break;
			case 7 : 
				grd = "C";
				break;
			case 6 : 
				grd = "D";
				break;
			case 5 : 
				grd = "E";
				break;
			default : 
				grd = "F";
				break;			
		}
		return grd;		
	}
}
