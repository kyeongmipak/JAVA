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
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;

public class MyHome extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField txtMyStoryList;
	private JScrollPane scrollPane;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MyHome dialog = new MyHome();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MyHome() {
		setTitle("마이 홈");
		setBounds(100, 100, 450, 476);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMyHome = new JLabel("MY HOME");
			lblMyHome.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
			lblMyHome.setBounds(22, 19, 96, 22);
			contentPanel.add(lblMyHome);
		}
		{
			JLabel label = new JLabel("이름 : ");
			label.setBounds(32, 53, 34, 16);
			contentPanel.add(label);
		}
		{
			textField = new JTextField();
			textField.setBounds(67, 48, 130, 26);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton button = new JButton("내 정보 수정");
			button.setBounds(327, 6, 96, 29);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("탈퇴하기");
			button.setBounds(227, 6, 96, 29);
			contentPanel.add(button);
		}
		{
			JLabel label = new JLabel("내 별점 :");
			label.setBounds(22, 87, 45, 16);
			contentPanel.add(label);
		}
		{
			txtMyStoryList = new JTextField();
			txtMyStoryList.setHorizontalAlignment(SwingConstants.CENTER);
			txtMyStoryList.setText("MY STORY LIST");
			txtMyStoryList.setBounds(0, 170, 450, 49);
			contentPanel.add(txtMyStoryList);
			txtMyStoryList.setColumns(10);
		}
		contentPanel.add(getScrollPane());
		contentPanel.add(getTextField_1());
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 231, 450, 223);
		}
		return scrollPane;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(77, 82, 69, 26);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
}
