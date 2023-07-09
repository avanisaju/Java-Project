package emp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Homeemployee extends JFrame {
	static Homeemployee  frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Homeemployee ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Homeemployee () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(71, 184, 172));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(74, 269, 133, 36);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add as=new Add();
				as.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblHomeemployee = new JLabel("Home Page");
		lblHomeemployee.setBounds(203, 193, 114, 25);
		lblHomeemployee.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHomeemployee.setForeground(Color.DARK_GRAY);
		
		JButton btnViewEmployee = new JButton("View");
		btnViewEmployee.setBounds(318, 269, 157, 36);
		btnViewEmployee.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnViewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new View().setVisible(true);
			}
		});
		
		JButton btnEditEmployee = new JButton("Delete");
		btnEditEmployee.setBounds(181, 331, 157, 36);
		btnEditEmployee.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEditEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Delete().setVisible(true);
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(184, 433, 133, 36);
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Loginemployee al=new Loginemployee();
				al.setVisible(true);
				frame.dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblHomeemployee);
		contentPane.add(btnNewButton);
		contentPane.add(btnViewEmployee);
		contentPane.add(btnLogout);
		contentPane.add(btnEditEmployee);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\homepic.jfif"));
		lblNewLabel.setBounds(104, 19, 323, 164);
		contentPane.add(lblNewLabel);
	}

}
