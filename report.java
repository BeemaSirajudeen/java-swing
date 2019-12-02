package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class report {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					report window = new report();
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
	public report() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(138, 43, 226));
		frame.setBounds(100, 100, 990, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(25, 11, 456, 345);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel studentid = new JLabel("Student_ID");
		studentid.setFont(new Font("Tahoma", Font.BOLD, 12));
		studentid.setForeground(new Color(0, 0, 0));
		studentid.setBounds(10, 50, 76, 14);
		panel.add(studentid);
		
		JLabel Firstname = new JLabel("Firstname");
		Firstname.setFont(new Font("Tahoma", Font.BOLD, 12));
		Firstname.setBounds(10, 90, 76, 14);
		panel.add(Firstname);
		
		JLabel Surname = new JLabel("Surname");
		Surname.setFont(new Font("Tahoma", Font.BOLD, 12));
		Surname.setForeground(new Color(0, 0, 0));
		Surname.setBounds(10, 129, 76, 14);
		panel.add(Surname);
		
		JLabel lblNewLabel = new JLabel("Course code");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 166, 76, 14);
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 191, 190, 2);
		panel.add(separator);
		
		JLabel totalscore = new JLabel("Total score");
		totalscore.setFont(new Font("Tahoma", Font.BOLD, 12));
		totalscore.setBounds(10, 222, 76, 14);
		panel.add(totalscore);
		
		JLabel average = new JLabel("Average");
		average.setFont(new Font("Tahoma", Font.BOLD, 12));
		average.setBounds(20, 257, 66, 14);
		panel.add(average);
		
		JLabel ranking = new JLabel("Ranking");
		ranking.setFont(new Font("Tahoma", Font.BOLD, 12));
		ranking.setBounds(10, 300, 66, 14);
		panel.add(ranking);
		
		textField = new JTextField();
		textField.setBounds(108, 48, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 88, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 127, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(108, 220, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(108, 255, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(108, 298, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel maths = new JLabel("Maths");
		maths.setFont(new Font("Tahoma", Font.BOLD, 12));
		maths.setBounds(226, 51, 76, 14);
		panel.add(maths);
		
		JLabel english = new JLabel("English");
		english.setFont(new Font("Tahoma", Font.BOLD, 12));
		english.setBounds(226, 91, 56, 14);
		panel.add(english);
		
		JLabel biology = new JLabel("Biology");
		biology.setFont(new Font("Tahoma", Font.BOLD, 12));
		biology.setBounds(226, 130, 56, 14);
		panel.add(biology);
		
		JLabel computer = new JLabel("Computer");
		computer.setFont(new Font("Tahoma", Font.BOLD, 12));
		computer.setBounds(226, 167, 76, 14);
		panel.add(computer);
		
		JLabel chemistry = new JLabel("Chemistry");
		chemistry.setFont(new Font("Tahoma", Font.BOLD, 12));
		chemistry.setBounds(226, 198, 66, 14);
		panel.add(chemistry);
		
		JLabel phsics = new JLabel("Physics");
		phsics.setFont(new Font("Tahoma", Font.BOLD, 12));
		phsics.setBounds(226, 226, 66, 14);
		panel.add(phsics);
		
		JLabel tamil = new JLabel("Tamil");
		tamil.setFont(new Font("Tahoma", Font.BOLD, 12));
		tamil.setBounds(226, 261, 59, 14);
		panel.add(tamil);
		
		JLabel malayalam = new JLabel("Malayalam");
		malayalam.setFont(new Font("Tahoma", Font.BOLD, 12));
		malayalam.setBounds(226, 301, 68, 14);
		panel.add(malayalam);
		
		textField_7 = new JTextField();
		textField_7.setBounds(312, 48, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(312, 88, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(312, 123, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(312, 164, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(312, 196, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(312, 224, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(312, 259, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(312, 298, 86, 20);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"111032E", "111032E", "111032E"}));
		comboBox.setBounds(108, 164, 86, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(485, 11, 462, 387);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 21, 442, 315);
		panel_1.add(textArea);
		
		JButton clearbutton = new JButton("Clear");
		clearbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(null);
			}
		});
		clearbutton.setBounds(196, 347, 89, 23);
		panel_1.add(clearbutton);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 418, 937, 85);
		frame.getContentPane().add(table);
		
		JButton addreprtbutton = new JButton("Add Report");
		addreprtbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String studentId=textField.getText();
				String firstname=textField_1.getText();
				String surname=textField_2.getText();
				String totalscore=textField_4.getText();
				String averag=textField_5.getText();
				String rnks=textField_6.getText();
				String maths=textField_7.getText();
				String english=textField_8.getText();
				String biology=textField_9.getText();
				String computer=textField_10.getText();
				String chemistry=textField_11.getText();
				String physics=textField_12.getText();
				String tamil=textField_13.getText();
				String malayalam=textField_14.getText();
				String s1=(String)comboBox.getSelectedItem();
						
				float a=Float.parseFloat(maths);
				float b=Float.parseFloat(english);
				float c=Float.parseFloat(biology);
				float d=Float.parseFloat(computer);
				float f=Float.parseFloat(chemistry);
				float g=Float.parseFloat(physics);
				float h=Float.parseFloat(tamil);
				float i=Float.parseFloat(malayalam);
				float total=(float)(a+b+c+d+f+g+h+i);
				float avg=(float)((a+b+c+d+f+g+h+i)/8);
			String str=String.valueOf(total);
			String str1=String.valueOf(avg);
			textField_4.setText(str);
			textField_5.setText(str1);
				if(total>=700)
				{
					textField_6.setText("1");
				}
				else if(total>=600)
				{
					textField_6.setText("2");
				}
				else if(total>=500)
				{
					textField_6.setText("3");
				}
				else if(total>=400)
				{
					textField_6.setText("4");
				}
				else if(total>=300)
				{
					textField_6.setText("5");
				}
				else if(total>=200)
				{
					textField_6.setText("fail");
				}
				String str2=textField_6.getText();
				
				
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				String[] row= {studentId,s1,maths,english,biology,computer,chemistry, physics,tamil, malayalam,str,str1,str2};
				model.addRow(row);
				
				
				
			}
		});
		addreprtbutton.setBounds(46, 547, 98, 23);
		frame.getContentPane().add(addreprtbutton);
		
		JButton deletebutton = new JButton("Delete");
		deletebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.removeRow(table.getSelectedRow());
			}
		});
		deletebutton.setBounds(181, 547, 98, 23);
		frame.getContentPane().add(deletebutton);
		
		JButton showreprtbutton = new JButton("Show Report");
		showreprtbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textArea.append("Student record \n"+"Student Name:\t\t"+textField_1.getText()+" "+textField_2.getText()+"\n"+"====================\n"
			+"maths:\t\t"+textField_7.getText()+"\nEnglish:\t\t"+textField_8.getText()+"\nBiology:\t\t"+textField_9.getText()+"\nComputer:\t\t"+textField_10.getText()+"\nChemistry:\t\t"+textField_11.getText()+"\nPhysics:\t\t"+textField_12.getText()+"\nTamil:\t\t"+textField_13.getText()+"\nMalayalam:\t\t"+textField_14.getText()+"\n===================="+"\nTotal Score:\t\t"+textField_4.getText()+"\nAverage:\t\t"+textField_5.getText()+"\nRanking:\t\t"+textField_6.getText());
			}
		});
		showreprtbutton.setBounds(318, 547, 115, 23);
		frame.getContentPane().add(showreprtbutton);
		
		JButton exitbutton = new JButton("Exit");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitbutton.setBounds(472, 547, 98, 23);
		frame.getContentPane().add(exitbutton);
		
		JButton resetbutton = new JButton("Reset");
		resetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				comboBox.setSelectedIndex(0);
				
				
			
				
				
				
				
			}
		});
		resetbutton.setBounds(619, 547, 98, 23);
		frame.getContentPane().add(resetbutton);
	}
}
