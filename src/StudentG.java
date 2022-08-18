import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Component;


import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.JPasswordField;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JOptionPane;



public class StudentG extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextArea txtrGettingAGood;
	private JTextArea txtrPakistansTopEducational;
	private JTextArea txtrWelcomeToThe;
	private JTextArea txtrUsername;
	private JTextArea txtrPassword;
	private JTextArea txtrAsPakistanIs;
	private JLabel lblNewLabel_2;
	private JTextArea txtrAmazingRecreationalPlaces;
	private JTextArea txtrTheCapitalCity;
	private JTextArea txtrContactInfo;
	private JTextArea txtrContactInfo_1;
	private JTextArea txtrContactInfo_2;
	private JTextArea txtrContactInfo_3;
	private JTextArea txtrEmailUs;
	private JTextArea txtrContactInfo_4;
	private JTextArea txtrContactInfo_5;
	private JTextArea txtrContactInfo_6;

	private JLabel lblNewLabel_4;
	private JButton back;
	private JButton newaccbtn;
	private Component loginbtn;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_5;
	private JTextArea textArea;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentG frame = new StudentG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentG() {
		//setExtendedState(StudentPortalGUI.MAXIMIZED_BOTH);
				//setExtendedState(StudentPortalGUI.MAXIMIZED_BOTH);
				setTitle("Student Portal");
				setBackground(new Color(0, 0, 0));
				setForeground(Color.WHITE);
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\201818.png"));
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setExtendedState(JFrame.MAXIMIZED_BOTH);
				setBounds(1, 1, 1370, 730);
				contentPane = new JPanel();
				contentPane.setForeground(Color.WHITE);
				contentPane.setBackground(Color.BLACK);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				textArea = new JTextArea();
				textArea.setBounds(99, 220, 154, 22);
				textArea.setBackground(new Color(204, 204, 153));
				contentPane.add(textArea);
				
				passwordField = new JPasswordField();
				passwordField.setBounds(99, 286, 154, 22);
				passwordField.setBackground(new Color(204, 204, 153));
				contentPane.add(passwordField);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setBounds(419, 63, 350, 149);
				lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\NUSTUniversity-Islamabad-Admissions-2018.jpg").getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT)));
				contentPane.add(lblNewLabel);
				
				JTextArea txtrUsername_1 = new JTextArea();
				txtrUsername_1.setWrapStyleWord(true);
				txtrUsername_1.setLineWrap(true);
				txtrUsername_1.setText("Welcome Sign In to get Started.");
				txtrUsername_1.setForeground(Color.BLACK);
				txtrUsername_1.setFont(new Font("Algerian", Font.PLAIN, 20));
				txtrUsername_1.setEditable(false);
				txtrUsername_1.setBackground(new Color(153, 102, 51));
				txtrUsername_1.setBounds(5, 47, 350, 32);
				contentPane.add(txtrUsername_1);
				
				txtrGettingAGood = new JTextArea("Getting a good quality education is everyone’s birthright. The beacon of education can help the person to conquer many difficulties of life with flying colors.. A good school polishes your professional and personal skills, abilities, and knowledge. Islamabad provides Pakistans best Educational Institutes.");
				txtrGettingAGood.setEditable(false);
				txtrGettingAGood.setBounds(754, 95, 410, 89);
				txtrGettingAGood.setBackground(Color.BLACK);
				txtrGettingAGood.setForeground(Color.LIGHT_GRAY);
				txtrGettingAGood.setLineWrap(true);
				txtrGettingAGood.setWrapStyleWord(true);
				txtrGettingAGood.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
				txtrGettingAGood.setTabSize(6);
				contentPane.add(txtrGettingAGood);
				
				txtrPakistansTopEducational = new JTextArea();
				txtrPakistansTopEducational.setEditable(false);
				txtrPakistansTopEducational.setBounds(818, 62, 296, 22);
				txtrPakistansTopEducational.setFont(new Font("Bookman Old Style", Font.ITALIC, 16));
				txtrPakistansTopEducational.setBackground(Color.BLACK);
				txtrPakistansTopEducational.setForeground(Color.WHITE);
				txtrPakistansTopEducational.setText("Pakistan's Top Educational Institutes");
				contentPane.add(txtrPakistansTopEducational);
				
				txtrWelcomeToThe = new JTextArea();
				txtrWelcomeToThe.setLineWrap(true);
				txtrWelcomeToThe.setBounds(638, 11, 331, 26);
				txtrWelcomeToThe.setEditable(false);
				txtrWelcomeToThe.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
				txtrWelcomeToThe.setText("Welcome to the Student Portal.");
				txtrWelcomeToThe.setBackground(Color.BLACK);
				txtrWelcomeToThe.setForeground(Color.WHITE);
				contentPane.add(txtrWelcomeToThe);
				
				txtrUsername = new JTextArea();
				txtrUsername.setEditable(false);
				txtrUsername.setBounds(121, 187, 115, 22);
				txtrUsername.setFont(new Font("Algerian", Font.PLAIN, 20));
				txtrUsername.setBackground(new Color(153, 102, 51));
				txtrUsername.setForeground(new Color(0, 0, 0));
				txtrUsername.setText("Username: ");
				contentPane.add(txtrUsername);
				
				
				txtrPassword = new JTextArea();
				txtrPassword.setFont(new Font("Algerian", Font.PLAIN, 20));
				txtrPassword.setEditable(false);
				txtrPassword.setBounds(121, 253, 112, 22);
				txtrPassword.setText("Password:");
				txtrPassword.setForeground(new Color(0, 0, 0));
				txtrPassword.setBackground(new Color(153, 102, 51));
				contentPane.add(txtrPassword);
				
				JTextArea txtrStartsResturants = new JTextArea();
				txtrStartsResturants.setEditable(false);
				txtrStartsResturants.setBackground(Color.BLACK);
				txtrStartsResturants.setForeground(Color.WHITE);
				txtrStartsResturants.setText("5 Starts Resturants");
				txtrStartsResturants.setFont(new Font("Bookman Old Style", Font.ITALIC, 16));
				txtrStartsResturants.setBounds(505, 223, 149, 22);
				contentPane.add(txtrStartsResturants);
				
				JLabel lblNewLabel_1 = new JLabel("");
				
				
				lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\download (1).jpg").getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT)));
				lblNewLabel_1.setBounds(849, 220, 350, 150);
				
				contentPane.add(lblNewLabel_1);
				
				txtrAsPakistanIs = new JTextArea();
				txtrAsPakistanIs.setEditable(false);
				txtrAsPakistanIs.setBackground(Color.BLACK);
				txtrAsPakistanIs.setForeground(Color.LIGHT_GRAY);
				txtrAsPakistanIs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
				txtrAsPakistanIs.setTabSize(6);
				txtrAsPakistanIs.setWrapStyleWord(true);
				txtrAsPakistanIs.setLineWrap(true);
				txtrAsPakistanIs.setText("As Pakistan is known for its diverse, traditional food options such as Nihari, Halwa Poori, Daal, Chapli Kebab, Islamabad's cuisine has further developed as they now have foreign franchises such as McDonald's, KFC, Hardee's, Subway, TGI Fridays, Cinnamon Café and China Grill. Islamabad has 5-Star Desi Resturants to amazing International Fast Food options.");
				txtrAsPakistanIs.setBounds(419, 256, 365, 117);
				contentPane.add(txtrAsPakistanIs);
				
				lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon ( new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\download (2).jpg").getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT)));
				lblNewLabel_2.setBounds(419, 411, 350, 150);
				contentPane.add(lblNewLabel_2);
				
				txtrAmazingRecreationalPlaces = new JTextArea();
				txtrAmazingRecreationalPlaces.setEditable(false);
				txtrAmazingRecreationalPlaces.setText("Amazing Recreational Places and Facilities");
				txtrAmazingRecreationalPlaces.setFont(new Font("Bookman Old Style", Font.ITALIC, 16));
				txtrAmazingRecreationalPlaces.setForeground(Color.WHITE);
				txtrAmazingRecreationalPlaces.setBackground(Color.BLACK);
				txtrAmazingRecreationalPlaces.setBounds(779, 413, 371, 22);
				contentPane.add(txtrAmazingRecreationalPlaces);
				
				txtrTheCapitalCity = new JTextArea();
				txtrTheCapitalCity.setEditable(false);
				txtrTheCapitalCity.setBackground(Color.BLACK);
				txtrTheCapitalCity.setForeground(Color.LIGHT_GRAY);
				txtrTheCapitalCity.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
				txtrTheCapitalCity.setWrapStyleWord(true);
				txtrTheCapitalCity.setLineWrap(true);
				txtrTheCapitalCity.setText("The capital city is blessed with breathtaking natural wonders alongside great infrastructure. This is what makes an incredibly attractive and exciting place to visit. It is known for its beautiful mountains and endless greenery. The weather here is moderate and pleasent at most time of the year.");
				txtrTheCapitalCity.setBounds(802, 444, 325, 117);
				contentPane.add(txtrTheCapitalCity);
				
				
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
				txtrContactInfo.setBackground(new Color(153, 102, 51));
				txtrContactInfo.setForeground(Color.WHITE);
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
				txtrEmailUs.setForeground(Color.WHITE);
				txtrEmailUs.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 14));
				txtrEmailUs.setEditable(false);
				txtrEmailUs.setBackground(new Color(153, 102, 51));
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
				
				
				lblNewLabel_4 = new JLabel("________________________________________________________________________________________________________________________________________________________________");
				lblNewLabel_4.setForeground(Color.WHITE);
				lblNewLabel_4.setBackground(Color.BLACK);
				lblNewLabel_4.setBounds(5, 570, 1407, 14);
				contentPane.add(lblNewLabel_4);
				
				JButton btnNewButton = new JButton("Login");
				btnNewButton.setFont(new Font("Book Antiqua", Font.PLAIN, 11));
				btnNewButton.setForeground(new Color(255, 255, 255));
				btnNewButton.setBackground(new Color(0, 0, 0));
				btnNewButton.setBounds(111, 332, 125, 32);
				btnNewButton.addActionListener(e-> {
					String user = textArea.getText();
					char[] p = passwordField.getPassword();
					String passwordvalue = new String(p);
					Stu st=new Stu(user,passwordvalue);
					ResultSet valid=DB.student_login(st);
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
						
							setVisible(false);
							StudentLogin S2= new StudentLogin();
							S2.setVisible(true);}
						
				    else {
						JOptionPane.showMessageDialog(loginbtn, "Wrong Username or Password");
					}	
					
				 });
				contentPane.add(btnNewButton);
				
				back = new JButton("Back\r\n");
				back.setForeground(new Color(255, 255, 255));
				back.setBackground(new Color(0, 0, 0));
				back.setFont(new Font("Book Antiqua", Font.PLAIN, 11));
				back.setBounds(111, 375, 125, 32);
				back.addActionListener(e-> {showMain();});
				contentPane.add(back);
				
				newaccbtn = new JButton("Create New Account");
				newaccbtn.setForeground(new Color(255, 255, 255));
				newaccbtn.setBackground(new Color(0, 0, 0));
				newaccbtn.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
				newaccbtn.setBounds(76, 443, 188, 38);
				newaccbtn.addActionListener(e-> {createAccount();});
				contentPane.add(newaccbtn);
				
				lblNewLabel_6 = new JLabel("");
				lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\book-spine-shelf-library.jpg"));
				lblNewLabel_6.setBounds(1, 1, 359, 583);
				contentPane.add(lblNewLabel_6);
				
				lblNewLabel_5 = new JLabel("");
				lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\book-spine-shelf-library.jpg"));
				lblNewLabel_5.setBounds(1171, -22, 359, 617);
				contentPane.add(lblNewLabel_5);
			}

		
	

			private void showMain() {
				this.setVisible(false);
				MainPage P1 = new MainPage();
				P1.setVisible(true);
				
			}
			private void showLoginPortal() {
				this.setVisible(false);
				StudentLogin S1 = new StudentLogin();
				S1.setVisible(true);
			}	
			private void createAccount() {
				
				CreateAccount C1 = new CreateAccount();
				C1.setVisible(true);
				
			}
		}