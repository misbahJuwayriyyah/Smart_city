
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Toolkit;

import java.awt.Color;

import java.awt.Font;


import javax.swing.JTextArea;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AdminOption extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int SCALE_DEFAULT = 0;

	private JPanel contentPane;

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

	private JButton btnNewButton;
	private JButton btnUpdateTables;
	private JButton btnViewRecords;
	private JButton btnBack_1;

	private JButton btnBack_2;
	private JButton btnBack_3;
	private JButton btnBack_4;
	private JButton cmap;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminOption frame = new AdminOption();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminOption() {
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
		
		btnBack_1 = new JButton("Logout");
		btnBack_1.setForeground(Color.WHITE);
		btnBack_1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 28));
		btnBack_1.setBackground(Color.BLACK);
		btnBack_1.setBounds(70, 462, 211, 41);
		btnBack_1.addActionListener(e-> {showAdmin();});
		contentPane.add(btnBack_1);
		
		cmap = new JButton("view CityMap");
		cmap.setForeground(Color.WHITE);
		cmap.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 28));
		cmap.setBackground(Color.BLACK);
		cmap.setBounds(70, 271, 212, 43);
		cmap.addActionListener(e-> {citymap();});
		contentPane.add(cmap);
		
		
		btnBack_4 = new JButton("Delete Account");
		btnBack_4.setForeground(Color.WHITE);
		btnBack_4.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 22));
		btnBack_4.setBackground(Color.BLACK);
		btnBack_4.setBounds(70, 410, 211, 41);
		btnBack_4.addActionListener(e->{deleteAcc();});
		contentPane.add(btnBack_4);
		

		btnBack_2 = new JButton("Change Password");
		btnBack_2.setForeground(Color.WHITE);
		btnBack_2.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 22));
		btnBack_2.setBackground(Color.BLACK);
		btnBack_2.setBounds(70, 358, 211, 41);
		btnBack_2.addActionListener(e-> {changepass();});
		contentPane.add(btnBack_2);
		
		
		btnViewRecords = new JButton("View Records");
		btnViewRecords.setForeground(Color.WHITE);
		btnViewRecords.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 28));
		btnViewRecords.setBackground(Color.BLACK);
		btnViewRecords.setBounds(70, 217, 212, 43);
		btnViewRecords.addActionListener(e-> {viewRecord();});
		contentPane.add(btnViewRecords);
		
		btnUpdateTables = new JButton("Update Tables");
		btnUpdateTables.setForeground(Color.WHITE);
		btnUpdateTables.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 27));
		btnUpdateTables.setBackground(Color.BLACK);
		btnUpdateTables.setBounds(70, 165, 212, 41);
		btnUpdateTables.addActionListener(e-> {showUpdate();});
		contentPane.add(btnUpdateTables);
		
		btnNewButton = new JButton("View Tables");
		btnNewButton.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(70, 111, 212, 43);
		btnNewButton.addActionListener(e-> {viewTables();});
		contentPane.add(btnNewButton);
		
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
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon( new ImageIcon( new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\nature-water-mountains-trees-wallpaper-preview.jpg").getImage().getScaledInstance(350, 584, SCALE_DEFAULT)));
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
	
	private void deleteAcc() {
		DelAcc3 D1 = new DelAcc3();
		D1.setVisible(true);
		
	}
	
	private void citymap() {
		CityMap C1 = new CityMap();
		 C1.setVisible(true);
	}
	

	private void changepass() {
		
		changepass3 c1 = new changepass3();
		c1.setVisible(true);
	}

	private void viewTables() {
		this.setVisible(false);
		Tables A4 = new Tables();
		A4.setVisible(true);
		
	}

	private void viewRecord() {
		this.setVisible(false);
		Record A3 = new Record();
		A3.setVisible(true);
		
	}

	private void showUpdate() {
		this.setVisible(false);
		adminstuff A2 = new adminstuff();
		A2.setVisible(true);
		
	}

	private void showAdmin() {
		this.setVisible(false);
		Admin A1 = new Admin();
		A1.setVisible(true);
		
	}

	
	
}
