package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SearchIDPW extends JDialog {
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JTextField tfUserSeach;
	private JButton btnUserSearch;
	private JLabel lblNewLabel_2_4_2;
	private JLabel lblNewLabel_2_4_2_1;
	private JTextField textField_6;
	private JPanel panel_1;
	private JTextField textField;
	private JButton btnUserSearch_1;
	private JLabel lblNewLabel_2_4_2_2;
	private JLabel lblNewLabel_2_4_2_1_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2_4_2_2_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchIDPW dialog = new SearchIDPW();
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
	public SearchIDPW() {
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석. all rights reserved");
		setBounds(100, 100, 502, 306);
		getContentPane().setLayout(null);
		getContentPane().add(getTabbedPane());

	}

	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 25, 502, 263);
			tabbedPane.addTab("아이디 찾기", null, getPanel(), null);
			tabbedPane.addTab("비밀번호 찾기", null, getPanel_1_1(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getTfUserSeach());
			panel.add(getBtnUserSearch());
			panel.add(getLblNewLabel_2_4_2());
			panel.add(getLblNewLabel_2_4_2_1());
			panel.add(getTextField_6());
		}
		return panel;
	}
	private JTextField getTfUserSeach() {
		if (tfUserSeach == null) {
			tfUserSeach = new JTextField();
			tfUserSeach.setColumns(10);
			tfUserSeach.setBounds(145, 44, 130, 26);
		}
		return tfUserSeach;
	}
	private JButton getBtnUserSearch() {
		if (btnUserSearch == null) {
			btnUserSearch = new JButton("찾 기");
			btnUserSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnUserSearch.setBounds(175, 142, 130, 36);
		}
		return btnUserSearch;
	}
	private JLabel getLblNewLabel_2_4_2() {
		if (lblNewLabel_2_4_2 == null) {
			lblNewLabel_2_4_2 = new JLabel("이 름 :");
			lblNewLabel_2_4_2.setBounds(106, 49, 61, 16);
		}
		return lblNewLabel_2_4_2;
	}
	private JLabel getLblNewLabel_2_4_2_1() {
		if (lblNewLabel_2_4_2_1 == null) {
			lblNewLabel_2_4_2_1 = new JLabel("이메일 주소 :");
			lblNewLabel_2_4_2_1.setBounds(74, 86, 85, 16);
		}
		return lblNewLabel_2_4_2_1;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(145, 83, 270, 26);
		}
		return textField_6;
	}
	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getTextField());
			panel_1.add(getBtnUserSearch_1());
			panel_1.add(getLblNewLabel_2_4_2_2());
			panel_1.add(getLblNewLabel_2_4_2_1_1());
			panel_1.add(getTextField_1());
			panel_1.add(getLblNewLabel_2_4_2_2_1());
			panel_1.add(getTextField_2());
		}
		return panel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(140, 61, 130, 26);
		}
		return textField;
	}
	private JButton getBtnUserSearch_1() {
		if (btnUserSearch_1 == null) {
			btnUserSearch_1 = new JButton("찾 기");
			btnUserSearch_1.setBounds(175, 141, 130, 36);
		}
		return btnUserSearch_1;
	}
	private JLabel getLblNewLabel_2_4_2_2() {
		if (lblNewLabel_2_4_2_2 == null) {
			lblNewLabel_2_4_2_2 = new JLabel("이 름 :");
			lblNewLabel_2_4_2_2.setBounds(101, 66, 61, 16);
		}
		return lblNewLabel_2_4_2_2;
	}
	private JLabel getLblNewLabel_2_4_2_1_1() {
		if (lblNewLabel_2_4_2_1_1 == null) {
			lblNewLabel_2_4_2_1_1 = new JLabel("이메일 주소 :");
			lblNewLabel_2_4_2_1_1.setBounds(69, 99, 85, 16);
		}
		return lblNewLabel_2_4_2_1_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(140, 96, 270, 26);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_2_4_2_2_1() {
		if (lblNewLabel_2_4_2_2_1 == null) {
			lblNewLabel_2_4_2_2_1 = new JLabel("아이디 :");
			lblNewLabel_2_4_2_2_1.setBounds(93, 34, 61, 16);
		}
		return lblNewLabel_2_4_2_2_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(140, 29, 130, 26);
		}
		return textField_2;
	}
}
