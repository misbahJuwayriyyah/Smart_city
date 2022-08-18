
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;



import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.JPasswordField;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Admin extends JFrame {

	private static final long serialVersionUID = 3797256878924359601L;

	private static final int SCALE_DEFAULT = 0;

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextArea txtrUsername;

	private JButton btnNewButton_1;

	private JButton back;
	private String user1;
	private JButton loginbtn;
	private JTextArea txtrContactInfo;
	private JTextArea txtrContactInfo_1;
	private JTextArea txtrContactInfo_3;
	private JTextArea txtrContactInfo_2;
	private JTextArea txtrEmailUs;
	private JTextArea txtrContactInfo_4;
	private JTextArea txtrContactInfo_5;
	private JTextArea txtrContactInfo_6;
	private JLabel lblNewLabel;
	private JTextArea txtrWelcomeToThe;
	private JLabel lblNewLabel_1;
	private JTextArea txtHelpGuidePeople;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Admin() {
		//setExtendedState(StudentPortalGUI.MAXIMIZED_BOTH);
		setTitle("Admin Portal");
		setBackground(new Color(0, 0, 0));
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\download (6).jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(1, 1, 1370, 730);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(83, 196, 156, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\download.jpg"));
		lblNewLabel_2.setBounds(121, 595, 276, 109);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\download.jpg"));
		lblNewLabel_2_1.setBounds(378, 595, 276, 109);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\download.jpg"));
		lblNewLabel_2_2.setBounds(638, 595, 296, 109);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\download.jpg"));
		lblNewLabel_2_3.setBounds(921, 595, 296, 109);
		contentPane.add(lblNewLabel_2_3);
		
		txtrContactInfo = new JTextArea();
		txtrContactInfo.setText("Contact Info.");
		txtrContactInfo.setEditable(false);
		txtrContactInfo.setLineWrap(true);
		txtrContactInfo.setBackground(Color.LIGHT_GRAY);
		txtrContactInfo.setForeground(Color.BLACK);
		txtrContactInfo.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 14));
		txtrContactInfo.setBounds(5, 595, 106, 22);
		contentPane.add(txtrContactInfo);
		
		txtrContactInfo_1 = new JTextArea();
		txtrContactInfo_1.setText("+92-3104123456");
		txtrContactInfo_1.setLineWrap(true);
		txtrContactInfo_1.setForeground(Color.WHITE);
		txtrContactInfo_1.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrContactInfo_1.setEditable(false);
		txtrContactInfo_1.setBackground(Color.BLACK);
		txtrContactInfo_1.setBounds(5, 646, 115, 22);
		contentPane.add(txtrContactInfo_1);
		
		txtrContactInfo_2 = new JTextArea();
		txtrContactInfo_2.setText("+92-3309078654");
		txtrContactInfo_2.setLineWrap(true);
		txtrContactInfo_2.setForeground(Color.WHITE);
		txtrContactInfo_2.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrContactInfo_2.setEditable(false);
		txtrContactInfo_2.setBackground(Color.BLACK);
		txtrContactInfo_2.setBounds(5, 628, 115, 22);
		contentPane.add(txtrContactInfo_2);
		
		txtrContactInfo_3 = new JTextArea();
		txtrContactInfo_3.setText("+92-3215678765");
		txtrContactInfo_3.setLineWrap(true);
		txtrContactInfo_3.setForeground(Color.WHITE);
		txtrContactInfo_3.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrContactInfo_3.setEditable(false);
		txtrContactInfo_3.setBackground(Color.BLACK);
		txtrContactInfo_3.setBounds(5, 666, 115, 22);
		contentPane.add(txtrContactInfo_3);
		
		txtrEmailUs = new JTextArea();
		txtrEmailUs.setText("    Email Us.");
		txtrEmailUs.setLineWrap(true);
		txtrEmailUs.setForeground(Color.BLACK);
		txtrEmailUs.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 14));
		txtrEmailUs.setEditable(false);
		txtrEmailUs.setBackground(Color.LIGHT_GRAY);
		txtrEmailUs.setBounds(1221, 595, 123, 22);
		contentPane.add(txtrEmailUs);
		
		txtrContactInfo_4 = new JTextArea();
		txtrContactInfo_4.setText("maryam@gmail.com");
		txtrContactInfo_4.setLineWrap(true);
		txtrContactInfo_4.setForeground(Color.WHITE);
		txtrContactInfo_4.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrContactInfo_4.setEditable(false);
		txtrContactInfo_4.setBackground(Color.BLACK);
		txtrContactInfo_4.setBounds(1221, 625, 133, 22);
		contentPane.add(txtrContactInfo_4);
		
		txtrContactInfo_5 = new JTextArea();
		txtrContactInfo_5.setText("misbah@gmail.com");
		txtrContactInfo_5.setLineWrap(true);
		txtrContactInfo_5.setForeground(Color.WHITE);
		txtrContactInfo_5.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrContactInfo_5.setEditable(false);
		txtrContactInfo_5.setBackground(Color.BLACK);
		txtrContactInfo_5.setBounds(1221, 646, 133, 22);
		contentPane.add(txtrContactInfo_5);
		
		txtrContactInfo_6 = new JTextArea();
		txtrContactInfo_6.setText("saadan@gmail.com");
		txtrContactInfo_6.setLineWrap(true);
		txtrContactInfo_6.setForeground(Color.WHITE);
		txtrContactInfo_6.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrContactInfo_6.setEditable(false);
		txtrContactInfo_6.setBackground(Color.BLACK);
		txtrContactInfo_6.setBounds(1221, 666, 133, 22);
		contentPane.add(txtrContactInfo_6);
		
		txtrUsername = new JTextArea();
		txtrUsername.setLineWrap(true);
		txtrUsername.setEditable(false);
		txtrUsername.setBounds(83, 163, 133, 22);
		txtrUsername.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		txtrUsername.setBackground(Color.BLACK);
		txtrUsername.setForeground(Color.WHITE);
		txtrUsername.setText("Username: ");
		contentPane.add(txtrUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(83, 273, 156, 35);
		passwordField.setBackground(Color.WHITE);
		contentPane.add(passwordField);
		
		btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(new Font("Book Antiqua", Font.PLAIN, 20));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(52, 394, 106, 43);
		btnNewButton_1.addActionListener(e-> {
			 if (e.getSource() == btnNewButton_1) {
				String user = textField.getText();
				 char[] p = passwordField.getPassword();
				String passwordvalue = new String(p);
				Administrator id=new Administrator(user,passwordvalue);
				ResultSet answer=DB.admin(id);
				boolean ans=false;
				try {
					ans=answer.next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if((user.equals("")) || (passwordvalue.equals("")))
				{
					JOptionPane.showMessageDialog(loginbtn, "A field is empty please enter a value.");
				}
				else if (ans) { //Condition to check from the database
					
						setVisible(false);
						AdminOption S2= new AdminOption();
						S2.setVisible(true);}
					
			    else {
					JOptionPane.showMessageDialog(loginbtn, "Wrong Username or Password");
				}	
				
				 

			 }
			 });
		contentPane.add(btnNewButton_1);
		
		back = new JButton("Back\r\n");
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLACK);
		back.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		back.setBounds(187, 394, 106, 43);
		back.addActionListener(e-> {showMain();});
		contentPane.add(back);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Password:");
		txtrPassword.setLineWrap(true);
		txtrPassword.setForeground(Color.WHITE);
		txtrPassword.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		txtrPassword.setEditable(false);
		txtrPassword.setBackground(Color.BLACK);
		txtrPassword.setBounds(83, 240, 133, 22);
		contentPane.add(txtrPassword);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon( new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\nature-water-mountains-trees-wallpaper-preview.jpg").getImage().getScaledInstance(350, 584, SCALE_DEFAULT)));
		lblNewLabel.setBounds(0, 0, 350, 584);
		contentPane.add(lblNewLabel);
		
		txtrWelcomeToThe = new JTextArea();
		txtrWelcomeToThe.setText("Welcome to the Admin Portal");
		txtrWelcomeToThe.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		txtrWelcomeToThe.setBackground(new Color(0, 0, 0));
		txtrWelcomeToThe.setForeground(new Color(255, 255, 255));
		txtrWelcomeToThe.setBounds(556, 44, 575, 43);
		contentPane.add(txtrWelcomeToThe);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\islamabad-map-0.jpg"));
		lblNewLabel_1.setBounds(571, 130, 562, 359);
		contentPane.add(lblNewLabel_1);
		
		txtHelpGuidePeople = new JTextArea();
		txtHelpGuidePeople.setWrapStyleWord(true);
		txtHelpGuidePeople.setLineWrap(true);
		txtHelpGuidePeople.setFont(new Font("Artifakt Element Medium", Font.BOLD | Font.ITALIC, 50));
		txtHelpGuidePeople.setText("Help guide people through your city. ");
		txtHelpGuidePeople.setBackground(new Color(0, 0, 0));
		txtHelpGuidePeople.setForeground(new Color(255, 255, 255));
		txtHelpGuidePeople.setBounds(378, 500, 966, 77);
		contentPane.add(txtHelpGuidePeople);
		txtHelpGuidePeople.setColumns(10);
		
	
		
		
	}

	private void showMain() {
		this.setVisible(false);
		MainPage P1 = new MainPage();
		P1.setVisible(true);
		
	}
}