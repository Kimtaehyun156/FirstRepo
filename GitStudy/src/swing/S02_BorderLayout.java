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
		 		- �������ϰ� ����� �̷���� ���̾ƿ�
		 		- ������Ʈ�� �߰��� �� ��ġ�� �Բ� ������ �� �� �ִ� 
		 */
		
		// �� �������� ���̾ƿ� ���� 
		setLayout(new BorderLayout());
		
		
		// �ط��̾ƿ� ������ �߰��ؾ��ԡ�
		JButton quit_btn = new JButton("Quit");
		JButton delete_btn = new JButton("Delete");
		JButton	save_btn = new JButton("Save");
		
		
		// ��ư�� ��Ʈ ���� 
		quit_btn.setFont(new Font("�ü�ü",Font.BOLD ,35));
		delete_btn.setFont(new Font("�������",Font.ITALIC,20));
		save_btn.setFont(new Font("����ü",Font.CENTER_BASELINE,15));
		Color backcolor =  new Color(120,255,0);
		
		// ��ư�� �̺�Ʈ�� �߰� 
		quit_btn.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ ���� 1 :" + e.getActionCommand());
				System.out.println("������ ���� 2 :" + e.getID());
				System.out.println("������ ���� 3 :" + e.getModifiers());
				System.out.println("������ ���� 4 :" + e.getWhen());
				System.out.println("������ ���� 5 :" + e.getSource());
				
				// e.getSource()���� �׼��� �߻��� ������Ʈ�� �ν��Ͻ��� ����ְ� 
				// �ٿ�ĳ���� �Ͽ� ����ؾ� �Ѵ�.
				((JButton) e.getSource()).setText("������!");
			}
		});
		
		delete_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ ���� 1 :" + e.getActionCommand());
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
		
		
		// ��ġ ���� 
		setLocation(450,150);
		
		// ������ ũ�� ����
		setSize(600,600);
		
		// X��ư�� ���������� ���ۼ���  EXIT_ON_CLOSE = �����Ѵ� 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		// �������� ���̰� ����( ȭ�鿡�׸��� )
		setVisible(true);
		

		
	}
	
	 public static void main(String[] args) {
		new S02_BorderLayout();
	}
}
