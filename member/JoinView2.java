package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class JoinView2 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton saveButton,listButton, loginButton;  
	JPasswordField passwordField; 
	JTextArea jtextarea;
	JLabel areaLabel;
	JTextField[] jtextfield;
	JLabel[] jlabel;
	MemberService memberservice;
	
	public JoinView2() {
		memberservice = new MemberServiceImpl();
	}
	public void open() {
		this.setSize(600,600); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true); 
		JPanel panel = new JPanel(); 
		this.add(panel); 
		
		jlabel = new JLabel[6];
				
		String[] name = {"이름","아이디","패스워드","주민번호","추가사항","검색결과"};
		for(int i=0; i<name.length-1; i++) {			
			jlabel[i] = new JLabel(name[i]);			
			panel.add(jlabel[i]);
			
		}
		areaLabel = new JLabel();
		panel.add(areaLabel);
		
		jtextfield = new JTextField[4];
		for(int i=0; i<jtextfield.length; i++) {
			jtextfield[i] = new JTextField();
			panel.add(jtextfield[i]);
		}
		
		jtextarea = new JTextArea();
		panel.add(jtextarea);
		passwordField = new JPasswordField(); 
		panel.add(passwordField); 
		
		saveButton = new JButton("저장"); 
		listButton = new JButton("목록");
		loginButton = new JButton("로그인");
		saveButton.addActionListener(this);
		listButton.addActionListener(this);
		loginButton.addActionListener(this);
		
		panel.add(saveButton); 
		panel.add(listButton);
		panel.add(loginButton); 
		
		jlabel[0].setBounds(40,10,40,40); 
		jlabel[1].setBounds(40,50,40,40); 
		jlabel[2].setBounds(40,90,60,40); 
		jlabel[3].setBounds(40,130,40,40); 
		jlabel[4].setBounds(40,170,60,40); 
		areaLabel.setBounds(40,210,60,40); 
		
		jtextfield[0].setBounds(120,10,200,30); 
		jtextfield[1].setBounds(120,50,200,30); 
		passwordField.setBounds(120,90,200,30); 
		jtextfield[2].setBounds(120,130,280,30); 
		jtextfield[3].setBounds(120,180,280,30); 
		jtextarea.setBounds(120,220,280,150);
		
		saveButton.setBounds(125,400,80,30);
		listButton.setBounds(240,400,80,30);
		loginButton.setBounds(340,400,80,30); 
		
		this.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e)  {		
		if(e.getSource() == saveButton) {		
						
			jtextfield[0].setText("홍길동,유관순,이순신,신사임당,이도");
			jtextfield[1].setText("hong,you,lee,shin,leedo");
			passwordField.setText("1,12,123,134,1234");
			jtextfield[2].setText("900101-1,960101-2,980101-1,011010-4,020606-3");
			jtextarea.setText("없음,없음,있음,없음,있음");
			
			
			String data = String.format("%s/%s/%s/%s/%s", 
					jtextfield[0].getText(),
					jtextfield[1].getText(),
					new String(passwordField.getPassword()),
					jtextfield[2].getText(),
					jtextarea.getText());
			
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
			JOptionPane.showMessageDialog(this, "저장했습니다.");
		}else if(e.getSource() == listButton){
			Member[] members = memberservice.getMembers();
			String message ="";
			for(int i=0; i<members.length; i++) {
				message += members[i]+"\n";
			}
			jtextarea.setText(message);	
			jtextfield[0].setText("");
			jtextfield[1].setText("");
			passwordField.setText("");
			jtextfield[2].setText("");
		}		
	} 
}
