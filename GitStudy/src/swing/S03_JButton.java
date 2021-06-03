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
		
		JButton btn1 = new JButton("����������");
		
		// setBounds(x,y,width, height) : ��ư�� ��ġ�� ũ�⸦ ������ �ѹ����Ѵ�
		btn1.setBounds(100,100,100,100);
		
		//setText() : �ش� ������Ʈ�� �ؽ�Ʈ�� �����Ѵ� 
		btn1.setText("Push this button!");
		
		//setEnabled() : �ش� ������Ʈ�� Ȱ��ȭ / ��Ȱ��ȭ�Ѵ� 
		btn1.setEnabled(true);
		
		
		// setBackground() : �ش� ������Ʈ�� ������ �����Ѵ� 
		//btn1.setBackground(Color.black);
		btn1.setBackground(new Color(255,255,0));
		
		
		//setIcon() ; �ش� ������Ʈ�� �������� �����Ѵ� 
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
