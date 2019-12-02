package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;

public class Hotelmanagement {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	public String CB,CBM,CHB,QTY,total,t,s2,s3,s4;
	public int w=0;
	public float tl,stotal,m,tx,k;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotelmanagement window = new Hotelmanagement();
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
	public Hotelmanagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 866, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel htmgmtsm = new JLabel("Hotel Management System");
		htmgmtsm.setFont(new Font("Tahoma", Font.BOLD, 15));
		htmgmtsm.setBounds(259, 24, 285, 30);
		frame.getContentPane().add(htmgmtsm);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(10, 65, 319, 245);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chicken Burger");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 112, 25);
		panel.add(lblNewLabel);
		
		JLabel chcknbrgrmeal = new JLabel("Chicken Burger Meal");
		chcknbrgrmeal.setFont(new Font("Tahoma", Font.BOLD, 12));
		chcknbrgrmeal.setBounds(10, 47, 133, 25);
		panel.add(chcknbrgrmeal);
		
		JLabel chsebrgr = new JLabel("Cheese Burger");
		chsebrgr.setFont(new Font("Tahoma", Font.BOLD, 13));
		chsebrgr.setBounds(10, 83, 112, 25);
		panel.add(chsebrgr);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(58, 119, 251, 2);
		panel.add(separator);
		
		JLabel drink = new JLabel("Drink");
		drink.setFont(new Font("Tahoma", Font.BOLD, 13));
		drink.setForeground(Color.BLACK);
		drink.setBounds(10, 147, 63, 14);
		panel.add(drink);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<SELECT>", "TEA", "COFFEE", "SOFT DRINK"}));
		comboBox.setBounds(20, 167, 102, 20);
		panel.add(comboBox);
		
		JLabel qty = new JLabel("Qty");
		qty.setFont(new Font("Tahoma", Font.BOLD, 13));
		qty.setBounds(180, 148, 68, 14);
		panel.add(qty);
		
		JRadioButton homedelvr = new JRadioButton("Home Delivery");
		homedelvr.setFont(new Font("Tahoma", Font.BOLD, 12));
		homedelvr.setBounds(10, 204, 133, 23);
		panel.add(homedelvr);
		
