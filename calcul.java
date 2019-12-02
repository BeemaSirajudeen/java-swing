package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calcul {

	private JFrame frame;
	private JTextField textField;
//	public String firstnum;
	public String s1,s2;
	public int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcul window = new calcul();
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
	public calcul() {
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
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(10, 23, 46, 14);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(113, 23, 46, 14);
		frame.getContentPane().add(lblView);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(223, 23, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		textField = new JTextField();
		textField.setBounds(20, 60, 392, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblScientific = new JLabel("Scientific");
		lblScientific.setBounds(10, 83, 46, 14);
		frame.getContentPane().add(lblScientific);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setBounds(326, 83, 46, 14);
		frame.getContentPane().add(lblStandard);
		
		JButton btnNewButton = new JButton("sqrt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//f++;
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			f++;
			}
		});
		btnNewButton.setBounds(0, 103, 60, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("%");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=textField.getText();
				 s2=btnNewButton_1.getText();
				 textField.setText("");
			}
		});
		btnNewButton_1.setBounds(0, 137, 56, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x^y");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f++;
				double a=Math.exp(Double.parseDouble(textField.getText()));
				s1=textField.getText();
				s2=btnNewButton_2.getText();
				textField.setText("");
				textField.setText(textField.getText()+a);
					
			}
		});
		btnNewButton_2.setBounds(0, 171, 56, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("x^2");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				double a=Math.pow(Double.parseDouble(textField.getText()),2);
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_3.setBounds(0, 205, 56, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("1/x");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				double a=1/Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_4.setBounds(70, 103, 56, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Exp");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double a=Math.exp(Double.parseDouble(textField.getText()));
			textField.setText("");
			textField.setText(textField.getText()+a);
			
			}
		});
		btnNewButton_5.setBounds(66, 137, 56, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("ln");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_6.setBounds(66, 171, 56, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("n!");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				int fact=1;
				s1=textField.getText();
				float a=Float.parseFloat(s1);
			
				while(a>0)
				{
					fact=(int)(fact*a);
					a--;
				}
				String r1=String.valueOf(fact);
				textField.setText(r1);
			}
		});
		btnNewButton_7.setBounds(66, 205, 50, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("sin");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				double a=Math.sin(Double.parseDouble(textField.getText())*Math.PI/180);
				textField.setText("");
				textField.setText(textField.getText()+a);
				;
			}
		});
		btnNewButton_8.setBounds(128, 103, 54, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("cos");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				double a=Math.cos(Double.parseDouble(textField.getText())*Math.PI/180);
				//double b=Math.toDegrees(a);
				textField.setText("");
				textField.setText(textField.getText()+a);
				f++;
			}
		});
		btnNewButton_9.setBounds(128, 137, 58, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("tan");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				double a=Math.tan(Double.parseDouble(textField.getText())*Math.PI/180);
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_10.setBounds(126, 171, 60, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("sec");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				double a=1/Math.cos(Double.parseDouble(textField.getText())*Math.PI/180);
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_11.setBounds(121, 205, 56, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("7");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
textField.setText(textField.getText().concat(btnNewButton_12.getText()));
			}
		});
		btnNewButton_12.setBounds(190, 103, 46, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("4");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(btnNewButton_13.getText()));
				
			}
		});
		btnNewButton_13.setBounds(192, 137, 46, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("1");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(btnNewButton_14.getText()));	
			}
		});
		btnNewButton_14.setBounds(192, 171, 44, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("0");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(btnNewButton_15.getText()));
			}
		});
		btnNewButton_15.setBounds(187, 205, 49, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("8");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(btnNewButton_16.getText()));
			}
		});
		btnNewButton_16.setBounds(246, 103, 46, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("5");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(f==1)
			{
				textField.setText("");
				f=0;
			}
				textField.setText(textField.getText().concat(btnNewButton_17.getText()));
			}
		});
		btnNewButton_17.setBounds(241, 137, 51, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("2");
		btnNewButton_18.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			if(f==1)
			{
				textField.setText("");
				f=0;
			}
				textField.setText(textField.getText().concat(btnNewButton_18.getText()));
			}
		});
		btnNewButton_18.setBounds(240, 171, 52, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton(".");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
					textField.setText(textField.getText().concat(btnNewButton_19.getText()));	
			}
		});
		btnNewButton_19.setBounds(243, 205, 49, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("9");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(btnNewButton_20.getText()));
			}
		});
		btnNewButton_20.setBounds(302, 103, 46, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("6");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(btnNewButton_21.getText()));
			}
		});
		btnNewButton_21.setBounds(299, 137, 49, 23);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("3");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(btnNewButton_22.getText()));
			}
		});
		btnNewButton_22.setBounds(302, 171, 46, 23);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("=");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				String s3=textField.getText();
				textField.setText("");
				float a=Float.parseFloat(s1);
				float b=Float.parseFloat(s3);
				if(s2.equals("+"))
				{
					float r1=a+b;
					String r2=String.valueOf(r1);
					textField.setText(r2);
					
				}
				if(s2.equals("-"))
				{
					float r1=a-b;
					String r2=String.valueOf(r1);
					textField.setText(r2);
					
				}
				if(s2.equals("*"))
				{
					float r1=a*b;
					String r2=String.valueOf(r1);
					textField.setText(r2);
					
				}
				if(s2.equals("/"))
				{
					float r1=a/b;
					String r2=String.valueOf(r1);
					textField.setText(r2);
					
				}
				if(s2.equals("%"))
				{
					float r1=a%b;
					String r2=String.valueOf(r1);
					textField.setText(r2);
					
				}
				if(s2.equals("x^y"))
				{
					//double p=Double.parseDouble(s3);
					double f=Math.pow(a,b);
					String r2=String.valueOf(f);
					textField.setText(r2);
					
				}
			}
		});
		btnNewButton_23.setBounds(302, 205, 46, 23);
		frame.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("/");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=textField.getText();
				 s2=btnNewButton_24.getText();
				 textField.setText("");
			}
		});
		btnNewButton_24.setBounds(356, 103, 56, 23);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("*");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=textField.getText();
				 s2=btnNewButton_25.getText();
				 textField.setText("");
			}
		});
		btnNewButton_25.setBounds(358, 137, 54, 23);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("-");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=textField.getText();
				 s2=btnNewButton_26.getText();
				 textField.setText("");
			}
		});
		btnNewButton_26.setBounds(358, 171, 54, 23);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("+");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 s1=textField.getText();
				 s2=btnNewButton_27.getText();
				 textField.setText("");
				 
				
				
			}
		});
		btnNewButton_27.setBounds(357, 205, 55, 23);
		frame.getContentPane().add(btnNewButton_27);
		
	}
}
