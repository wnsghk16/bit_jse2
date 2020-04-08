package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private CelPhone[] celphones;
	private int count;
	
	public PhoneService() {
		phones = new Phone[3];
		celphones = new CelPhone[3];
		count = 0;
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
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	public void addCelphone(CelPhone celphone) {
		celphones[count] = celphone;
		count++;
	}
}