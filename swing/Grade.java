package com.jse.swing;
/*
 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 
 * * 이름과 국,영,수 세과목점수를 입력받아서() 
 * [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 
 * 단) 평균은 소수점이하는 절삭합니다
 *  평균점수가 90점 이상 A * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 
 *  50점 미만이면 F 학점입니다라고 출력되게 해주세요
 */
public class Grade {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int student;
	public int flag=1;	
	public int rank;
	public int total;
	public int avg;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setKorean(int korean){
		this.korean = korean;
	}
	public int getKorean() {
		return korean;
	}
	public void setEnglish(int english){
		this.english = english;
	}
	public int getEnglish() {
		return english;
	}
	public void setMath(int math){
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	public void setScore(int korean, int english, int math){
		this.korean = korean;
		this.english = english;
		this.math = math;
	}	
	public int total() {
		total = korean+english+math;
		return total;
	}
	public int avg() {
		avg = total/3;
		return avg;
	}
	public void setStudent(int student){
		this.student += student;
	}
	public int getStudent() {
		return student;
	}
	public String grade() {
		String grd = "";
		int avg = avg()/10;
		
		switch(avg) {
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
	public int error(int subject) {
		if(subject<0|subject>100) {
			System.out.println("점수를 잘못입력했습니다.");
			flag=0;
			return flag;
		}
		else
			return flag;				
	}  
}
