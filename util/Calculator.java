package com.jse.util;

public class Calculator {
	private int choice;
	private float result;
	private float num1;
	private float num2;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	public void setNum1(float num1){
		this.num1 = num1;
	}
	public float getNum1(){
		return num1;
	}
	public void setNum2(float num2){
		this.num2 = num2;
	}
	public float getNum2(){
		return num2;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public float calculate() {	
		
		switch(this.choice) {
		case 1:
			add(num1,num2);
			break;
		case 2:
			min(num1,num2);
			break;
		case 3:
			mul(num1,num2);
			break;
		case 4:
			div(num1,num2);
			break;
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}
		return result;
	}
	
	public void add(float a, float b) {
		result = a + b;
	}
	public void min(float a, float b) {
		result = a - b;
	}
	public void mul(float a, float b) {
		result = a * b;
	}
	public void div(float a, float b) {
		result = a / b;
	}
}

