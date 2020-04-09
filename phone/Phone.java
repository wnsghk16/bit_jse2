package com.jse.phone;

import lombok.Data;

@Data
public class Phone {
	private String phonenumber, name, company;	
}


class CelPhone extends Phone{
	private boolean portable;
	private String move;
	public void setPortable(boolean portable) {
		this.portable = portable;
		this.move = portable ? "휴대 가능": "휴대 불가능";		
	}
	@Override
	public String toString() {
		return super.toString()+", portable=" + portable + ", move=" + move;
	}
}

class Iphone extends CelPhone{
	private String search;
	
	public void setSearch(String search) {
		this.search = (search.equals(" o")|search.equals("o")) ? "인터넷검색 가능" : ((search.equals(" x")|search.equals("x") ? "인터넷검색 불가능" : "잘못입력했습니다."));
		
	}
	@Override
	public String toString() {
		return super.toString()+", search="+search;
	}

}

class GalaxyNote extends Iphone{
	private String bigsize;
	
	public void setBigsize(String bigsize) {
		this.bigsize = (bigsize.equals(" o")|bigsize.equals("o")) ? "큰스크린 있음" : ((bigsize.equals(" x")|bigsize.equals("x") ? "큰스크린 없음" : "잘못입력했습니다."));
	}
	@Override
	public String toString() {
		return super.toString()+", bigsize="+bigsize;
	}
}

 