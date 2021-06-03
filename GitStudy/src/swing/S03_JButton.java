package swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import swing.quiz.S03_KakaoimageButton;

public class S03_JButton extends JFrame {


	private static final long serialVersionUID = 1L;

	public S03_JButton() {
		
		setLayout(null);
		
		JButton btn1 = new JButton("눌러보세요");
		
		// setBounds(x,y,width, height) : 버튼의 위치와 크기를 설정을 한번에한다
		btn1.setBounds(100,100,100,100);
		
		//setText() : 해당 컴포넌트의 텍스트를 변경한다 
		btn1.setText("Push this button!");
		
		//setEnabled() : 해당 컴포넌트의 활성화 / 비활성화한다 
		btn1.setEnabled(true);
		
		
		// setBackground() : 해당 컴포넌트의 배경색을 변경한다 
		//btn1.setBackground(Color.black);
		btn1.setBackground(new Color(255,255,0));
		
		
		//setIcon() ; 해당 컴포넌트의 아이콘을 설정한다 
		btn1.setIcon(new ImageIcon("./data/text/1.png"));
		
		add(btn1);
		
		add(new S03_KakaoimageButton(S03_KakaoimageButton.RYON, 100, 300, 100, 100));
		add(new S03_KakaoimageButton(S03_KakaoimageButton.APHEACH, 100, 400, 100, 100));
		add(new S03_KakaoimageButton(S03_KakaoimageButton.MUJI, 100, 500, 100, 100));
		add(new S03_KakaoimageButton(S03_KakaoimageButton.TUBE, 100, 600, 100, 100));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(450,150);
		setSize(800,800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S03_JButton();
	}

}
