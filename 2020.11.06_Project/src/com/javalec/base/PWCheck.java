package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class PWCheck extends JDialog {
	private JLabel lblNewLabel;
	private JButton button;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PWCheck dialog = new PWCheck();
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
	public PWCheck() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getButton());
		getContentPane().add(getLblNewLabel_1());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("비밀번호 찾기");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(154, 73, 141, 27);
		}
		return lblNewLabel;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("로그인 화면으로 돌아가기");
			button.setBounds(117, 204, 216, 29);
		}
		return button;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("회원가입 시 사용한 비밀번호는 124**** 입니다.");
			lblNewLabel_1.setBounds(97, 137, 256, 16);
		}
		return lblNewLabel_1;
	}
}
