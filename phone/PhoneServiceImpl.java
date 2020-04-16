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
	public int count() {
		return count;
	}	
	@Override
	public void resetCount() {
		count=0;
	}

	@Override
	public Phone[] phoneList() {		
		return phones;
	}

	@Override
	public Phone[] phoneDetail() {
		return null;
	}

	@Override
	public CelPhone[] celphoneList() {
		return celphones;
	}

	@Override
	public CelPhone[] celphoneDetail() {
		return null;
	}

	@Override
	public Iphone[] iphoneList() {
		return iphones;
	}

	@Override
	public Iphone[] iphoneDetail() {
		return null;
	}

	@Override
	public GalaxyNote[] galaxynoteList() {
		return galaxynotes;
	}

	@Override
	public GalaxyNote[] galaxynoteDetail() {
		return null;
	}

	@Override
	public void update(Phone phone) {
		
	}

	@Override
	public void update(CelPhone celphone) {
		
	}

	@Override
	public void update(Iphone iphone) {
		
	}

	@Override
	public void update(GalaxyNote galaxynote) {
		
	}

	@Override
	public void delete(Phone phone) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(CelPhone celphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iphone iphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(GalaxyNote galaxynote) {
		// TODO Auto-generated method stub
		
	}
}