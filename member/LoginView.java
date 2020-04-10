package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton saveButton,cancelButton;  
	JPasswordField passwordField; 
	JTextField[] jtextfield;
	JLabel[] jlabel;
	
	public void open() {   
	     final JLabel label = new JLabel();            
	     label.setBounds(20,300, 400,50);  
	     final JPasswordField passwordfield = new JPasswordField();   
	     passwordfield.setBounds(100,75,200,30);   
	     
	     jlabel = new JLabel[5];
	     String[] name = {"이름","아이디","패스워드","주민번호","추가사항"};
	     for(int i=0; i<name.length; i++) {			
				jlabel[i] = new JLabel(name[i]);			
				this.add(jlabel[i]);
		}
	     
	     jlabel[0].setBounds(20,20,200,30); 
	     jlabel[1].setBounds(20,75,200,30);
	     jlabel[2].setBounds(20,130,200,30);
	     jlabel[3].setBounds(20,185,200,30);
	     jlabel[4].setBounds(20,230,200,30);
	     
	     saveButton = new JButton("가입");
	     saveButton.setBounds(50,385,100,30);
	     cancelButton = new JButton("취소");
	     cancelButton.setBounds(180,385,100,30);
	     saveButton.addActionListener(this);
	     cancelButton.addActionListener(this);
	     this.add(saveButton);
	     this.add(cancelButton);
	     
	     jtextfield = new JTextField[4];
			for(int i=0; i<jtextfield.length; i++) {
				jtextfield[i] = new JTextField();
				this.add(jtextfield[i]);
			}
			passwordField = new JPasswordField(); 
			this.add(passwordField);
			
			jtextfield[0].setBounds(100,20,200,30);
			passwordField.setBounds(100,75,200,30);  
			jtextfield[1].setBounds(100,130,200,30); 
			jtextfield[2].setBounds(100,185,200,30); 
			jtextfield[3].setBounds(100,230,200,120); 
			
	     this.add(label); 	    
	     this.setSize(400,500);
	     this.setLayout(null);
	     this.setVisible(true);			
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
	     this.setLocationRelativeTo(null);
		}
	@Override
	public void actionPerformed(ActionEvent e)  {
		
		if(e.getSource() == saveButton) {
			String data = "이름 : " + jtextfield[0].getText();
   		 data += "\n아이디 : " + jtextfield[1].getText()
   		 + "\n비밀번호 : " + new String(passwordField.getPassword())
   		 + "\n주민번호 : " + jtextfield[2].getText()
   		 + "\n추가사항 : " + jtextfield[3].getText();
			JOptionPane.showMessageDialog(this, data);   		 
		}else if(e.getSource() == cancelButton){
			JOptionPane.showMessageDialog(this, "취소했습니다.");
		}		
	} 
}