import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JButton;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;


public class changenum extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int SCALE_DEFAULT = 0;
	private JPanel contentPane;
	String oldpass, new_pass, confirm;
	private JTextField user;
	private JTextField current;
	private JTextField newn;
	private JTextField confirmn;
	private Component loginbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changenum frame = new changenum();
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
	public changenum() {
		setTitle("Change Number");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\download (6).jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 274);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user = new JTextField();
		user.setBounds(218, 22, 165, 24);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(10, 22, 158, 24);
		contentPane.add(lblUsername);
		
		JLabel lblNewLabel = new JLabel("Current Number :");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 57, 158, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewPassword = new JLabel("New Number :");
		lblNewPassword.setForeground(SystemColor.text);
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewPassword.setBounds(10, 92, 158, 24);
		contentPane.add(lblNewPassword);
		
		JLabel lblNewLabel_1 = new JLabel("Confirm New Number :");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 127, 180, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton confirmbtn = new JButton("Confirm");
		confirmbtn.setBackground(SystemColor.text);
		confirmbtn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		confirmbtn.setBounds(24, 185, 85, 21);
		confirmbtn.addActionListener(e -> {chnge();});
		contentPane.add(confirmbtn);
		
		JButton backbtn = new JButton("Back");
		backbtn.setBackground(SystemColor.text);
		backbtn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		backbtn.setBounds(272, 184, 85, 22);
		backbtn.addActionListener(e -> {
			this.setVisible(false);
		} );
		contentPane.add(backbtn);
		
		current = new JTextField();
		current.setColumns(10);
		current.setBounds(218, 57, 165, 24);
		contentPane.add(current);
		
		newn = new JTextField();
		newn.setColumns(10);
		newn.setBounds(218, 96, 165, 24);
		contentPane.add(newn);
		
		confirmn = new JTextField();
		confirmn.setColumns(10);
		confirmn.setBounds(218, 131, 165, 24);
		contentPane.add(confirmn);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon( new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\cyber-attack-abstract-access.jpg").getImage().getScaledInstance(417, 235, SCALE_DEFAULT)));
		lblNewLabel_2.setBounds(0, 0, 417, 235);
		contentPane.add(lblNewLabel_2);
	}

	private void chnge() {
	
		String username = user.getText();
		String number = current.getText();
		String newnumber = newn.getText();
		String conf = confirmn.getText();
		
			
		if(username.equals("")|| number.equals("") || newnumber.equals("") || conf.equals(""))
		{JOptionPane.showMessageDialog(loginbtn, "A field is empty please enter a value.");}
		
		else if (!(10<=number.length() && number.length()<=12))
		{JOptionPane.showMessageDialog(loginbtn, "The lenght of the number can only be between 10-12 digits");}
		
		else if (!(10<=newnumber.length() && newnumber.length()<=12))
		{JOptionPane.showMessageDialog(loginbtn, "The lenght of the new number can only be between 10-12 digits");}	
		
		else if(username.equals("")|| number.equals("") || newnumber.equals("") || conf.equals(""))
		{JOptionPane.showMessageDialog(loginbtn, "A field is empty please enter a value.");}
		
		else if (current.equals(newnumber))
		{JOptionPane.showMessageDialog(loginbtn, "The old and the newnumber are same.");}
		else if( !(newnumber.equals(conf)))
		{JOptionPane.showMessageDialog(loginbtn, "New Number and confirm number do not match.");}
		else {
			ResultSet valid=DB.check_phone(username, number);
			boolean check=false;
			try {
				check=valid.next();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(check) {
				boolean change=DB.stu_phone(number, conf, username);
				if(change) {
					this.setVisible(false);
					JOptionPane.showMessageDialog(loginbtn, "Your Phone Number Has Been Updated Successfully");
					
				}else {
					JOptionPane.showMessageDialog(loginbtn, "Unsuccessful");
				}
			}else {
				JOptionPane.showMessageDialog(loginbtn, "Incorrect Username Or Phone Number");
			}
		
		}
		//The data to be updated in the database	
	}
}