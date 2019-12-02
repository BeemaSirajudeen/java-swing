package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;

public class checkbox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox window = new checkbox();
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
	public checkbox() {
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
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("CPP");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox.setBounds(117, 43, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(95, 186, 285, 29);
		frame.getContentPane().add(lblNewLabel);
		
		chckbxNewCheckBox.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent e)	{
			lblNewLabel.setText("CPP "+(e.getStateChange()==1?"Checked":"unchecked"));
			
		}
	});
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("JAVA");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox_1.setBounds(117, 99, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		
		chckbxNewCheckBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)	{
				lblNewLabel.setText("JAVA "+(e.getStateChange()==1?"Checked":"unchecked"));
				
			}
		});
		
		
	}
}
