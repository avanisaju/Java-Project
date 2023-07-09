package emp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JPasswordField;
public class Loginemployee extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginemployee window = new Loginemployee();
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
	public Loginemployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =this;
		frame.getContentPane().setBackground(new Color(68, 187, 164));
		frame.setBounds(100, 100, 532, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBounds(197, 229, 89, 24);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(95, 302, 130, 14);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Password");
		lblNewLabel_2.setBounds(95, 361, 130, 14);
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.setBounds(210, 434, 89, 23);
		btnNewButton.setForeground(new Color(128, 0, 64));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","msc","msc");
					Statement stmt=con.createStatement();
					String query="select * from Login where Username='"+textField.getText()+"' and Password='"+textField_1.getText()+"'";
			
					ResultSet rs=stmt.executeQuery(query);
					if(rs.next())
					{
						Homeemployee cos=new Homeemployee();
						cos.setVisible(true);
						setVisible(false);
					}
					
					
					else {
						JOptionPane.showMessageDialog(null,"login failed");
						
					}
				}catch(Exception e1)
				{
					System.out.println(e1);
				}
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(296, 303, 104, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(296, 362, 104, 20);
		textField_1.setToolTipText("");
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\emppic.png"));
		lblNewLabel_3.setBounds(67, 3, 557, 216);
		getContentPane().add(lblNewLabel_3);
		
		
		
		
		
	}
}
