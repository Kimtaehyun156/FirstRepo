package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_BorderLayout extends javax.swing.JFrame {

	public S02_BorderLayout() {

		
		/*
		 		# BorderLayout
		 		- 동서남북과 가운데로 이루어진 레이아웃
		 		- 컴포넌트를 추가할 때 위치를 함께 지정해 줄 수 있다 
		 */
		
		// 이 프레임의 레이아웃 설정 
		setLayout(new BorderLayout());
		
		
		// ※레이아웃 설정후 추가해야함※
		JButton quit_btn = new JButton("Quit");
		JButton delete_btn = new JButton("Delete");
		JButton	save_btn = new JButton("Save");
		
		
		// 버튼의 폰트 설정 
		quit_btn.setFont(new Font("궁서체",Font.BOLD ,35));
		delete_btn.setFont(new Font("맑은고딕",Font.ITALIC,20));
		save_btn.setFont(new Font("바탕체",Font.CENTER_BASELINE,15));
		Color backcolor =  new Color(120,255,0);
		
		// 버튼의 이벤트를 추가 
		quit_btn.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {
				System.out.println("눌린것 정보 1 :" + e.getActionCommand());
				System.out.println("눌린것 정보 2 :" + e.getID());
				System.out.println("눌린것 정보 3 :" + e.getModifiers());
				System.out.println("눌린것 정보 4 :" + e.getWhen());
				System.out.println("눌린것 정보 5 :" + e.getSource());
				
				// e.getSource()에는 액션이 발생한 컴포넌트의 인스턴스가 들어있고 
				// 다운캐스팅 하여 사용해야 한다.
				((JButton) e.getSource()).setText("눌렸음!");
			}
		});
		
		delete_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("눌린것 정보 1 :" + e.getActionCommand());
				((JButton) e.getSource()).setText("");
				((JButton) e.getSource()).setBackground(backcolor);
			}
		});
		
		
		save_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File file = new File("./data/text/TestSave.txt");
				FileOutputStream fout;
				try{
					fout = new FileOutputStream(file);
					fout.write(e.getID());
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				try {
					FileInputStream fin = new FileInputStream(file);
					int _byte;
					while((_byte=fin.read()) != -1) {
						System.out.print((char)_byte);
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		
		
		add(save_btn,BorderLayout.CENTER);
		add(new JButton("Load"),BorderLayout.EAST);
		add(delete_btn,BorderLayout.WEST);
		add(new JButton("Update"),BorderLayout.NORTH);
		add(quit_btn,BorderLayout.SOUTH);
		
		
		// 위치 설정 
		setLocation(450,150);
		
		// 프레임 크기 설정
		setSize(600,600);
		
		// X버튼을 눌렀을떄의 동작설정  EXIT_ON_CLOSE = 종료한다 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		// 프레임을 보이게 설정( 화면에그린다 )
		setVisible(true);
		

		
	}
	
	 public static void main(String[] args) {
		new S02_BorderLayout();
	}
}
