package com.jse.inheritance;

public class Iphone extends CelPhone{
	private String search;
	
	public Iphone(String phonenumber, String name, String company, boolean portable, String search) {
		super(phonenumber, name, company, portable);
		setSearch(search);
	}
	public void setSearch(String search) {
		if(search.equals(" o")|search.equals("o")){
			this.search = "인터넷검색 가능";
		}else if(search.equals(" x")|search.equals("x")) {
			this.search = "인터넷검색 불가능";
		}
	}
	public String getSearch() {
		return search;
	}

}
