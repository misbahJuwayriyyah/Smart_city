import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;

import javax.swing.JButton;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;


public class changepassword extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int SCALE_DEFAULT = 0;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTextField textField;
	private Component loginbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changepassword frame = new changepassword();
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
	public changepassword() {
		setTitle("Change Password\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\download (6).jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 274);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(218, 22, 165, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Username :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 22, 158, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Current Password:");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 57, 158, 24);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(218, 59, 165, 24);
		contentPane.add(passwordField);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setForeground(SystemColor.text);
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewPassword.setBounds(10, 92, 158, 24);
		contentPane.add(lblNewPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(218, 94, 165, 24);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Confirm New Password:");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 127, 180, 24);
		contentPane.add(lblNewLabel_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(218, 129, 165, 24);
		contentPane.add(passwordField_2);
		
		JButton confirmbtn = new JButton("Confirm");
		confirmbtn.setBackground(SystemColor.text);
		confirmbtn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		confirmbtn.setBounds(24, 185, 85, 21);
		confirmbtn.addActionListener(e -> {changepass();});
		contentPane.add(confirmbtn);
		
		JButton backbtn = new JButton("Back");
		backbtn.setBackground(SystemColor.text);
		backbtn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		backbtn.setBounds(272, 184, 85, 22);
		backbtn.addActionListener(e -> {
			this.setVisible(false);
		} );
		contentPane.add(backbtn);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon( new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\cyber-attack-abstract-access.jpg").getImage().getScaledInstance(417, 235, SCALE_DEFAULT)));
		lblNewLabel_2.setBounds(0, 0, 417, 235);
		contentPane.add(lblNewLabel_2);
	}

	private void changepass() {
		char[] p1 = passwordField.getPassword();
		String oldpass = new String(p1);
		char[] p2 = passwordField_1.getPassword();
		String new_pass = new String(p2);
		char[] p3 =passwordField_2.getPassword();
		String confirm = new String(p3);
		String username = textField.getText();
		
		if(username.equals("")|| oldpass.equals("") || new_pass.equals("") || confirm.equals(""))
		{JOptionPane.showMessageDialog(loginbtn, "A field is empty please enter a value.");}
		
		//else if (!(10<=oldpass.length() && oldpass.length()<=12))  //if lenght is to be restricted
		//{JOptionPane.showMessageDialog(loginbtn, "The lenght of the number can only be between 10-12 digits");}
		
		//else if (!(10<=new_pass.length() && new_pass.length()<=12))
		//{JOptionPane.showMessageDialog(loginbtn, "The lenght of the new number can only be between 10-12 digits");}	
		
		else if(username.equals("")|| oldpass.equals("") || new_pass.equals("") || confirm.equals(""))
		{JOptionPane.showMessageDialog(loginbtn, "A field is empty please enter a value.");}
		
		else if (oldpass.equals(new_pass))
		{JOptionPane.showMessageDialog(loginbtn, "The old and the newnumber are same.");}
		else if( !(new_pass.equals(confirm)))
		{JOptionPane.showMessageDialog(loginbtn, "New Number and confirm number do not match.");}
		else {
			Stu st=new Stu(username,oldpass);
			ResultSet valid=DB.student_login(st);
			boolean check=false;
			try {
				check=valid.next();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(check) {
				boolean change=DB.stu_password(oldpass, new_pass, username);
				if(change) {
					this.setVisible(false);
					JOptionPane.showMessageDialog(loginbtn, "Your Password Has Been Updated Successfully");
					
				}else {
					JOptionPane.showMessageDialog(loginbtn, "Unsuccessful");
				}
			}else {
				JOptionPane.showMessageDialog(loginbtn, "Incorect Username Or Password");
			}
		
		}
		//The data to be updated in the database	
		
	}
}