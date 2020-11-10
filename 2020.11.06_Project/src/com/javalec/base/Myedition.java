package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Myedition extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton btnNewButton;
	private JLabel label;
	private JLabel lblId;
	private JLabel lblPw;
	private JLabel lblPw_1;
	private JLabel lblEmail;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_2_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Myedition dialog = new Myedition();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Myedition() {
		setTitle("회원정보");
		setBounds(100, 100, 450, 425);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getBtnNewButton());
		contentPanel.add(getLabel());
		contentPanel.add(getLblId());
		contentPanel.add(getLblPw());
		contentPanel.add(getLblPw_1());
		contentPanel.add(getLblEmail());
		contentPanel.add(getLabel_1());
		contentPanel.add(getLabel_2());
		contentPanel.add(getLabel_3());
		contentPanel.add(getTextField());
		contentPanel.add(getTextField_1());
		contentPanel.add(getTextField_2());
		contentPanel.add(getTextField_3());
		contentPanel.add(getTextField_4());
		contentPanel.add(getComboBox());
		contentPanel.add(getComboBox_1());
		contentPanel.add(getComboBox_2());
		contentPanel.add(getComboBox_2_1());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("완료");
			btnNewButton.setBounds(352, 17, 78, 29);
		}
		return btnNewButton;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("회원정보");
			label.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
			label.setBounds(19, 19, 78, 27);
		}
		return label;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("아이디 :");
			lblId.setBounds(86, 58, 41, 16);
		}
		return lblId;
	}
	private JLabel getLblPw() {
		if (lblPw == null) {
			lblPw = new JLabel("비밀번호 :");
			lblPw.setBounds(75, 86, 52, 16);
		}
		return lblPw;
	}
	private JLabel getLblPw_1() {
		if (lblPw_1 == null) {
			lblPw_1 = new JLabel("비밀번호 확인 :");
			lblPw_1.setBounds(51, 114, 80, 16);
		}
		return lblPw_1;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email : ");
			lblEmail.setBounds(86, 142, 46, 16);
		}
		return lblEmail;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("전화번호 :");
			label_1.setBounds(75, 168, 52, 16);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("성 별 :");
			label_2.setBounds(96, 196, 41, 16);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("생년월일 :");
			label_3.setBounds(75, 224, 52, 16);
		}
		return label_3;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(134, 53, 130, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(134, 81, 130, 26);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(134, 114, 130, 26);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(134, 142, 130, 26);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(134, 170, 130, 26);
		}
		return textField_4;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000"}));
			comboBox.setBounds(139, 220, 85, 27);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"남자", "여자"}));
			comboBox_1.setBounds(144, 192, 80, 27);
		}
		return comboBox_1;
	}
	private JComboBox getComboBox_2() {
		if (comboBox_2 == null) {
			comboBox_2 = new JComboBox();
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
			comboBox_2.setBounds(236, 220, 72, 27);
		}
		return comboBox_2;
	}
	private JComboBox getComboBox_2_1() {
		if (comboBox_2_1 == null) {
			comboBox_2_1 = new JComboBox();
			comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
			comboBox_2_1.setBounds(320, 220, 72, 27);
		}
		return comboBox_2_1;
	}
}
