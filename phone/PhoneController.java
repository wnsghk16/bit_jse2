package com.jse.phone;
import javax.swing.JOptionPane;
import com.jse.util.Constants;

public class PhoneController {
	
	public static void main(String[] args) {
		PhoneService phoneservice = new PhoneServiceImpl();
		String message ="";
		Phone phone = null;
		CelPhone celphone = null;
		Iphone iphone = null;
		GalaxyNote galaxynote = null;
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료합니다.");
				return;
			case "1":
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
					phone = new Phone();
					phone.setPhonenumber(values[0]);
					phone.setName(values[1]);
					phone.setCompany(values[2]);
					phoneservice.add(phone);
				}
				break;
			case "2":
				Phone [] phones = phoneservice.phoneList();
				for(int i=0; i<3; i++) {
					message += phones[i].toString()+"\n";					
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				phoneservice.resetCount();
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.CELPHONE_MENU).split(",");
					celphone = new CelPhone();
					celphone.setPhonenumber(values[0]);
					celphone.setName(values[1]);
					celphone.setCompany(values[2]);
					celphone.setPortable(Boolean.parseBoolean(values[3]));
					phoneservice.add(celphone);
				}
				break;
			case "4":
				CelPhone [] celphones = phoneservice.celphoneList();
				for(int i=0; i<3; i++) {
					message += celphones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null,message);
				break;
			case "5":
				phoneservice.resetCount();
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
					iphone = new Iphone();
					iphone.setPhonenumber(values[0]);
					iphone.setName(values[1]);
					iphone.setCompany(values[2]);
					iphone.setPortable(Boolean.parseBoolean(values[3]));
					iphone.setSearch(values[4]);
					phoneservice.add(iphone);
				}
				break;
			case "6":
				Iphone[] iphones = phoneservice.iphoneList();
				for(int i=0; i<3; i++) {
					message += iphones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "7":
				phoneservice.resetCount();
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GALAXYPHONE_MENU).split(",");
					galaxynote = new GalaxyNote();
					galaxynote.setPhonenumber(values[0]);
					galaxynote.setName(values[1]);
					galaxynote.setCompany(values[2]);
					galaxynote.setPortable(Boolean.parseBoolean(values[3]));
					galaxynote.setSearch(values[4]);
					galaxynote.setBigsize(values[5]);
					phoneservice.add(galaxynote);
				}
				break;
			case "8":
				GalaxyNote[] galaxynotes = phoneservice.galaxynoteList();
				for(int i=0; i<3; i++) {
					message += galaxynotes[i].toString()+"\n";					
				}
				JOptionPane.showMessageDialog(null, message);
				break;
				default:
					break;
			}
		}
	}
}
