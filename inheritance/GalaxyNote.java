package com.jse.inheritance;

public class GalaxyNote extends Iphone{
	private String bigsize;

	public GalaxyNote(String phonenumber, String name, String company, boolean portable, String search,String bigsize) {
		super(phonenumber, name, company, portable, search);
		setBigsize(bigsize);
	}
	public String getBigsize() {
		return bigsize;
	}

	public void setBigsize(String bigsize) {
		if(bigsize.equals(" o")|bigsize.equals("o")) {
			this.bigsize = "큰스크린 있음";
		}else if(bigsize.equals(" x")|bigsize.equals("x")) {
			this.bigsize = "큰스크린 없음";
		}
		else {
			this.bigsize = "잘못입력했습니다.";
		}
	}	
}
