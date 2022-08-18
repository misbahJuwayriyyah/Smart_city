import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JTextField;
import javax.swing.JTabbedPane;

import javax.swing.SwingConstants;

public class adminstuff extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private JTextField hoscontact;
	private JTextField hoslocation;
	private JTextField hossector;
	private JTextField hospitalname;

	private JTextField hotelname;
	private JTextField hotelrating;
	private JTextArea txtrContactInfo;
	private JTextArea txtrContactInfo_1;
	private JTextArea txtrContactInfo_2;
	private JTextArea txtrContactInfo_3;
	private JTextArea txtrEmailUs;
	private JTextArea txtrContactInfo_4;
	private JTextArea txtrContactInfo_5;
	private JTextArea txtrContactInfo_6;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminstuff frame = new adminstuff();
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
	public adminstuff() {
		setTitle("Admin Module\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\download (6).jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(1, 1, 1370, 730);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		JLabel adminlbl = new JLabel("Admin Mode:");
		adminlbl.setBounds(570, 13, 193, 37);
		adminlbl.setFont(new Font("Bookman Old Style", Font.ITALIC, 30));
		adminlbl.setForeground(new Color(255, 255, 255));
		adminlbl.setBackground(Color.BLACK);
		contentPane.add(adminlbl);
		
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
		
		
		
		JLabel imagelbl = new JLabel("Image Gallery\r\n");
		imagelbl.setBounds(948, 643, 187, 25);
		imagelbl.setForeground(Color.WHITE);
		imagelbl.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(imagelbl);
		
		JLabel imagefaisal = new JLabel("");
		imagefaisal.setBounds(1007, 688, 164, 105);
		imagefaisal.setIcon(new ImageIcon("C:\\Users\\ghio_\\Desktop\\oop project\\pics\\monumentp.jpg"));
		contentPane.add(imagefaisal);
		
		JLabel image2 = new JLabel("");
		image2.setBounds(1212, 643, 175, 143);
		image2.setIcon(new ImageIcon("C:\\Users\\ghio_\\Desktop\\oop project\\pics\\road1.jfif"));
		contentPane.add(image2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		tabbedPane.setForeground(Color.WHITE);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(Color.BLACK);
		tabbedPane.setBounds(0, 61, 1366, 533);
		contentPane.add(tabbedPane);
		
		JPanel hospital = new JPanel();
		hospital.setForeground(Color.WHITE);
		hospital.setBorder(null);
		hospital.setBackground(Color.BLACK);
		tabbedPane.addTab("Hospital", null, hospital, null);
		hospital.setLayout(null);
		
		JLabel lblNewLabel_h = new JLabel("Add/Remove Hospital");
		lblNewLabel_h.setBounds(527, 49, 262, 29);
		lblNewLabel_h.setForeground(Color.WHITE);
		lblNewLabel_h.setBackground(Color.BLACK);
		lblNewLabel_h.setFont(new Font("Tahoma", Font.BOLD, 24));
		hospital.add(lblNewLabel_h);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(300, 114, 642, 374);
		hospital.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Name :");
		lblNewLabel_3.setBounds(101, 67, 64, 25);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3.setForeground(Color.WHITE);
		
		hospitalname = new JTextField();
		hospitalname.setBounds(237, 73, 209, 20);
		panel.add(hospitalname);
		hospitalname.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Sector :");
		lblNewLabel_3_1.setBounds(101, 118, 139, 31);
		panel.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 19));
		
		JLabel lblNewLabel_3_2 = new JLabel("Location :");
		lblNewLabel_3_2.setBounds(101, 171, 139, 31);
		panel.add(lblNewLabel_3_2);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Dialog", Font.BOLD, 19));
		
		JLabel lblNewLabel_3_3 = new JLabel("Contact # :");
		lblNewLabel_3_3.setBounds(101, 222, 139, 31);
		panel.add(lblNewLabel_3_3);
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Dialog", Font.BOLD, 19));
		
		hossector = new JTextField();
		hossector.setBounds(237, 127, 209, 20);
		panel.add(hossector);
		hossector.setColumns(10);
		
		hoslocation = new JTextField();
		hoslocation.setBounds(237, 180, 213, 20);
		panel.add(hoslocation);
		hoslocation.setColumns(10);
		
		hoscontact = new JTextField();
		hoscontact.setBounds(237, 231, 213, 20);
		
		panel.add(hoscontact);
		hoscontact.setColumns(10);
		
		JButton deletehos = new JButton("Delete");
		deletehos.setBounds(462, 308, 99, 26);
		deletehos.addActionListener(e ->{	
			String name = hospitalname.getText();
			String loc = hoslocation.getText();
			String sector = hossector.getText();
			String contact = hoscontact.getText();
			
			
			if(name.equals("") || loc.equals("") || sector.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(deletehos,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(deletehos,"Invalid Contact Number");   
			}else {
				SmartCity hos=new Hospitals(name,sector,loc,contact);
				ResultSet valid=DB.check_hospitals(hos);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check==false) {
					JOptionPane.showMessageDialog(deletehos,"This Hospital Does Not Exist");    
				}else {
					boolean ans=DB.dltHospital(name, loc);
					if(ans) {
						JOptionPane.showMessageDialog(deletehos,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deletehos,"Something Went Wrong");    
					}
				}
				
			}
		});
		
		panel.add(deletehos);
		deletehos.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JButton addhos = new JButton("Add");
		addhos.setBounds(101, 308, 99, 26);
		addhos.addActionListener(e-> {
			String name = hospitalname.getText();
			String loc = hoslocation.getText();
			String sector = hossector.getText();
			String contact = hoscontact.getText();
			
			if(name.equals("") || loc.equals("") || sector.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(addhos,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(addhos,"Invalid Contact Number");   
			}else {
				Hospitals hos=new Hospitals(name,sector,loc,contact);
				ResultSet valid=DB.check_hospitals(hos);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check) {
					JOptionPane.showMessageDialog(addhos,"This Hospital Already Exists");    
				}else {
					boolean ans=DB.addHospitals(hos);
					if(ans) {
						JOptionPane.showMessageDialog(addhos,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addhos,"Something Went Wrong");    
					}
				}
				
			}

		});
		panel.add(addhos);
		addhos.setFont(new Font("Dialog", Font.BOLD, 14));
		
		
		
		
		
		JPanel famousspots = new JPanel();
		famousspots.setForeground(Color.WHITE);
		famousspots.setBackground(Color.BLACK);
		famousspots.setBorder(null);
		tabbedPane.addTab("Famous Spots", null, famousspots, null);
		famousspots.setLayout(null);
		
		JLabel lblfs = new JLabel("Add/Remove Famous Spots");
		lblfs.setHorizontalAlignment(SwingConstants.CENTER);
		lblfs.setForeground(Color.WHITE);
		lblfs.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblfs.setBackground(Color.BLACK);
		lblfs.setBounds(527, 49, 331, 29);
		famousspots.add(lblfs);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(300, 114, 642, 374);
		famousspots.add(panel_1);
		
		JLabel lblNewLabel_3_8 = new JLabel("Name :");
		lblNewLabel_3_8.setForeground(Color.WHITE);
		lblNewLabel_3_8.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_8.setBounds(101, 67, 64, 25);
		panel_1.add(lblNewLabel_3_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(237, 73, 209, 20);
		panel_1.add(textField);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Location");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_1.setBounds(101, 118, 139, 31);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("Timing");
		lblNewLabel_3_2_4.setForeground(Color.WHITE);
		lblNewLabel_3_2_4.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_4.setBounds(101, 171, 139, 31);
		panel_1.add(lblNewLabel_3_2_4);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Entry Price");
		lblNewLabel_3_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_3_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_3_2.setBounds(101, 222, 139, 31);
		panel_1.add(lblNewLabel_3_3_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(237, 127, 209, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(237, 180, 213, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(237, 231, 213, 20);
		panel_1.add(textField_3);
		
		JButton deletfs = new JButton("Delete");
		deletfs.setFont(new Font("Dialog", Font.BOLD, 14));
		deletfs.setBounds(462, 308, 99, 26);
		deletfs.addActionListener(e->{
			String name = textField.getText();
			String loc = textField_1.getText();
			String price = textField_2.getText();
			String timing = textField_3.getText();
			
			if(name.equals("") || loc.equals("") || timing.equals("") || price.equals("")) {
				JOptionPane.showMessageDialog(deletfs,"No Box Can Be Left Empty");   
			}else {
				FamousSpots fs=new FamousSpots(name,loc,timing,price);
				ResultSet valid=DB.check_spots(fs);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check==false) {
					JOptionPane.showMessageDialog(deletfs,"This Famous Spot Does Not Exist");    
				}else {
					boolean ans=DB.dltSpot(name);
					if(ans) {
						JOptionPane.showMessageDialog(deletfs,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deletfs,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		
		panel_1.add(deletfs);
		
		JButton addfs = new JButton("Add");
		addfs.setFont(new Font("Dialog", Font.BOLD, 14));
		addfs.setBounds(101, 308, 99, 26);
		addfs.addActionListener(e->{
			String name = textField.getText();
			String loc = textField_1.getText();
			String price = textField_2.getText();
			String timing = textField_3.getText();
			
			if(name.equals("") || loc.equals("") || timing.equals("") || price.equals("")) {
				JOptionPane.showMessageDialog(addfs,"No Box Can Be Left Empty");   
			}else {
				FamousSpots fs=new FamousSpots(name,loc,timing,price);
				ResultSet valid=DB.check_spots(fs);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check) {
					JOptionPane.showMessageDialog(addfs,"This Famous Spot Already Exists");    
				}else {
					boolean ans=DB.addSpot(fs);
					if(ans) {
						JOptionPane.showMessageDialog(addfs,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addfs,"Something Went Wrong");    
					}
				}
				
			}

			
		});
		panel_1.add(addfs);
		
		JPanel cinema = new JPanel();
		cinema.setBorder(null);
		cinema.setBackground(Color.BLACK);
		tabbedPane.addTab("Cinema Halls", null, cinema, null);
		cinema.setLayout(null);
		
		JLabel lblNewLabel_2_c = new JLabel("Add/Remove Cinema Halls");
		lblNewLabel_2_c.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_c.setForeground(Color.WHITE);
		lblNewLabel_2_c.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_c.setBackground(Color.BLACK);
		lblNewLabel_2_c.setBounds(527, 49, 318, 29);
		cinema.add(lblNewLabel_2_c);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(300, 114, 642, 374);
		cinema.add(panel_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("Name :");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_4.setBounds(101, 67, 64, 25);
		panel_2.add(lblNewLabel_3_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(237, 73, 209, 20);
		panel_2.add(textField_5);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Location");
		lblNewLabel_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_2.setBounds(101, 118, 139, 31);
		panel_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Ticket Price");
		lblNewLabel_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_1.setBounds(101, 171, 139, 31);
		panel_2.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("Contact # :");
		lblNewLabel_3_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3_3.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_3_3.setBounds(101, 222, 139, 31);
		panel_2.add(lblNewLabel_3_3_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(237, 127, 209, 20);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(237, 180, 213, 20);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(237, 231, 213, 20);
		panel_2.add(textField_8);
		
		JButton deletecinema = new JButton("Delete");
		deletecinema.setFont(new Font("Dialog", Font.BOLD, 14));
		deletecinema.setBounds(462, 308, 99, 26);
		deletecinema.addActionListener(e->{
			String name = textField_5.getText();
			String loc = textField_6.getText();
			String price = textField_7.getText();
			String contact = textField_8.getText();
			
			if(name.equals("") || loc.equals("") || price.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(deletecinema,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(deletecinema,"Invalid Contact Number");   
			}else {
				Cinemas cine=new Cinemas(name,loc,price,contact);
				ResultSet valid=DB.check_cinema(cine);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check==false) {
					JOptionPane.showMessageDialog(deletecinema,"This Cinema Does Not Exist");    
				}else {
					boolean ans=DB.dltCinema(name, loc);
					if(ans) {
						JOptionPane.showMessageDialog(deletecinema,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deletecinema,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		panel_2.add(deletecinema);
		
		JButton addcinema = new JButton("Add");
		addcinema.setFont(new Font("Dialog", Font.BOLD, 14));
		addcinema.setBounds(101, 308, 99, 26);
		addcinema.addActionListener(e->{
			String name = textField_5.getText();
			String loc = textField_6.getText();
			String price = textField_7.getText();
			String contact = textField_8.getText();
			
			if(name.equals("") || loc.equals("") || price.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(addcinema,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(addcinema,"Invalid Contact Number");   
			}else {
				Cinemas cine=new Cinemas(name,loc,price,contact);
				ResultSet valid=DB.check_cinema(cine);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check) {
					JOptionPane.showMessageDialog(addcinema,"This Cinema Already Exists");    
				}else {
					boolean ans=DB.addCinemas(cine);
					if(ans) {
						JOptionPane.showMessageDialog(addcinema,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addcinema,"Something Went Wrong");    
					}
				}
				
			}
			
			
		});
		panel_2.add(addcinema);
		
		JPanel shopping = new JPanel();
		shopping.setBorder(null);
		shopping.setBackground(Color.BLACK);
		tabbedPane.addTab("Shopping Malls", null, shopping, null);
		shopping.setLayout(null);
		
		JLabel lblNewLabel_21 = new JLabel("Add/Remove Shopping Malls");
		lblNewLabel_21.setForeground(Color.WHITE);
		lblNewLabel_21.setBackground(Color.BLACK);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_21.setBounds(527, 49, 479, 29);
		shopping.add(lblNewLabel_21);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(300, 114, 642, 374);
		shopping.add(panel_3);
		
		JLabel lblNewLabel_3_9 = new JLabel("Name :");
		lblNewLabel_3_9.setForeground(Color.WHITE);
		lblNewLabel_3_9.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_9.setBounds(101, 67, 64, 25);
		panel_3.add(lblNewLabel_3_9);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(237, 73, 209, 20);
		panel_3.add(textField_9);
		
		JLabel lblNewLabel_3_1_3 = new JLabel(" Timing :");
		lblNewLabel_3_1_3.setForeground(Color.WHITE);
		lblNewLabel_3_1_3.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_3.setBounds(101, 118, 139, 31);
		panel_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Location :");
		lblNewLabel_3_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_2_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_2.setBounds(101, 171, 139, 31);
		panel_3.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_3_4 = new JLabel("Contact # :");
		lblNewLabel_3_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_3_4.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_3_4.setBounds(101, 222, 139, 31);
		panel_3.add(lblNewLabel_3_3_4);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(237, 127, 209, 20);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(237, 180, 213, 20);
		panel_3.add(textField_11);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(237, 231, 213, 20);
		panel_3.add(textField_14);
		
		JButton deletemall= new JButton("Delete");
		deletemall.setFont(new Font("Dialog", Font.BOLD, 14));
		deletemall.setBounds(462, 308, 99, 26);
		deletemall.addActionListener(e->{
			String name = textField_9.getText();
			String loc = textField_10.getText();
			String time = textField_11.getText();
			String contact = textField_14.getText();
			
			
			if(name.equals("") || loc.equals("") || time.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(deletemall,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(deletemall,"Invalid Contact Number");   
			}else {
				ShoppingMalls mall=new ShoppingMalls(name,loc,time,contact);
				ResultSet valid=DB.check_malls(mall);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check==false) {
					JOptionPane.showMessageDialog(deletehos,"This Mall Does Not Exist");    
				}else {
					boolean ans=DB.dltMalls(name, loc);
					if(ans) {
						JOptionPane.showMessageDialog(deletehos,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deletehos,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		panel_3.add(deletemall);
		
		JButton addmall = new JButton("Add");
		addmall.setFont(new Font("Dialog", Font.BOLD, 14));
		addmall.setBounds(101, 308, 99, 26);
		addmall.addActionListener(e->{
			String name = textField_9.getText();
			String loc = textField_10.getText();
			String time = textField_11.getText();
			String contact = textField_14.getText();
			
			if(name.equals("") || loc.equals("") || time.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(addmall,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(addmall,"Invalid Contact Number");   
			}else {
				ShoppingMalls mall=new ShoppingMalls(name,loc,time,contact);
				ResultSet valid=DB.check_malls(mall);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check) {
					JOptionPane.showMessageDialog(addmall,"This Mall Already Exists");    
				}else {
					boolean ans=DB.addMall(mall);
					if(ans) {
						JOptionPane.showMessageDialog(addhos,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addhos,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		panel_3.add(addmall);
		
		JPanel library = new JPanel();
		library.setBackground(Color.BLACK);
		tabbedPane.addTab("Library", null, library, null);
		library.setLayout(null);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Add/Remove Library\r\n");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_2_1_1_1.setBounds(527, 49, 248, 29);
		library.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.BLACK);
		panel_4.setBounds(300, 114, 642, 374);
		library.add(panel_4);
		
		JLabel lblNewLabel_3_10 = new JLabel("Name :");
		lblNewLabel_3_10.setForeground(Color.WHITE);
		lblNewLabel_3_10.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_10.setBounds(101, 67, 64, 25);
		panel_4.add(lblNewLabel_3_10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(237, 73, 209, 20);
		panel_4.add(textField_15);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("Sector :");
		lblNewLabel_3_1_4.setForeground(Color.WHITE);
		lblNewLabel_3_1_4.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_4.setBounds(101, 118, 139, 31);
		panel_4.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("Contact # :");
		lblNewLabel_3_2_3.setForeground(Color.WHITE);
		lblNewLabel_3_2_3.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3.setBounds(101, 171, 139, 31);
		panel_4.add(lblNewLabel_3_2_3);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(237, 127, 209, 20);
		panel_4.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(237, 180, 213, 20);
		panel_4.add(textField_17);
		
		JButton deletelibrary = new JButton("Delete");
		deletelibrary.setFont(new Font("Dialog", Font.BOLD, 14));
		deletelibrary.setBounds(462, 308, 99, 26);
		deletelibrary.addActionListener(e->{
			String name = textField_15.getText();
			String loc = textField_16.getText();
			String contact = textField_17.getText();
			
			if(name.equals("") || loc.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(deletelibrary,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(deletelibrary,"Invalid Contact Number");   
			}else {
				Libraries lib=new Libraries(name,loc,contact);
				ResultSet valid=DB.check_library(lib);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check==false) {
					JOptionPane.showMessageDialog(deletelibrary,"This Library Does Not Exist");    
				}else {
					boolean ans=DB.dltLibraries(name, loc);
					if(ans) {
						JOptionPane.showMessageDialog(deletelibrary,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deletelibrary,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		panel_4.add(deletelibrary);
		
		JButton addlibrary = new JButton("Add");
		addlibrary.setFont(new Font("Dialog", Font.BOLD, 14));
		addlibrary.setBounds(101, 308, 99, 26);
		addlibrary.addActionListener(e->{
			String name = textField_15.getText();
			String loc = textField_16.getText();
			String contact = textField_17.getText();
			
			if(name.equals("") || loc.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(addlibrary,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(addlibrary,"Invalid Contact Number");   
			}else {
				Libraries lib=new Libraries(name,loc,contact);
				ResultSet valid=DB.check_library(lib);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check) {
					JOptionPane.showMessageDialog(addlibrary,"This Hospital Already Exists");    
				}else {
					boolean ans=DB.addLibraries(lib);
					if(ans) {
						JOptionPane.showMessageDialog(addlibrary,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addlibrary,"Something Went Wrong");    
					}
				}
				
			}
		});
		panel_4.add(addlibrary);
		
		JPanel atms = new JPanel();
		atms.setBorder(null);
		atms.setBackground(Color.BLACK);
		tabbedPane.addTab("ATMs", null, atms, null);
		atms.setLayout(null);
		
		JLabel lblNewLabel_2_a = new JLabel("Add/Remove ATMs");
		lblNewLabel_2_a.setForeground(Color.WHITE);
		lblNewLabel_2_a.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2_a.setBackground(Color.BLACK);
		lblNewLabel_2_a.setBounds(527, 49, 248, 32);
		atms.add(lblNewLabel_2_a);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.BLACK);
		panel_4_1.setBounds(300, 114, 642, 374);
		atms.add(panel_4_1);
		
		JLabel lblNewLabel_3_10_1 = new JLabel("Name :");
		lblNewLabel_3_10_1.setForeground(Color.WHITE);
		lblNewLabel_3_10_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_10_1.setBounds(101, 67, 64, 25);
		panel_4_1.add(lblNewLabel_3_10_1);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(237, 73, 209, 20);
		panel_4_1.add(textField_18);
		
		JLabel lblNewLabel_3_1_4_1 = new JLabel("Sector :");
		lblNewLabel_3_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_4_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_4_1.setBounds(101, 118, 139, 31);
		panel_4_1.add(lblNewLabel_3_1_4_1);
		
		JLabel lblNewLabel_3_2_3_1 = new JLabel("Timing :");
		lblNewLabel_3_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_3_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3_1.setBounds(101, 171, 139, 31);
		panel_4_1.add(lblNewLabel_3_2_3_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(237, 127, 209, 20);
		panel_4_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(237, 180, 213, 20);
		panel_4_1.add(textField_20);
		
		JButton deleteatm = new JButton("Delete");
		deleteatm.setFont(new Font("Dialog", Font.BOLD, 14));
		deleteatm.setBounds(462, 308, 99, 26);
		deleteatm.addActionListener(e->{
			String name = textField_18.getText();
			String loc = textField_19.getText();
			String time = textField_20.getText();
			

			if(name.equals("") || loc.equals("") || time.equals("")) {
				JOptionPane.showMessageDialog(deleteatm,"No Box Can Be Left Empty");   
			}else {
				Atm atm=new Atm(name,loc,time);
				ResultSet valid=DB.check_atm(atm);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check==false) {
					JOptionPane.showMessageDialog(deleteatm,"This Atm Does Not Exist");    
				}else {
					boolean ans=DB.dltatm(time, loc);
					if(ans) {
						JOptionPane.showMessageDialog(deleteatm,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deleteatm,"Something Went Wrong");    
					}
				}
				
			}

			
		});
		panel_4_1.add(deleteatm);
		
		JButton addatm = new JButton("Add");
		addatm.setFont(new Font("Dialog", Font.BOLD, 14));
		addatm.setBounds(101, 308, 99, 26);
		addatm.addActionListener(e->{
			String name = textField_18.getText();
			String loc = textField_19.getText();
			String time = textField_20.getText();
			

			if(name.equals("") || loc.equals("") || time.equals("")) {
				JOptionPane.showMessageDialog(addhos,"No Box Can Be Left Empty");    
			}else {
				Atm atm=new Atm(name,loc,time);
				ResultSet valid=DB.check_atm(atm);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check) {
					JOptionPane.showMessageDialog(addhos,"This Hospital Already Exists");    
				}else {
					boolean ans=DB.addAtm(atm);
					if(ans) {
						JOptionPane.showMessageDialog(addhos,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addhos,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		panel_4_1.add(addatm);
		
		JPanel hostel = new JPanel();
		hostel.setBorder(null);
		hostel.setBackground(Color.BLACK);
		tabbedPane.addTab("Hostels", null, hostel, null);
		hostel.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Add/Remove Hostels");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1.setBackground(Color.BLACK);
		lblNewLabel_2_1_1.setBounds(527, 49, 252, 29);
		hostel.add(lblNewLabel_2_1_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setBackground(Color.BLACK);
		panel_4_2.setBounds(300, 114, 642, 374);
		hostel.add(panel_4_2);
		
		JLabel lblNewLabel_3_10_2 = new JLabel("Name :");
		lblNewLabel_3_10_2.setForeground(Color.WHITE);
		lblNewLabel_3_10_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_10_2.setBounds(101, 67, 64, 25);
		panel_4_2.add(lblNewLabel_3_10_2);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(237, 73, 209, 20);
		panel_4_2.add(textField_21);
		
		JLabel lblNewLabel_3_1_4_2 = new JLabel("Location :");
		lblNewLabel_3_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_4_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_4_2.setBounds(101, 118, 139, 31);
		panel_4_2.add(lblNewLabel_3_1_4_2);
		
		JLabel lblNewLabel_3_2_3_2 = new JLabel("Contact # :");
		lblNewLabel_3_2_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2_3_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3_2.setBounds(101, 171, 139, 31);
		panel_4_2.add(lblNewLabel_3_2_3_2);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(237, 127, 209, 20);
		panel_4_2.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(237, 180, 213, 20);
		panel_4_2.add(textField_23);
		
		JButton deletehostel = new JButton("Delete");
		deletehostel.setFont(new Font("Dialog", Font.BOLD, 14));
		deletehostel.setBounds(462, 308, 99, 26);
		deletehostel.addActionListener(e->{
			String name = textField_21.getText();
			String loc = textField_22.getText();
			String contact = textField_23.getText();
			
			if(name.equals("") || loc.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(deletehostel,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(deletehostel,"Invalid Contact Number");   
			}else {
				Hostels hos=new Hostels(name,loc,contact);
				ResultSet valid=DB.check_hostels(hos);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check==false) {
					JOptionPane.showMessageDialog(deletehostel,"This Hostel Does Not Exist");    
				}else {
					boolean ans=DB.dltHostels(name, loc);
					if(ans) {
						JOptionPane.showMessageDialog(deletehostel,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deletehostel,"Something Went Wrong");    
					}
				}
				
			}

			
		});
		panel_4_2.add(deletehostel);
		
		JButton addhostel = new JButton("Add");
		addhostel.setFont(new Font("Dialog", Font.BOLD, 14));
		addhostel.setBounds(101, 308, 99, 26);
		addhostel.addActionListener(e->{
			String name = textField_21.getText();
			String loc = textField_22.getText();
			String contact = textField_23.getText();
			

			if(name.equals("") || loc.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(addhostel,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(addhostel,"Invalid Contact Number");   
			}else {
				Hostels hos=new Hostels(name,loc,contact);
				ResultSet valid=DB.check_hostels(hos);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check) {
					JOptionPane.showMessageDialog(addhostel,"This Hospital Already Exists");    
				}else {
					boolean ans=DB.addHostels(hos);
					if(ans) {
						JOptionPane.showMessageDialog(addhostel,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addhostel,"Something Went Wrong");    
					}
				}
				
			}
		
		});
		panel_4_2.add(addhostel);

		
		JPanel publict = new JPanel();
		publict.setBorder(null);
		publict.setBackground(Color.BLACK);
		tabbedPane.addTab("Public Transport", null, publict, null);
		publict.setLayout(null);
		
		JLabel lblNewLabel_2_11_1 = new JLabel("Add/Remove Public Transport");
		lblNewLabel_2_11_1.setForeground(Color.WHITE);
		lblNewLabel_2_11_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_11_1.setBackground(Color.BLACK);
		lblNewLabel_2_11_1.setBounds(527, 49, 360, 29);
		publict.add(lblNewLabel_2_11_1);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setLayout(null);
		panel_4_3.setBackground(Color.BLACK);
		panel_4_3.setBounds(300, 114, 642, 374);
		publict.add(panel_4_3);
		
		JLabel lblNewLabel_3_10_3 = new JLabel("Name :");
		lblNewLabel_3_10_3.setForeground(Color.WHITE);
		lblNewLabel_3_10_3.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_10_3.setBounds(101, 67, 64, 25);
		panel_4_3.add(lblNewLabel_3_10_3);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(237, 73, 209, 20);
		panel_4_3.add(textField_24);
		
		JLabel lblNewLabel_3_1_4_3 = new JLabel("Station :");
		lblNewLabel_3_1_4_3.setForeground(Color.WHITE);
		lblNewLabel_3_1_4_3.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_4_3.setBounds(101, 118, 139, 31);
		panel_4_3.add(lblNewLabel_3_1_4_3);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(237, 127, 209, 20);
		panel_4_3.add(textField_25);
		
		JButton deletpt = new JButton("Delete");
		deletpt.setFont(new Font("Dialog", Font.BOLD, 14));
		deletpt.setBounds(462, 308, 99, 26);
		deletpt.addActionListener(e->{
			String bus = textField_24.getText();
			String station = textField_25.getText();
			

			if(bus.equals("") || station.equals("")) {
				JOptionPane.showMessageDialog(deletpt,"No Box Can Be Left Empty");   
			}else {
				Transport tr=new Transport(bus,station);
				ResultSet valid=DB.check_transport(tr);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check==false) {
					JOptionPane.showMessageDialog(deletpt,"This Station Does Not Exist");    
				}else {
					boolean ans=DB.dltTransport(bus, station);
					if(ans) {
						JOptionPane.showMessageDialog(deletpt,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deletpt,"Something Went Wrong");    
					}
				}
				
			}

		});
		panel_4_3.add(deletpt);
		
		JButton addpt= new JButton("Add");
		addpt.setFont(new Font("Dialog", Font.BOLD, 14));
		addpt.setBounds(101, 308, 99, 26);
		addpt.addActionListener(e->{
			String bus = textField_24.getText();
			String station = textField_25.getText();
			
			if(bus.equals("") || station.equals("")) {
				JOptionPane.showMessageDialog(addpt,"No Box Can Be Left Empty");     
			}else {
				Transport tr=new Transport(bus,station);
				ResultSet valid=DB.check_transport(tr);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check) {
					JOptionPane.showMessageDialog(addpt,"This Police Station Already Exists");    
				}else {
					boolean ans=DB.addTransport(tr);
					if(ans) {
						JOptionPane.showMessageDialog(addpt,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addpt,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		panel_4_3.add(addpt);
		
		JPanel hotels = new JPanel();
		hotels.setBackground(Color.BLACK);
		tabbedPane.addTab("Hotels", null, hotels, null);
		hotels.setLayout(null);
		
		JLabel labelh = new JLabel("Add/Remove Hotel");
		labelh.setForeground(Color.WHITE);
		labelh.setFont(new Font("Tahoma", Font.BOLD, 24));
		labelh.setBackground(Color.BLACK);
		labelh.setBounds(527, 49, 228, 29);
		hotels.add(labelh);
		
		JPanel panel_4_4 = new JPanel();
		panel_4_4.setLayout(null);
		panel_4_4.setBackground(Color.BLACK);
		panel_4_4.setBounds(300, 114, 642, 374);
		hotels.add(panel_4_4);
		
		JLabel lblNewLabel_3_10_4 = new JLabel("Name :");
		lblNewLabel_3_10_4.setForeground(Color.WHITE);
		lblNewLabel_3_10_4.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_10_4.setBounds(101, 67, 64, 25);
		panel_4_4.add(lblNewLabel_3_10_4);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(237, 73, 209, 20);
		panel_4_4.add(textField_26);
		
		JLabel lblNewLabel_3_1_4_4 = new JLabel("Location :");
		lblNewLabel_3_1_4_4.setForeground(Color.WHITE);
		lblNewLabel_3_1_4_4.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_4_4.setBounds(101, 118, 139, 31);
		panel_4_4.add(lblNewLabel_3_1_4_4);
		
		JLabel lblNewLabel_3_2_3_3 = new JLabel("Price :");
		lblNewLabel_3_2_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_2_3_3.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3_3.setBounds(101, 171, 139, 31);
		panel_4_4.add(lblNewLabel_3_2_3_3);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(237, 127, 209, 20);
		panel_4_4.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(237, 180, 213, 20);
		panel_4_4.add(textField_28);
		
		JButton deletehotel = new JButton("Delete");
		deletehotel.setFont(new Font("Dialog", Font.BOLD, 14));
		deletehotel.setBounds(461, 337, 99, 26);
		deletehotel.addActionListener(e->{
			String nameh = textField_26.getText();
			String locationh = textField_27.getText();
			String priceh = textField_28.getText();
			String ratingh = hotelrating.getText();
			String contacth = hotelname.getText();
			

			if(nameh.equals("") || locationh.equals("") || priceh.equals("") || contacth.equals("") || ratingh.equals("")) {
				JOptionPane.showMessageDialog(deletehotel,"No Box Can Be Left Empty");   
			}else if(contacth.length()>12 || contacth.length()<10) {
				JOptionPane.showMessageDialog(deletehotel,"Invalid Contact Number");   
			}else {
				Hotels hot=new Hotels(nameh,locationh,priceh,ratingh,contacth);
				ResultSet valid=DB.check_hotels(hot);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check==false) {
					JOptionPane.showMessageDialog(deletehotel,"This Hotel Does Not Exist");    
				}else {
					boolean ans=DB.dltHotels(nameh, locationh);
					if(ans) {
						JOptionPane.showMessageDialog(deletehotel,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deletehotel,"Something Went Wrong");    
					}
				}
				
			}

			
		});
		panel_4_4.add(deletehotel);
		
		JButton addhotel= new JButton("Add");
		addhotel.setFont(new Font("Dialog", Font.BOLD, 14));
		addhotel.setBounds(101, 337, 99, 26);
		addhotel.addActionListener(e->{
			String nameh = textField_26.getText();
			String locationh = textField_27.getText();
			String priceh = textField_28.getText();
			String ratingh = hotelrating.getText();
			String contacth = hotelname.getText();
			
			if(nameh.equals("") || locationh.equals("") || priceh.equals("") || contacth.equals("") || ratingh.equals("")) {
				JOptionPane.showMessageDialog(addhotel,"No Box Can Be Left Empty");   
			}else if(contacth.length()>12 || contacth.length()<10) {
				JOptionPane.showMessageDialog(addhotel,"Invalid Contact Number");   
			}else {
				Hotels hot=new Hotels(nameh,locationh,priceh,ratingh,contacth);
				ResultSet valid=DB.check_hotels(hot);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check) {
					JOptionPane.showMessageDialog(addhotel,"This Hotel Already Exists");    
				}else {
					boolean ans=DB.addHotels(hot);
					if(ans) {
						JOptionPane.showMessageDialog(addhotel,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addhotel,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		panel_4_4.add(addhotel);
		
		JLabel lblNewLabel_3_2_3_3_1 = new JLabel("Rating :");
		lblNewLabel_3_2_3_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_3_3_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3_3_1.setBounds(101, 223, 139, 31);
		panel_4_4.add(lblNewLabel_3_2_3_3_1);
		
		JLabel lblNewLabel_3_2_3_3_2 = new JLabel("Contact :");
		lblNewLabel_3_2_3_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2_3_3_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3_3_2.setBounds(101, 274, 139, 31);
		panel_4_4.add(lblNewLabel_3_2_3_3_2);
		
		hotelrating = new JTextField();
		hotelrating.setBounds(237, 232, 209, 20);
		panel_4_4.add(hotelrating);
		hotelrating.setColumns(10);
		
		hotelname = new JTextField();
		hotelname.setBounds(237, 283, 209, 20);
		panel_4_4.add(hotelname);
		hotelname.setColumns(10);
		
		JPanel policest = new JPanel();
		policest.setBackground(Color.BLACK);
		tabbedPane.addTab("Police Stations", null, policest, null);
		policest.setLayout(null);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Add/Remove Police Stations");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_2_1_1_1_1.setBounds(527, 49, 341, 29);
		policest.add(lblNewLabel_2_1_1_1_1);
		
		JPanel panel_4_2_1 = new JPanel();
		panel_4_2_1.setLayout(null);
		panel_4_2_1.setBackground(Color.BLACK);
		panel_4_2_1.setBounds(300, 114, 642, 374);
		policest.add(panel_4_2_1);
		
		JLabel lblNewLabel_3_10_2_1 = new JLabel("Name :");
		lblNewLabel_3_10_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_10_2_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_10_2_1.setBounds(101, 67, 64, 25);
		panel_4_2_1.add(lblNewLabel_3_10_2_1);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(237, 73, 209, 20);
		panel_4_2_1.add(textField_29);
		
		JLabel lblNewLabel_3_1_4_2_1 = new JLabel("Location :");
		lblNewLabel_3_1_4_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_4_2_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_4_2_1.setBounds(101, 118, 139, 31);
		panel_4_2_1.add(lblNewLabel_3_1_4_2_1);
		
		JLabel lblNewLabel_3_2_3_2_1 = new JLabel("Contact # :");
		lblNewLabel_3_2_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_3_2_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3_2_1.setBounds(101, 171, 139, 31);
		panel_4_2_1.add(lblNewLabel_3_2_3_2_1);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(237, 127, 209, 20);
		panel_4_2_1.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(237, 180, 213, 20);
		panel_4_2_1.add(textField_31);
		
		JButton deletepolice = new JButton("Delete");
		deletepolice.setFont(new Font("Dialog", Font.BOLD, 14));
		deletepolice.setBounds(462, 308, 99, 26);
		deletepolice.addActionListener(e->{
			String namep = textField_29.getText();
			String locationp = textField_30.getText();
			String contactp = textField_31.getText();
			

			if(namep.equals("")|| locationp.equals("") ||contactp.equals("")) {
				JOptionPane.showMessageDialog(deletepolice,"No Box Can Be Left Empty");   
			}else if(contactp.length()>12 || contactp.length()<10) {
				JOptionPane.showMessageDialog(deletepolice,"Invalid Contact Number");   
			}else {
				Police police=new Police(namep,locationp,contactp);
				ResultSet valid=DB.check_police(police);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check==false) {
					JOptionPane.showMessageDialog(deletepolice,"This Police Station Does Not Exist");    
				}else {
					boolean ans=DB.dltPolice(namep, locationp);
					if(ans) {
						JOptionPane.showMessageDialog(deletepolice,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deletepolice,"Something Went Wrong");    
					}
				}
				
			}

			
		});
		panel_4_2_1.add(deletepolice);
		
		JButton addpolice = new JButton("Add");
		addpolice.setFont(new Font("Dialog", Font.BOLD, 14));
		addpolice.setBounds(101, 308, 99, 26);
		addpolice.addActionListener(e->{
			String namep = textField_29.getText();
			String locationp = textField_30.getText();
			String contactp = textField_31.getText();
			
			if(namep.equals("")|| locationp.equals("") ||contactp.equals("")) {
				JOptionPane.showMessageDialog(addpolice,"No Box Can Be Left Empty");   
			}else if(contactp.length()>12 || contactp.length()<10) {
				JOptionPane.showMessageDialog(addpolice,"Invalid Contact Number");   
			}else {
				Police police=new Police(namep,locationp,contactp);
				ResultSet valid=DB.check_police(police);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check) {
					JOptionPane.showMessageDialog(addhos,"This Police Station Already Exists");    
				}else {
					boolean ans=DB.addPolice(police);
					if(ans) {
						JOptionPane.showMessageDialog(addpolice,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addpolice,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		panel_4_2_1.add(addpolice);
		
		JPanel airport = new JPanel();
		airport.setBackground(Color.BLACK);
		airport.setForeground(Color.BLACK);
		tabbedPane.addTab("Airport", null, airport, null);
		airport.setLayout(null);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Add/Remove Airport");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1.setBounds(527, 49, 247, 29);
		airport.add(lblNewLabel_2_1_1_1_1_1);
		
		JPanel panel_4_2_2 = new JPanel();
		panel_4_2_2.setLayout(null);
		panel_4_2_2.setBackground(Color.BLACK);
		panel_4_2_2.setBounds(300, 114, 642, 374);
		airport.add(panel_4_2_2);
		
		JLabel lblNewLabel_3_10_2_2 = new JLabel("Name :");
		lblNewLabel_3_10_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_10_2_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_10_2_2.setBounds(101, 67, 64, 25);
		panel_4_2_2.add(lblNewLabel_3_10_2_2);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(237, 73, 209, 20);
		panel_4_2_2.add(textField_32);
		
		JLabel lblNewLabel_3_1_4_2_2 = new JLabel("Location :");
		lblNewLabel_3_1_4_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_4_2_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_4_2_2.setBounds(101, 118, 139, 31);
		panel_4_2_2.add(lblNewLabel_3_1_4_2_2);
		
		JLabel lblNewLabel_3_2_3_2_2 = new JLabel("Contact # :");
		lblNewLabel_3_2_3_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_2_3_2_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3_2_2.setBounds(101, 171, 139, 31);
		panel_4_2_2.add(lblNewLabel_3_2_3_2_2);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(237, 127, 209, 20);
		panel_4_2_2.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(237, 180, 213, 20);
		panel_4_2_2.add(textField_34);
		
		JButton deleteairport = new JButton("Delete");
		deleteairport.setFont(new Font("Dialog", Font.BOLD, 14));
		deleteairport.setBounds(462, 308, 99, 26);
		deleteairport.addActionListener(e->{
			String name = textField_32.getText();
			String location = textField_33.getText();
			String contact = textField_34.getText();
			

			if(name.equals("")|| location.equals("") ||contact.equals("")) {
				JOptionPane.showMessageDialog(deleteairport,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(deleteairport,"Invalid Contact Number");   
			}else {
				Airport air=new Airport(name,location,contact);
				ResultSet valid=DB.check_airport(air);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check==false) {
					JOptionPane.showMessageDialog(deleteairport,"This Airport Does Not Exist");    
				}else {
					boolean ans=DB.dltairport(name, location);
					if(ans) {
						JOptionPane.showMessageDialog(deleteairport,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deleteairport,"Something Went Wrong");    
					}
				}
				
			}

			
		});
		panel_4_2_2.add(deleteairport);
		
		JButton addairport = new JButton("Add");
		addairport.setFont(new Font("Dialog", Font.BOLD, 14));
		addairport.setBounds(101, 308, 99, 26);
		addairport.addActionListener(e->{
			String name = textField_32.getText();
			String location = textField_33.getText();
			String contact = textField_34.getText();
			
			if(name.equals("")|| location.equals("") ||contact.equals("")) {
				JOptionPane.showMessageDialog(addairport,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(addairport,"Invalid Contact Number");   
			}else {
				Airport air=new Airport(name,location,contact);
				ResultSet valid=DB.check_airport(air);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check) {
					JOptionPane.showMessageDialog(addairport,"This Airport Already Exists");    
				}else {
					boolean ans=DB.addAirport(air);
					if(ans) {
						JOptionPane.showMessageDialog(addairport,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addairport,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		panel_4_2_2.add(addairport);
		
		JPanel restaurant = new JPanel();
		restaurant.setBackground(Color.BLACK);
		tabbedPane.addTab("Restaurants", null, restaurant, null);
		restaurant.setLayout(null);
		

		JLabel lblNewLabel_2_11 = new JLabel("Add/Remove Restaurants");
		lblNewLabel_2_11.setForeground(Color.WHITE);
		lblNewLabel_2_11.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_11.setBackground(Color.BLACK);
		lblNewLabel_2_11.setBounds(527, 49, 307, 29);
		restaurant.add(lblNewLabel_2_11);
		
		JPanel panel_4_2_4_1 = new JPanel();
		panel_4_2_4_1.setLayout(null);
		panel_4_2_4_1.setBackground(Color.BLACK);
		panel_4_2_4_1.setBounds(300, 114, 605, 348);
		restaurant.add(panel_4_2_4_1);
		
		JLabel lblNewLabel_3_10_2_4_1 = new JLabel("Name :");
		lblNewLabel_3_10_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_3_10_2_4_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_10_2_4_1.setBounds(101, 67, 64, 25);
		panel_4_2_4_1.add(lblNewLabel_3_10_2_4_1);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(237, 73, 209, 20);
		panel_4_2_4_1.add(textField_41);
		
		JLabel lblNewLabel_3_1_4_2_4_1 = new JLabel("Location :");
		lblNewLabel_3_1_4_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_4_2_4_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_4_2_4_1.setBounds(101, 118, 139, 31);
		panel_4_2_4_1.add(lblNewLabel_3_1_4_2_4_1);
		
		JLabel lblNewLabel_3_2_3_2_4_1 = new JLabel("Ambience :");
		lblNewLabel_3_2_3_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_3_2_4_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3_2_4_1.setBounds(101, 171, 139, 31);
		panel_4_2_4_1.add(lblNewLabel_3_2_3_2_4_1);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(237, 127, 209, 20);
		panel_4_2_4_1.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(237, 180, 213, 20);
		panel_4_2_4_1.add(textField_43);
		
		JButton deleteres = new JButton("Delete");
		deleteres.setBounds(462, 308, 99, 26);
		deleteres.setFont(new Font("Dialog", Font.BOLD, 14));
		deleteres.addActionListener(e->{
			String name = textField_41.getText();
			String location = textField_42.getText();
			String ambiance = textField_43.getText();
			
			if(name=="" || location=="" || ambiance=="") {
				JOptionPane.showMessageDialog(deleteres,"No Box Can Be Left Empty");    
			}else {
				Restaurants res=new Restaurants(name,location,ambiance);
				ResultSet valid=DB.check_restaurants(res);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					

				if(check==false) {
					JOptionPane.showMessageDialog(deleteres,"This Restaurant Does Not Exist");    
				}else {
					boolean ans=DB.dltRest(name, location);
					if(ans) {
						JOptionPane.showMessageDialog(deleteres,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deleteres,"Something Went Wrong");    
					}
				}
				
			}
			
		});
		
		
		panel_4_2_4_1.add(deleteres);
		
		JButton addres = new JButton("Add");
		addres.setFont(new Font("Dialog", Font.BOLD, 14));
		addres.setBounds(101, 308, 99, 26);
		addres.addActionListener(e->{
			String name = textField_41.getText();
			String location = textField_42.getText();
			String ambiance = textField_43.getText();
			
			if(name.equals("") || location.equals("") || ambiance.equals("")) {
				JOptionPane.showMessageDialog(addres,"No Box Can Be Left Empty");   
			}else {
				Restaurants res=new Restaurants(name,location,ambiance);
				ResultSet valid=DB.check_restaurants(res);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check) {
					JOptionPane.showMessageDialog(addres,"This Restaurant Already Exists");    
				}else {
					boolean ans=DB.addRestaurant(res);
					if(ans) {
						JOptionPane.showMessageDialog(addres,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addres,"Something Went Wrong");    
					}
				}
				
			}
			
			
		});
		panel_4_2_4_1.add(addres);
		
		JPanel school = new JPanel();
		school.setBackground(Color.BLACK);
		tabbedPane.addTab("Schools And Colleges", null, school, null);
		school.setLayout(null);
		
		JLabel lblNewLabel_2_111 = new JLabel("Add/Remove Schools");
		lblNewLabel_2_111.setForeground(Color.WHITE);
		lblNewLabel_2_111.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_111.setBackground(Color.BLACK);
		lblNewLabel_2_111.setBounds(527, 49, 256, 29);
		school.add(lblNewLabel_2_111);
		
		JPanel panel_4_2_3 = new JPanel();
		panel_4_2_3.setLayout(null);
		panel_4_2_3.setBackground(Color.BLACK);
		panel_4_2_3.setBounds(300, 114, 642, 374);
		school.add(panel_4_2_3);
		
		JLabel lblNewLabel_3_10_2_3 = new JLabel("Name :");
		lblNewLabel_3_10_2_3.setForeground(Color.WHITE);
		lblNewLabel_3_10_2_3.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_10_2_3.setBounds(101, 67, 64, 25);
		panel_4_2_3.add(lblNewLabel_3_10_2_3);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(237, 73, 209, 20);
		panel_4_2_3.add(textField_35);
		
		JLabel lblNewLabel_3_1_4_2_3 = new JLabel("Location :");
		lblNewLabel_3_1_4_2_3.setForeground(Color.WHITE);
		lblNewLabel_3_1_4_2_3.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_4_2_3.setBounds(101, 118, 139, 31);
		panel_4_2_3.add(lblNewLabel_3_1_4_2_3);
		
		JLabel lblNewLabel_3_2_3_2_3 = new JLabel("Contact # :");
		lblNewLabel_3_2_3_2_3.setForeground(Color.WHITE);
		lblNewLabel_3_2_3_2_3.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3_2_3.setBounds(101, 171, 139, 31);
		panel_4_2_3.add(lblNewLabel_3_2_3_2_3);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(237, 127, 209, 20);
		
		panel_4_2_3.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(237, 180, 213, 20);
		panel_4_2_3.add(textField_37);
		
		JButton deleteschool = new JButton("Delete");
		deleteschool.setFont(new Font("Dialog", Font.BOLD, 14));
		deleteschool.setBounds(462, 308, 99, 26);
		deleteschool.addActionListener(e->{
			String name = textField_35.getText();
			String loc = textField_36.getText();
			String contact = textField_37.getText();
			

			if(name.equals("") || loc.equals("") ||contact.equals("")) {
				JOptionPane.showMessageDialog(deleteschool,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(deleteschool,"Invalid Contact Number");   
			}else {
				Schools sc=new Schools(name,loc,contact);
				ResultSet valid=DB.check_schools(sc);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check==false) {
					JOptionPane.showMessageDialog(deleteschool,"This School Or College Does Not Exist");    
				}else {
					boolean ans=DB.dltSchools(name, loc);
					if(ans) {
						JOptionPane.showMessageDialog(deleteschool,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deleteschool,"Something Went Wrong");    
					}
				}
				
			}
			
			
		});
		panel_4_2_3.add(deleteschool);
		
		JButton addschool = new JButton("Add");
		addschool.setFont(new Font("Dialog", Font.BOLD, 14));
		addschool.setBounds(101, 308, 99, 26);
		addschool.addActionListener(e->{
			String name = textField_35.getText();
			String loc = textField_36.getText();
			String contact = textField_37.getText();
			
			if(name.equals("") || loc.equals("") ||contact.equals("")) {
				JOptionPane.showMessageDialog(addschool,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(addschool,"Invalid Contact Number");   
			}else {
				Schools sc=new Schools(name,loc,contact);
				ResultSet valid=DB.check_schools(sc);
				 boolean check=false;
					try {
						check = valid.next();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(check) {
					JOptionPane.showMessageDialog(addschool,"This School Already Exists");    
				}else {
					boolean ans=DB.addSchool(sc);
					if(ans) {
						JOptionPane.showMessageDialog(addschool,"Updated Successfully");    
					}else {
						JOptionPane.showMessageDialog(addschool,"Something Went Wrong");    
					}
				}
				
			}
		
		});
		panel_4_2_3.add(addschool);
		
		JPanel univeristy = new JPanel();
		tabbedPane.addTab("Universities", null, univeristy, null);
		univeristy.setBackground(Color.BLACK);
		univeristy.setLayout(null);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Add/Remove University");
		lblNewLabel_2_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_2.setBackground(Color.BLACK);
		lblNewLabel_2_1_1_2.setBounds(527, 49, 285, 29);
		univeristy.add(lblNewLabel_2_1_1_2);
		
		JPanel panel_4_2_4 = new JPanel();
		panel_4_2_4.setLayout(null);
		panel_4_2_4.setBackground(Color.BLACK);
		panel_4_2_4.setBounds(300, 114, 642, 374);
		univeristy.add(panel_4_2_4);
		
		JLabel lblNewLabel_3_10_2_4 = new JLabel("Name :");
		lblNewLabel_3_10_2_4.setForeground(Color.WHITE);
		lblNewLabel_3_10_2_4.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_10_2_4.setBounds(101, 67, 64, 25);
		panel_4_2_4.add(lblNewLabel_3_10_2_4);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(237, 73, 209, 20);
		panel_4_2_4.add(textField_38);
		
		JLabel lblNewLabel_3_1_4_2_4 = new JLabel("Location :");
		lblNewLabel_3_1_4_2_4.setForeground(Color.WHITE);
		lblNewLabel_3_1_4_2_4.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_1_4_2_4.setBounds(101, 118, 139, 31);
		panel_4_2_4.add(lblNewLabel_3_1_4_2_4);
		
		JLabel lblNewLabel_3_2_3_2_4 = new JLabel("Contact # :");
		lblNewLabel_3_2_3_2_4.setForeground(Color.WHITE);
		lblNewLabel_3_2_3_2_4.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_3_2_3_2_4.setBounds(101, 171, 139, 31);
		panel_4_2_4.add(lblNewLabel_3_2_3_2_4);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(237, 127, 209, 20);
		panel_4_2_4.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(237, 180, 213, 20);
		panel_4_2_4.add(textField_40);
		
		JButton deleteuni = new JButton("Delete");
		deleteuni.setFont(new Font("Dialog", Font.BOLD, 14));
		deleteuni.setBounds(462, 308, 99, 26);
		deleteuni.addActionListener(e->{
			String name = textField_38.getText();
			String loc = textField_39.getText();
			String contact = textField_40.getText();
			
			if(name.equals("") || loc.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(deleteuni,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(deleteuni,"Invalid Contact Number");   
			}else {
				Universities uni=new Universities(name,loc,contact);
				 ResultSet valid=DB.check_university(uni);
				 boolean check=false;
				try {
					check = valid.next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(check) {
					boolean ans=DB.dltUniversities(name, loc);
					if(ans) {
						JOptionPane.showMessageDialog(deleteuni,"Deleted Successfully");    
					}else {
						JOptionPane.showMessageDialog(deleteuni,"Something Went Wrong");    
					}
				}else {
					JOptionPane.showMessageDialog(deleteuni,"This University Does Not Exist");    
					
			     }
			}
				
			
		});
		panel_4_2_4.add(deleteuni);
		
		
		JButton adduni = new JButton("Add");
		adduni.setFont(new Font("Dialog", Font.BOLD, 14));
		adduni.setBounds(101, 308, 99, 26);
		adduni.addActionListener(e->{
			String name = textField_38.getText();
			String loc = textField_39.getText();
			String contact = textField_40.getText();
			Universities uni=new Universities(name,loc,contact);
			 ResultSet valid=DB.check_university(uni);
			 boolean check=false;
			try {
				check = valid.next();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if(name.equals("") || loc.equals("") || contact.equals("")) {
				JOptionPane.showMessageDialog(adduni,"No Box Can Be Left Empty");   
			}else if(contact.length()>12 || contact.length()<10) {
				JOptionPane.showMessageDialog(adduni,"Invalid Contact Number");   
			}else if(check==false) {
					boolean ans=DB.addUniversities(uni);
					if(ans) {
						JOptionPane.showMessageDialog(adduni,"Added Successfully");    
					}else {
						JOptionPane.showMessageDialog(adduni,"Something Went Wrong");    
					}
					
			}else {
					JOptionPane.showMessageDialog(adduni,"This University Does Not Exist");    
					
			}
			
			
		});
		panel_4_2_4.add(adduni);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(1221, 13, 109, 36);
		btnNewButton.addActionListener(e -> {openmainpage();});

		contentPane.add(btnNewButton);
		}
		
		
	
	public void openmainpage(){
		this.setVisible(false);
		 AdminOption m1 = new AdminOption();
		 m1.setVisible(true);
	}
}