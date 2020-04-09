package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CelPhone celphone);
	public void add(Iphone iphone);
	public void add(GalaxyNote galaxynote);
	public void setPhone(Phone[] phones);
	public Phone[] getPhone();
	public void setCount(int count);
	public int getCount();
	public CelPhone[] getCelPhones();
	public void setCelPhones(CelPhone[] celphones);
	public Iphone[] getIphones();
	public void setIphones(Iphone[] iphones);
	public GalaxyNote[] getGalaxynotes();
	public void setGalaxynotes(GalaxyNote[] galaxynotes);
	public void resetCount();
}
