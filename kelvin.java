package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class kelvin {

	private JFrame frame;
	private JTextField textField;
	public int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kelvin window = new kelvin();
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
	public kelvin() {
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
		
		JLabel lblL = new JLabel("     Input");
		lblL.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblL.setForeground(new Color(0, 0, 0));
		lblL.setBounds(92, 21, 67, 14);
		frame.getContentPane().add(lblL);
		
		textField = new JTextField();
		textField.setBounds(189, 19, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Inputscale");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 68, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Celcius");
		rdbtnNewRadioButton.setBounds(10, 103, 67, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==0)
				{
					f++;
				}
			}
		});
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Fahrenheit");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_1.setBounds(10, 141, 89, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==0)
				{
					f++;
				}
			}
		});
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Kelvin");
		rdbtnNewRadioButton_2.setBounds(10, 189, 73, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==0)
				{
					f++;
				}
			}
		});
		
		ButtonGroup G1=new ButtonGroup();
		G1.add(rdbtnNewRadioButton);
		G1.add(rdbtnNewRadioButton_1);
		G1.add(rdbtnNewRadioButton_2);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Outputscale");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(335, 69, 89, 14);
		frame.getContentPane().add(lblNewLabel_1);
		

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(216, 223, 67, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Celcius");
		rdbtnNewRadioButton_3.setBounds(315, 103, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str=textField.getText();
			
				if(rdbtnNewRadioButton.isSelected())
					{
					lblNewLabel_3.setText(str);
			}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					//String c1=textField.getText();
					float c2=Float.parseFloat(str);
					float f=(float)((c2-32)*(0.55));
					String str1=String.valueOf(f);
					lblNewLabel_3.setText(str1);
				}
				
				if(rdbtnNewRadioButton_2.isSelected())
				{
					//String c1=textField.getText();
					float c2=Float.parseFloat(str);
					float f=(float)((c2-273.055));
					String str1=String.valueOf(f);
					lblNewLabel_3.setText(str1);
				}
				
				}
			});
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Fahrenheit");
		rdbtnNewRadioButton_4.setBounds(315, 141, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str=textField.getText();
			
				if(rdbtnNewRadioButton.isSelected())
					{
					float c2=Float.parseFloat(str);
					float f=(float)((1.8)*c2+32);
					String str1=String.valueOf(f);
					lblNewLabel_3.setText(str1);
					
			}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					lblNewLabel_3.setText(str);
					
				}
				
				if(rdbtnNewRadioButton_2.isSelected())
				{
					//String c1=textField.getText();
					float c2=Float.parseFloat(str);
					float f=(float)((c2-273.15)*(1.8)+32);
					String str1=String.valueOf(f);
					lblNewLabel_3.setText(str1);
				}
				
				
				}
			});
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Kelvin");
		rdbtnNewRadioButton_5.setBounds(315, 189, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str=textField.getText();
			
				if(rdbtnNewRadioButton.isSelected())
					{
					float c2=Float.parseFloat(str);
					float f=(float)(c2+273.15);
					String str1=String.valueOf(f);
					lblNewLabel_3.setText(str1);
					
			}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					lblNewLabel_3.setText(str);
					
				}
				
				if(rdbtnNewRadioButton_1.isSelected())
				{
					lblNewLabel_3.setText(str);
					//String c1=textField.getText();
					float c2=Float.parseFloat(str);
					float f=(float)((c2-32)*(0.55)+273.15);
					String str1=String.valueOf(f);
					lblNewLabel_3.setText(str1);
				}
				
				
				}
			});
		
		ButtonGroup G2=new ButtonGroup();
		G2.add(rdbtnNewRadioButton_3);
		G2.add(rdbtnNewRadioButton_4);
		G2.add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_2 = new JLabel("Output");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(92, 222, 67, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			G1.clearSelection();
			G2.clearSelection();
			textField.setText("");
			lblNewLabel_3.setText("");
			}
		});
		btnNewButton.setBounds(335, 219, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
