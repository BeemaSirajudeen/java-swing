package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Currencycon {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
public String s1;
public String s2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Currencycon window = new Currencycon();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Currencycon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(150, 11, 172, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Input currency");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(30, 65, 97, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Output currency");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(30, 103, 97, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Amount");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(30, 160, 99, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Converted amount");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(30, 196, 117, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"INR[Indian Rupee]", "USD[United Stated Dollar]", "EUR[Euro]"}));
		comboBox.setBounds(167, 63, 216, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"INR[Indian Rupee]", "USD[United Stated Dollar]", "EUR[Euro]"}));
		comboBox_1.setBounds(167, 110, 216, 20);
		frame.getContentPane().add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(185, 158, 157, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 189, 157, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s1=(String)comboBox.getSelectedItem();
				s2=(String)comboBox_1.getSelectedItem();
				String s=textField.getText();
				if((s1.equals("USD[United Stated Dollar]"))&&(s2.equals("USD[United Stated Dollar]")))
				{
					textField_1.setText(s);
					
				}
			else if((s1.equals("USD[United Stated Dollar]"))&&(s2.equals("EUR[Euro]")))
		{
			double a=Double.parseDouble(s);
			double f=a*0.90;
			String str=String.valueOf(f);
			textField_1.setText(str);
		}
			else if((s1.equals("USD[United Stated Dollar]"))&&(s2.equals("INR[Indian Rupee]")))
			{
				double a=Double.parseDouble(s);
				double f=a*71.75;
				String str=String.valueOf(f);
				textField_1.setText(str);
			}	
				if((s1.equals("INR[Indian Rupee]"))&&(s2.equals("INR[Indian Rupee]")))
				{
					textField_1.setText(s);
					
				}
			else if((s1.equals("INR[Indian Rupee]"))&&(s2.equals("EUR[Euro]")))
		{
			double a=Double.parseDouble(s);
			double f=a*0.013;
			String str=String.valueOf(f);
			textField_1.setText(str);
		}
			else if((s1.equals("INR[Indian Rupee]"))&&(s2.equals("USD[United Stated Dollar]")))
			{
				double a=Double.parseDouble(s);
				double f=a*0.014;
				String str=String.valueOf(f);
				textField_1.setText(str);
			}
				if((s1.equals("EUR[Euro]"))&&(s2.equals("EUR[Euro]")))
				{
					textField_1.setText(s);
					
				}
			else if((s1.equals("EUR[Euro]"))&&(s2.equals("INR[Indian Rupee]")))
		{
			double a=Double.parseDouble(s);
			double f=a*79.36;
			String str=String.valueOf(f);
			textField_1.setText(str);
		}
				
			else if((s1.equals("EUR[Euro]"))&&(s2.equals("USD[United Stated Dollar]")))
			{
				double a=Double.parseDouble(s);
				double f=a*1.11;
				String str=String.valueOf(f);
				textField_1.setText(str);
			}	
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(77, 228, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(206, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
