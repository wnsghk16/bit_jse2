package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CelPhone celphone);
	public void add(Iphone iphone);
	public void add(GalaxyNote galaxynote);
	public Phone[] phoneList();
	public CelPhone[] celphoneList();
	public Iphone[] iphoneList();
	public GalaxyNote[] galaxynoteList();
	public Phone detail(Phone phone);
	public CelPhone detail(CelPhone celphone);
	public Iphone detail(Iphone iphone);
	public GalaxyNote detail(GalaxyNote galaxynote);
	public int count();
	public void resetCount();
	public void udate(Phone phone);
	public void udate(CelPhone celphone);
	public void update(Iphone iphone);
	public void update(GalaxyNote galaxynote);
	public void delete(Phone phone);
	public void delete(CelPhone celphone);
	public void delete(Iphone iphone);
	public void delete(GalaxyNote galaxynote);	
}
