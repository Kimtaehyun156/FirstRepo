package swing.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_Lotto extends javax.swing.JFrame{
	
	/*
	 	
	 	�̱� ��ư�� ���������� 6���� �ߺ����� ���� ���ڸ� ���� ��ư��  �����ӿ� ���� ���α׷��� �������� 
	 	
	 */
	static int count =1 ;
	
	public S02_Lotto() {
		
		
		setLayout( new GridLayout(1,7));
		
		// �ط��̾ƿ� ������ �߰��ؾ��ԡ�
		JButton draw_btn = new JButton("�̱�");
		JButton num_btn[] = new JButton[6];
		for( int i = 0; i<6; i++) {
			num_btn[i] = new JButton(String.valueOf(i+1)+"��");
			num_btn[i].setFont(new Font("����ü",Font.BOLD ,20));
		}

		// ��ư�� ��Ʈ ���� 
		String[] strfont = {"�ü�ü","����ü","���ü"};
		draw_btn.setFont(new Font("����ü",Font.BOLD ,20));
		
		draw_btn.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {
				// e.getSource()���� �׼��� �߻��� ������Ʈ�� �ν��Ͻ��� ����ְ� 
				// �ٿ�ĳ���� �Ͽ� ����ؾ� �Ѵ�.
				if( count != 0) {	
					((JButton) e.getSource()).setText(count+"�� ����");
					count++;
					
					if( count >= 11) {
						System.exit(0);
					}
					
					int Lotto[] = new int[6];
					for( int i = 0; i<Lotto.length; i++ ) {
						Lotto[i] = (int)(Math.random()*45)+1;
						for(int j = 0; j<i; j++) {
							if(Lotto[i]== Lotto[j]) {
								i--;
								break;
							}
						}
					}
					
					for( int i = 0; i<6; i++) {
						num_btn[i].setText(String.valueOf(Lotto[i]));
						num_btn[i].setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
						num_btn[i].setFont(new Font(strfont[(int)Math.random()*3],Font.BOLD ,(int)(Math.random()*50)+1));
					}
				
					draw_btn.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
					draw_btn.setFont(new Font(strfont[(int)Math.random()*3],Font.BOLD ,(int)(Math.random()*50)+1));
				}
			}
		});
		
		for( int i = 0; i<6; i++) {
			add(num_btn[i]);
		}

		add(draw_btn);

		setTitle("�ζǹ�ȣ ������");
		// ��ġ ���� 
		setLocation(450,150);
				
		// ������ ũ�� ����
		setSize(600,600);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �������� ���̰� ����( ȭ�鿡�׸��� )
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new S02_Lotto();
	}
}
