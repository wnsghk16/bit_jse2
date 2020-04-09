package com.jse.grade;

public class GradeService {
	private Grade[] grades;
	private int count;
	
	public GradeService() {
		grades = new Grade[100];
		count = 0;
	}	
	public void setGrade(Grade[] grades) {
		this.grades = grades;
	}
	public Grade[] getGrade() {
		return grades;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void add(Grade grade) {
		grades[count]=grade;
		count++;
	}
}
