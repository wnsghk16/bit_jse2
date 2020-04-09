package com.jse.phone;

public class Phone {
	private String phonenumber, name, company;
	
	public Phone(String phonenumber, String name, String company) {
		this.phonenumber = phonenumber;
		this.name = name;
		this.company = company;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void getName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	@Override
	public String toString() {
		return "Phone : phonenumber=" + phonenumber + ", name=" + name + ", company=" + company;
	}
	
}


class CelPhone extends Phone{
	private boolean portable;
	private String move;
	
	public CelPhone(String phonenumber, String name, String company, boolean portable) {
		super(phonenumber, name, company);
		setPortable(this.portable=portable);
	}
	public void setPortable(boolean portable) {
		this.move = portable ? "휴대 가능": "휴대 불가능";		
	}
	public boolean isPortable() {
		return portable;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	@Override
	public String toString() {
		return super.toString()+", portable=" + portable + ", move=" + move;
	}
	
}


class Iphone extends CelPhone{
	private String search;
	
	public Iphone(String phonenumber, String name, String company, boolean portable, String search) {
		super(phonenumber, name, company, portable);
		setSearch(search);
	}
	public void setSearch(String search) {
		this.search = (search.equals(" o")|search.equals("o")) ? "인터넷검색 가능" : ((search.equals(" x")|search.equals("x") ? "인터넷검색 불가능" : "잘못입력했습니다."));
		
	}
	public String getSearch() {
		return search;
	}
	@Override
	public String toString() {
		return super.toString()+", search="+search;
	}

}


class GalaxyNote extends Iphone{
	private String bigsize;

	public GalaxyNote(String phonenumber, String name, String company, boolean portable, String search,String bigsize) {
		super(phonenumber, name, company, portable, search);
		setBigsize(bigsize);
	}
	public String getBigsize() {
		return bigsize;
	}

	public void setBigsize(String bigsize) {
		this.bigsize = (bigsize.equals(" o")|bigsize.equals("o")) ? "큰스크린 있음" : ((bigsize.equals(" x")|bigsize.equals("x") ? "큰스크린 없음" : "잘못입력했습니다."));
	}	
	@Override
	public String toString() {
		return super.toString()+", bigsize="+bigsize;
	}
}

 