		JRadioButton tax = new JRadioButton("Tax");
		tax.setFont(new Font("Tahoma", Font.BOLD, 13));
		tax.setBounds(187, 205, 109, 23);
		panel.add(tax);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(162, 14, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setBounds(162, 50, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBounds(162, 86, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setBounds(180, 167, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(339, 65, 237, 251);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel currcycnvtr = new JLabel("Currency Converter");
		currcycnvtr.setFont(new Font("Tahoma", Font.BOLD, 13));
		currcycnvtr.setBounds(38, 11, 187, 14);
		panel_1.add(currcycnvtr);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<SELECT>", "INR[Indian Rupee]", "EUR[Euro]"}));
		comboBox_1.setBounds(10, 53, 195, 20);
		panel_1.add(comboBox_1);
		
		JButton cnvt = new JButton("Convert");
		cnvt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s2=(String)comboBox_1.getSelectedItem();
				String s=textField_10.getText();
				 if((s2.equals("EUR[Euro]")))
				{
					double a=Double.parseDouble(s);
					double f=a*0.90;
					String str=String.valueOf(f);
					textField_4.setText(str);
				}
				 else if((s2.equals("INR[Indian Rupee]")))
					{
						double a=Double.parseDouble(s);
						double f=a*71.75;
						String str=String.valueOf(f);
						textField_4.setText(str);
					}	
				
			}
		});
		cnvt.setFont(new Font("Tahoma", Font.BOLD, 13));
		cnvt.setBounds(10, 206, 89, 23);
		panel_1.add(cnvt);
		
		JButton close = new JButton("Close");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.setSelectedIndex(0);
				textField_4.setText("");
				
			}
		});
		close.setFont(new Font("Tahoma", Font.BOLD, 13));
		close.setBounds(131, 207, 79, 23);
		panel_1.add(close);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(38, 110, 167, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 334, 319, 146);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel cstofdrnk = new JLabel("Cost of Drinks");
		cstofdrnk.setFont(new Font("Tahoma", Font.BOLD, 13));
		cstofdrnk.setBounds(10, 11, 102, 14);
		panel_2.add(cstofdrnk);
		
		JLabel cstofml = new JLabel("Cost of Meal");
		cstofml.setFont(new Font("Tahoma", Font.BOLD, 13));
		cstofml.setBounds(10, 46, 102, 14);
		panel_2.add(cstofml);
		
		JLabel cstofdlvy = new JLabel("Cost of Delivery");
		cstofdlvy.setFont(new Font("Tahoma", Font.BOLD, 13));
		cstofdlvy.setForeground(Color.BLACK);
		cstofdlvy.setBounds(10, 81, 117, 14);
		panel_2.add(cstofdlvy);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(151, 9, 86, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(151, 44, 86, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(151, 79, 86, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(339, 334, 237, 146);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel taxlbl = new JLabel("Tax");
		taxlbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		taxlbl.setBounds(10, 22, 46, 14);
		panel_3.add(taxlbl);
		
		JLabel subtllbl = new JLabel("Sub Total");
		subtllbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		subtllbl.setBounds(10, 62, 70, 14);
		panel_3.add(subtllbl);
		
		JLabel totllbl = new JLabel("Total");
		totllbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		totllbl.setBounds(10, 103, 46, 14);
		panel_3.add(totllbl);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(90, 20, 86, 20);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(90, 60, 86, 20);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(90, 101, 86, 20);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		panel_4.setBounds(23, 509, 793, 85);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton totalbtn = new JButton("Total");
		totalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CB=textField.getText();
				float a=Float.parseFloat(CB);
				CBM=textField_1.getText();
				float b=Float.parseFloat(CBM);
				CHB=textField_2.getText();
				float c=Float.parseFloat(CHB);
				QTY=textField_3.getText();
				float d=Float.parseFloat(QTY);
				 String s1=(String)comboBox.getSelectedItem();
				tx=100;
				float z=70;
				float y=100;
				float x=50;
				float q=(float)(z*a);
				float r=(float)(y*b);
				float s=(float)(x*c);
				tl=(float)(q+r+s);
				String h=String.valueOf(tl);
		           textField_6.setText(h);
		         //  String i=String.valueOf(stotal);
		          // textField_9.setText(i);
				
				if(s1.equals("TEA"))
				{
					 m=d*10;
					
				}
				if(s1.contentEquals("COFFEE")) {
					m=d*15;
				}
				if(s1.equals("SOFT DRINK"))
				{
				 m=d*20;
					
				}
				String g=String.valueOf(m);
		           textField_5.setText(g);
				
				
				
				
				
				if(homedelvr.isSelected())
				{
				float n=70;
				t=String.valueOf(n);
				textField_7.setText(t);
				stotal=(float)(tl+m+n);
				total=String.valueOf(stotal);
				textField_10.setText(total);
				
				 String i=String.valueOf(stotal);
		           textField_9.setText(i);
				}
				if(tax.isSelected())
				{
					stotal=(float)(tl+m);
					total=String.valueOf(tx);
					textField_8.setText(total);
					//stotal=(float)(tl+m);
					
					total=String.valueOf(stotal);
					textField_9.setText(total);
					 k=(float)(stotal+tx);
					 total=String.valueOf(k);
					textField_10.setText(total);
				}
				
			}
		});
		totalbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		totalbtn.setBounds(26, 28, 89, 23);
		panel_4.add(totalbtn);
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(586, 72, 254, 408);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 234, 386);
		panel_5.add(tabbedPane);
		
	JTextArea textArea = new JTextArea();
	textArea.setEditable(false);
	//JTabbedPane tabbedPane;
	tabbedPane.addTab("Receipt", null, textArea, null);
		
		JButton receiptbtn = new JButton("Receipt");
		receiptbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String n1=(String)comboBox.getSelectedItem();
				String n2=(String)comboBox_1.getSelectedItem();
				
				textArea.append("Receipt============================== \n"
				+"Chicken Burger:\t"+textField.getText()+"\nChicken Burger Meal:\t"+textField_1.getText()+
				"\nCheese Burger:\t\t"+textField_2.getText()+"\n"+n1+"\t\t"+
			"\nCost of Drink:\t\t"+textField_5.getText()+"\nCost of meal:\t\t"+textField_6.getText()+
			"\nCost of Delivery:\t\t"+textField_7.getText()+"\n============================== \n"+      
			"\nTax:\t\t"+textField_8.getText()+"\nSubtotal:\t\t"+textField_9.getText()+"\ntotal:\t\t"+textField_10.getText()+
			"\n============================== \n"+"tThankyou\n"
				
						
				
				
			);
				
			}
	});
		receiptbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		receiptbtn.setBounds(168, 29, 104, 23);
		panel_4.add(receiptbtn);
		
		JButton resetbtn = new JButton("Reset");
		resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);	
				homedelvr.setSelected(false);
				tax.setSelected(false);
				
				
			}
		});
		resetbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		resetbtn.setBounds(377, 29, 89, 23);
		panel_4.add(resetbtn);
		
		JButton exitbtn = new JButton("Exit");
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		exitbtn.setBounds(565, 29, 89, 23);
		panel_4.add(exitbtn);
		
		
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("calculator", null, layeredPane, null);
		layeredPane.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 234, 358);
		layeredPane.add(panel_6);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setLayout(null);
		
		textField_11 = new JTextField();
		textField_11.setBounds(23, 22, 188, 40);
		panel_6.add(textField_11);
		textField_11.setColumns(10);
		
		JButton bbtn = new JButton("B");
		bbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		bbtn.setBounds(0, 73, 51, 23);
		panel_6.add(bbtn);
		
		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1)
				{
					textField_11.setText("");
					w=0;
				}
           textField_11.setText(textField_11.getText().concat(btnNewButton7 .getText()));
			}
		});
		btnNewButton7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton7.setBounds(0, 100, 51, 20);
		panel_6.add(btnNewButton7);
		
		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1)
			{
				textField_11.setText("");
				w=0;
			}
			textField_11.setText(textField_11.getText().concat(btnNewButton4 .getText()));
			
			}
		});
		btnNewButton4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton4.setBounds(0, 122, 51, 23);
		panel_6.add(btnNewButton4);
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1)
				{
					textField_11.setText("");
					w=0;
				}
				textField_11.setText(textField_11.getText().concat(btnNewButton1 .getText()));
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton1.setBounds(0, 145, 51, 23);
		panel_6.add(btnNewButton1);
		
		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1)
				{
					textField_11.setText("");
					w=0;
				}
				textField_11.setText(textField_11.getText().concat(btnNewButton0 .getText()));
			}
		});
		btnNewButton0.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton0.setBounds(0, 168, 51, 23);
		panel_6.add(btnNewButton0);
		
		JButton btnNewButtonc = new JButton("c");
		btnNewButtonc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText("");
			}
		});
		btnNewButtonc.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButtonc.setBounds(59, 74, 41, 23);
		panel_6.add(btnNewButtonc);
		
		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1)
				{
					textField_11.setText("");
					w=0;
				}
				textField_11.setText(textField_11.getText().concat(btnNewButton8 .getText()));
			}
		});
		btnNewButton8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton8.setBounds(54, 100, 47, 23);
		panel_6.add(btnNewButton8);
		
		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1)
				{
					textField_11.setText("");
					w=0;
				}
					textField_11.setText(textField_11.getText().concat(btnNewButton5.getText()));
				
			}
		});
		btnNewButton5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton5.setBounds(54, 123, 47, 23);
		panel_6.add(btnNewButton5);
		
		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(w==1)
				{
					textField_11.setText("");
					w=0;
				}
					textField_11.setText(textField_11.getText().concat(btnNewButton2 .getText()));
				
			}
		});
		btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton2.setBounds(54, 146, 47, 23);
		panel_6.add(btnNewButton2);
		
		JButton btnNewButton = new JButton(".");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1)
				{
					textField_11.setText("");
					w=0;
				}
					textField_11.setText(textField_11.getText().concat(btnNewButton.getText()));	
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(54, 169, 47, 23);
		panel_6.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("...");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(104, 73, 47, 24);
		panel_6.add(btnNewButton_1);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1)
				{
					textField_11.setText("");
					w=0;
				}
				textField_11.setText(textField_11.getText().concat(btn9.getText()));
			
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn9.setBounds(104, 100, 47, 23);
		panel_6.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1)
				{
					textField_11.setText("");
					w=0;
				}
				textField_11.setText(textField_11.getText().concat(btn6.getText()));
			
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn6.setBounds(104, 123, 47, 22);
		panel_6.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1)
				{
					textField_11.setText("");
					w=0;
				}
				textField_11.setText(textField_11.getText().concat(btn3.getText()));
			}
			}
		);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn3.setBounds(104, 146, 47, 23);
		panel_6.add(btn3);
		
		JButton btnNewButton_2 = new JButton("....");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(104, 169, 47, 23);
		panel_6.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 s3=textField_11.getText();
				 s4=btnNewButton_3.getText();
				 textField_11.setText("");
				 
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_3.setBounds(155, 73, 47, 23);
		panel_6.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("-");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s3=textField_11.getText();
				 s4=btnNewButton_4.getText();
				 textField_11.setText("");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_4.setBounds(157, 99, 45, 23);
		panel_6.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("*");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s3=textField_11.getText();
				 s4=btnNewButton_5.getText();
				 textField_11.setText("");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_5.setBounds(155, 123, 51, 23);
		panel_6.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("/");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s3=textField_11.getText();
				 s4=btnNewButton_6.getText();
				 textField_11.setText("");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_6.setBounds(155, 145, 49, 23);
		panel_6.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("=");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w++;
				String s5=textField_11.getText();
				textField_11.setText("");
				float a1=Float.parseFloat(s3);
				float b1=Float.parseFloat(s5);
				if(s4.equals("+"))
				{
					float r1=a1+b1;
					String r2=String.valueOf(r1);
					textField_11.setText(r2);
					
				}
				if(s4.equals("-"))
				{
					float r1=a1-b1;
					String r2=String.valueOf(r1);
					textField_11.setText(r2);
					
				}
				if(s4.equals("*"))
				{
					float r1=a1*b1;
					
					String r2=String.valueOf(r1);
					textField_11.setText(r2);
					
				}
				if(s4.equals("/"))
				{
					float r1=a1/b1;
					String r2=String.valueOf(r1);
					textField_11.setText(r2);
					
				}
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_7.setBounds(157, 169, 45, 23);
		panel_6.add(btnNewButton_7);
		
//	JTextArea textArea = new JTextArea();
	//	tabbedPane.addTab("Receipt", null, textArea, null);
	}
}
