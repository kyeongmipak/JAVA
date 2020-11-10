package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class RevisePost extends JDialog {
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_1;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1_1_1;
	private JComboBox comboBox_1;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RevisePost dialog = new RevisePost();
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
	public RevisePost() {
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석. all rights reserved");
		setBounds(100, 100, 600, 600);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTextField());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getTextField_1());
		getContentPane().add(getLblNewLabel_1_1());
		getContentPane().add(getComboBox());
		getContentPane().add(getLblNewLabel_1_1_1());
		getContentPane().add(getComboBox_1());
		getContentPane().add(getTextArea());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_1_1());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("제목 : ");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(38, 42, 70, 27);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			textField.setBounds(107, 39, 386, 32);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("작성자 : ");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel_1.setBounds(38, 93, 70, 27);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			textField_1.setColumns(10);
			textField_1.setBounds(107, 90, 168, 32);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("메뉴 : ");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(39, 141, 70, 27);
		}
		return lblNewLabel_1_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "밥 요리", "면 요리", "기타"}));
			comboBox.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			comboBox.setBounds(115, 135, 120, 41);
		}
		return comboBox;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("조리 시간 : ");
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(299, 141, 84, 27);
		}
		return lblNewLabel_1_1_1;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "10분 이내", "20분 이내", "30분 이내"}));
			comboBox_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			comboBox_1.setBounds(389, 135, 120, 41);
		}
		return comboBox_1;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(43, 243, 508, 275);
		}
		return textArea;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("수정");
			btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnNewButton.setForeground(new Color(65, 105, 225));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(446, 527, 90, 44);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("취소");
			btnNewButton_1.setForeground(new Color(0, 0, 0));
			btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnNewButton_1.setBounds(338, 527, 90, 44);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("삭제");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1_1.setForeground(Color.RED);
			btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnNewButton_1_1.setBounds(229, 528, 90, 44);
		}
		return btnNewButton_1_1;
	}
}
