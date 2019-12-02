package sampleswing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class faren {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					faren window = new faren();
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
	public faren() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblDeegrees = new JLabel("Deegrees");
		lblDeegrees.setBounds(41, 56, 85, 24);
		frame.getContentPane().add(lblDeegrees);
		
		textField = new JTextField();
		textField.setBounds(172, 58, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(99, 131, 200, 14);
		frame.getContentPane().add(label);
		
		
		JButton btnToCelsius = new JButton("To Celsius");
		btnToCelsius.setBounds(37, 199, 89, 23);
		frame.getContentPane().add(btnToCelsius);
		btnToCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String c1=textField.getText();
			float c2=Float.parseFloat(c1);
			float f=(float)((9/5)*c2+32);
			String str=String.valueOf(f);
			label.setText("Result="+str);
			
			}
		});
	

		
		JButton btnToFahrenheit = new JButton("To fahrenheit");
		btnToFahrenheit.setBounds(223, 199, 89, 23);
		frame.getContentPane().add(btnToFahrenheit);
		
		
		btnToFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String S1=textField.getText();
				float S2=Float.parseFloat(S1);
				float f=(float)((1.8)*S2+32);
				String str=String.valueOf(f);
				label.setText("Result="+str);
				
				
				
			}
		});
	}

}
