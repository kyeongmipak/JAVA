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
import javax.swing.JTextPane;

public class AdminMenu extends JDialog {
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel_2;
	private JTextField tfUserno;
	private JLabel lblNewLabel_2_1;
	private JTextField tfName;
	private JLabel lblNewLabel_2_2;
	private JTextField tfID;
	private JLabel lblNewLabel_2_3_1;
	private JTextField tfEmail;
	private JLabel lblNewLabel_2_4;
	private JTextField tfState;
	private JLabel lblNewLabel_2_4_1;
	private JTextField textField;
	private JLabel lblNewLabel_2_4_1_1;
	private JTextField textField_1;
	private JComboBox cbSelectSearch;
	private JTextField tfUserSeach;
	private JButton btnUserSearch;
	private JLabel lblNewLabel_3;
	private JButton button_1;
	private JButton button_1_1;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private JLabel lblNewLabel_3_1;
	private JPanel panel_3;
	private JComboBox cbSelectSearch_1;
	private JTextField textField_2;
	private JButton btnUserSearch_1;
	private JTextField textField_3;
	private JLabel lblNewLabel_4_1;
	private JTextField textField_4;
	private JLabel lblNewLabel_4_1_1;
	private JTextField tfNoticeDate;
	private JLabel lblNewLabel_4_1_2;
	private JButton btnUserSearch_1_1;
	private JLabel lblNewLabel_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_2_1_1;
	private JTextField tfInsertDate;
	private JLabel lblNewLabel_2_1_1_1;
	private JTextField tfDeleteDate;
	private JTextPane textPane;
	private JPanel panel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu dialog = new AdminMenu();
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
	public AdminMenu() {
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석. all rights reserved");
		setBounds(100, 100, 566, 633);
		getContentPane().setLayout(null);
		getContentPane().add(getTabbedPane());

	}

	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 25, 566, 586);
			tabbedPane.addTab("회원 관리", null, getPanel(), null);
			tabbedPane.addTab("공지사항 관리", null, getPanel_1(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getScrollPane());
			panel.add(getLblNewLabel_1());
			panel.add(getPanel_2());
			panel.add(getCbSelectSearch());
			panel.add(getTfUserSeach());
			panel.add(getBtnUserSearch());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_3());
			panel_1.add(getButton_1());
			panel_1.add(getButton_1_1());
			panel_1.add(getScrollPane_1());
			panel_1.add(getLblNewLabel_3_1());
			panel_1.add(getPanel_3());
			panel_1.add(getCbSelectSearch_1());
			panel_1.add(getTextField_2());
			panel_1.add(getBtnUserSearch_1());
			panel_1.add(getTextField_3());
			panel_1.add(getLblNewLabel_4_1());
			panel_1.add(getTextField_4());
			panel_1.add(getLblNewLabel_4_1_1());
			panel_1.add(getTfNoticeDate());
			panel_1.add(getLblNewLabel_4_1_2());
			panel_1.add(getBtnUserSearch_1_1());
			panel_1.add(getPanel_4());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("회원 목록");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel.setBounds(224, 6, 85, 28);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(6, 74, 522, 193);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
				}
			});
		}
		return table;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("상세 정보");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_1.setBounds(224, 279, 85, 28);
		}
		return lblNewLabel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(new Color(128, 128, 128)));
			panel_2.setBackground(UIManager.getColor("CheckBox.background"));
			panel_2.setBounds(6, 306, 521, 215);
			panel_2.setLayout(null);
			panel_2.add(getLblNewLabel_2());
			panel_2.add(getTfUserno());
			panel_2.add(getLblNewLabel_2_1());
			panel_2.add(getTfName());
			panel_2.add(getLblNewLabel_2_2());
			panel_2.add(getTfID());
			panel_2.add(getLblNewLabel_2_3_1());
			panel_2.add(getTfEmail());
			panel_2.add(getLblNewLabel_2_4());
			panel_2.add(getTfState());
			panel_2.add(getLblNewLabel_2_4_1());
			panel_2.add(getTextField());
			panel_2.add(getLblNewLabel_2_4_1_1());
			panel_2.add(getTextField_1());
			panel_2.add(getLblNewLabel_2_1_1());
			panel_2.add(getTfInsertDate());
			panel_2.add(getLblNewLabel_2_1_1_1());
			panel_2.add(getTfDeleteDate());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("회원번호 :");
			lblNewLabel_2.setBounds(21, 68, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfUserno() {
		if (tfUserno == null) {
			tfUserno = new JTextField();
			tfUserno.setEditable(false);
			tfUserno.setBounds(77, 63, 96, 26);
			tfUserno.setColumns(10);
		}
		return tfUserno;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("이     름 :");
			lblNewLabel_2_1.setBounds(21, 94, 61, 16);
		}
		return lblNewLabel_2_1;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setEditable(false);
			tfName.setColumns(10);
			tfName.setBounds(77, 89, 130, 26);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("I       D :");
			lblNewLabel_2_2.setBounds(21, 127, 61, 13);
		}
		return lblNewLabel_2_2;
	}
	private JTextField getTfID() {
		if (tfID == null) {
			tfID = new JTextField();
			tfID.setEditable(false);
			tfID.setColumns(10);
			tfID.setBounds(77, 122, 130, 18);
		}
		return tfID;
	}
	private JLabel getLblNewLabel_2_3_1() {
		if (lblNewLabel_2_3_1 == null) {
			lblNewLabel_2_3_1 = new JLabel("E-Mail :");
			lblNewLabel_2_3_1.setBounds(21, 152, 61, 16);
		}
		return lblNewLabel_2_3_1;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setEditable(false);
			tfEmail.setColumns(10);
			tfEmail.setBounds(77, 147, 219, 26);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_2_4() {
		if (lblNewLabel_2_4 == null) {
			lblNewLabel_2_4 = new JLabel("회원 상태:");
			lblNewLabel_2_4.setBounds(21, 38, 61, 16);
		}
		return lblNewLabel_2_4;
	}
	private JTextField getTfState() {
		if (tfState == null) {
			tfState = new JTextField();
			tfState.setEditable(false);
			tfState.setColumns(10);
			tfState.setBounds(77, 33, 96, 26);
		}
		return tfState;
	}
	private JLabel getLblNewLabel_2_4_1() {
		if (lblNewLabel_2_4_1 == null) {
			lblNewLabel_2_4_1 = new JLabel("게시글 :");
			lblNewLabel_2_4_1.setBounds(322, 107, 61, 16);
		}
		return lblNewLabel_2_4_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setColumns(10);
			textField.setBounds(367, 102, 54, 26);
		}
		return textField;
	}
	private JLabel getLblNewLabel_2_4_1_1() {
		if (lblNewLabel_2_4_1_1 == null) {
			lblNewLabel_2_4_1_1 = new JLabel("좋아요 :");
			lblNewLabel_2_4_1_1.setBounds(322, 136, 61, 16);
		}
		return lblNewLabel_2_4_1_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(367, 131, 54, 26);
		}
		return textField_1;
	}
	private JComboBox getCbSelectSearch() {
		if (cbSelectSearch == null) {
			cbSelectSearch = new JComboBox();
			cbSelectSearch.setModel(new DefaultComboBoxModel(new String[] {"회원상태", "ID", "이름"}));
			cbSelectSearch.setBounds(6, 35, 102, 27);
		}
		return cbSelectSearch;
	}
	private JTextField getTfUserSeach() {
		if (tfUserSeach == null) {
			tfUserSeach = new JTextField();
			tfUserSeach.setColumns(10);
			tfUserSeach.setBounds(120, 34, 297, 26);
		}
		return tfUserSeach;
	}
	private JButton getBtnUserSearch() {
		if (btnUserSearch == null) {
			btnUserSearch = new JButton("검 색");
			btnUserSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnUserSearch.setBounds(429, 34, 85, 29);
		}
		return btnUserSearch;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("공지사항 목록");
			lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_3.setBounds(230, 0, 85, 28);
		}
		return lblNewLabel_3;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("완 료");
			button_1.setBounds(414, 505, 91, 29);
		}
		return button_1;
	}
	private JButton getButton_1_1() {
		if (button_1_1 == null) {
			button_1_1 = new JButton("취 소");
			button_1_1.setBounds(323, 505, 91, 29);
		}
		return button_1_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(16, 69, 231, 151);
			scrollPane_1.setViewportView(getTable_1());
		}
		return scrollPane_1;
	}
	private JTable getTable_1() {
		if (table_1 == null) {
			table_1 = new JTable();
		}
		return table_1;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("공지사항 작성");
			lblNewLabel_3_1.setBackground(Color.WHITE);
			lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_3_1.setBounds(230, 239, 85, 28);
		}
		return lblNewLabel_3_1;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_3.setBounds(6, 267, 533, 267);
			panel_3.setLayout(null);
			panel_3.add(getLblNewLabel_4());
			panel_3.add(getTextField_5());
			panel_3.add(getTextPane());
		}
		return panel_3;
	}
	private JComboBox getCbSelectSearch_1() {
		if (cbSelectSearch_1 == null) {
			cbSelectSearch_1 = new JComboBox();
			cbSelectSearch_1.setModel(new DefaultComboBoxModel(new String[] {"제목", "내용"}));
			cbSelectSearch_1.setBounds(16, 32, 98, 27);
		}
		return cbSelectSearch_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(115, 31, 312, 26);
		}
		return textField_2;
	}
	private JButton getBtnUserSearch_1() {
		if (btnUserSearch_1 == null) {
			btnUserSearch_1 = new JButton("검 색");
			btnUserSearch_1.setBounds(439, 31, 85, 29);
		}
		return btnUserSearch_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(303, 65, 148, 26);
		}
		return textField_3;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("제    목");
			lblNewLabel_4_1.setBounds(259, 70, 61, 16);
		}
		return lblNewLabel_4_1;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(305, 123, 219, 89);
		}
		return textField_4;
	}
	private JLabel getLblNewLabel_4_1_1() {
		if (lblNewLabel_4_1_1 == null) {
			lblNewLabel_4_1_1 = new JLabel("작성일자");
			lblNewLabel_4_1_1.setBounds(259, 98, 61, 16);
		}
		return lblNewLabel_4_1_1;
	}
	private JTextField getTfNoticeDate() {
		if (tfNoticeDate == null) {
			tfNoticeDate = new JTextField();
			tfNoticeDate.setColumns(10);
			tfNoticeDate.setBounds(303, 93, 85, 26);
		}
		return tfNoticeDate;
	}
	private JLabel getLblNewLabel_4_1_2() {
		if (lblNewLabel_4_1_2 == null) {
			lblNewLabel_4_1_2 = new JLabel("내    용 ");
			lblNewLabel_4_1_2.setBounds(259, 131, 61, 16);
		}
		return lblNewLabel_4_1_2;
	}
	private JButton getBtnUserSearch_1_1() {
		if (btnUserSearch_1_1 == null) {
			btnUserSearch_1_1 = new JButton("수 정");
			btnUserSearch_1_1.setBounds(439, 213, 85, 29);
		}
		return btnUserSearch_1_1;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("제 목 :");
			lblNewLabel_4.setBounds(31, 11, 61, 16);
		}
		return lblNewLabel_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setBounds(73, 6, 434, 26);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel("가입일자 :");
			lblNewLabel_2_1_1.setBounds(312, 42, 61, 16);
		}
		return lblNewLabel_2_1_1;
	}
	private JTextField getTfInsertDate() {
		if (tfInsertDate == null) {
			tfInsertDate = new JTextField();
			tfInsertDate.setEditable(false);
			tfInsertDate.setColumns(10);
			tfInsertDate.setBounds(368, 37, 130, 26);
		}
		return tfInsertDate;
	}
	private JLabel getLblNewLabel_2_1_1_1() {
		if (lblNewLabel_2_1_1_1 == null) {
			lblNewLabel_2_1_1_1 = new JLabel("탈퇴일자 :");
			lblNewLabel_2_1_1_1.setBounds(312, 73, 61, 16);
		}
		return lblNewLabel_2_1_1_1;
	}
	private JTextField getTfDeleteDate() {
		if (tfDeleteDate == null) {
			tfDeleteDate = new JTextField();
			tfDeleteDate.setEditable(false);
			tfDeleteDate.setColumns(10);
			tfDeleteDate.setBounds(368, 68, 130, 26);
		}
		return tfDeleteDate;
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setBounds(17, 44, 499, 185);
		}
		return textPane;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_4.setBounds(6, 26, 533, 214);
		}
		return panel_4;
	}
}
