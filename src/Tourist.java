import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;

public class Tourist extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1893388726760456979L;
	private JPanel contentPane;
	private JTextField textFielduser;
	private JPasswordField passwordField;
	String uservalue  , passwordvalue;
	private JButton loginbtn, back, newaccbtn;
	private JTextArea txtrContactInfo;
	private JTextArea txtrContactInfo_1;
	private JTextArea txtrContactInfo_2;
	private JTextArea txtrContactInfo_3;
	private JTextArea txtrEmailUs;
	private JTextArea txtrContactInfo_4;
	private JTextArea txtrContactInfo_5;
	private JTextArea txtrContactInfo_6;
	private JLabel textArea;
 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tourist frame = new Tourist();
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
	public Tourist() {
		setTitle("Tourist Mode");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\WhatsApp Image 2022-07-05 at 9.44.32 PM.jpeg"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(1, 1, 1370, 730);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Tourist Login");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Bookman Old Style", Font.BOLD, 23));
		l1.setBounds(61, 72, 204, 51);
		contentPane.add(l1);
		
		JLabel username = new JLabel("Username:");
		username.setBackground(new Color(255, 255, 255));
		username.setFont(new Font("Candara", Font.BOLD, 28));
		username.setForeground(new Color(255, 255, 255));
		username.setBounds(85, 149, 143, 41);
		contentPane.add(username);
		
		textFielduser = new JTextField();
		textFielduser.setForeground(Color.WHITE);
		textFielduser.setBackground(Color.BLACK);
		textFielduser.setBounds(60, 201, 178, 35);
		contentPane.add(textFielduser);
		textFielduser.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setBackground(Color.BLACK);
		passwordField.setBounds(60, 296, 178, 35);
		contentPane.add(passwordField);
		
		
		loginbtn = new JButton("Login");
		loginbtn.setForeground(new Color(255, 255, 255));
		loginbtn.setBackground(new Color(0, 0, 0));
		loginbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		loginbtn.addActionListener(e-> {
			
				
				String user = textFielduser.getText();
				char[] p = passwordField.getPassword();
				String passwordvalue = new String(p);
				Tour st=new Tour(user,passwordvalue);
				ResultSet valid=DB.tourist_login(st);
				boolean ans=false;
				try {
					ans=valid.next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if((user.equals("")) || (passwordvalue.equals("")))
				{
					JOptionPane.showMessageDialog(loginbtn, "A field is empty please enter a value.");
				}
				else if (ans) { //Condition to check from the database
					
				
						this.setVisible(false);
						tourist2 S2= new tourist2();
						S2.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(loginbtn, "Wrong Username or Password");
				}			
			
	
		 });
		loginbtn.setBounds(77, 369, 151, 21);
		contentPane.add(loginbtn);
		
		JLabel l2 = new JLabel("Some Tourist Attaractions:");
		l2.setFont(new Font("Tahoma", Font.BOLD, 24));
		l2.setForeground(Color.WHITE);
		l2.setBounds(386, 10, 333, 51);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("Faisal Mosque");
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Tahoma", Font.BOLD, 20));
		l3.setBounds(396, 72, 224, 26);
		contentPane.add(l3);
		
		JLabel picfaisalm = new JLabel("");
		picfaisalm.setHorizontalAlignment(SwingConstants.CENTER);
		picfaisalm.setIcon(new ImageIcon( new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\WhatsApp Image 2022-07-05 at 9.44.36 PM (1).jpeg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
		picfaisalm.setForeground(Color.WHITE);
		picfaisalm.setBounds(971, 72, 296, 175);
		contentPane.add(picfaisalm);
		
		JLabel l4 = new JLabel("Saidpur Village");
		l4.setFont(new Font("Tahoma", Font.BOLD, 20));
		l4.setForeground(Color.WHITE);
		l4.setBounds(694, 228, 216, 35);
		contentPane.add(l4);
		
		JLabel picsaidpur = new JLabel("");
		picsaidpur.setVerticalAlignment(SwingConstants.BOTTOM);
		picsaidpur.setHorizontalAlignment(SwingConstants.CENTER);
		picsaidpur.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\WhatsApp Image 2022-07-05 at 9.44.35 PM.jpeg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
		picsaidpur.setBounds(396, 228, 258, 182);
		contentPane.add(picsaidpur);
		
		JLabel l5 = new JLabel("Margalla Hills");
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("Tahoma", Font.BOLD, 20));
		l5.setBounds(396, 433, 185, 28);
		contentPane.add(l5);
		
		JLabel picmargalla = new JLabel("");
		picmargalla.setHorizontalAlignment(SwingConstants.CENTER);
		picmargalla.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\WhatsApp Image 2022-07-05 at 9.44.36 PM.jpeg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
		picmargalla.setBounds(1001, 421, 266, 141);
		contentPane.add(picmargalla);
		
		newaccbtn = new JButton("Create New Account");
		newaccbtn.setForeground(new Color(255, 255, 255));
		newaccbtn.setBackground(new Color(0, 0, 0));
		newaccbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		newaccbtn.setBounds(77, 401, 151, 28);
		newaccbtn.addActionListener(e-> {createAccount();});
		contentPane.add(newaccbtn);
		
		back = new JButton("Back\r\n");
		back.setForeground(new Color(255, 255, 255));
		back.setBackground(new Color(0, 0, 0));
		back.setFont(new Font("Tahoma", Font.PLAIN, 15));
		back.setBounds(77, 440, 151, 21);
		back.addActionListener(e-> {showMain();});
		contentPane.add(back);
		
		JLabel l6 = new JLabel("________________________________________________\r\n");
		l6.setForeground(Color.WHITE);
		l6.setBounds(10, 730, 1808, 13);
		contentPane.add(l6);
		
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
		txtrContactInfo.setBackground(new Color(204, 204, 255));
		txtrContactInfo.setForeground(new Color(0, 0, 0));
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
		txtrEmailUs.setForeground(new Color(0, 0, 0));
		txtrEmailUs.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 14));
		txtrEmailUs.setEditable(false);
		txtrEmailUs.setBackground(new Color(204, 204, 255));
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
		
		
		JTextArea txtrFaisalMosqueIs = new JTextArea();
		txtrFaisalMosqueIs.setEditable(false);
		txtrFaisalMosqueIs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrFaisalMosqueIs.setBackground(Color.BLACK);
		txtrFaisalMosqueIs.setForeground(Color.WHITE);
		txtrFaisalMosqueIs.setText("Faisal Mosque is the mosque in Islamabad, Pakistan. Located on the \r\nfoothills of Margalla Hills in Islamabad, the mosque features a \r\ncontemporary design consisting of eight sides of concrete shell and is \r\ninspired by a Bedouin tent.\r\n\r\n");
		txtrFaisalMosqueIs.setBounds(396, 121, 607, 82);
		contentPane.add(txtrFaisalMosqueIs);
		
		JTextArea txtrsaidpur = new JTextArea();
		txtrsaidpur.setEditable(false);
		txtrsaidpur.setBackground(Color.BLACK);
		txtrsaidpur.setForeground(Color.WHITE);
		txtrsaidpur.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrsaidpur.setText("The revived town of Saidpur lies at the foothills of the mountains that surround \r\nthe capital and provide a welcome break from modern life. Visiting this part of\r\nIslamabad is like taking 21st century. While modern life has found its way into \r\nthe settlements here, it has been incorporated in a manner that blends all the \r\nmodern eateries into the ancient surroundings. The village itself is more than \r\n500 years old, but it was renovated by the CDA in 2006.");
		txtrsaidpur.setBounds(701, 280, 566, 130);
		contentPane.add(txtrsaidpur);
		
		JTextArea txtrItmargalla = new JTextArea();
		txtrItmargalla.setEditable(false);
		txtrItmargalla.setBackground(Color.BLACK);
		txtrItmargalla.setForeground(Color.WHITE);
		txtrItmargalla.setText("It goes without saying that if you live near the mountains, you’ll probably want\r\nto spend some time exploring them. The feeling is no different for tourists\r\nvisiting Islamabad, and for those  who  see the wilderness up close. \r\nHiking trails are marked throughout the hills and enthusiasts often backpack\r\nthrough them at their leisure");
		txtrItmargalla.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrItmargalla.setBounds(396, 472, 595, 102);
		contentPane.add(txtrItmargalla);
		
		
		
		JLabel imagegallery = new JLabel("Image Gallery\r\n");
		imagegallery.setForeground(Color.WHITE);
		imagegallery.setFont(new Font("Tahoma", Font.BOLD, 20));
		imagegallery.setBounds(853, 751, 187, 25);
		contentPane.add(imagegallery);
		
		JLabel faisalm = new JLabel("");
		faisalm.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\WhatsApp Image 2022-07-05 at 9.44.33 PM.jpeg"));
		faisalm.setBounds(1012, 748, 164, 87);
		contentPane.add(faisalm);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Candara", Font.BOLD, 28));
		lblPassword.setBackground(Color.WHITE);
		lblPassword.setBounds(83, 244, 133, 41);
		contentPane.add(lblPassword);
		
		JLabel pic2 = new JLabel("");
		pic2.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\WhatsApp Image 2022-07-05 at 9.44.34 PM.jpeg"));
		pic2.setBounds(1197, 751, 143, 82);
		contentPane.add(pic2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\landscape-photography-of-weather-change-lago-lago-wallpaper-preview.jpg"));
		lblNewLabel.setBounds(0, 0, 306, 584);
		contentPane.add(lblNewLabel);
		
	}

	private void createAccount() {
		
		createTourAcc C1 = new createTourAcc();
		C1.setVisible(true);
		
	}

	private void showMain() {
		this.setVisible(false);
		MainPage P1 = new MainPage();
		P1.setVisible(true);
		
	}
	
}