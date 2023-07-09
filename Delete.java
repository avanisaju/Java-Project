package emp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Delete extends JFrame {

private JPanel contentPane;
private JTextField textField;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
	Delete frame = new Delete();
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
public Delete() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 956, 579);
contentPane = new JPanel();
contentPane.setBackground(new Color(32, 159, 143));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JButton btnNewButton_1 = new JButton("Back");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
new Homeemployee().setVisible(true);
}
});
btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 15));
btnNewButton_1.setBounds(479, 362, 89, 23);
contentPane.add(btnNewButton_1);

JButton btnNewButton = new JButton("Delete");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","msc","msc");
Statement stmt=con.createStatement();

String e_id = textField.getText();
String qry = "delete from Employeedetails where e_id='"+e_id+"'";
   System.out.println(qry);
   stmt.executeUpdate(qry);
   JOptionPane.showMessageDialog(null, "Values deleted successfully");

}

catch (Exception q) {
System .out.println(q);
}
}
});
btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
btnNewButton.setBounds(463, 268, 119, 23);
contentPane.add(btnNewButton);

textField = new JTextField();
textField.setBounds(564, 158, 220, 36);
contentPane.add(textField);
textField.setColumns(10);

JLabel lblNewLabel_2 = new JLabel("ID");
lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 15));
lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_2.setBounds(300, 158, 180, 48);
contentPane.add(lblNewLabel_2);

JSeparator separator = new JSeparator();
separator.setBounds(345, 77, 374, 2);
contentPane.add(separator);

JLabel lblNewLabel_1 = new JLabel("DELETION");
lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1.setBounds(366, 24, 294, 32);
contentPane.add(lblNewLabel_1);


}

}
