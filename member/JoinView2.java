package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class JoinView2 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton saveButton,cancelButton;  
	JPasswordField passwordField; 
	JTextField[] jtextfield;
	JLabel[] jlabel;
	MemberService memberservice;
	
	public JoinView2() {
		memberservice = new MemberServiceImpl();
	}
	public void open() {
		this.setSize(500, 500); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true); 
		JPanel panel = new JPanel(); 
		this.add(panel); 
		
		jlabel = new JLabel[5];
				
		String[] name = {"이름","아이디","패스워드","주민번호","추가사항"};
		for(int i=0; i<name.length; i++) {			
			jlabel[i] = new JLabel(name[i]);			
			panel.add(jlabel[i]);
			
		}
		
		jtextfield = new JTextField[4];
		for(int i=0; i<jtextfield.length; i++) {
			jtextfield[i] = new JTextField();
			panel.add(jtextfield[i]);
		}
		passwordField = new JPasswordField(); 
		panel.add(passwordField); 
		
		saveButton = new JButton("저장"); 
		cancelButton = new JButton("취소"); 
		saveButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		panel.add(saveButton); 
		panel.add(cancelButton); 
		
		jlabel[0].setBounds(40,10,40,40); 
		jlabel[1].setBounds(40,50,40,40); 
		jlabel[2].setBounds(40,90,60,40); 
		jlabel[3].setBounds(40,130,60,40); 
		jlabel[4].setBounds(40,170,60,40); 
		
		jtextfield[0].setBounds(120,10,200,30); 
		jtextfield[1].setBounds(120,50,200,30); 
		passwordField.setBounds(120,90,200,30); 
		jtextfield[2].setBounds(120,130,280,30); 
		jtextfield[3].setBounds(120,180,280,120); 
		
		saveButton.setBounds(125, 330, 80, 30); 
		cancelButton.setBounds(240, 330, 80, 30); 
		this.setLocationRelativeTo(null);
		}
	@Override
	public void actionPerformed(ActionEvent e)  {		
		if(e.getSource() == saveButton) {		
						
			jtextfield[0].setText("홍길동,유관순,이순신,신사임당,이도");
			jtextfield[1].setText("hong,you,lee,shin,leedo");
			passwordField.setText("1,12,123,134,1234");
			jtextfield[2].setText("900101-1,960101-2,980101-1,011010-4,020606-3");
			jtextfield[3].setText("없음,없음,있음,없음,있음");
			
			
			String data = String.format("%s/%s/%s/%s/%s", 
					jtextfield[0].getText(),
					jtextfield[1].getText(),
					new String(passwordField.getPassword()),
					jtextfield[2].getText(),
					jtextfield[3].getText());
			
			String[] arr = data.split("/");
			
			String[] name = arr[0].split(",");
			String[] userid = arr[1].split(",");
			String[] passwd = arr[2].split(",");
			String[] idum = arr[3].split(",");
			String[] ect = arr[4].split(",");
			
			Member member = new Member();
			for(int i=0; i<5; i++) {
				member = new Member();
				member.setUserid(userid[i]);
				member.setPasswd(passwd[i]);
				member.setName(name[i]);
				member.setIdnum(idum[i]);
				member.setEct(ect[i]);
				memberservice.add(member);						
			}		
			
			Member[] members = memberservice.getMembers();
			String message ="";
			for(int i=0; i<members.length; i++) {
				message += members[i]+"\n";
			}
			JOptionPane.showMessageDialog(this, message);
		}else if(e.getSource() == cancelButton){
			JOptionPane.showMessageDialog(this, "취소했습니다.");
		}		
	} 
}
