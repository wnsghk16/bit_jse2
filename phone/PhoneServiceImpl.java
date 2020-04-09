package com.jse.phone;

public class PhoneServiceImpl implements PhoneService{
	private Phone[] phones;
	private CelPhone[] celphones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxynotes;
	private int count;
	
	public PhoneServiceImpl() {
		phones = new Phone[3];
		celphones = new CelPhone[3];
		iphones = new Iphone[3];
		galaxynotes = new GalaxyNote[3];
		count = 0;
	}
	@Override
	public void setPhone(Phone[] phones) {
		this.phones = phones;
	}
	@Override
	public Phone[] getPhone() {
		return phones;
	}
	@Override
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public CelPhone[] getCelPhones() {
		return celphones;
	}
	@Override
	public void setCelPhones(CelPhone[] celphones) {
		this.celphones = celphones;
	}
	@Override
	public Iphone[] getIphones() {
		return iphones;
	}
	@Override
	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}
	@Override
	public GalaxyNote[] getGalaxynotes() {
		return galaxynotes;
	}
	@Override
	public void setGalaxynotes(GalaxyNote[] galaxynotes) {
		this.galaxynotes = galaxynotes;
	}
	@Override
	public void add(Phone phone) {
		phones[count] = phone;
		count++;	
	}
	@Override
	public void add(CelPhone celphone) {
		celphones[count] = celphone;
		count++;
	}
	@Override
	public void add(Iphone iphone) {
		iphones[count] = iphone;
		count++;
	}
	@Override
	public void add(GalaxyNote galaxynote) {
		galaxynotes[count] = galaxynote;
		count++;
	}
	@Override
	public void resetCount() {
		count=0;
	}
}