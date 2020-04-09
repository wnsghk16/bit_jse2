package com.jse.grade;

public interface GradeService {
	public void setGrade(Grade[] grades);
	public Grade[] getGrade();
	public void setCount(int count);
	public int getCount();
	public void add(Grade grade);
	public int total(Grade grade);
	public int avg(Grade grade);
	public String record(Grade grade);
	public String printGrades();
	public String ranking();
}
