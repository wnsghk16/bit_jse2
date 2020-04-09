package com.jse.phone;
import javax.swing.JOptionPane;
import com.jse.util.Constants;

public class PhoneController {
	
	public static void main(String[] args) {
		PhoneService phoneservice = new PhoneService();
		String message ="";
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료합니다.");
				return;
			case "1":
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
					phoneservice.add(new Phone(values[0],values[1],values[2]));
				}
				break;
			case "2":
				Phone [] phones = phoneservice.getPhone();
				for(int i=0; i<3; i++) {
					message += phones[i].toString()+"\n";					
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				phoneservice.resetCount();
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.CELPHONE_MENU).split(",");
					phoneservice.add(new CelPhone(values[0],values[1],
							values[2],Boolean.parseBoolean(values[3])));
				}
				break;
			case "4":
				CelPhone [] celphones = phoneservice.getCelPhones();
				for(int i=0; i<3; i++) {
					message += celphones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null,message);
				break;
			case "5":
				phoneservice.resetCount();
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
					phoneservice.add(new Iphone(values[0],values[1],values[2],
							Boolean.parseBoolean(values[3]),values[4]));
				}
				break;
			case "6":
				Iphone[] iphones = phoneservice.getIphones();
				for(int i=0; i<3; i++) {
					message += iphones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "7":
				phoneservice.resetCount();
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GALAXYPHONE_MENU).split(",");
					phoneservice.add(new GalaxyNote(values[0],values[1],
							values[2],Boolean.parseBoolean(values[3]),values[4],values[5]));
				}
				break;
			case "8":
				GalaxyNote[] galaxynotes = phoneservice.getGalaxynotes();
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
