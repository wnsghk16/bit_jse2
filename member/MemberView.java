package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Font;


public class MemberView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordText; 
	private Container container; 
    private JLabel title,nameLabel,useridLabel,passwordLabel,
    				ssnLabel,addrLabel; 
    private JTextField nameText, useridText, ssnText,
    					addrText; 
    private JTextArea resultText; 
    private JButton submitButton, listButton, loginButton, detailButton, nameButton,
    				genderButton, countButton, updateButton, deleteButton; 
    public MemberService memberService;
	
	public MemberView() {
		memberService = new MemberServiceImpl();
	}
	public void open() {
    	setTitle("Swing Exercise"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        container = getContentPane(); 
        container.setLayout(null); 
  
        title = new JLabel("Swing Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        container.add(title); 
  
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nameLabel.setSize(100, 20); 
        nameLabel.setLocation(100, 100); 
        container.add(nameLabel); 
  
        nameText = new JTextField(); 
        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        nameText.setSize(190, 20); 
        nameText.setLocation(200, 100); 
        container.add(nameText); 
  
        useridLabel = new JLabel("Userid"); 
        useridLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        useridLabel.setSize(100, 20); 
        useridLabel.setLocation(100, 150); 
        container.add(useridLabel); 
  
        useridText = new JTextField(); 
        useridText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        useridText.setSize(190, 20); 
        useridText.setLocation(200, 150); 
        container.add(useridText); 
  
        passwordLabel = new JLabel("Password"); 
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        passwordLabel.setSize(100, 20); 
        passwordLabel.setLocation(100, 200); 
        container.add(passwordLabel); 
        
        passwordText = new JPasswordField(); 
        passwordText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        passwordText.setSize(190, 20); 
        passwordText.setLocation(200, 200); 
        container.add(passwordText);
  
        ssnLabel = new JLabel("SSN"); 
        ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        ssnLabel.setSize(100, 20); 
        ssnLabel.setLocation(100, 250); 
        container.add(ssnLabel); 
        
        ssnText = new JTextField(); 
        ssnText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        ssnText.setSize(190, 20); 
        ssnText.setLocation(200, 250); 
        container.add(ssnText);
  
        addrLabel = new JLabel("Address"); 
        addrLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        addrLabel.setSize(100, 20); 
        addrLabel.setLocation(100, 300); 
        container.add(addrLabel); 
        
        addrText = new JTextField(); 
        addrText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        addrText.setSize(190, 20); 
        addrText.setLocation(200, 300); 
        container.add(addrText);
        
  
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 20); 
        submitButton.setLocation(90, 350); 
        container.add(submitButton);
        submitButton.addActionListener(this);
  
        listButton = new JButton("List"); 
        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        listButton.setSize(100, 20); 
        listButton.setLocation(210, 350); 
        container.add(listButton); 
        listButton.addActionListener(this);
        
        loginButton = new JButton("Login"); 
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        loginButton.setSize(100, 20); 
        loginButton.setLocation(330, 350); 
        container.add(loginButton); 
        loginButton.addActionListener(this);
        
        detailButton = new JButton("Detail"); 
        detailButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        detailButton.setSize(100, 20); 
        detailButton.setLocation(90, 400); 
        container.add(detailButton);
        detailButton.addActionListener(this);
  
        nameButton = new JButton("Name"); 
        nameButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        nameButton.setSize(100, 20); 
        nameButton.setLocation(210, 400); 
        container.add(nameButton); 
        nameButton.addActionListener(this);
        
        genderButton = new JButton("Gender"); 
        genderButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        genderButton.setSize(100, 20); 
        genderButton.setLocation(330, 400); 
        container.add(genderButton); 
        genderButton.addActionListener(this);
        
        countButton = new JButton("Count"); 
        countButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        countButton.setSize(100, 20); 
        countButton.setLocation(90, 450); 
        container.add(countButton);
        countButton.addActionListener(this);
  
        updateButton = new JButton("Update"); 
        updateButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        updateButton.setSize(100, 20); 
        updateButton.setLocation(210, 450); 
        container.add(updateButton); 
        updateButton.addActionListener(this);
        
        deleteButton = new JButton("Delete"); 
        deleteButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        deleteButton.setSize(100, 20); 
        deleteButton.setLocation(330, 450); 
        container.add(deleteButton); 
        deleteButton.addActionListener(this);
  
        resultText = new JTextArea(); 
        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        resultText.setSize(300, 400); 
        resultText.setLocation(500, 100); 
        resultText.setLineWrap(true); 
        resultText.setEditable(false); 
        container.add(resultText); 
 
        setVisible(true);         
	}
	@Override
	public void actionPerformed(ActionEvent e)  {		
		if(e.getSource() == submitButton) {		
				
			nameText.setText("홍길동,유관순,이순신,신사임당,홍길동");
			useridText.setText("hong,you,lee,shin,leedo");
			passwordText.setText("1,12,123,134,1234");
			ssnText.setText("900101-1,960101-2,980101-1,011010-4,020606-3");
			addrText.setText("서울,서울,서울,부산,부산");
						
			String data = String.format("%s/%s/%s/%s/%s", 
					nameText.getText(),
					useridText.getText(),
					new String(passwordText.getPassword()),
					ssnText.getText(),
					addrText.getText());
			
			String[] arr = data.split("/");
			
			String[] name = arr[0].split(",");
			String[] userid = arr[1].split(",");
			String[] passwd = arr[2].split(",");
			String[] idum = arr[3].split(",");
			String[] adress = arr[4].split(",");
			
			Member member = null;
			for(int i=0; i<name.length; i++) {
				member = new Member();
				member.setUserid(userid[i]);
				member.setPasswd(passwd[i]);
				member.setName(name[i]);
				member.setSsn(idum[i]);
				member.setAddr(adress[i]);
				memberService.add(member);				
			}
			JOptionPane.showMessageDialog(this, "저장했습니다.");
		}else if(e.getSource() == listButton){
			Member[] members = memberService.list();
			String message ="";
			for(int i=0; i<members.length; i++) {
				message += members[i]+"\n";
			}
			resultText.setText(message);	
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");
		}else if(e.getSource() == loginButton) {			
			Member member = new Member();
			member.setName(nameText.getText());			
			member.setUserid(useridText.getText());
			member.setPasswd(passwordText.getText());
			member.setSsn(ssnText.getText());
			member.setAddr(addrText.getText());
			
			Member result = memberService.login(member);				
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");	
			if(result != null) { // 주소값 없을때
				resultText.setText("로그인성공\n"+result);
			}else {
				resultText.setText("로그인실패");
			}	
		}else if(e.getSource() == detailButton) {	
			Member result = memberService.detail(useridText.getText());			
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");	
			if(result != null) {
				resultText.setText("일치하는 회원을 찾았습니다.\n"+result);
			}else {
				resultText.setText("일치하는 아이디가 없습니다.");
			}			
		}else if(e.getSource() == nameButton) {
			String name = nameText.getText();
			int searchCount = memberService.count(name);
			Member[] result = memberService.searchByName(name,searchCount);
			String message = "";
			for(int i=0; i<searchCount; i++) {
				message += result[i]+"\n";
			}
			if(result != null) {
				resultText.setText("일치하는 회원을 찾았습니다.\n"+message);					
			}else {		
				resultText.setText("일치하는 이름이 없습니다.");
			}
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");
		}else if(e.getSource() == genderButton) {
			memberService.searchByGender(ssnText.getText());
			
		}else if(e.getSource() == countButton) {
			resultText.setText(String.valueOf(memberService.count()));
		}else if(e.getSource() == updateButton) {
			Member member = new Member();
			member.setName(nameText.getText());			
			member.setUserid(useridText.getText());
			member.setPasswd(passwordText.getText());
			member.setSsn(ssnText.getText());
			member.setAddr(addrText.getText());			
			memberService.update(member);
			resultText.setText("비밀번호 변경 성공\n"+memberService.detail(member.getUserid()));
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");
		}else if(e.getSource() == deleteButton) {
			Member deleteMember = new Member();
			deleteMember.setUserid(useridText.getText());
			deleteMember.setPasswd(passwordText.getText());
			memberService.delete(deleteMember);
			resultText.setText("삭제성공");
			/*
			Member member = new Member();
			member.setName(nameText.getText());			
			member.setUserid(useridText.getText());
			member.setPasswd(passwordText.getText());
			member.setSsn(ssnText.getText());
			member.setAddr(addrText.getText());	
			Member[] result = memberService.delete(member,memberService.count(member));			
			String message ="";
			
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");
			if(result != null) {
				for(int i=0; i<memberService.count(); i++) {
					message += result[i]+"\n";
				}
				resultText.setText("회원삭제성공\n"+message);
			}else {
				resultText.setText("회원삭제실패");
			}*/	
		}
	} 
}
