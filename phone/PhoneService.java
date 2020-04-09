package com.jse.phone;

public class PhoneService {
	private Phone[] phones;
	private CelPhone[] celphones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxynotes;
	private int count;
	
	public PhoneService() {
		phones = new Phone[3];
		celphones = new CelPhone[3];
		iphones = new Iphone[3];
		galaxynotes = new GalaxyNote[3];
		count = 0;
	}
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}	
	public void add(CelPhone celphone) {
		celphones[count] = celphone;
		count++;
	}
	public void add(Iphone iphone) {
		iphones[count] = iphone;
		count++;
	}
	public void add(GalaxyNote galaxynote) {
		galaxynotes[count] = galaxynote;
		count++;
	}
	public void setPhone(Phone[] phones) {
		this.phones = phones;
	}
	public Phone[] getPhone() {
		return phones;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public CelPhone[] getCelPhones() {
		return celphones;
	}
	public void setCelPhones(CelPhone[] celphones) {
		this.celphones = celphones;
	}
	public Iphone[] getIphones() {
		return iphones;
	}
	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}	
	public GalaxyNote[] getGalaxynotes() {
		return galaxynotes;
	}
	public void setGalaxynotes(GalaxyNote[] galaxynotes) {
		this.galaxynotes = galaxynotes;
	}
	public void resetCount() {
		count=0;
	}
}