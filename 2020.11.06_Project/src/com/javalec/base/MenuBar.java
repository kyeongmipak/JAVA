package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;

public class MenuBar extends JDialog {
	private JPanel sideBar;
	private JPanel homeMenu;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblHome;
	private JPanel noticeMenu;
	private JLabel lblHome_1;
	private JPanel recipeMenu;
	private JLabel lblHome_1_1;
	private JPanel recipeMenu_1;
	private JLabel lblHome_1_1_1;
	private JPanel miniGameMenu;
	private JLabel lblHome_1_1_1_1;
	private JPanel adminMenu;
	private JLabel label;
	private JPanel panel;
	private JPanel noticePanel;
	private JPanel homePanel;
	private JLabel label_1;
	private JLabel label_2;
	private JPanel admin;
	private JTabbedPane tabbedPane;
	private JPanel panel_1;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuBar dialog = new MenuBar();
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
	public MenuBar() {
		setBounds(100, 100, 664, 484);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
		getContentPane().add(getSideBar());

	}
	private JPanel getSideBar() {
		if (sideBar == null) {
			sideBar = new JPanel();
			sideBar.setBackground(SystemColor.activeCaptionBorder);
			sideBar.setBounds(0, 0, 224, 456);
			sideBar.setLayout(null);
			sideBar.add(getLblNewLabel_2());
			sideBar.add(getLblNewLabel_4());
			sideBar.add(getLblNewLabel_3());
			sideBar.add(getHomeMenu());
			sideBar.add(getNoticeMenu());
			sideBar.add(getRecipeMenu());
			sideBar.add(getRecipeMenu_1());
			sideBar.add(getMiniGameMenu());
			sideBar.add(getAdminMenu());
		}
		return sideBar;
	}
	private JPanel getHomeMenu() {
		if (homeMenu == null) {
			homeMenu = new JPanel();
			homeMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// home menu click 시 menu 화면출력 및 버튼 흰색으로 변경
					homePanel.setVisible(true);
					noticePanel.setVisible(false);
					getHomeMenu().setBackground(Color.white);				
					getNoticeMenu().setBackground(new Color(221, 160, 221));
					
					
				}
			});
			homeMenu.setBackground(new Color(221, 160, 221));
			homeMenu.setBounds(0, 134, 224, 44);
			homeMenu.setLayout(null);
			homeMenu.add(getLblHome());
		}
		return homeMenu;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("로그아웃");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(143, 487, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("혼밥생활");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(34, 65, 170, 57);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon("/Users/kyeongmi/Desktop/스크린샷 2020-11-07 오후 12.19.43.png"));
			lblNewLabel_4.setBounds(18, 24, 186, 44);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblHome() {
		if (lblHome == null) {
			lblHome = new JLabel("HOME");
			lblHome.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome.setBounds(67, 0, 89, 44);
		}
		return lblHome;
	}
	private JPanel getNoticeMenu() {
		if (noticeMenu == null) {
			noticeMenu = new JPanel();
			noticeMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					homePanel.setVisible(false);
					noticePanel.setVisible(true);
					getNoticeMenu().setBackground(Color.white);
					getHomeMenu().setBackground(new Color(221, 160, 221));
					
				}
			});
			noticeMenu.setLayout(null);
			noticeMenu.setBackground(new Color(221, 160, 221));
			noticeMenu.setBounds(0, 179, 224, 44);
			noticeMenu.add(getLblHome_1());
		}
		return noticeMenu;
	}
	private JLabel getLblHome_1() {
		if (lblHome_1 == null) {
			lblHome_1 = new JLabel("공지사항");
			lblHome_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome_1.setBounds(67, 0, 89, 44);
		}
		return lblHome_1;
	}
	private JPanel getRecipeMenu() {
		if (recipeMenu == null) {
			recipeMenu = new JPanel();
			recipeMenu.setLayout(null);
			recipeMenu.setBackground(new Color(221, 160, 221));
			recipeMenu.setBounds(0, 224, 224, 44);
			recipeMenu.add(getLblHome_1_1());
		}
		return recipeMenu;
	}
	private JLabel getLblHome_1_1() {
		if (lblHome_1_1 == null) {
			lblHome_1_1 = new JLabel("Recipe");
			lblHome_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome_1_1.setBounds(67, 0, 89, 44);
		}
		return lblHome_1_1;
	}
	private JPanel getRecipeMenu_1() {
		if (recipeMenu_1 == null) {
			recipeMenu_1 = new JPanel();
			recipeMenu_1.setLayout(null);
			recipeMenu_1.setBackground(new Color(221, 160, 221));
			recipeMenu_1.setBounds(0, 269, 224, 44);
			recipeMenu_1.add(getLblHome_1_1_1());
		}
		return recipeMenu_1;
	}
	private JLabel getLblHome_1_1_1() {
		if (lblHome_1_1_1 == null) {
			lblHome_1_1_1 = new JLabel("myPage");
			lblHome_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome_1_1_1.setBounds(67, 0, 89, 44);
		}
		return lblHome_1_1_1;
	}
	private JPanel getMiniGameMenu() {
		if (miniGameMenu == null) {
			miniGameMenu = new JPanel();
			miniGameMenu.setLayout(null);
			miniGameMenu.setBackground(new Color(221, 160, 221));
			miniGameMenu.setBounds(0, 314, 224, 44);
			miniGameMenu.add(getLblHome_1_1_1_1());
		}
		return miniGameMenu;
	}
	private JLabel getLblHome_1_1_1_1() {
		if (lblHome_1_1_1_1 == null) {
			lblHome_1_1_1_1 = new JLabel("miniGame\n");
			lblHome_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome_1_1_1_1.setBounds(67, 0, 89, 44);
		}
		return lblHome_1_1_1_1;
	}
	private JPanel getAdminMenu() {
		if (adminMenu == null) {
			adminMenu = new JPanel();
			adminMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
				}
			});
			adminMenu.setLayout(null);
			adminMenu.setBackground(new Color(221, 160, 221));
			adminMenu.setBounds(0, 359, 224, 44);
			adminMenu.add(getLabel());
		}
		return adminMenu;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("관리자 메뉴");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(67, 0, 89, 44);
		}
		return label;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(225, 0, 439, 523);
			panel.setLayout(new CardLayout(0, 0));
			panel.add(getAdmin(), "name_28639355250422");
			panel.add(getPanel_2_1(), "name_11753955479258");
			panel.add(getNoticePanel(), "name_11746695439519");
		}
		return panel;
	}
	private JPanel getNoticePanel() {
		if (noticePanel == null) {
			noticePanel = new JPanel();
			noticePanel.setBackground(new Color(0, 255, 0));
			noticePanel.setLayout(null);
			noticePanel.add(getLabel_1());
		}
		return noticePanel;
	}
	private JPanel getPanel_2_1() {
		if (homePanel == null) {
			homePanel = new JPanel();
			homePanel.setBackground(new Color(0, 255, 255));
			homePanel.setLayout(null);
			homePanel.add(getLabel_2());
		}
		return homePanel;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("공지사항");
			label_1.setBounds(159, 81, 61, 16);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("환영합니다.");
			label_2.setBounds(186, 238, 61, 16);
		}
		return label_2;
	}
	private JPanel getAdmin() {
		if (admin == null) {
			admin = new JPanel();
			admin.setLayout(null);
			admin.add(getTabbedPane());
		}
		return admin;
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(6, 6, 427, 454);
			tabbedPane.addTab("New tab", null, getPanel_1(), null);
			tabbedPane.addTab("New tab", null, getPanel_2(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
		}
		return panel_2;
	}
}
