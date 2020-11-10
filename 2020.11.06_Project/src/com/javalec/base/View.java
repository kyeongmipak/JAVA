package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class View extends JDialog {
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblImg;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_1_1;
	private JRadioButton rdbtnNewRadioButton_3;
	private JLabel label;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View dialog = new View();
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
	public View() {
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석. all rights reserved");
		setBounds(100, 100, 600, 800);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTextField());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getTextField_1());
		getContentPane().add(getLblNewLabel_1_1());
		getContentPane().add(getLblNewLabel_1_1_1());
		getContentPane().add(getTextArea());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getTextField_2());
		getContentPane().add(getTextField_3());
		getContentPane().add(getLblImg());
		getContentPane().add(getRdbtnNewRadioButton());
		getContentPane().add(getRdbtnNewRadioButton_1());
		getContentPane().add(getRdbtnNewRadioButton_2());
		getContentPane().add(getRdbtnNewRadioButton_1_1());
		getContentPane().add(getRdbtnNewRadioButton_3());
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());

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
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("조리 시간 : ");
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(299, 141, 84, 27);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(43, 444, 508, 275);
		}
		return textArea;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("닫기");
			btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(448, 726, 90, 44);
		}
		return btnNewButton;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			textField_2.setEditable(false);
			textField_2.setColumns(10);
			textField_2.setBounds(106, 139, 135, 32);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			textField_3.setEditable(false);
			textField_3.setColumns(10);
			textField_3.setBounds(390, 139, 151, 32);
		}
		return textField_3;
	}
	private JLabel getLblImg() {
		if (lblImg == null) {
			lblImg = new JLabel("이미지");
			lblImg.setHorizontalAlignment(SwingConstants.CENTER);
			lblImg.setForeground(new Color(0, 0, 0));
//			JLabel.setVerticalAlignment(SwingConstants.NORTH);
//			JLabel.setBorder(new CompoundBorder(black, null)			
//			JLabel.setBorder(BorderFactory.createLineBorder(Color.black);
			lblImg.setEnabled(false);
			lblImg.setBounds(44, 199, 261, 223);
		}
		return lblImg;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBounds(372, 304, 33, 23);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("");
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBounds(402, 305, 33, 23);
		}
		return rdbtnNewRadioButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton_2() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("");
			buttonGroup.add(rdbtnNewRadioButton_2);
			rdbtnNewRadioButton_2.setBounds(430, 304, 33, 23);
		}
		return rdbtnNewRadioButton_2;
	}
	private JRadioButton getRdbtnNewRadioButton_1_1() {
		if (rdbtnNewRadioButton_1_1 == null) {
			rdbtnNewRadioButton_1_1 = new JRadioButton("");
			buttonGroup.add(rdbtnNewRadioButton_1_1);
			rdbtnNewRadioButton_1_1.setBounds(460, 305, 33, 23);
		}
		return rdbtnNewRadioButton_1_1;
	}
	private JRadioButton getRdbtnNewRadioButton_3() {
		if (rdbtnNewRadioButton_3 == null) {
			rdbtnNewRadioButton_3 = new JRadioButton("");
			rdbtnNewRadioButton_3.setSelected(true);
			buttonGroup.add(rdbtnNewRadioButton_3);
			rdbtnNewRadioButton_3.setBounds(488, 304, 33, 23);
		}
		return rdbtnNewRadioButton_3;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("1점 <------------> 5점");
			label.setBounds(360, 338, 168, 27);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("글이 마음에 들면 별점을 주세요!");
			label_1.setBounds(360, 269, 174, 16);
		}
		return label_1;
	}
}
