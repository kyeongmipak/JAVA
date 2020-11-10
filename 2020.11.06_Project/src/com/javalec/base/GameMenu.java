package com.javalec.base;

import java.awt.EventQueue;
import java.awt.Image;
import java.util.Random;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class GameMenu extends JDialog {
	private JLabel label;
	private JLabel lbImageMenu;
	private JTextField tfGameMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMenu dialog = new GameMenu();
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
	public GameMenu() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel());
		getContentPane().add(getLbImageMenu());
		getContentPane().add(getTfGameMenu());

	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("오늘의 추천 메뉴는");
			label.setBounds(42, 22, 104, 16);
		}
		return label;
	}
	private JLabel getLbImageMenu() {
		if (lbImageMenu == null) {
			lbImageMenu = new JLabel("");
			
			// 이미지 jlabel 사이즈 맞추기
			ImageIcon icon = new ImageIcon("/Users/kyeongmi/Desktop/혼밥생활.png"); 
			Image img = icon.getImage();
			Image changeImage = img.getScaledInstance(279, 130, Image.SCALE_DEFAULT);
			ImageIcon changeIcon = new ImageIcon(changeImage);
			lbImageMenu = new JLabel(changeIcon);
			lbImageMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
			lbImageMenu.setBounds(77, 50, 284, 147);
			
		}
		return lbImageMenu;
	}
	private JTextField getTfGameMenu() {
		if (tfGameMenu == null) {
			tfGameMenu = new JTextField();
			tfGameMenu.setEditable(false);
			tfGameMenu.setBounds(151, 205, 130, 26);
			tfGameMenu.setColumns(10);
		}
		return tfGameMenu;
	}
	
	
	//---------------------------------------------------
	// 랜덤메뉴 출려
	public void randomMenu() {
		Random random = new Random();
		String[] menuList = {"떡볶이", "라면", "비빔밥","김치볶음밥", "삼겹살", "오므라이스"};
		
		int mixSu = (int)(Math.random()*6);
		  switch(mixSu){
		  case 0 : tfGameMenu.setText(menuList[0]); break; 
		  case 1 : tfGameMenu.setText(menuList[1]); break; 
		  case 2 : tfGameMenu.setText(menuList[2]); break; 
		  case 3 : tfGameMenu.setText(menuList[3]); break; 
		  case 4 : tfGameMenu.setText(menuList[4]); break; 
		  case 5 : tfGameMenu.setText(menuList[5]); break; 
		  
		  }
	}
	
	//---------------------------------------------------
	// 출력 문구에 맞는 이미지 출력
	public void getMenu() {
		String imageRoot = "";
		ImageIcon icon = new ImageIcon(imageRoot); 
		Image img = icon.getImage();
		Image changeImage = img.getScaledInstance(279, 130, Image.SCALE_DEFAULT);
		ImageIcon changeIcon = new ImageIcon(changeImage);
		lbImageMenu = new JLabel(changeIcon);
		
		
		if(tfGameMenu.getText().equals("김치볶음밥")) {
			lbImageMenu.setIcon(new ImageIcon("/Users/kyeongmi/Desktop/김치볶음밥.png"));
		}
		
		if(tfGameMenu.getText().equals("떡볶이")) {
			lbImageMenu.setIcon(new ImageIcon("/Users/kyeongmi/Desktop/sample.png"));
		
		}
		
	}
		
}