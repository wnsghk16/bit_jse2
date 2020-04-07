package com.jse.swing;

public class GradeService {
	private GradeBean[] grades;
	private int count;
	
	public GradeService() {
		grades = new GradeBean[100];
		count = 0;
	}	
	public void setGrade(GradeBean[] grades) {
		this.grades = grades;
	}
	public GradeBean[] getGrade() {
		return grades;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void add(GradeBean grade) {
		grades[count]=grade;
		count++;
	}
}
