package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bmi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmi window = new bmi();
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
	public bmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 390, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 374, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Body Mass Index");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(80, 25, 155, 28);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 205, 50));
		panel_1.setBounds(0, 103, 384, 176);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Height(m):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 34, 88, 23);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Weight(kg):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 78, 88, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("  BMI");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 118, 73, 14);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(169, 34, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 76, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(119, 136, 153));
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setBounds(70, 116, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(237, 119, 123, 14);
		panel_1.add(label);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=textField.getText();
				float a=Float.parseFloat(s1);
				String s2=textField_1.getText();
				float b=Float.parseFloat(s2);
				float m=b/(a*a);
				String r1=String.valueOf(m);
				textField_2.setText(r1);
				if(m<18.5)
				{
			        label.setText("Underweight");
				}
				if(m>18.5&&m<24.9)
				{
					label.setText("Normalweight");
				}
				if(m>25&&m<29.9) 
				{
					label.setText("Overweight");
				}
				if(m>30)
				{
					label.setText("Obese");
				}
			}
		});
		btnNewButton.setBounds(80, 147, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(179, 147, 73, 23);
		panel_1.add(btnClear);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(262, 147, 89, 23);
		panel_1.add(btnNewButton_1);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(154, 205, 50));
		panel_2.setBounds(0, 290, 374, 122);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(new Color(176, 224, 230));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Underweight", "Normalweight", "Overweight", "Obese"},
				{"<18.5", "18.5 -24.9", "25-29.9", ">30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(0, 79, 374, 32);
		panel_2.add(table);
	}
}
