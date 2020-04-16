package com.jse.grade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Container;
import java.awt.Font;


public class GradeView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container container; 
    private JLabel title,nameLabel,koreanLabel, englishLabel,
    				mathLabel,javaLabel; 
    private JTextField nameText, koreanText, englishText, mathText,
    					javaText; 
    private JTextArea resultText; 
    private JButton submitButton, listButton; 
    public GradeService gradeservice;
	
	public GradeView() {
		gradeservice = new GradeServiceImpl();
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
  
        koreanLabel = new JLabel("Korean"); 
        koreanLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        koreanLabel.setSize(100, 20); 
        koreanLabel.setLocation(100, 150); 
        container.add(koreanLabel); 
  
        koreanText = new JTextField(); 
        koreanText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        koreanText.setSize(150, 20); 
        koreanText.setLocation(200, 150); 
        container.add(koreanText); 
  
        englishLabel = new JLabel("English"); 
        englishLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        englishLabel.setSize(100, 20); 
        englishLabel.setLocation(100, 200); 
        container.add(englishLabel); 
        
        englishText = new JTextField(); 
        englishText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        englishText.setSize(150, 20); 
        englishText.setLocation(200, 200); 
        container.add(englishText);
  
        mathLabel = new JLabel("Math"); 
        mathLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mathLabel.setSize(100, 20); 
        mathLabel.setLocation(100, 250); 
        container.add(mathLabel); 
        
        mathText = new JTextField(); 
        mathText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        mathText.setSize(150, 20); 
        mathText.setLocation(200, 250); 
        container.add(mathText);
  
        javaLabel = new JLabel("Java"); 
        javaLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        javaLabel.setSize(100, 20); 
        javaLabel.setLocation(100, 300); 
        container.add(javaLabel); 
        
        javaText = new JTextField(); 
        javaText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        javaText.setSize(150, 20); 
        javaText.setLocation(200, 300); 
        container.add(javaText);
        
  
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 20); 
        submitButton.setLocation(150, 450); 
        container.add(submitButton);
        submitButton.addActionListener(this);
  
        listButton = new JButton("List"); 
        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        listButton.setSize(100, 20); 
        listButton.setLocation(270, 450); 
        container.add(listButton); 
        listButton.addActionListener(this);
  
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
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submitButton) {
			nameText.setText("홍길동,유관순,이순신,신사임당,이도");
			koreanText.setText("95,45,78,66,67");
			englishText.setText("100,45,16,99,43");
			mathText.setText("77,99,98,100,23");
			javaText.setText("55,91,20,45,63");	
			
			String data = String.format("%s/%s/%s/%s/%s", 
					nameText.getText(),
					koreanText.getText(),
					englishText.getText(),
					mathText.getText(),
					javaText.getText());
			String[] arr = data.split("/");
			
			String[] name = arr[0].split(",");
			String[] korean = arr[1].split(",");
			String[] english = arr[1].split(",");
			String[] math = arr[1].split(",");
			String[] java = arr[1].split(",");
			
			Grade[] grades = new Grade[5];
			for(int i=0; i<arr.length; i++) {
				grades[i] = new Grade();
				grades[i].setName(name[i]);
				grades[i].setKorean(Integer.parseInt(korean[i]));
				grades[i].setEnglish(Integer.parseInt(english[i]));
				grades[i].setMath(Integer.parseInt(math[i]));
				grades[i].setJava(Integer.parseInt(java[i]));
				gradeservice.add(grades[i]);
			}
			JOptionPane.showMessageDialog(this, "저장했습니다.");
		}else if(e.getSource() == listButton) {
			Grade[] grades = gradeservice.list();
			String message = "";
			for(int i=0; i<grades.length; i++) {
				message += grades[i]+"\n";
			}
			resultText.setText(message);
			nameText.setText("");
			koreanText.setText("");
			englishText.setText("");
			mathText.setText("");
			javaText.setText("");			
		}
	}
}
