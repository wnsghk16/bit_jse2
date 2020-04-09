package com.jse.member;
import java.util.Scanner;
/*
 * 키와 몸무게를 이용하여 카우푸지수를 구하고 
 * 우프지수=체중(g)/신장2(cm)* 10배해서 사용한다. 
 * 22이상은 지나친 비만, 22~19가 우량, 19~15가 정상, 15~13이 마른것, 13~10이 영양실조, 10이하가 소모증
 * 그 결과 정상, 저체중, 비만 등으로 몸의 상태만 
 * 알려주는 프로그램을 만들어 주세요
 */
public class Kaup {
	private float weight;
	private float height;
	
	public void setWeight(float w){
		this.weight = w;
	}
	public float getWeight() {
		return weight;
	}
	public void setHeight(float h){
		this.height = h;
	}
	public float getHeight() {
		return height;
	}
	public float setKaup(){
		float kaup = (weight*10000/(height*height));
		return kaup;
	}
	public String state(float kaup) {
		String state="";
		
		if(kaup>=30) {
			state = "고도비만";			
		}else if(kaup>=25) {
			state = "비만";		
		}else if(kaup>=23) {				
			state = "과체중";		
		}else if(kaup>=18.5) {
			state = "정상";			
		}else if(kaup<18.5) {				
			state = "저체중";		
		}		
		return state;		
	}
}
