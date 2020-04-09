package com.jse.grade;

public class GradeServiceImpl implements GradeService{
	private Grade[] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[100];
		count = 0;
	}	
	@Override
	public void setGrade(Grade[] grades) {
		this.grades = grades;
	}
	@Override
	public Grade[] getGrade() {
		return grades;
	}
	@Override
	public void add(Grade grade) {
		grades[count]=grade;
		count++;		
	}
	@Override
	public void setCount(int count) {
		this.count = count;
		
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public int total(Grade grade) {
		return grade.getKorean()+grade.getEnglish()+grade.getMath();
	}
	@Override
	public int avg(Grade grade) {
		return total(grade)/3;
	}
	@Override
	public String record(Grade grade) {
		String result = "";
		int avg = avg(grade)/10;
		
		switch(avg) {
			case 9 : 
				result = "A";
				break;
			case 8 : 
				result = "B";
				break;
			case 7 : 
				result = "C";
				break;
			case 6 : 
				result = "D";
				break;
			case 5 : 
				result = "E";
				break;
			default : 
				result = "F";
				break;			
		}
		return result;	
	}
	@Override
	public String printGrades() {
		String result="";
		for(int i=0; i<3; i++) {
			result += String.format("[%s : 총점 %d점, 평균 %d점,학점 : %s]\n", 
					grades[i].getName(), total(grades[i]), avg(grades[i]), record(grades[i]));
		}
		return result;
	}
	@Override
	public String ranking() {
		for (int i=0; i < 3 ; i++ ){
			for (int j =i+1; j <3 ; j++ ){
				if (total(grades[j])>total(grades[i])){
					Grade tmp = new Grade();
					tmp = grades[i];
					grades[i] = grades[j];
					grades[j] = tmp;									
				}
			}
		}
		String result = "";
		for(int i=0; i<3; i++) {
			result += String.format("%d등 : %s\n",i+1, grades[i].getName());										
		}
		return result;
	}
}
