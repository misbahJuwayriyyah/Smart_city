
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;



import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JTextArea;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class StudentLogin extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtrContactInfo;
	private JTextArea txtrContactInfo_1;
	private JTextArea txtrContactInfo_2;
	private JTextArea txtrContactInfo_3;
	private JTextArea txtrEmailUs;
	private JTextArea txtrContactInfo_4;
	private JTextArea txtrContactInfo_5;
	private JTextArea txtrContactInfo_6;
	
	private JButton btnNewButton;
	private JButton btnViewSchoolsAnd;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_1;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;

	private JButton logoutbtn;
	private JButton changepassbtn;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;

	private JButton btnChangeNumber;
	private JButton btnDeleteAccount;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLogin frame = new StudentLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentLogin() {
		setTitle("Student Portal Access");
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
		
		btnChangeNumber = new JButton("Change Number ");
		btnChangeNumber.setForeground(Color.WHITE);
		btnChangeNumber.setBackground(Color.BLACK);
		btnChangeNumber.setBounds(89, 263, 140, 26);
		btnChangeNumber.addActionListener(e-> {changenumber();});
		
		JButton cmap = new JButton("view CityMap");
		cmap.setForeground(Color.WHITE);
		cmap.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		cmap.setBackground(Color.BLACK);
		cmap.setBounds(36, 73, 218, 54);
		cmap.addActionListener(e-> {citymap();});
		contentPane.add(cmap);
		contentPane.add(btnChangeNumber);
		
		btnDeleteAccount = new JButton("Delete Account");
		btnDeleteAccount.setForeground(Color.WHITE);
		btnDeleteAccount.setBackground(Color.BLACK);
		btnDeleteAccount.setBounds(89, 300, 140, 26);
		btnDeleteAccount.addActionListener(e->{deleteAcc();});
		contentPane.add(btnDeleteAccount);
		
		
		
		
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
		
		
		
		JButton btnNewButton_2_1 = new JButton("view Airport");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnNewButton_2_1.setBackground(Color.BLACK);
		btnNewButton_2_1.setBounds(36, 456, 218, 54);
		btnNewButton_2_1.addActionListener(e -> {showWindow("Airport"); });
		contentPane.add(btnNewButton_2_1);
		
		btnNewButton = new JButton("view Universities");
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(378, 73, 218, 54);
		btnNewButton.addActionListener(e -> {showWindow("Universities"); });
		contentPane.add(btnNewButton);
		
		btnViewSchoolsAnd = new JButton("view Schools ");
		btnViewSchoolsAnd.setForeground(new Color(255, 255, 255));
		btnViewSchoolsAnd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnViewSchoolsAnd.setBackground(new Color(0, 0, 0));
		btnViewSchoolsAnd.setBounds(378, 269, 218, 54);
		btnViewSchoolsAnd.addActionListener(e -> {showWindow("School");});
		contentPane.add(btnViewSchoolsAnd);
		
		btnNewButton_2 = new JButton("view Police Stations");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(378, 456, 218, 54);
		btnNewButton_2.addActionListener(e -> {showWindow("Police Stations");});
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("view Transport");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setBounds(742, 73, 207, 54);
		btnNewButton_3.addActionListener(e -> {showWindow("Transport");});
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("view Hostels");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnNewButton_4.setBackground(new Color(0, 0, 0));
		btnNewButton_4.setBounds(742, 269, 207, 54);
		btnNewButton_4.addActionListener(e -> {showWindow("Hostels");});
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("view Resturants");
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnNewButton_5.setBackground(new Color(0, 0, 0));
		btnNewButton_5.setBounds(742, 456, 207, 54);
		btnNewButton_5.addActionListener(e -> {showWindow("Restaurant");});
		contentPane.add(btnNewButton_5);
		
		btnNewButton_1 = new JButton("view Hospitals");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(1094, 73, 199, 54);
		btnNewButton_1.addActionListener(e -> {showWindow("Hospitals");});
		contentPane.add(btnNewButton_1);
		
		btnNewButton_6 = new JButton("view Libraries");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnNewButton_6.setBackground(new Color(0, 0, 0));
		btnNewButton_6.setBounds(1094, 269, 199, 54);
		btnNewButton_6.addActionListener(e -> {showWindow("Library");});
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("view ATM");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnNewButton_7.setBackground(new Color(0, 0, 0));
		btnNewButton_7.setBounds(1094, 457, 199, 53);
		btnNewButton_7.addActionListener(e -> {showWindow("ATM");});
		contentPane.add(btnNewButton_7);
		
		changepassbtn = new JButton("Change Password");
		changepassbtn.setForeground(new Color(255, 255, 255));
		changepassbtn.setBackground(new Color(0, 0, 0));
		changepassbtn.setBounds(89, 229, 140, 26);
		changepassbtn.addActionListener(e-> {changepass();});
		contentPane.add(changepassbtn);
		
		logoutbtn = new JButton("Log Out\r\n");
		logoutbtn.setForeground(new Color(255, 255, 255));
		logoutbtn.setBackground(new Color(0, 0, 0));
		logoutbtn.setBounds(89, 336, 140, 26);
		logoutbtn.addActionListener(e-> {showLoginPortal();});
		contentPane.add(logoutbtn);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\book-spine-shelf-library.jpg"));
		lblNewLabel.setBounds(5, 205, 296, 178);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\library-interior-interior-design-books-wallpaper-preview.jpg"));
		lblNewLabel_1.setBounds(1032, 205, 328, 178);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\school-books-young-adult-education.jpg"));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(311, 205, 343, 178);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\misc-fbi-police-hd-wallpaper-preview.jpg"));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(311, 394, 343, 178);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\night-artwork-futuristic-city-cyberpunk-wallpaper-preview.jpg"));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(675, 11, 332, 178);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\colombia-medellin-manila-best-hostel-in-medellin.jpg"));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(675, 205, 332, 178);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\birmingham-united-kingdom-resturant-brewery.jpg"));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(675, 396, 332, 178);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\america-the-dollar-president-finance.jpg"));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(1032, 396, 322, 178);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\book-read-student-students.jpg"));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(311, 11, 343, 178);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\hospital-a-e-emergency-hospital-beds.jpg"));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(1032, 11, 322, 178);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\lufthansa-airbus-a320-airplane-airbus-wallpaper-preview.jpg"));
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setBounds(5, 394, 296, 178);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("New label");
		lblNewLabel_6_1_1.setIcon(new ImageIcon("C:\\Users\\HP\\OneDrive\\Desktop\\Project Images\\time-lapse-photograph-of-grass-beside-body-of-water-snowdonia-snowdonia-wallpaper-preview.jpg"));
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1.setBounds(5, 11, 296, 178);
		contentPane.add(lblNewLabel_6_1_1);
		
		
		
		
	}
	private void citymap() {
		CityMap C1 = new CityMap();
		 C1.setVisible(true);
	}

	private void deleteAcc() {
		DeleteAcc D1 = new DeleteAcc();
		D1.setVisible(true);
		
	}

	private void changenumber() {
		changenum c2 = new changenum();
		c2.setVisible(true);
		
		
	}

	private void changepass() {
		changepassword cp1 = new changepassword();
		 cp1.setVisible(true);	
	}

	private void showLoginPortal() {
		this.setVisible(false);
		StudentG S1 = new StudentG();
		S1.setVisible(true);
	}	
	private void showWindow(String information) {
		this.setVisible(false);
		DisplayInfo D1 = new DisplayInfo();
		D1.setMain(information);
		D1.setVisible(true);
		
		
		
	}	
}