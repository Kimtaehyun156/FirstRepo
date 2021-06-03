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
	 	
	 	뽑기 버튼을 누를때마다 6개의 중복없는 랜덤 숫자를 가진 버튼을  프레임에 띄우는 프로그램을 만들어보세여 
	 	
	 */
	static int count =1 ;
	
	public S02_Lotto() {
		
		
		setLayout( new GridLayout(1,7));
		
		// ※레이아웃 설정후 추가해야함※
		JButton draw_btn = new JButton("뽑기");
		JButton num_btn[] = new JButton[6];
		for( int i = 0; i<6; i++) {
			num_btn[i] = new JButton(String.valueOf(i+1)+"번");
			num_btn[i].setFont(new Font("바탕체",Font.BOLD ,20));
		}

		// 버튼의 폰트 설정 
		String[] strfont = {"궁서체","바탕체","고딕체"};
		draw_btn.setFont(new Font("바탕체",Font.BOLD ,20));
		
		draw_btn.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {
				// e.getSource()에는 액션이 발생한 컴포넌트의 인스턴스가 들어있고 
				// 다운캐스팅 하여 사용해야 한다.
				if( count != 0) {	
					((JButton) e.getSource()).setText(count+"번 뽑음");
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

		setTitle("로또번호 생성기");
		// 위치 설정 
		setLocation(450,150);
				
		// 프레임 크기 설정
		setSize(600,600);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임을 보이게 설정( 화면에그린다 )
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new S02_Lotto();
	}
}
