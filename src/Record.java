import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.table.DefaultTableModel;




import java.awt.Toolkit;

import java.awt.Color;


import javax.swing.JTextField;

import javax.swing.SwingConstants;
import java.awt.Font;


import javax.swing.JTextArea;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JTable;


public class Record extends JFrame {

	private static final long serialVersionUID = 5597121913719156148L;

	private JPanel contentPane;

	private JTextArea txtrContactInfo;
	private JTextArea txtrContactInfo_1;
	private JTextArea txtrContactInfo_3;
	private JTextArea txtrContactInfo_2;
	private JTextArea txtrEmailUs;
	private JTextArea txtrContactInfo_4;
	private JTextArea txtrContactInfo_5;
	private JTextArea txtrContactInfo_6;
	private JTextField main;
	
	private JButton btnBack_1;

	private JPanel panel;
	private JTable t_sdisplay;
	private JPanel panel2;
	private JTable t_deuse;
	private JPanel panel3;
	private JTable t_use;
	private JButton btnNewButton;
	private JTextField txtDeactiveAcc;
	private JTextField textField_3;
	private JTextField txtActiveAccounts;
	private JTextField textField_5;
	private JTextField txtDeactivatedAccounts;
	private JTextField textField;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField txtActiveAccount;
	private JTextField txtSerialNumber;
	private JTable s_display;
	private JPanel panel_4;
	private JPanel panel_5;
	private JTextField txtAcctiveAccount;
	private JTextField txtSerialNumber_1;
	private JTable s_use;
	private JPanel panel_6;
	private JPanel panel_7;
	private JTextField textField_7;
	private JTextField txtSerialNumber_2;
	private JTable s_deuse;
	private JTextArea txtrTouristRecords;
	private JTextArea txtrStudentRecords;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Record frame = new Record();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Record() {
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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(204, 204, 255));
		panel_6.setBounds(971, 357, 373, 208);
		contentPane.add(panel_6);
		
		panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(204, 204, 255));
		panel_7.setBounds(0, 0, 373, 43);
		panel_6.add(panel_7);
		
		textField_7 = new JTextField();
		textField_7.setText("Deactive Acc.");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(204, 204, 255));
		textField_7.setBounds(186, 0, 187, 43);
		panel_7.add(textField_7);
		
		txtSerialNumber_2 = new JTextField();
		txtSerialNumber_2.setText("Serial No.");
		txtSerialNumber_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtSerialNumber_2.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		txtSerialNumber_2.setColumns(10);
		txtSerialNumber_2.setBackground(new Color(204, 204, 255));
		txtSerialNumber_2.setBounds(0, 0, 188, 43);
		panel_7.add(txtSerialNumber_2);
		
		s_deuse = new JTable();
		s_deuse.setSurrendersFocusOnKeystroke(true);
		s_deuse.setForeground(Color.BLACK);
		s_deuse.setFont(new Font("Bookman Old Style", Font.PLAIN, 10));
		s_deuse.setFillsViewportHeight(true);
		s_deuse.setColumnSelectionAllowed(true);
		s_deuse.setCellSelectionEnabled(true);
		s_deuse.setBackground(new Color(204, 204, 255));
		s_deuse.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		s_deuse.setBounds(0, 42, 373, 166);
		s_deuse.setModel(new DefaultTableModel(
				new Object[][] {
					{"Serial No.", "Dective Account"},
				},
				new String[] {
					"New column", "New column"
				}
			));
		DB.display_students_dlt(s_deuse);
		panel_6.add(s_deuse);
		panel_4 = new JPanel();
		panel_4.setBounds(509, 357, 373, 208);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(204, 204, 255));
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(204, 204, 255));
		panel_5.setBounds(0, 0, 373, 43);
		panel_4.add(panel_5);
		
		txtAcctiveAccount = new JTextField();
		txtAcctiveAccount.setText("Active Account");
		txtAcctiveAccount.setHorizontalAlignment(SwingConstants.CENTER);
		txtAcctiveAccount.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		txtAcctiveAccount.setColumns(10);
		txtAcctiveAccount.setBackground(new Color(204, 204, 255));
		txtAcctiveAccount.setBounds(186, 0, 187, 43);
		panel_5.add(txtAcctiveAccount);
		
		txtSerialNumber_1 = new JTextField();
		txtSerialNumber_1.setText("Serial No.");
		txtSerialNumber_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSerialNumber_1.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		txtSerialNumber_1.setColumns(10);
		txtSerialNumber_1.setBackground(new Color(204, 204, 255));
		txtSerialNumber_1.setBounds(0, 0, 188, 43);
		panel_5.add(txtSerialNumber_1);
		
		s_use = new JTable();
		s_use.setSurrendersFocusOnKeystroke(true);
		s_use.setForeground(Color.BLACK);
		s_use.setFont(new Font("Bookman Old Style", Font.PLAIN, 10));
		s_use.setFillsViewportHeight(true);
		s_use.setColumnSelectionAllowed(true);
		s_use.setCellSelectionEnabled(true);
		s_use.setBackground(new Color(204, 204, 255));
		s_use.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		s_use.setBounds(0, 42, 373, 166);
		s_use.setModel(new DefaultTableModel(
				new Object[][] {
					{"Serial No.", "Active Account"},
				},
				new String[] {
					"New column", "New column"
				}
			));
		DB.display_students_use(s_use);
		panel_4.add(s_use);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(204, 204, 255));
		panel_2.setBounds(46, 357, 373, 208);
		contentPane.add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(204, 204, 255));
		panel_3.setBounds(0, 0, 373, 43);
		panel_2.add(panel_3);
		
		txtActiveAccount = new JTextField();
		txtActiveAccount.setText("Deactive Account");
		txtActiveAccount.setHorizontalAlignment(SwingConstants.CENTER);
		txtActiveAccount.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		txtActiveAccount.setColumns(10);
		txtActiveAccount.setBackground(new Color(204, 204, 255));
		txtActiveAccount.setBounds(186, 0, 187, 43);
		panel_3.add(txtActiveAccount);
		
		txtSerialNumber = new JTextField();
		txtSerialNumber.setText(" Active account");
		txtSerialNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtSerialNumber.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		txtSerialNumber.setColumns(10);
		txtSerialNumber.setBackground(new Color(204, 204, 255));
		txtSerialNumber.setBounds(0, 0, 188, 43);
		panel_3.add(txtSerialNumber);
		
		s_display = new JTable();
		s_display.setForeground(Color.BLACK);
		s_display.setFont(new Font("Bookman Old Style", Font.PLAIN, 10));
		s_display.setFillsViewportHeight(true);
		s_display.setColumnSelectionAllowed(true);
		s_display.setCellSelectionEnabled(true);
		s_display.setBackground(new Color(204, 204, 255));
		s_display.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		s_display.setBounds(0, 42, 373, 166);
		s_display.setModel(new DefaultTableModel(
				new Object[][] {
					{"Active Account", "Deactive Account"},
				},
				new String[] {
					"New column", "New column"
				}
			));
		DB.display_students_signup(s_display);
		panel_2.add(s_display);
		
		panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(46, 110, 373, 208);
		contentPane.add(panel);
		
		panel2 = new JPanel();
		panel2.setBackground(new Color(204, 204, 255));
		panel2.setBounds(509, 110, 373, 208);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		t_use = new JTable();
		
		
		
		t_use.setForeground(Color.BLACK);
		t_use.setFont(new Font("Bookman Old Style", Font.PLAIN, 10));
		t_use.setFillsViewportHeight(true);
		t_use.setColumnSelectionAllowed(true);
		t_use.setCellSelectionEnabled(true);
		t_use.setBackground(new Color(204, 204, 255));
		t_use.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t_use.setBounds(0, 44, 373, 163);
		t_use.setModel(new DefaultTableModel(
				new Object[][] {
					{"Serial No.", "Active Account"},
				},
				new String[] {
					"New column", "New column"
				}
			));
	 	DB.display_tourist_use(t_use);
		panel2.add(t_use);
		
		
		
		
		textField_3 = new JTextField();
		textField_3.setText("Serial No.");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(204, 204, 255));
		textField_3.setBounds(0, 0, 188, 43);
		panel2.add(textField_3);
		
		txtActiveAccounts = new JTextField();
		txtActiveAccounts.setText("Active Accounts");
		txtActiveAccounts.setHorizontalAlignment(SwingConstants.CENTER);
		txtActiveAccounts.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		txtActiveAccounts.setColumns(10);
		txtActiveAccounts.setBackground(new Color(204, 204, 255));
		txtActiveAccounts.setBounds(185, 0, 188, 43);
		panel2.add(txtActiveAccounts);
		
		panel3 = new JPanel();
		panel3.setBackground(new Color(204, 204, 255));
		panel3.setBounds(971, 110, 373, 208);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		t_deuse = new JTable();
		
		
		t_deuse.setBounds(0, 44, 373, 163);
		
		t_deuse.setSurrendersFocusOnKeystroke(true);
		t_deuse.setForeground(Color.BLACK);
		t_deuse.setFont(new Font("Bookman Old Style", Font.PLAIN, 10));
		t_deuse.setFillsViewportHeight(true);
		t_deuse.setColumnSelectionAllowed(true);
		t_deuse.setCellSelectionEnabled(true);
		t_deuse.setBackground(new Color(204, 204, 255));
		t_deuse.setModel(new DefaultTableModel(
				new Object[][] {
					{"Serial No.", "Dective Account"},
				},
				new String[] {
					"New column", "New column"
				}
			));
		DB.display_tourist_dlt(t_deuse);
		t_deuse.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		panel3.add(t_deuse);
		
		textField_5 = new JTextField();
		textField_5.setText("Serial No.");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(204, 204, 255));
		textField_5.setBounds(0, 0, 187, 43);
		panel3.add(textField_5);
		
		txtDeactivatedAccounts = new JTextField();
		txtDeactivatedAccounts.setText("Deactivated Accounts");
		txtDeactivatedAccounts.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeactivatedAccounts.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		txtDeactivatedAccounts.setColumns(10);
		txtDeactivatedAccounts.setBackground(new Color(204, 204, 255));
		txtDeactivatedAccounts.setBounds(186, 0, 187, 43);
		panel3.add(txtDeactivatedAccounts);
		
		
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
		
		main = new JTextField("Record History");
		main.setEditable(false);
		main.setHorizontalAlignment(SwingConstants.CENTER);
		main.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 25));
		main.setBackground(Color.BLACK);
		main.setForeground(Color.WHITE);
		main.setBounds(378, 32, 615, 42);
		contentPane.add(main);
		main.setColumns(10);
		
		
		
		btnBack_1 = new JButton("Back");
		btnBack_1.setForeground(Color.WHITE);
		btnBack_1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 28));
		btnBack_1.setBackground(Color.BLACK);
		btnBack_1.setBounds(166, 526, 152, 29);
		btnBack_1.addActionListener(e-> {showAdmin();});
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(0, 0, 373, 43);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtDeactiveAcc = new JTextField();
		txtDeactiveAcc.setText("Deactive Acc.");
		txtDeactiveAcc.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeactiveAcc.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		txtDeactiveAcc.setColumns(10);
		txtDeactiveAcc.setBackground(new Color(204, 204, 255));
		txtDeactiveAcc.setBounds(186, 0, 187, 43);
		panel_1.add(txtDeactiveAcc);
		
		textField = new JTextField();
		textField.setText("Active Acc");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
		textField.setColumns(10);
		textField.setBackground(new Color(204, 204, 255));
		textField.setBounds(0, 0, 188, 43);
		panel_1.add(textField);
		
		t_sdisplay = new JTable();
		
		
		t_sdisplay.setBounds(0, 42, 373, 166);
		
		t_sdisplay.setSurrendersFocusOnKeystroke(true);
		t_sdisplay.setForeground(Color.BLACK);
		t_sdisplay.setFont(new Font("Bookman Old Style", Font.PLAIN, 10));
		t_sdisplay.setFillsViewportHeight(true);
		t_sdisplay.setColumnSelectionAllowed(true);
		t_sdisplay.setCellSelectionEnabled(true);
		t_sdisplay.setBackground(new Color(204, 204, 255));
		t_sdisplay.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		t_sdisplay.setModel(new DefaultTableModel(
				new Object[][] {
					{"Active Account", "Deactive Account"},
				},
				new String[] {
					"New column", "New column"
				}
			));
		DB.display_tourist_signup(t_sdisplay);
		panel.add(t_sdisplay);
	 	
		
		btnNewButton = new JButton("Back");
		btnNewButton.setBounds(1067, 37, 183, 33);
		contentPane.add(btnNewButton);
		btnNewButton.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		
		txtrTouristRecords = new JTextArea();
		txtrTouristRecords.setFont(new Font("Bookman Old Style", Font.ITALIC, 18));
		txtrTouristRecords.setBackground(new Color(204, 204, 255));
		txtrTouristRecords.setForeground(new Color(0, 0, 0));
		txtrTouristRecords.setText("Tourist Records");
		txtrTouristRecords.setBounds(46, 82, 157, 22);
		contentPane.add(txtrTouristRecords);
		
		txtrStudentRecords = new JTextArea();
		txtrStudentRecords.setText("Student Records");
		txtrStudentRecords.setForeground(Color.BLACK);
		txtrStudentRecords.setFont(new Font("Bookman Old Style", Font.ITALIC, 18));
		txtrStudentRecords.setBackground(new Color(204, 204, 255));
		txtrStudentRecords.setBounds(46, 329, 157, 22);
		contentPane.add(txtrStudentRecords);
		btnNewButton.addActionListener(e-> {showAdmin();});
		
	}
	
	
	
	

				
		
	
	private void showAdmin() {
		this.setVisible(false);
		AdminOption A1 = new AdminOption();
		A1.setVisible(true);
		
	}
}