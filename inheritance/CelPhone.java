package com.jse.inheritance;

public class CelPhone extends Phone{
	private boolean portable;
	private String move;
	
	public CelPhone(String phonenumber, String name, String company,boolean portable) {
		super(phonenumber, name, company);
		this.portable = portable;
		this.move = move;
	}		
	public void setPortable(boolean portable) {
		if(portable) {
			this.move = "휴대 가능";
		}else {
			this.move = "휴대 불가능";
		}
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

}
 