package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {

	
	/*
	 	# SWing
	 	- Java�� ������ GUI ���α׷��� ����� �ִ� API 
	 	
	 	# Container 
	 	- ������Ʈ�� �߰��� �� �ִ� �� 
	 	- JFrame , JPanel , JDialog ... ��
	 	- �����̳ʸ��� ���ϴ� ���̾ƿ��� ������ �� �ִ� 
	 	
	 	# Component
	 	- �����̳ʿ� �߰��� �� �ִ� ��ǰ
	 	- JButton , JTable, Jslider , JMenu ...�� 
	 	
	 	# �����̳ʿ� ���ϴ� ������Ʈ�� �ٿ��� GUI ȯ���� ������ִ� 
	 */
	
	
	public static void main(String[] args) {
		
		/*
		 	# JFrame
		 	- ������ �����̳�. �پ��� ������Ʈ���� �߰��� �� �ִ�
		 */
		JFrame frame = new JFrame();
		
		JButton btn1 = new JButton("This is Button");
		btn1.setLocation(100,100);
		btn1.setSize(200,50);
		
		frame.add(btn1);
		
		frame.setLocation(450,150);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);

	}
}
