
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

import javax.swing.JTextArea;


public class tourist2 extends JFrame implements ActionListener {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int SCALE_DEFAULT = 0;
	private JPanel contentPane;
	private JButton hotelbtn, famousspotbtn, atmsbtn, cinemabtn, shoppingbtn, restaurantsbtn, publictbtn, hospitalsbtn, citymapbtn, changepassbtn, logoutbtn, policestationsbtn; 

	private JTextArea txtrContactInfo;
	private JTextArea txtrContactInfo_1;
	private JTextArea txtrContactInfo_2;
	private JTextArea txtrContactInfo_3;
	private JTextArea txtrEmailUs;
	private JTextArea txtrContactInfo_4;
	private JTextArea txtrContactInfo_5;
	private JTextArea txtrContactInfo_6;
	private JLabel lblNewLabel_3;
	private JButton btnChangeNumber;
	private JButton btnDeleteAccount;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tourist2 frame = new tourist2();
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
	public tourist2() {
		setType(Type.POPUP);
		setTitle("Tourist Module");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\WhatsApp Image 2022-07-05 at 9.44.32 PM.jpeg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(1, 1, 1370, 730);
		contentPane = new JPanel();	
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		btnDeleteAccount = new JButton("Delete Account");
		btnDeleteAccount.setForeground(Color.WHITE);
		btnDeleteAccount.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnDeleteAccount.setBackground(Color.BLACK);
		btnDeleteAccount.setBounds(30, 560, 152, 33);
		btnDeleteAccount.addActionListener(e-> {deleteAcc();});
		contentPane.add(btnDeleteAccount);
		
		btnChangeNumber = new JButton("Change Number");
		btnChangeNumber.setForeground(Color.WHITE);
		btnChangeNumber.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnChangeNumber.setBackground(Color.BLACK);
		btnChangeNumber.setBounds(204, 560, 152, 33);
		btnChangeNumber.addActionListener(e-> {changenumber();});
		contentPane.add(btnChangeNumber);
		
		JLabel lblNewLabel = new JLabel("Sidebar Menu:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 26));
		lblNewLabel.setBounds(93, 29, 199, 41);
		contentPane.add(lblNewLabel);
		
		hotelbtn = new JButton("view Hotels");
		hotelbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		hotelbtn.setBackground(Color.BLACK);
		hotelbtn.setForeground(Color.WHITE);
		hotelbtn.setBounds(93, 83, 187, 33);
		contentPane.add(hotelbtn);
		
		famousspotbtn = new JButton("view Famous Spots");
		famousspotbtn.setForeground(Color.WHITE);
		famousspotbtn.setBackground(Color.BLACK);
		famousspotbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		famousspotbtn.setBounds(93, 127, 187, 33);
		contentPane.add(famousspotbtn);
		
		atmsbtn = new JButton("view ATMs");
		atmsbtn.setForeground(Color.WHITE);
		atmsbtn.setBackground(Color.BLACK);
		atmsbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		atmsbtn.setBounds(93, 171, 187, 33);
		contentPane.add(atmsbtn);
		
		cinemabtn = new JButton("view Cinema Halls\r\n");
		cinemabtn.setBackground(Color.BLACK);
		cinemabtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		cinemabtn.setForeground(Color.WHITE);
		cinemabtn.setBounds(93, 215, 187, 33);
		contentPane.add(cinemabtn);
		
		shoppingbtn = new JButton("view Shopping Malls");
		shoppingbtn.setForeground(Color.WHITE);
		shoppingbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		shoppingbtn.setBackground(Color.BLACK);
		shoppingbtn.setBounds(93, 259, 187, 33);
		contentPane.add(shoppingbtn);
		
	    restaurantsbtn = new JButton("view Restaurants");
		restaurantsbtn.setForeground(Color.WHITE);
		restaurantsbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		restaurantsbtn.setBackground(Color.BLACK);
		restaurantsbtn.setBounds(93, 302, 187, 33);
		contentPane.add(restaurantsbtn);
		
		publictbtn = new JButton("view Public Transport");
		publictbtn.setForeground(Color.WHITE);
		publictbtn.setBackground(Color.BLACK);
		publictbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		publictbtn.setBounds(93, 346, 187, 33);
		contentPane.add(publictbtn);
		
		hospitalsbtn = new JButton("view Hospitals");
		hospitalsbtn.setForeground(Color.WHITE);
		hospitalsbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		hospitalsbtn.setBackground(Color.BLACK);
		hospitalsbtn.setBounds(93, 390, 187, 33);
		contentPane.add(hospitalsbtn);
		
		policestationsbtn = new JButton("view Police Stations");
		policestationsbtn.setForeground(Color.WHITE);
		policestationsbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		policestationsbtn.setBackground(Color.BLACK);
		policestationsbtn.setBounds(93, 434, 187, 33);
		contentPane.add(policestationsbtn);
		
		citymapbtn = new JButton("view City Map");
		citymapbtn.setForeground(Color.WHITE);
		citymapbtn.setBackground(Color.BLACK);
		citymapbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		citymapbtn.setBounds(93, 477, 187, 33);
		contentPane.add(citymapbtn);
		
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
		
		JLabel lblNewLabel_13 = new JLabel("Welcome to Islamabad");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_13.setFont(new Font("Book Antiqua", Font.BOLD, 30));
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(627, 11, 363, 41);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("City History:");
		lblNewLabel_14.setBackground(Color.BLACK);
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setFont(new Font("Book Antiqua", Font.BOLD, 24));
		lblNewLabel_14.setBounds(741, 50, 175, 41);
		contentPane.add(lblNewLabel_14);
		
		JTextArea txtrWhereIs = new JTextArea();
		txtrWhereIs.setWrapStyleWord(true);
		txtrWhereIs.setLineWrap(true);
		txtrWhereIs.setEditable(false);
		txtrWhereIs.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		txtrWhereIs.setForeground(Color.WHITE);
		txtrWhereIs.setBackground(Color.BLACK);
		txtrWhereIs.setText("1. Where is Islamabad?\r\n\r\nIslamabad is the capital city of Pakistan.\r\n\r\n2. It rolls off the tongue!\r\n\r\nWondering how to say the name of this wonderful city? It’s pronounced Is-la-muh-bad.\r\n\r\n3. It’s a massive city!\r\n\r\nThe total land area of Islamabad is 350 square miles (906 square kilometers) – that’s nearly twice the size of Leeds.\r\n\r\n4. Plenty of people live here, too.\r\n\r\nIslamabad’s population was 1.015 million in 2017 – that’s slightly less than double the population of Leeds, and \r\ngives it a population density of around 3,900 residents per square mile.\r\n\r\n5. It’s quite a way above the water.\r\n\r\nIslamabad is located 1,770 ft above sea level.\r\n\r\n6. It’s beautiful to look at!\r\n\r\nFounded in 1960, Islamabad is a very green and luscious city, surrounded by beautiful mountains.\r\n\r\n7.Go up on high!\r\n\r\nMake sure you visit Pir Sohawa if you’re in Islamabad; it’s the city’s highest tourist spot, delivering breathtaking\r\n views across the city. There’s also an eatery providing delicious lunches and even wild monkeys who are free \r\nto roam around!\r\n\r\n8.People speak many languages here!\r\n\r\nThe official language of Islamabad is Urdu, although English, Punjabi and Pashto are also spoken here.");
		txtrWhereIs.setBounds(412, 102, 847, 491);
		contentPane.add(txtrWhereIs);
		
		changepassbtn = new JButton("Change Password");
		changepassbtn.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		changepassbtn.setForeground(new Color(255, 255, 255));
		changepassbtn.setBackground(new Color(0, 0, 0));
		changepassbtn.setBounds(204, 522, 152, 34);
		contentPane.add(changepassbtn);
		
		logoutbtn = new JButton("Log Out\r\n");
		logoutbtn.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		logoutbtn.setForeground(new Color(255, 255, 255));
		logoutbtn.setBackground(new Color(0, 0, 0));
		logoutbtn.setBounds(30, 521, 152, 33);
		contentPane.add(logoutbtn);
		
		
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon( new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\religious-wallpaper-preview.jpg").getImage().getScaledInstance(387, 593,SCALE_DEFAULT)));
		lblNewLabel_3.setBounds(0, 0, 387, 593);
		contentPane.add(lblNewLabel_3);
		
		
		
		policestationsbtn.addActionListener(this);
		hotelbtn.addActionListener(this);
		famousspotbtn.addActionListener(this);
		atmsbtn.addActionListener(this);
		cinemabtn.addActionListener(this);
		shoppingbtn.addActionListener(this);
		restaurantsbtn.addActionListener(this);
		publictbtn.addActionListener(this);
		hospitalsbtn.addActionListener(this);
		citymapbtn.addActionListener(this);
		changepassbtn.addActionListener(this);
		logoutbtn.addActionListener(this);
	}
	
	
	private void deleteAcc() {
		DeleteAcc2 D1 = new DeleteAcc2();
		D1.setVisible(true);
		
	}

	private void changenumber() {
		
		changenum2 c2 = new changenum2();
		c2.setVisible(true);
		
	}

		
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource() == hotelbtn ) {
				 this.setVisible(false);
					DisplayInfo2 D1 = new DisplayInfo2();
					D1.setMain("Hotel");
					D1.setVisible(true);
				 
			 }
			 else if (e.getSource() == famousspotbtn) {
				 this.setVisible(false);
					DisplayInfo2 D1 = new DisplayInfo2();
					D1.setMain("Spots");
					D1.setVisible(true);
			 }
			 else if (e.getSource() == atmsbtn) {
						this.setVisible(false);
						DisplayInfo2 D1 = new DisplayInfo2();
						D1.setMain("ATM");
						D1.setVisible(true);	 
			 }
			 else if (e.getSource() == cinemabtn) {
				 this.setVisible(false);
					DisplayInfo2 D1 = new DisplayInfo2();
					D1.setMain("Cinema");
					D1.setVisible(true);
			 }
			 else if (e.getSource() == shoppingbtn) {
				 this.setVisible(false);
					DisplayInfo2 D1 = new DisplayInfo2();
					D1.setMain("Shopping");
					D1.setVisible(true);
				 
			 }
			 else if (e.getSource() == restaurantsbtn) {
				 this.setVisible(false);
					DisplayInfo2 D1 = new DisplayInfo2();
					D1.setMain("Resturant");
					D1.setVisible(true);
			 }
			 else if (e.getSource() == publictbtn) {
				 this.setVisible(false);
					DisplayInfo2 D1 = new DisplayInfo2();
					D1.setMain("Transport");
					D1.setVisible(true);
			 }
			 else if (e.getSource() == hospitalsbtn) {
				 this.setVisible(false);
					DisplayInfo2 D1 = new DisplayInfo2();
					D1.setMain("Hospitals");
					D1.setVisible(true);
				 
			 }
			 else if (e.getSource() == policestationsbtn) {
				 this.setVisible(false);
					DisplayInfo2 D1 = new DisplayInfo2();
					D1.setMain("Police Stations");
					D1.setVisible(true);
			 }
			 else if (e.getSource() == citymapbtn) {
				 CityMap C1 = new CityMap();
				 C1.setVisible(true);
				
			 }
			 else if (e.getSource() == changepassbtn) {
				 changepassword2 cp1 = new changepassword2();
				 cp1.setVisible(true);
				 
			 }
			 else if (e.getSource() == logoutbtn ) {
				 this.setVisible(false);
				 Tourist t1 = new Tourist();
				 t1.setVisible(true);
			 }
		 }
	}