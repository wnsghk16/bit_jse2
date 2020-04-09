package com.jse.grade;

import javax.swing.JOptionPane;
import com.jse.util.Constants;


public class GradeController {
	
	public static void main(String[] args) {
		
		GradeService gradeservice = new GradeServiceImpl();		
		Grade grade = null;
		while(true) {				
			switch(JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료합니다.");
				return;
			case "1":
				for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GRADE_INPUT).split(",");
					grade = new Grade();
					grade.setName(values[0]);
					grade.setKorean(Integer.parseInt(values[1]));
					grade.setEnglish(Integer.parseInt(values[2]));
					grade.setMath(Integer.parseInt(values[3]));
					gradeservice.add(grade);					
				}
				break;
			case "2":
				JOptionPane.showMessageDialog(null, gradeservice.printGrades());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, gradeservice.ranking());
				break;			
			default:
				JOptionPane.showMessageDialog(null,"잘못입력하셨습니다.");
				break;
			}			
			
		}
		
	}
}
