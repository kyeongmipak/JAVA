package com.javalec.base;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MiniGame extends JDialog {
	private JLabel lbGameStart;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniGame dialog = new MiniGame();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public MiniGame() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLbGameStart());
		getContentPane().add(getLblNewLabel_1());

	}
	private JLabel getLbGameStart() {
		if (lbGameStart == null) {
			
			// 이미지 jlabel 사이즈 맞추기
			ImageIcon icon = new ImageIcon("/Users/kyeongmi/Desktop/혼밥생활.png"); 
			Image img = icon.getImage();
			Image changeImage = img.getScaledInstance(279, 130, Image.SCALE_DEFAULT);
			ImageIcon changeIcon = new ImageIcon(changeImage);
			lbGameStart = new JLabel(changeIcon);
			
			
			
			
			lbGameStart.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					GameMenu gameMenu = new GameMenu();
					gameMenu.setVisible(true); // 메뉴 출력 화면
					gameMenu.randomMenu(); // 랜덤 메뉴 정하기
					gameMenu.getMenu(); // 랜덤에 맞는 이미지 출력
					
				}
			});
			lbGameStart.setHorizontalAlignment(SwingConstants.CENTER);
			lbGameStart.setBounds(84, 48, 279, 130);
		}
		return lbGameStart;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("사진을 클릭하세요");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(130, 205, 190, 16);
		}
		return lblNewLabel_1;
	}
	
//	public void gotoGameMenu() {
//		
//		 GameMenu gameMenu = new GameMenu();
//		 gameMenu.setLocationRelativeTo(null);
//		 gameMenu.setVisible(true); //  창 보여주는 역할
//	}

	
}
