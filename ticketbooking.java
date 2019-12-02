package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class ticketbooking {

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
	private JTable table;
	public String name,tax,t,total;
    public float stotal;
    public int c=3456;
     public int  stnd,first,ac,sleeper;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
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
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 834, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(259, 29, 320, 37);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(28, 128, 93, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(50, 179, 333, 2);
		frame.getContentPane().add(separator);
		
		JRadioButton stndradiobtn = new JRadioButton("Standard");
		stndradiobtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		stndradiobtn.setBounds(29, 197, 109, 23);
		frame.getContentPane().add(stndradiobtn);
		
		JRadioButton firstclsrdbtn = new JRadioButton("First class");
		firstclsrdbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		firstclsrdbtn.setBounds(28, 233, 93, 23);
		frame.getContentPane().add(firstclsrdbtn);
		
		JRadioButton sngltcktrdbtn = new JRadioButton("Single Ticket");
		sngltcktrdbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		sngltcktrdbtn.setBounds(146, 198, 118, 23);
		frame.getContentPane().add(sngltcktrdbtn);
		
		JRadioButton acradobtn = new JRadioButton("Ac");
		acradobtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		acradobtn.setBounds(131, 234, 65, 23);
		frame.getContentPane().add(acradobtn);
		
		JRadioButton slepprrdbtn = new JRadioButton("Sleeper");
		slepprrdbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		slepprrdbtn.setBounds(198, 234, 77, 23);
		frame.getContentPane().add(slepprrdbtn);
		
		JRadioButton adltrdbtn = new JRadioButton("Adult");
		adltrdbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		adltrdbtn.setBounds(279, 198, 77, 23);
		frame.getContentPane().add(adltrdbtn);
		
		JRadioButton chldrdbtn = new JRadioButton("child");
		chldrdbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		chldrdbtn.setBounds(283, 234, 73, 23);
		frame.getContentPane().add(chldrdbtn);
		
		ButtonGroup G1=new ButtonGroup();
		G1.add(stndradiobtn);
		G1.add(firstclsrdbtn);
	    G1.add(acradobtn);
		G1.add(slepprrdbtn);
	
	    ButtonGroup G2=new ButtonGroup();
		G2.add(sngltcktrdbtn);
		G2.add(adltrdbtn );
		G2.add(chldrdbtn);
		
		
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"KOLLAM", "TVM", "TRISSUR"}));
		comboBox.setBounds(10, 266, 118, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"KOLLAM", "TVM", "TRISSUR"}));
		comboBox_1.setBounds(146, 266, 118, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox_2.setBounds(279, 266, 77, 20);
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(51, 310, 332, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel txlbl = new JLabel("Tax");
		txlbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		txlbl.setBounds(28, 335, 65, 14);
		frame.getContentPane().add(txlbl);
		
		JLabel subtllbl = new JLabel("SubTotal");
		subtllbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		subtllbl.setBounds(28, 360, 77, 23);
		frame.getContentPane().add(subtllbl);
		
		JLabel totallbl = new JLabel("Total");
		totallbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		totallbl.setBounds(28, 396, 65, 14);
		frame.getContentPane().add(totallbl);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(50, 435, 345, -15);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(50, 448, 326, 2);
		frame.getContentPane().add(separator_3);
		
		JButton tlButton = new JButton("Total");
		tlButton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
				name=textField.getText();
		      tax=textField_1.getText();
		 String s1=(String)comboBox_2.getSelectedItem();
		 String s2=(String)comboBox.getSelectedItem();
		 String s3=(String)comboBox_1.getSelectedItem();
		 float f=Float.parseFloat(s1);
		 String d=String.valueOf(c);
		 float stax=Float.parseFloat(tax);
	 if(s2.equals("KOLLAM")&&s3.equals("TVM")) {
		 stnd=60;
		 first=100;
		 ac=250;
		 sleeper=150;
	 }
	 if(s2.equals("KOLLAM")&&s3.equals("TRISSUR")) {
		 stnd=100;
		 first=140;
		 ac=290;
		 sleeper=190;
	 }
		
	 if(s2.equals("TVM")&&s3.equals("KOLLAM")) {
		 stnd=60;
		 first=100;
		 ac=250;
		 sleeper=150;
	 }
	 if(s2.equals("TRISSIR")&&s3.equals("KOLLAM")) {
		 stnd=100;
		 first=140;
		 ac=290;
		 sleeper=190;
	 }
	 if(s2.equals("TRISSUR")&&s3.equals("TVM")) {
		 stnd=150;
		 first=170;
		 ac=390;
		 sleeper=290;
	 }
	 if(s2.equals("TVM")&&s3.equals("TRISSUR")) {
		 stnd=150;
		 first=170;
		 ac=390;
		 sleeper=290;
	 }
		
		

		 if(stndradiobtn.isSelected())
		 {
			 stotal=(float)f*stnd;
			 t=String.valueOf(stotal);
			 textField_2.setText(t);
			 float ftotal=(float)(stotal+stax);
			  total=String.valueOf(ftotal);
			 textField_3.setText(total);
			 
		 }
		 if(firstclsrdbtn.isSelected())
		 {
			  stotal=(float)f*first;
			 t=String.valueOf(stotal);
			 textField_2.setText(t);
			 float ftotal=(float)(stotal+stax);
			 total=String.valueOf(ftotal);
			 textField_3.setText(total);
			 
		 }
		 if(acradobtn.isSelected())
		 {
			 stotal=(float)f*ac;
			 t=String.valueOf(stotal);
			 textField_2.setText(t);
			 float ftotal=(float)(stotal+stax);
			 total=String.valueOf(ftotal);
			 textField_3.setText(total);
			 
		 }
		 if(slepprrdbtn.isSelected())
		 {
			  stotal=(float)f*sleeper;
			 t=String.valueOf(stotal);
			 textField_2.setText(t);
			 float ftotal=(float)(stotal+stax);
			 total=String.valueOf(ftotal);
			 textField_3.setText(total);
			 
		 }
		 LocalDate m=java.time.LocalDate.now();
		 String p=String.valueOf(m);
		 LocalTime time=java.time.LocalTime.now();
		 String tym=String.valueOf(time);
		 textField_4.setText(name);
		 textField_9.setText(s1);
		 textField_5.setText(s2);
		 textField_6.setText(s3);
		 textField_7.setText(p);
		 textField_8.setText(tym);
		 textField_9.setText(d);
		 textField_10.setText(total);	
		 textField_11.setText("any");
		     c++;		
			}
		});
		tlButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		tlButton.setBounds(28, 464, 89, 23);
		
		frame.getContentPane().add(tlButton);
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
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
				G1.clearSelection();
				G2.clearSelection();
				comboBox_2.setSelectedIndex(0);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
			}
		});
		resetButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		resetButton.setBounds(149, 465, 89, 23);
		frame.getContentPane().add(resetButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		exitButton.setBounds(267, 465, 89, 23);
		frame.getContentPane().add(exitButton);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(393, 179, 1, 332);
		frame.getContentPane().add(separator_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(404, 77, 404, 395);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(22, 42, 66, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("From");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(22, 108, 55, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("To");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(22, 169, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(22, 226, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Time");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(22, 296, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ticket Number");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(289, 83, 93, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Price");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(287, 191, 79, 24);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Route");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(287, 297, 79, 14);
		panel_1.add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.setBounds(98, 41, 129, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(98, 106, 121, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(98, 167, 129, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(94, 224, 133, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(98, 294, 129, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(289, 108, 105, 20);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(289, 224, 105, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(289, 331, 105, 20);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		JButton confirmbtn = new JButton("Confirm");
		confirmbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String n1=textField_4.getText();
				String n2=textField_9.getText();
				String n3=textField_5.getText();
				String n4=textField_6.getText();
				String n5=(String)comboBox_2.getSelectedItem();
				String n6=textField_8.getText();
				String n7=textField_7.getText();
				String n8=textField_10.getText();
				String n9;
				
				if(acradobtn.isSelected())
				{
					n9="Ac";
				}
				else
				{
					n9="Non AC";
				}

				DefaultTableModel model=(DefaultTableModel)table.getModel();
				String[] row= {n1,n2,n3,n4,n5,n6,n7,n9,n8};
				model.addRow(row);
			}
		});
		confirmbtn.setBounds(160, 349, 89, 23);
		panel_1.add(confirmbtn);
		
		textField = new JTextField();
		textField.setBounds(131, 127, 158, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 334, 109, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 362, 107, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(131, 394, 107, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(10, 518, 798, 96);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No of seat", "Time", "Date", "AC/Non AC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 778, 74);
		panel_2.add(table);
	}
}
