package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Post extends JDialog {
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
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Post dialog = new Post();
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
	public Post() {
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
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());

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
			btnNewButton = new JButton("완료");
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
			btnNewButton_1.setForeground(new Color(255, 0, 0));
			btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnNewButton_1.setBounds(340, 528, 90, 44);
		}
		return btnNewButton_1;
	}
	
//	private void attachAction() {
//		
//	JFileChooser chooser = new JFileChooser();
//	chooser.showDialog(getTfInsertFile(), null);
//	File f = chooser.getSelectedFile();
//	String filename = f.getAbsolutePath();
//	getTfInsertFile().setText(filename);
//	Image getAbsolutePath = null;
//	ImageIcon icon = new ImageIcon();
//	Image image = icon.getImage().getScaledInstance(getLblInsertFile().getWidth(), getLblInsertFile().getHeight(), Image.SCALE_SMOOTH);
//	getLblInsertFile().setIcon(icon);
//	
//} 
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon("/Users/tj/Desktop/스크린샷 2020-11-06 오후 2.23.25.png"));
			lblNewLabel_2.setBounds(309, 178, -4, 59);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("File");
			lblNewLabel_3.setBackground(Color.WHITE);
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(471, 180, 80, 57);
		}
		return lblNewLabel_3;
	}
} // 
