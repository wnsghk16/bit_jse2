package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CelPhone celphone);
	public void add(Iphone iphone);
	public void add(GalaxyNote galaxynote);
	public Phone[] phoneList();
	public Phone[] phoneDetail();
	public CelPhone[] celphoneList();
	public CelPhone[] celphoneDetail();
	public Iphone[] iphoneList();
	public Iphone[] iphoneDetail();
	public GalaxyNote[] galaxynoteList();
	public GalaxyNote[] galaxynoteDetail();
	public int count();
	public void resetCount();
	public void update(Phone phone);
	public void update(CelPhone celphone);
	public void update(Iphone iphone);
	public void update(GalaxyNote galaxynote);
	public void delete(Phone phone);
	public void delete(CelPhone celphone);
	public void delete(Iphone iphone);
	public void delete(GalaxyNote galaxynote);	
}
