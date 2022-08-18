import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class CreateAccount extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int SCALE_DEFAULT = 0;
	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField uname;
	private JPasswordField passwordField;
	private JPasswordField cpasswordField;
	
	private Component loginbtn;
	private JTextField num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount frame = new CreateAccount();
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
	public CreateAccount() {
		setTitle("Create New Account");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\download (6).jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 306);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		num = new JTextField();
		num.setColumns(10);
		num.setBounds(201, 139, 167, 19);
		contentPane.add(num);
		
		JTextArea number = new JTextArea();
		number.setText("Contact No.");
		number.setForeground(Color.WHITE);
		number.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
		number.setEditable(false);
		number.setBackground(new Color(34, 34, 34));
		number.setBounds(10, 135, 105, 22);
		contentPane.add(number);
		
		JTextArea txtrWelcomeLet = new JTextArea();
		txtrWelcomeLet.setLineWrap(true);
		txtrWelcomeLet.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		txtrWelcomeLet.setEnabled(true);
		txtrWelcomeLet.setEditable(false);
		txtrWelcomeLet.setBackground( new Color(34, 34, 34));
		txtrWelcomeLet.setForeground(SystemColor.text);
		txtrWelcomeLet.setText("Welcome ! Let us help you create a new Account ");
		txtrWelcomeLet.setBounds(10, 13, 414, 28);
		contentPane.add(txtrWelcomeLet);
		
		JTextArea txtrEnterYourFirst = new JTextArea();
		txtrEnterYourFirst.setEditable(false);
		txtrEnterYourFirst.setForeground(SystemColor.text);
		txtrEnterYourFirst.setBackground(new Color(34, 34, 34));
		txtrEnterYourFirst.setText("First Name :");
		txtrEnterYourFirst.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
		txtrEnterYourFirst.setBounds(10, 51, 116, 22);
		contentPane.add(txtrEnterYourFirst);
		
		JTextArea enterlname = new JTextArea();
		enterlname.setEditable(false);
		enterlname.setForeground(SystemColor.text);
		enterlname.setBackground(new Color(34, 34, 34));
		enterlname.setText("Last Name :");
		enterlname.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
		enterlname.setBounds(10, 80, 111, 22);
		contentPane.add(enterlname);
		
		JTextArea user = new JTextArea();
		user.setEditable(false);
		user.setForeground(SystemColor.text);
		user.setText("Username :");
		user.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
		user.setBackground(new Color(34, 34, 34));
		user.setBounds(10, 108, 105, 22);
		contentPane.add(user);
		
		JTextArea txtrEnterYourPassword = new JTextArea();
		txtrEnterYourPassword.setEditable(false);
		txtrEnterYourPassword.setForeground(SystemColor.text);
		txtrEnterYourPassword.setText("Password :");
		txtrEnterYourPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
		txtrEnterYourPassword.setBackground(new Color(34, 34, 34));
		txtrEnterYourPassword.setBounds(10, 163, 99, 22);
		contentPane.add(txtrEnterYourPassword);
		
		JTextArea txtrPleaseReenterYour = new JTextArea();
		txtrPleaseReenterYour.setEditable(false);
		txtrPleaseReenterYour.setForeground(SystemColor.text);
		txtrPleaseReenterYour.setText("Confirm Password :");
		txtrPleaseReenterYour.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
		txtrPleaseReenterYour.setBackground(new Color(34, 34, 34));
		txtrPleaseReenterYour.setBounds(10, 194, 176, 22);
		contentPane.add(txtrPleaseReenterYour);
		
		JButton createbtn = new JButton("Create");
		createbtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		createbtn.addActionListener(e->{create();});
		createbtn.setBounds(335, 227, 89, 23);
		
		contentPane.add(createbtn);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBack.setBounds(10, 227, 89, 23);
		btnBack.addActionListener(e -> {this.setVisible(false);});
		contentPane.add(btnBack);
		
		fname = new JTextField();
		fname.setBounds(201, 56, 167, 19);
		contentPane.add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(201, 84, 167, 19);
		contentPane.add(lname);
		
		uname = new JTextField();
		uname.setColumns(10);
		uname.setBounds(201, 112, 167, 19);
		contentPane.add(uname);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(201, 167, 167, 19);
		contentPane.add(passwordField);
		
		cpasswordField = new JPasswordField();
		cpasswordField.setBounds(198, 198, 170, 19);
		contentPane.add(cpasswordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon( new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\concept-construction-page-site.jpg").getImage().getScaledInstance(429, 267, SCALE_DEFAULT)));
		lblNewLabel.setBounds(0, 0, 429, 267);
		contentPane.add(lblNewLabel);
	}

	private void create() {
		char[] p1 = passwordField.getPassword();
		String pass = new String(p1);
		char[] p2 = cpasswordField.getPassword();
		String cpass = new String(p2);
		String fullname = fname.getText();
		String lastname = lname.getText();
		String username = uname.getText();
		String cnumber = num.getText();
		
		if(username.equals("")|| fullname.equals("") || lastname.equals("") || pass.equals("") || cpass.equals("") || cnumber.equals(""))
		{JOptionPane.showMessageDialog(loginbtn, "A field is empty please enter a value.");}
		
		//else if (!(10<=fullname.length() && fullname.length()<=12))
		//{JOptionPane.showMessageDialog(loginbtn, "The lenght of the number can only be between 10-12 digits");}
		
		else if (!(10<=cnumber.length() && cnumber.length()<=12))
		{JOptionPane.showMessageDialog(loginbtn, "Invalid Phone Number");}	
		
		else if( !(cpass.equals(pass)))
		{JOptionPane.showMessageDialog(loginbtn, "The password and confirm password do not match.");}
		else {
			Stu st=new Stu(fullname,lastname,username,cpass,cnumber);
			ResultSet check=DB.student_check(username);
			boolean ans=false;
			boolean valid=false;
			try {
				 ans=check.next();
				 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(ans) {
				 JOptionPane.showMessageDialog(loginbtn, "User Name Must Be Unique");
				 
			 }else {
				 valid=DB.student_signup(st);
					if(valid) {
						this.setVisible(false);
						StudentLogin s1=new StudentLogin();
						s1.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(loginbtn, "Sign-up not successful");
						
					}
				
			 }
			
		}
		//The data to be updated in the database
		
		
	}
}