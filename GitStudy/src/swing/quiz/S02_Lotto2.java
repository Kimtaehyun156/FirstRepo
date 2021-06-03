package swing.quiz;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_Lotto2 extends JFrame {
	
	
	public S02_Lotto2() {
		setLayout(null);
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		btns.add(new S02_NumberButton(100,100));
		btns.add(new S02_NumberButton(190,100));
		btns.add(new S02_NumberButton(280,100));
		btns.add(new S02_NumberButton(370,100));
		btns.add(new S02_NumberButton(460,100));
		btns.add(new S02_NumberButton(550,100));
		
		JButton nextBtn = new S02_NextButton(100,300 ,btns);
		
		for( JButton btn : btns) {
			add(btn);
		}
		add(nextBtn);
		// 위치 설정 
		setLocation(450,150);
				
		// 프레임 크기 설정
		setSize(600,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S02_Lotto2();
	}
}
