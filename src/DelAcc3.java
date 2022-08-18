
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


public class DelAcc3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int SCALE_DEFAULT = 0;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField cpasswordField;
	String oldpass, new_pass, confirm;
	private Component loginbtn;
	private JTextField uname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DelAcc3 frame = new DelAcc3();
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
	public DelAcc3() {
		setTitle("Delete Account");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\download (6).jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 274);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		uname = new JTextField();
		uname.setBounds(218, 29, 165, 24);
		contentPane.add(uname);
		uname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(24, 29, 158, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewPassword = new JLabel("Password :");
		lblNewPassword.setForeground(SystemColor.text);
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewPassword.setBounds(24, 78, 158, 24);
		contentPane.add(lblNewPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(218, 80, 165, 24);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Confirm Password");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 127, 180, 24);
		contentPane.add(lblNewLabel_1);
		
		cpasswordField = new JPasswordField();
		cpasswordField.setBounds(218, 129, 165, 24);
		contentPane.add(cpasswordField);
		
		JButton confirmbtn = new JButton("Delete");
		confirmbtn.setBackground(SystemColor.text);
		confirmbtn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		confirmbtn.setBounds(24, 185, 85, 21);
		confirmbtn.addActionListener(e -> {delete();
		});
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

	private void delete() {
		
			char[] p1 = passwordField.getPassword();
			String pass = new String(p1);
			char[] p2 = cpasswordField.getPassword();
			String cpass = new String(p2);
			
			String username = uname.getText();
			
			if(username.equals("")|| pass.equals("") || cpass.equals("") )
			{JOptionPane.showMessageDialog(loginbtn, "A field is empty please enter a value.");}
			
			//else if (!(10<=fullname.length() && fullname.length()<=12))
			//{JOptionPane.showMessageDialog(loginbtn, "The lenght of the number can only be between 10-12 digits");}
			
			//else if (!(10<=lastname.length() && lastname.length()<=12))
			//{JOptionPane.showMessageDialog(loginbtn, "The lenght of the new number can only be between 10-12 digits");}	
			
			else if( !(cpass.equals(pass)))
			{JOptionPane.showMessageDialog(loginbtn, "The password and confirm password do not match.");}
			else {
				Administrator st=new Administrator(username,cpass);
				ResultSet valid=DB.admin(st);
				
				boolean check=false;
				try {
					check=valid.next();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(check) {
					boolean dlt=DB.dltAdmin(username, cpass);
					if(dlt) {
						this.setVisible(false);
						MainPage m=new MainPage();
						m.setVisible(true);
						JOptionPane.showMessageDialog(loginbtn, "Account Deleted");
						
					}else {
						JOptionPane.showMessageDialog(loginbtn, "Unsuccessful");
					}
				}else {
					JOptionPane.showMessageDialog(loginbtn, "Incorrect UserName Or Password");
				}
			}
			//The data to be updated in the database
			
			
		}
		
	
}
