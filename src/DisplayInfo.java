import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import java.awt.Toolkit;
	import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
	import javax.swing.SwingConstants;
	import java.awt.Font;


	import javax.swing.JTextArea;

	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;

	import javax.swing.JOptionPane;



import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;



	public class DisplayInfo extends JFrame {
		

		/**
		 * 
		 */
		private static final long serialVersionUID = 5597121913719156148L;
		private JPanel contentPane;
		private JTextArea txtrContactInfo;
		private JTextArea txtrContactInfo_1;
		private JTextArea txtrContactInfo_2;
		private JTextArea txtrContactInfo_3;
		private JTextArea txtrEmailUs;
		private JTextArea txtrContactInfo_4;
		private JTextArea txtrContactInfo_5;
		private JTextArea txtrContactInfo_6;

		private JLabel lblNewLabel;
		
		private JPanel panel;
		private JTextField main;
		private JTable table;
		private JTextField txtName;
		private JTextField txtLocation;
		private JTextField txtRating;
		private JTextField txtContactNo;
		private JTextField txtPrice;
		private JTextField textField_1;
		private JPanel panel_1;
		private JPanel panel_2;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JPanel panel_3;
		private JTextField textField_6;
		private JTextField textField_7;
		private JTextField textField_8;
		private JTextField txtTiming;
		private JTextField txtPrice_1;
		private JPanel panel_4;
		private JTextField textField_9;
		private JTextField textField_10;
		private JTextField textField_11;
		private JTextField txtTiming_1;
		private JPanel panel_5;
		private JTextField textField_12;
		private JTextField textField_13;
		private JTextField textField_14;
		private JTextField txtPrice_2;
		private JTextField txtContactNo_1;
		private JPanel panel_6;
		private JTextField textField_15;
		private JTextField textField_16;
		private JTextField textField_17;
		private JTextField textField_18;
		private JTextField txtContactNo_2;
		private JPanel panel_7;
		private JTextField textField_19;
		private JTextField textField_20;
		private JTextField txtStatus;
		private JTextField txtLocation_1;
		private JTextField txtContactNo_3;
		private JPanel panel_8;
		private JTextField textField_21;
		private JTextField textField_22;
		private JTextField textField_24;
		private JPanel panel_9;
		private JTextField textField_23;
		private JTextField textField_25;
		private JTextField textField_26;
		private JTextField txtAmbience;
		private Component loginbtn;
		private JScrollPane scrollPane;
		private JTextArea txtrSelectARow;
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DisplayInfo frame = new DisplayInfo();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		public DisplayInfo() {
			setTitle("Student Portal Access");
			setBackground(new Color(0, 0, 0));
			setForeground(Color.WHITE);
			setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\201818.png"));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			setBounds(1, 1, 1370, 730);
			contentPane = new JPanel();
			contentPane.setForeground(new Color(0, 0, 0));
			contentPane.setBackground(Color.BLACK);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnNewButton = new JButton("Show Location");
			btnNewButton.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
			btnNewButton.setBackground(new Color(0, 0, 0));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBounds(69, 302, 158, 42);
			btnNewButton.addActionListener(e-> {getValue(table);});
			contentPane.add(btnNewButton);
			
			panel = new JPanel();
			panel.setBackground(new Color(204, 204, 255));
			panel.setBounds(400, 163, 817, 377);
			contentPane.add(panel);
			
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
			
			JButton btnBack = new JButton("Back");
			btnBack.setForeground(Color.WHITE);
			btnBack.setBackground(Color.BLACK);
			btnBack.setBounds(69, 237, 158, 42);
			btnBack.addActionListener(e-> {showLogin();});
			contentPane.add(btnBack);
			
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\book-spine-shelf-library.jpg"));
			lblNewLabel.setBounds(5, 205, 296, 178);
			contentPane.add(lblNewLabel);
			panel.setLayout(null);
			
			scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setBounds(0, 38, 817, 339);
			panel.add(scrollPane);
			
			table = new JTable();
			scrollPane.setViewportView(table);
			table.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			table.setSurrendersFocusOnKeystroke(true);
			table.setFillsViewportHeight(true);
			
			table.setCellSelectionEnabled(true);
			table.setColumnSelectionAllowed(true);
			table.setForeground(Color.BLACK);
			table.setBackground(new Color(204, 204, 255));
			
			
			table.setAutoResizeMode( JTable.AUTO_RESIZE_ALL_COLUMNS );
			
			
			main = new JTextField();
			main.setEditable(false);
			main.setHorizontalAlignment(SwingConstants.CENTER);
			main.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 25));
			main.setBackground(new Color(204, 204, 255));
			main.setForeground(new Color(0, 0, 0));
			main.setBounds(486, 67, 615, 42);
			contentPane.add(main);
			main.setColumns(10);
			
			panel_8 = new JPanel();
			panel_8.setLayout(null);
			panel_8.setBackground(new Color(204, 204, 255));
			panel_8.setBounds(0, 0, 817, 39);
			panel.add(panel_8);
			
			textField_21 = new JTextField();
			textField_21.setText("Serial No.");
			textField_21.setHorizontalAlignment(SwingConstants.CENTER);
			textField_21.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_21.setColumns(10);
			textField_21.setBackground(new Color(204, 204, 255));
			textField_21.setBounds(0, 0, 266, 39);
			panel_8.add(textField_21);
			
			txtrSelectARow = new JTextArea();
			txtrSelectARow.setBackground(Color.BLACK);
			txtrSelectARow.setForeground(Color.WHITE);
			txtrSelectARow.setLineWrap(true);
			txtrSelectARow.setFont(new Font("Bookman Old Style", Font.ITALIC, 17));
			txtrSelectARow.setText("Select a row and then click on show location to view online location.");
			txtrSelectARow.setBounds(5, 140, 296, 54);
			contentPane.add(txtrSelectARow);
			
			textField_22 = new JTextField();
			textField_22.setText("Name");
			textField_22.setHorizontalAlignment(SwingConstants.CENTER);
			textField_22.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_22.setColumns(10);
			textField_22.setBackground(new Color(204, 204, 255));
			textField_22.setBounds(266, 0, 266, 39);
			panel_8.add(textField_22);
			
			textField_24 = new JTextField();
			textField_24.setText("Location");
			textField_24.setHorizontalAlignment(SwingConstants.CENTER);
			textField_24.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_24.setColumns(10);
			textField_24.setBackground(new Color(204, 204, 255));
			textField_24.setBounds(532, 0, 266, 39);
			panel_8.add(textField_24);
			
			panel_9 = new JPanel();
			panel_9.setBackground(new Color(204, 204, 255));
			panel_9.setLayout(null);
			panel_9.setBounds(0, 0, 817, 39);
			panel.add(panel_9);
			
			textField_23 = new JTextField();
			textField_23.setText("Serial No.");
			textField_23.setHorizontalAlignment(SwingConstants.CENTER);
			textField_23.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_23.setColumns(10);
			textField_23.setBackground(new Color(204, 204, 255));
			textField_23.setBounds(0, 0, 200, 39);
			panel_9.add(textField_23);
			
			textField_25 = new JTextField();
			textField_25.setText("Name");
			textField_25.setHorizontalAlignment(SwingConstants.CENTER);
			textField_25.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_25.setColumns(10);
			textField_25.setBackground(new Color(204, 204, 255));
			textField_25.setBounds(200, 0, 200, 39);
			panel_9.add(textField_25);
			
			textField_26 = new JTextField();
			textField_26.setText("Location");
			textField_26.setHorizontalAlignment(SwingConstants.CENTER);
			textField_26.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_26.setColumns(10);
			textField_26.setBackground(new Color(204, 204, 255));
			textField_26.setBounds(400, 0, 200, 39);
			panel_9.add(textField_26);
			
			txtAmbience = new JTextField();
			txtAmbience.setText("Ambience");
			txtAmbience.setHorizontalAlignment(SwingConstants.CENTER);
			txtAmbience.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtAmbience.setColumns(10);
			txtAmbience.setBackground(new Color(204, 204, 255));
			txtAmbience.setBounds(600, 0, 200, 39);
			panel_9.add(txtAmbience);
			
			panel_7 = new JPanel();
			panel_7.setLayout(null);
			panel_7.setBackground(new Color(204, 204, 255));
			panel_7.setBounds(0, 0, 817, 39);
			panel.add(panel_7);
			
			textField_19 = new JTextField();
			textField_19.setText("Serial No.");
			textField_19.setHorizontalAlignment(SwingConstants.CENTER);
			textField_19.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_19.setColumns(10);
			textField_19.setBackground(new Color(204, 204, 255));
			textField_19.setBounds(0, 0, 160, 39);
			panel_7.add(textField_19);
			
			textField_20 = new JTextField();
			textField_20.setText("Name");
			textField_20.setHorizontalAlignment(SwingConstants.CENTER);
			textField_20.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_20.setColumns(10);
			textField_20.setBackground(new Color(204, 204, 255));
			textField_20.setBounds(160, 0, 160, 39);
			panel_7.add(textField_20);
			
			txtStatus = new JTextField();
			txtStatus.setText("Location");
			txtStatus.setHorizontalAlignment(SwingConstants.CENTER);
			txtStatus.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtStatus.setColumns(10);
			txtStatus.setBackground(new Color(204, 204, 255));
			txtStatus.setBounds(320, 0, 160, 39);
			panel_7.add(txtStatus);
			
			txtLocation_1 = new JTextField();
			txtLocation_1.setText("Status");
			txtLocation_1.setHorizontalAlignment(SwingConstants.CENTER);
			txtLocation_1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtLocation_1.setColumns(10);
			txtLocation_1.setBackground(new Color(204, 204, 255));
			txtLocation_1.setBounds(480, 0, 160, 39);
			panel_7.add(txtLocation_1);
			
			txtContactNo_3 = new JTextField();
			txtContactNo_3.setText("Contact No.");
			txtContactNo_3.setHorizontalAlignment(SwingConstants.CENTER);
			txtContactNo_3.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtContactNo_3.setColumns(10);
			txtContactNo_3.setBackground(new Color(204, 204, 255));
			txtContactNo_3.setBounds(640, 0, 160, 39);
			panel_7.add(txtContactNo_3);
			
			panel_6 = new JPanel();
			panel_6.setLayout(null);
			panel_6.setBackground(new Color(204, 204, 255));
			panel_6.setBounds(0, 0, 817, 39);
			panel.add(panel_6);
			
			textField_15 = new JTextField();
			textField_15.setText("Serial No.");
			textField_15.setHorizontalAlignment(SwingConstants.CENTER);
			textField_15.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_15.setColumns(10);
			textField_15.setBackground(new Color(204, 204, 255));
			textField_15.setBounds(0, 0, 160, 39);
			panel_6.add(textField_15);
			
			textField_16 = new JTextField();
			textField_16.setText("Name");
			textField_16.setHorizontalAlignment(SwingConstants.CENTER);
			textField_16.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_16.setColumns(10);
			textField_16.setBackground(new Color(204, 204, 255));
			textField_16.setBounds(160, 0, 160, 39);
			panel_6.add(textField_16);
			
			textField_17 = new JTextField();
			textField_17.setText("Location");
			textField_17.setHorizontalAlignment(SwingConstants.CENTER);
			textField_17.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_17.setColumns(10);
			textField_17.setBackground(new Color(204, 204, 255));
			textField_17.setBounds(320, 0, 160, 39);
			panel_6.add(textField_17);
			
			textField_18 = new JTextField();
			textField_18.setText("Timing");
			textField_18.setHorizontalAlignment(SwingConstants.CENTER);
			textField_18.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_18.setColumns(10);
			textField_18.setBackground(new Color(204, 204, 255));
			textField_18.setBounds(480, 0, 160, 39);
			panel_6.add(textField_18);
			
			txtContactNo_2 = new JTextField();
			txtContactNo_2.setText("Contact No.");
			txtContactNo_2.setHorizontalAlignment(SwingConstants.CENTER);
			txtContactNo_2.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtContactNo_2.setColumns(10);
			txtContactNo_2.setBackground(new Color(204, 204, 255));
			txtContactNo_2.setBounds(640, 0, 160, 39);
			panel_6.add(txtContactNo_2);
			
			panel_5 = new JPanel();
			panel_5.setLayout(null);
			panel_5.setBackground(new Color(204, 204, 255));
			panel_5.setBounds(0, 0, 817, 39);
			panel.add(panel_5);
			
			textField_12 = new JTextField();
			textField_12.setText("Serial No.");
			textField_12.setHorizontalAlignment(SwingConstants.CENTER);
			textField_12.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_12.setColumns(10);
			textField_12.setBackground(new Color(204, 204, 255));
			textField_12.setBounds(0, 0, 160, 39);
			panel_5.add(textField_12);
			
			textField_13 = new JTextField();
			textField_13.setText("Name");
			textField_13.setHorizontalAlignment(SwingConstants.CENTER);
			textField_13.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_13.setColumns(10);
			textField_13.setBackground(new Color(204, 204, 255));
			textField_13.setBounds(160, 0, 160, 39);
			panel_5.add(textField_13);
			
			textField_14 = new JTextField();
			textField_14.setText("Location");
			textField_14.setHorizontalAlignment(SwingConstants.CENTER);
			textField_14.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_14.setColumns(10);
			textField_14.setBackground(new Color(204, 204, 255));
			textField_14.setBounds(320, 0, 160, 39);
			panel_5.add(textField_14);
			
			txtPrice_2 = new JTextField();
			txtPrice_2.setText("Price");
			txtPrice_2.setHorizontalAlignment(SwingConstants.CENTER);
			txtPrice_2.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtPrice_2.setColumns(10);
			txtPrice_2.setBackground(new Color(204, 204, 255));
			txtPrice_2.setBounds(480, 0, 160, 39);
			panel_5.add(txtPrice_2);
			
			txtContactNo_1 = new JTextField();
			txtContactNo_1.setText("Contact No.");
			txtContactNo_1.setHorizontalAlignment(SwingConstants.CENTER);
			txtContactNo_1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtContactNo_1.setColumns(10);
			txtContactNo_1.setBackground(new Color(204, 204, 255));
			txtContactNo_1.setBounds(640, 0, 160, 39);
			panel_5.add(txtContactNo_1);
			
			panel_4 = new JPanel();
			panel_4.setLayout(null);
			panel_4.setBounds(0, 0, 817, 39);
			panel.add(panel_4);
			
			textField_9 = new JTextField();
			textField_9.setText("Serial No.");
			textField_9.setHorizontalAlignment(SwingConstants.CENTER);
			textField_9.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_9.setColumns(10);
			textField_9.setBackground(new Color(204, 204, 255));
			textField_9.setBounds(0, 0, 200, 39);
			panel_4.add(textField_9);
			
			textField_10 = new JTextField();
			textField_10.setText("Name");
			textField_10.setHorizontalAlignment(SwingConstants.CENTER);
			textField_10.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_10.setColumns(10);
			textField_10.setBackground(new Color(204, 204, 255));
			textField_10.setBounds(200, 0, 200, 39);
			panel_4.add(textField_10);
			
			textField_11 = new JTextField();
			textField_11.setText("Location");
			textField_11.setHorizontalAlignment(SwingConstants.CENTER);
			textField_11.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_11.setColumns(10);
			textField_11.setBackground(new Color(204, 204, 255));
			textField_11.setBounds(400, 0, 200, 39);
			panel_4.add(textField_11);
			
			txtTiming_1 = new JTextField();
			txtTiming_1.setText("Timing");
			txtTiming_1.setHorizontalAlignment(SwingConstants.CENTER);
			txtTiming_1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtTiming_1.setColumns(10);
			txtTiming_1.setBackground(new Color(204, 204, 255));
			txtTiming_1.setBounds(600, 0, 200, 39);
			panel_4.add(txtTiming_1);
			
			panel_3 = new JPanel();
			panel_3.setBackground(new Color(204, 204, 255));
			panel_3.setBounds(0, 0, 814, 39);
			panel.add(panel_3);
			panel_3.setLayout(null);
			
			textField_6 = new JTextField();
			textField_6.setText("Serial No.");
			textField_6.setHorizontalAlignment(SwingConstants.CENTER);
			textField_6.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_6.setColumns(10);
			textField_6.setBackground(new Color(204, 204, 255));
			textField_6.setBounds(0, 0, 200, 39);
			panel_3.add(textField_6);
			
			textField_7 = new JTextField();
			textField_7.setText("Name");
			textField_7.setHorizontalAlignment(SwingConstants.CENTER);
			textField_7.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_7.setColumns(10);
			textField_7.setBackground(new Color(204, 204, 255));
			textField_7.setBounds(200, 0, 200, 39);
			panel_3.add(textField_7);
			
			textField_8 = new JTextField();
			textField_8.setText("Location");
			textField_8.setHorizontalAlignment(SwingConstants.CENTER);
			textField_8.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_8.setColumns(10);
			textField_8.setBackground(new Color(204, 204, 255));
			textField_8.setBounds(400, 0, 200, 39);
			panel_3.add(textField_8);
			
			txtTiming = new JTextField();
			txtTiming.setText("Timing");
			txtTiming.setHorizontalAlignment(SwingConstants.CENTER);
			txtTiming.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtTiming.setColumns(10);
			txtTiming.setBackground(new Color(204, 204, 255));
			txtTiming.setBounds(600, 0, 200, 39);
			panel_3.add(txtTiming);
			
			txtPrice_1 = new JTextField();
			txtPrice_1.setText("Price");
			txtPrice_1.setHorizontalAlignment(SwingConstants.CENTER);
			txtPrice_1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtPrice_1.setColumns(10);
			txtPrice_1.setBackground(new Color(204, 204, 255));
			txtPrice_1.setBounds(600, 0, 200, 39);
			panel_3.add(txtPrice_1);
			
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBounds(0, 0, 817, 39);
			panel.add(panel_2);
			
			textField_2 = new JTextField();
			textField_2.setText("Serial No.");
			textField_2.setHorizontalAlignment(SwingConstants.CENTER);
			textField_2.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_2.setColumns(10);
			textField_2.setBackground(new Color(204, 204, 255));
			textField_2.setBounds(0, 0, 200, 39);
			panel_2.add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setText("Name");
			textField_3.setHorizontalAlignment(SwingConstants.CENTER);
			textField_3.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_3.setColumns(10);
			textField_3.setBackground(new Color(204, 204, 255));
			textField_3.setBounds(200, 0, 200, 39);
			panel_2.add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setText("Location");
			textField_4.setHorizontalAlignment(SwingConstants.CENTER);
			textField_4.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_4.setColumns(10);
			textField_4.setBackground(new Color(204, 204, 255));
			textField_4.setBounds(400, 0, 200, 39);
			panel_2.add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setText("Contact No.");
			textField_5.setHorizontalAlignment(SwingConstants.CENTER);
			textField_5.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_5.setColumns(10);
			textField_5.setBackground(new Color(204, 204, 255));
			textField_5.setBounds(600, 0, 200, 39);
			panel_2.add(textField_5);
			
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(204, 204, 255));
			panel_1.setBounds(0, 0, 817, 39);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			textField_1 = new JTextField();
			textField_1.setText("Serial No.");
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			textField_1.setColumns(10);
			textField_1.setBackground(new Color(204, 204, 255));
			textField_1.setBounds(0, 0, 133, 39);
			panel_1.add(textField_1);
			
			txtName = new JTextField();
			txtName.setHorizontalAlignment(SwingConstants.CENTER);
			txtName.setText("Name");
			txtName.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtName.setColumns(10);
			txtName.setBackground(new Color(204, 204, 255));
			txtName.setBounds(133, 0, 266, 39);
			panel_1.add(txtName);
			
			txtLocation = new JTextField();
			txtLocation.setHorizontalAlignment(SwingConstants.CENTER);
			txtLocation.setText("Location");
			txtLocation.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtLocation.setColumns(10);
			txtLocation.setBackground(new Color(204, 204, 255));
			txtLocation.setBounds(266, 0, 133, 39);
			panel_1.add(txtLocation);
			
			txtRating = new JTextField();
			txtRating.setHorizontalAlignment(SwingConstants.CENTER);
			txtRating.setText("Rating");
			txtRating.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtRating.setColumns(10);
			txtRating.setBackground(new Color(204, 204, 255));
			txtRating.setBounds(399, 0, 133, 39);
			panel_1.add(txtRating);
			
			txtContactNo = new JTextField();
			txtContactNo.setHorizontalAlignment(SwingConstants.CENTER);
			txtContactNo.setBounds(532, 0, 133, 39);
			panel_1.add(txtContactNo);
			txtContactNo.setText("Contact No.");
			txtContactNo.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtContactNo.setColumns(10);
			txtContactNo.setBackground(new Color(204, 204, 255));
			
			txtPrice = new JTextField();
			txtPrice.setText("Price");
			txtPrice.setHorizontalAlignment(SwingConstants.CENTER);
			txtPrice.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 18));
			txtPrice.setColumns(10);
			txtPrice.setBackground(new Color(204, 204, 255));
			txtPrice.setBounds(665, 0, 133, 39);
			panel_1.add(txtPrice);
			
			
		}
		
public void getValue(JTable table) {
			
			try {
				int selectedrow = table.getSelectedRow();
				String Name = table.getValueAt(selectedrow, 1).toString();
				String Location = table.getValueAt(selectedrow, 2).toString();
				
				
				
				if( ( "lslamabad International Airport".equals(Name)) && ("HR4M+GJ7 New Islamabad, Airport Road, Islamabad".equals(Location) ))	locationMaps.airport_map();
				else if(("Faysal Bank ATM".equals(Name)) && ( "HR4M+GJ7 New Islamabad, Airport Road, Islamabad".equals(Location) ))	locationMaps.faisalBank_map1();
				else if(("National Bank ATM".equals(Name)) && ( "NUST College of Electrical and Mechanical Engineering".equals(Location) ))	locationMaps.NBP_map1();
				else if(("United Bank Limited Branch ATM".equals(Name)) && ( "G9, 4 Street 55".equals(Location) ))	locationMaps.UBL_map();
				else if((  "Habib Bank Limited ATM".equals(Name)) && ( "C2, NUST, Concordia 2, H-12".equals(Location) ))	locationMaps.HBL_map1();
				else if((  "MCB ATM".equals(Name)) && ( "F-11 Markaz".equals(Location) ))	locationMaps.MCB_map1();
				else if((  "ABL ATM".equals(Name)) && ( " G-13/1 ".equals(Location) ))	locationMaps.ABL_map1();
				else if((  "MCB ATM".equals(Name)) && ( "11D Jinnah Ave, Block F G 7/3 Blue Area".equals(Location) ))	locationMaps.MCB_map2();		
				else if((  "United Bank Limited ATM".equals(Name)) && ( "Islamabad Arcade, G-11 Markaz".equals(Location) ))	locationMaps.UBL_map2();
				else if((  "Allied Bank ATM".equals(Name)) && ( " G-13/1\",\"Open 24 hours".equals(Location) ))	locationMaps.allied_map1();
				else if((  "ATM Of Faysal Bank".equals(Name)) && ( "Faysal Bank, 11D Jinnah Avnue, G 6/2 Blue Area".equals(Location) ))	locationMaps.faisal_map2();	
				else if((  "Meezan Bank ATM".equals(Name)) && ( " G-13 Markaz".equals(Location) ))	locationMaps.Meezan_map1();
				else if((  "Askari Bank ATM".equals(Name)) && ( " G-10 Markaz".equals(Location) ))	locationMaps.askari_map1();	
				else if((  "MCB ATM".equals(Name)) && ( "28 Jinnah Ave, Block A G 6/3 Blue Area".equals(Location) ))	locationMaps.MCB_map3();
				else if((  "Allied ATM".equals(Name)) && ( "G-9 Markaz".equals(Location) ))	locationMaps.allied_map2();		
				else if((  "NBP ATM".equals(Name)) && ( "Korang Road, I-10 Markaz".equals(Location) ))	locationMaps.NBP_map2();
				else if((  "Askari Bank ATM".equals(Name)) && ( " G-8 Markaz ".equals(Location) ))	locationMaps.askari_map2();		
				else if((  "The Centaurus Cineplex ".equals(Name)) && ( "Centaurus Mall".equals(Location) ))	locationMaps.cineplex_map1();
				else if((  "Raiha CineGold Plex".equals(Name)) && ( "Bahria Town, Phase 7".equals(Location) ))	locationMaps.raiha_map1();		
				else if((  "Cinepax World Trade Center".equals(Name)) && ( "Dha Phase II".equals(Location) ))	locationMaps.cinepax_map1();		
				else if((  "The Arena Islamabad ".equals(Name)) && ( "Bahria Town, Phase 4".equals(Location) ))	locationMaps.arena_map1();
				else if((  "Jacaranda Family Club (JFC) Cineplex".equals(Name)) && ( "Dha Phase II".equals(Location) ))	locationMaps.jacaranda_map1();
				else if((  "Shah Faisal Mosque".equals(Name)) && ( "Shah Faisal Avenue, E8 ".equals(Location) ))	locationMaps.faisalmosque_map1();		
				else if((  "Lok Virsa Museum".equals(Name)) && ( "Garden Ave & Shakarparian Rd".equals(Location) ))	locationMaps.lok_map1();		
				else if((  "Daman-e-Koh Park".equals(Name)) && ( "Daman-e-Koh Rd, E-7".equals(Location) ))	locationMaps.daman_map1();
				else if((  "Pakistan Monument".equals(Name)) && ( "Shakarparian Hills".equals(Location) ))	locationMaps.monument_map1();	
				else if((  "Giga Mall".equals(Name)) && ( "Main GT Road, Defense Housing Authority, DHA Phase II,".equals(Location) ))	locationMaps.giga_map1();
				else if((  "Islamabad Zoo	".equals(Name)) && ( " Pir Sohawa Rd, Saidpur".equals(Location) ))	locationMaps.zoo_map1();	
				else if((  "Fatima Jinnah Park".equals(Name)) && ( " F-9	".equals(Location) ))	locationMaps.fatima_map1();		
				else if((  "The Monal	".equals(Name)) && ( " 9KM Pir Sohawa Rd".equals(Location) ))	locationMaps.monal_map1();
				else if((  "Pakistan Museum of Natural History".equals(Name)) && ( "Shakarparian National Park, Garden Ave".equals(Location) ))	locationMaps.museum_map1();		
				else if((  "Shah Allah Ditta Caves".equals(Name)) && ( " Shah Allah Dita, Islamabad".equals(Location) ))	locationMaps.caves_map1();
				else if((  "Bruti".equals(Name)) && ( "behind Bari Imam Shrine".equals(Location) ))	locationMaps.bruti_map1();
				else if((  "Rawal Lake Bird Aviary".equals(Name)) && ( "Lake View Park".equals(Location) ))	locationMaps.lake_map1();		
				else if((  "Pakistan National Council of Arts".equals(Name)) && ( "F-5/1 F-5".equals(Location) ))	locationMaps.art_map1();
				else if((  "The Centaurus".equals(Name)) && ( " F8، 4 Jinnah Avenue".equals(Location) ))	locationMaps.centaurus_map1();		
				else if((  "Pak China Friendship Center".equals(Name)) && ( "Garden Ave & Shakarparian Rd".equals(Location) ))	locationMaps.china_map1();		
				else if((  "Rose and Jasmine Garden".equals(Name)) && ( "Kashmir Highway".equals(Location) ))	locationMaps.rose_map1();	
				else if((  "Golra Sharif Railway Museum".equals(Name)) && ( "Golra Railway Station, Golra Rd".equals(Location) ))	locationMaps.golra_map1();
				else if((  "Hiking Track 5 Dara Janglan".equals(Name)) && ( "Trail 5".equals(Location) ))	locationMaps.trail5_map1();		
				else if((  "Bahria Enclave Zoo".equals(Name)) && ( "Bahria Enclave".equals(Location) ))	locationMaps.bahriazoo_map1();		
				else if((  "Lal Masjid".equals(Name)) && ( "Masjid Rd, G-6/4 G 6/4 G-6".equals(Location) ))	locationMaps.lal_map1();		
				else if((  "Japanese Children Park".equals(Name)) && ( "Saidpur".equals(Location) ))	locationMaps.japan_map1();
				else if((  "Sir Syed Memorial Museum".equals(Name)) && ( "19 Ataturk Ave, G-5/1 G-5".equals(Location) ))	locationMaps.sirsyed_map1();
				else if((  "Pakistan Institute of Medical Sciences (PIMS)".equals(Name)) && ( "G8/3, Islamabad".equals(Location) ))	locationMaps.PIMS_map1();		
				else if((  "Federal Government Services Hospital".equals(Name)) && ( "PolyClinic, Service Road, G6/1".equals(Location) ))	locationMaps.federal_map1();		
				else if((  "Capital Hospital (CDA Hospital)".equals(Name)) && ( "Near Melody G6/3".equals(Location) ))	locationMaps.CDA_map1();
				else if((  "National Institute of Health".equals(Name)) && ( "Chak Shahzad".equals(Location) ))	locationMaps.NIH_map1();		
				else if((  "Nuclear Oncology and RadioTherapy Institute(NORI)".equals(Name)) && ( "G-8/3".equals(Location) ))	locationMaps.nori_map1();		
				else if((  "Nescom Hospital".equals(Name)) && ( "Sector H-1".equals(Location) ))	locationMaps.nescom_map1();	
				else if((  "KRL Hospital".equals(Name)) && ( "Sector G-9/1".equals(Location) ))	locationMaps.krl_map1();
				else if((  "Shifa International Hospital".equals(Name)) && ( "Patras Bukhari Road, H-8/4".equals(Location) ))	locationMaps.shifa_map1();		
				else if((  "Ali Medical Centre".equals(Name)) && ( "Kohistan Road".equals(Location) ))	locationMaps.ali_map1();		
				else if((  "Maroof International Hospital".equals(Name)) && ( "10th Ave, F-10 Markaz F-10/3 F-10".equals(Location) ))	locationMaps.marrof_map1();		
				else if((  "Kulsum International Hospital".equals(Name)) && ( "Kulsum Plaza, 2020 Blue Area".equals(Location) ))	locationMaps.kulsum_map1();
				else if((  "Integrated Health Services".equals(Name)) && ( "Plot 18, Chohan Plaza, G-8 Markaz".equals(Location) ))	locationMaps.ihs_map1();		
				else if((  "HS Children's Medical Centre".equals(Name)) && ( " Khumrial Centre, Street 22, G 8/4".equals(Location) ))	locationMaps.child_map1();
				else if((  "Medicsi".equals(Name)) && ( "First floor, Low Rise, Saudi Pak Towers, 61-A Jinnah Avenue, Blue Area، F 7/4".equals(Location) ))	locationMaps.medicsi_map1();	
				else if((  "Islamabad International Hospital & Research Center".equals(Name)) && ( "E-11/2, Main Double Road, D-12".equals(Location) ))	locationMaps.iih_map1();
				else if((  "Amanat Eye Hospital".equals(Name)) && ( "Private\",\"Auqaf Building, Street No 61/62, Islamabad، F 7/4 F-7".equals(Location) ))	locationMaps.amanat_map1();		
				else if((  "Maxhealth Hospital".equals(Name)) && ( "2-K Markaz Rd, G 8 Markaz, G-8 sector".equals(Location) ))	locationMaps.max_map1();
				else if((  "Family Health Hospital".equals(Name)) && ( "Street Number 30, I-10/4 I 10/4 I-10".equals(Location) ))	locationMaps.family_map1();
				else if((  "Medcity International hospital".equals(Name)) && ( "PMC Plaza, Ayub Market, near Islamabad Kacheri, F-8".equals(Location) ))	locationMaps.medcity_map1();		
				else if((  "The Diabetes Centre".equals(Name)) && ( "Phulgran Stop, Near Toll Plaza. Islamabad – Murree Expressway, Barakahu".equals(Location) ))	locationMaps.tdc_map1();
				else if((  "PAF hospital".equals(Name)) && ( "Main Margalla Rd, E-9/1 E-9".equals(Location) ))	locationMaps.paf_map1();		
				else if((  "PNS Hafeez".equals(Name)) && ( "Address: E 8/1, sector E-8".equals(Location) ))	locationMaps.pns_map1();		
				else if((  "PAEC general hospital".equals(Name)) && ( "H-11/4".equals(Location) ))	locationMaps.paec_map1();
				else if((  "Fatima Tuz Zahra Group of Hostels".equals(Name)) && ( "House no, 1461 street no 4, I-11/2 I 11/2 I-11".equals(Location) ))	locationMaps.fatimahostel_map1();	
				else if((  "Backpackers Hostel Islamabad".equals(Name)) && ( "KHudadad Heights، Main Margalla Rd, Golra E-11".equals(Location) ))	locationMaps.back_map1();
				else if((  "Islamabad Hostel".equals(Name)) && ( "House 421 Street 36, Sector I-8/2 I 8/2 I-8".equals(Location) ))	locationMaps.isb_map1();		
				else if((  "Originale Hostel".equals(Name)) && ( "M634+H68, Road, Phase I Frash Town".equals(Location) ))	locationMaps.org_map1();
				else if((  "Khyber Inn".equals(Name)) && ( "House 740 Street 64, G-9/4 G 9/4 G-9".equals(Location) ))	locationMaps.khyber_map1();		
				else if((  "Executive Palace Guest House".equals(Name)) && ( "F7 College Rd, F-7 Markaz F 7 Markaz F-7".equals(Location) ))	locationMaps.exe_map1();
				else if((  "MARGALLA Hills Residency Islamabad E-11/3".equals(Name)) && ( "House 170-A, Street 70, MPCHS E-11/3 MPCHS E 11/3 E-11".equals(Location) ))	locationMaps.margalla_map1();		
				else if((  "Three Star Boys Hostel".equals(Name)) && ( "Royal Avenue Lane, 10 Street No:3, Chatta Bakhtawar".equals(Location) ))	locationMaps.three_map1();		
				else if((  "Hotel Apartment for rent".equals(Name)) && ( "Phase 4, Civic Center Bahria Town Civic Center Bahria Town".equals(Location) ))	locationMaps.hotel_map1();
				else if((  "The Professional lodges".equals(Name)) && ( "JWCC+X25, Street 5, 7 & 9 G 16/4 G 16".equals(Location) ))	locationMaps.prof_map1();
				else if((  "islamabad Serena Hotel".equals(Name)) && ( "Khayaban-e-Suharwardy, G-5/1".equals(Location) ))	locationMaps.serena_map1();		
				else if((  "Reina Boutique Hotel".equals(Name)) && ( "G6/3\",\"PKR 8,740".equals(Location) ))	locationMaps.reina_map1();
				else if((  "Ramada by Wyndham Islamabad".equals(Name)) && ( "9 km from Shah Faisal Mosque".equals(Location) ))	locationMaps.ramada_map1();		
				else if((  "Hotel Crown Plaza Islamabad".equals(Name)) && ( "Jinnah Avenue, Blue Area".equals(Location) ))	locationMaps.crown_map1();
				else if((  "HOTEL AL-HABIB".equals(Name)) && ( "Whole Sale Market Markaz G-7".equals(Location) ))	locationMaps.habib_map1();	
				else if((  "Envoy Continental Hotel".equals(Name)) && ( "Fazal-Ul-Haq Road, Blue Area".equals(Location) ))	locationMaps.envoy_map1();
				else if((  "Roomy Signature Hotel, Islamabad".equals(Name)) && ( "F-6 Markaz".equals(Location) ))	locationMaps.roomy_map1();
				else if((  "Hotel Margala".equals(Name)) && ( "M-2 islamabad near convention centre".equals(Location) ))	locationMaps.hotelMargalla_map1();		
				else if((  "Islamabad Hotel".equals(Name)) && ( "Main Civic Centre, Municipal Rd, G-6 Markaz".equals(Location) ))	locationMaps.isbHotel_map1();
				else if((  "Marriott Hotel".equals(Name)) && ( " Agha Khan Rd, F-5/1 F-5".equals(Location) ))	locationMaps.marriott_map1();
				else if((  "Islamabad Public Library".equals(Name)) && ( "Plot#، 35 Service Rd E, H 9/4 H-9".equals(Location) ))	locationMaps.public_map1();
				else if((  "Islamabad Community Library".equals(Name)) && ( "Street 57, Sector I-10/1 I 10/1 I-10".equals(Location) ))	locationMaps.community_map1();
				else if((  "Aiwan-e-Quaid Library".equals(Name)) && ( "M2WG+J9P, F-9".equals(Location) ))	locationMaps.aiwan_map1();
				else if((  "Islamabad Community Library".equals(Name)) && ( "P35C+6W8, Khushal Khan Khattak Rd, G 7/3 G-7".equals(Location) ))	locationMaps.community_map2();
				else if((  "National Library of Pakistan".equals(Name)) && ( "P4G2+HMP, Constitution Ave, G-5".equals(Location) ))	locationMaps.national_map1();
				else if((  "CDA Public Library and Gym , F-11".equals(Name)) && ( "MXPP+5Q6, Colonel Sher Khan Rd, F-11 Markaz F 11 Markaz F-11".equals(Location) ))	locationMaps.cda_map1();
				else if((  "NUML Central Library".equals(Name)) && ( "M28X+VVV, H-9/4 H 9/4 H-9".equals(Location) ))	locationMaps.numl_map1();
				else if((  "Al Sadiq Library".equals(Name)) && ( "G-9/2 G 9/2 G-9".equals(Location) ))	locationMaps.sadiq_map1();
				else if((  "Dr. Muhammad Hamidullah Library (IRI Library)".equals(Name)) && ( "P2JQ+2JF, E-7".equals(Location) ))	locationMaps.iri_map1();
				else if((  "Model Police Station Ramna".equals(Name)) && ( "MX8W+MJJ, Shabbir Sharif Road, G-11 Markaz G 11 Markaz G-11".equals(Location) ))	locationMaps.model_map1();
				else if((  "Police Station Golra Sharif".equals(Name)) && ( "MXRC+H4P, Golra Rd, Golra E 11/1 E-11".equals(Location) ))	locationMaps.golra_map2();
				else if((  "Model Police Station Shalimar".equals(Name)) && ( "MXVX+GQ4, Street 8, F-10/2 F 10/3 F-10".equals(Location) ))	locationMaps.model_map2();
				else if((  "Police Station G-9 Markaz".equals(Name)) && ( "M2PM+MVR, G-9 Markaz G 9 Markaz G-9".equals(Location) ))	locationMaps.g9_map1();
				else if((  "Women Police Station".equals(Name)) && ( "P349+2W2, G-7 Markaz G 7 Markaz G-7".equals(Location) ))	locationMaps.women_map1();
				else if((  "Model Police Station Kohsar".equals(Name)) && ( "Jinnah Super Market، 13-K Bhittai Rd, F-7 Markaz F 7 Markaz F-7".equals(Location) ))	locationMaps.model_map3();
				else if((  "Islamabad Traffic Police Headquarters".equals(Name)) && ( "P24J+FQQ, Service Rd W, F 8/1 F-8".equals(Location) ))	locationMaps.traffic_map1();
				else if((  "Police Station Sabzi Mandi".equals(Name)) && ( "J2QG+36Q, Sabzi Mandi Rd, I-11/4 I 11/4 I-11".equals(Location) ))	locationMaps.sabzi_map1();
				else if((  "Police Station Shams Colony Islamabad".equals(Name)) && ( "JXHC+C4J, H-13".equals(Location) ))	locationMaps.shams_map1();
				else if((  "Tarnol Police Station".equals(Name)) && ( "JWW7+JQQ, Tarnol, F 15 Jammu Kashmir Housing Scheme".equals(Location) ))	locationMaps.tarnol_map1();
				else if((  "Rescue 15".equals(Name)) && ( "M3X5+VP9, Service Road East, G-8/4 G 8/4 G-8".equals(Location) ))	locationMaps.rescue_map1();
				else if((  "Margalla Police Station".equals(Name)) && ( "P25R+J2P, Kaghan Rd, F-8 Markaz F 8 Markaz F-8".equals(Location) ))	locationMaps.margalla_map2();
				else if((  "Monthly Police Vs Crime".equals(Name)) && ( "Babar Plaza, Office 1, Ground Floor, Plot G-1-A, Sohni Rd, I-10-1 Markaz, I-10, I 10 Markaz I-10".equals(Location) ))	locationMaps.monthly_map1();
				else if((  "Aabpara Police Station".equals(Name)) && ( "6 Municipal Rd, G-6 Markaz G 6 Markaz G-6".equals(Location) ))	locationMaps.aabpara_map1();
				else if((  "National Police Bureau".equals(Name)) && ( "Municipal Rd, near Lal Masjid، G-6/1 G 6/1 G-6".equals(Location) ))	locationMaps.NPB_map1();
				else if((  "Secretariat Police Station".equals(Name)) && ( "P4G4+WRX, Isfahani Rd, Diplomatic Enclave".equals(Location) ))	locationMaps.sect_map1();
				else if((  "Police Headquarters ICT Police Lines Islamabad".equals(Name)) && ( "M236+4FM, AK Brohi Rd, H-11/1 H 11/1 H-11".equals(Location) ))	locationMaps.ict_map1();
				else if((  "Chatta's".equals(Name)) && ( "Plaza 1 N Street 14 Tariq Market F-10/2".equals(Location) ))	locationMaps.chatha_map1();
				else if((  "Dilli Darwaza".equals(Name)) && ( "Plot no, 8 Street 33, F-8/1".equals(Location) ))	locationMaps.dilli_map1();
				else if((  "Khoka Khola".equals(Name)) && ( "Beverly Centre, Jinnah Ave, F 6/1 Blue Area".equals(Location) ))	locationMaps.khokha_map1();
				else if((  "Des Pardes".equals(Name)) && ( "Plaza 1 N, Street 14, Tariq Market، F-10/2".equals(Location) ))	locationMaps.des_map1();
				else if((  "Melody Food Park".equals(Name)) && ( "Street 5, G-6/3, Markaz G-6, Islamabad".equals(Location) ))	locationMaps.melody_map1();
				else if((  "Chikachino".equals(Name)) && ( "F-7 Markaz".equals(Location) ))	locationMaps.chikachino_map1();
				else if((  "Bismillah Tikka and Chargha".equals(Name)) && ( "Madina Market, Block 5, Street 21, F-8/2".equals(Location) ))	locationMaps.tikka_map1();
				else if((  "Kyber Dodai".equals(Name)) && ( "Super Market, School Rd, F-6 Markaz".equals(Location) ))	locationMaps.dodai_map1();
				else if((  "Tandoori".equals(Name)) && ( "Khursheed Market، Street 30, F-10/1".equals(Location) ))	locationMaps.tandoori_map1();
				else if((  "Hot n Chilli".equals(Name)) && ( "F-10 Markaz F 10/3".equals(Location) ))	locationMaps.hot_map1();
				else if((  "Qishmisch".equals(Name)) && ( "Bhittai Rd, F-7 Markaz".equals(Location) ))	locationMaps.qish_map1();
				else if((  "Usmania Restaurant".equals(Name)) && ( "West Jinnah Ave, Block D G 6/2 Blue Area".equals(Location) ))	locationMaps.usman_map1();
				else if((  "Salt' n Pepper".equals(Name)) && ( "Plot No. 55, Shabbir Plaza, Blue Area، G 6/2".equals(Location) ))	locationMaps.salt_map1();
				else if((  "Andaaz".equals(Name)) && ( "Saidpur Village, Saidpur Road, Islamabad".equals(Location) ))	locationMaps.andaz_map1();
				else if((  "Haleem Ghar".equals(Name)) && ( "Ginza Center, Ground Floor، Jinnah Ave, G 7/2 Blue Area".equals(Location) ))	locationMaps.Haleem_map1();
				else if((  "Bar BQ Tonight".equals(Name)) && ( "Sohrab Plaza, group floor, Block -32, Fazl-e-Haq Road, Embassy Rd, G 6/3 Blue Area".equals(Location) ))	locationMaps.bbq_map1();
				else if((  "The Monal".equals(Name)) && ( "Pir Sohawa Rd, Islamabad".equals(Location) ))	locationMaps.monal_map2();
				else if((  "Savour Foods".equals(Name)) && ( "Furtune Plaza, 72 E Jinnah Ave, G 7/2 Blue Area, Islamabad".equals(Location) ))	locationMaps.savour_map1();
				else if((  "Khiva Revolving Restaurant".equals(Name)) && ( "5th & 6th Floor, STS Mall Plaza, Civic Center, Phase 4 Bahria Town, Rawalpindi".equals(Location) ))	locationMaps.khiva_map1();
				else if((  " Charsi Tikka".equals(Name)) && ( "Saidpur Village, Saidpur Road, Islamabad".equals(Location) ))	locationMaps.charsi_map1();
				else if((  "Chilman".equals(Name)) && ( "Ramzan Plaza, Mangla Rd, G-9 Markaz".equals(Location) ))	locationMaps.chill_map1();
				else if((  "Tapas".equals(Name)) && ( "Jahangir Market، Shop No.1-3, Street 5, Mangla Rd, G-9/2".equals(Location) ))	locationMaps.tapas_map1();	
				else if((  " La Montana".equals(Name)) && ( "Margalla Hills, 9 KMs، Pir Sohawa Rd".equals(Location) ))	locationMaps.montana_map1();
				else if((  " Rewayat".equals(Name)) && ( "Al Hameed Mall, Shop no 16,17, G 11 Markaz".equals(Location) ))	locationMaps.rewayat_map1();
				else if((  "International Grammar School & College".equals(Name)) && ( "MXJW+V39, Street 58, F-11/4 F 11/4 F-11".equals(Location) ))	locationMaps.gram_map1();
				else if((  "The Smart School Capital Campus".equals(Name)) && ( "House # 1، Street 128, G-13/4 G 13/4 G-13".equals(Location) ))	locationMaps.smart_map1();
				else if((  "TQM Model School".equals(Name)) && ( "JXR8+5QG، سلیمان ٹاون H-13".equals(Location) ))	locationMaps.tqm_map1();
				else if((  "International School of Islamabad".equals(Name)) && ( " M26R+VG3، Johar Road، Khayaban-e-Johar, Sector H-9/1 H 9/1 H-9".equals(Location) ))	locationMaps.intSch_map1();
				else if((  "One World Schools".equals(Name)) && ( "Street 165, G-12".equals(Location) ))	locationMaps.one_map1();
				else if((  "SLS Montessori & School".equals(Name)) && ( "M294+3FP, Street 124, G-11/4 G 11/4 G-11".equals(Location) ))	locationMaps.sls_map1();
				else if((  "Islamabad Science School & College".equals(Name)) && ( "M237+WRF, H-11/4 H 11/4 H-11".equals(Location) ))	locationMaps.science_map1();
				else if((  "Allied Schools G-13 Isb. Campus".equals(Name)) && ( "JXW3+WR2, Service Rd W, G-13/2 G 13/2 G-13".equals(Location) ))	locationMaps.allied_map3();
				else if((  "Roots International Schools - Winchester campus".equals(Name)) && ( "Street 787, G-12".equals(Location) ))	locationMaps.roots_map1();
				else if((  "EMS High School".equals(Name)) && ( "33 Service Rd E, F-11/4 F 11/4 F-11".equals(Location) ))	locationMaps.ems_map1();
				else if((  "Super Nova School".equals(Name)) && ( "16 Nazim-ud-din Rd, F-8/1 F 8/1 F-8".equals(Location) ))	locationMaps.nova_map1();
				else if((  "Sehberg School System".equals(Name)) && ( "Sehberg School System".equals(Location) ))	locationMaps.sehberg_map1();
				else if((  "The Science School Islamabad".equals(Name)) && ( "PTCL NOC, 6 Street 6, Sector H-9/1 H 9/1 H-9".equals(Location) ))	locationMaps.sci_map1();
				else if((  "Foundation Public School".equals(Name)) && ( "10th Ave N, G 10/4 G-10".equals(Location) ))	locationMaps.foundation_map1();
				else if((  "Imperial International School & College".equals(Name)) && ( "316 Service Rd North (VR-30), F-10/3 F 10/3 F-10".equals(Location) ))	locationMaps.imperial_map1();
				else if((  "Bright Model School".equals(Name)) && ( "M332+FR5, Street 18, I-9/1 I 9/1 I-9".equals(Location) ))	locationMaps.bright_map1();
				else if((  "Schola Nova".equals(Name)) && ( "5 Street 8, F-8/3 F 8/3 F-8".equals(Location) ))	locationMaps.schola_map1();
				else if((  "AlHuda International School".equals(Name)) && ( "7 AK Brohi Rd, H-11/4 MPCHS H 11/4 H-11".equals(Location) ))	locationMaps.huda_map1();
				else if((  "Khaldunia High School".equals(Name)) && ( "Plot 2، s Street 94, G-11/3 G 11/3 G-11".equals(Location) ))	locationMaps.khal_map1();
				else if((  "Super Nova School".equals(Name)) && ( "16 Nazim-ud-din Rd, F-8/1 F 8/1 F-8".equals(Location) ))	locationMaps.nova_map2();
				else if((  "The Knowledge City School".equals(Name)) && ( "M2H7+8GG, G-10/2 G 10/2 G-10".equals(Location) ))	locationMaps.know_map1();
				else if((  "Royal International School".equals(Name)) && ( "MX8W+95X, Street 176, G-11/1 G 11/1 G-11".equals(Location) ))	locationMaps.royal_map1();
				else if((  "International Islamic University Islamabad Schools G-10 Campus".equals(Name)) && ( "43 Bela Rd, G-10/1 G 10/1 G-10".equals(Location) ))	locationMaps.iius_map1();
				else if((  "Oxbridge Islamic Grammar School".equals(Name)) && ( "House 6 &، 7 Major Rd, F-11/3 F 11/3 F-11".equals(Location) ))	locationMaps.ox_map1();
					else if((  "AlHuda International School".equals(Name)) && ( "7 AK Brohi Rd, H-11/4 MPCHS H 11/4 H-11".equals(Location) ))	locationMaps.huda_map2();
					else if((  "The Centaurus Mall".equals(Name)) && ( " F8، 4 Jinnah Avenue".equals(Location) ))	locationMaps.cent_map1();		
					else if((  "Safa Gold Mall".equals(Name)) && ( "College  road F-7 Markaz".equals(Location) ))	locationMaps.safa_map1();
					else if((  "Giga Mall".equals(Name)) && ( "Main GT Road, Defense Housing Authority, DHA Phase II".equals(Location) ))	locationMaps.giga_map2();		
					else if((  "Olympus Mall".equals(Name)) && ( "F-11".equals(Location) ))	locationMaps.oly_map1();
					else if((  "Al-Janat Mall".equals(Name)) && ( "G-9 Markaz".equals(Location) ))	locationMaps.janant_map1();		
					else if((  "Emporium Islamabad".equals(Name)) && ( "F10 Markaz".equals(Location) ))	locationMaps.emp_map1();
					else if((  "Amazon mall".equals(Name)) && ( "Nh 5, sector a dha phase 2".equals(Location) ))	locationMaps.amaz_map1();		
					else if((  "Katchery Metro Bus Station".equals(Name)) && ( "Jinnah Ave, G 8/2 G-8".equals(Location) ))	locationMaps.katchery_map1();
					else if((  "Chamman Metro Bus Station".equals(Name)) && ( "Chamman Metro Bus Station".equals(Location) ))	locationMaps.chamman_map1();		
					else if((  "Metro Station I-8/I-9".equals(Name)) && ( "I 8/2 I-8".equals(Location) ))	locationMaps.I8_map1();	
					else if((  "Kashmir Highway Station".equals(Name)) && ( "Kashmir Highway، 9th Avenue، Islamabad".equals(Location) ))	locationMaps.kashmir_map1();
					else if((  "Faiz Ahmed Faiz Metro Bus Station".equals(Name)) && ( "9th Ave, H 8/1 H-8".equals(Location) ))	locationMaps.faiz_map1();		
					else if((  "PIMS Metro Bus Station".equals(Name)) && ( "Jinnah Ave, G 8/3 G-8".equals(Location) ))	locationMaps.pim_map1();		
					else if((  "Khayaban-e-Johar Metro Bus Station".equals(Name)) && ( "H 8/1 H-8".equals(Location) ))	locationMaps.khyab_map1();		
					else if((  "7th Avenue Metro Bus Station".equals(Name)) && ( "F-8 Markaz G 7/3 F-8".equals(Location) ))	locationMaps.ave_map1();
					else if((  "Ibn-e-Sina".equals(Name)) && ( "9th Ave, G 9/3 G-9".equals(Location) ))	locationMaps.ibn_map1();		
					else if((  "Chaman Metro Station Bridge".equals(Name)) && ( "M2RV+57J, 9th Ave, G-8/2 G 8/1 G-8".equals(Location) ))	locationMaps.cham_map1();
					else if((  "G-12 Metro Station".equals(Name)) && ( "MX4V+H64, G-12".equals(Location) ))	locationMaps.g12_map1();	
					else if((  "Stock Exchange Metrobus Station".equals(Name)) && ( "109 Jinnah Ave, G 7/2 Blue Area".equals(Location) ))	locationMaps.stock_map1();
					else if((  "IJP Metro Bus Station".equals(Name)) && ( " I.J.P. Road, I 8/1 I-8".equals(Location) ))	locationMaps.ijp_map1();		
					else if((  "Shaheed-e-Millat Metro Bus Station".equals(Name)) && ( "Jinnah Ave, G 6/2 Blue Area".equals(Location) ))	locationMaps.shaheed_map1();
					else if((  "Parade Ground Metro Bus Station".equals(Name)) && ( "Jinnah Ave, G 6/3 Blue Area".equals(Location) ))	locationMaps.parade_map1();		
					else if((  "Metro Secretariat Station".equals(Name)) && ( "P3PR+2X2, Rawalpindi - Islamabad Metro Bus Service, F-5".equals(Location) ))	locationMaps.sect_map2();
					else if((  "Potohar Metro Bus Station".equals(Name)) && ( "9th Ave, I 8/1 I-8".equals(Location) ))	locationMaps.potohar_map1();
					else if((  "High Court Metrobus Station".equals(Name)) && ( "1 Service Road South, G-10/1 G-10".equals(Location) ))	locationMaps.high_map1();		
					else if((  "IIUI Metro Bus Station".equals(Name)) && ( "Mudasar Hanif, Sabri Road, Sector H8 H-10".equals(Location) ))	locationMaps.iiui_map1();
					else if((  "NUST/G-13 West Metro Bus Station".equals(Name)) && ( "JXXJ+RP6, Srinagar Hwy, H-12".equals(Location) ))	locationMaps.g13_map1();		
					else if((  "Faizabad Metro Station".equals(Name)) && ( "M36M+G4F, Faizabad Rawalpindi, Islamabad, Punjab".equals(Location) ))	locationMaps.faiza_map1();
					else if((  "H-9/G-9 Metrobus Station".equals(Name)) && ( "M2GM+WW6, H-9".equals(Location) ))	locationMaps.h9_map1();		
					else if((  "Metro Bus Depot".equals(Name)) && ( "M2HR+6RW, Peshawar Mor, Srinagar Hwy, H-9".equals(Location) ))	locationMaps.depot_map1();
					else if((  "Golra Metrobus Station".equals(Name)) && ( "1, G 13/1 G-13".equals(Location) ))	locationMaps.golra_map3();		
					else if((  "H-8 Metro Bus Stop".equals(Name)) && ( "Disaster Management & Logistic Center, H 8/2 H-8".equals(Location) ))	locationMaps.h8_map1();
					else if((  "N-5 Metrobus Station".equals(Name)) && ( "JXM2+XG2".equals(Location) ))	locationMaps.n5_map1();
					else if((  "Police Foundation Metro Station South Parking".equals(Name)) && ( "M264+RM, H-11".equals(Location) ))	locationMaps.police_map1();	
					else if((  "International Islamic University Islamabad (IIUI)".equals(Name)) && ( "H10".equals(Location) ))	locationMaps.iiu_map1();
					else if((  "COMSATS University Islamabad".equals(Name)) && ( "M524+PJP, Park Rd".equals(Location) ))	locationMaps.comsats_map1();		
					else if((  "Quaid-i-Azam University".equals(Name)) && ( "Islamabad Capital Territory 15320".equals(Location) ))	locationMaps.quaid_map1();
					else if((  "Air University".equals(Name)) && ( "Service Road E-9 / E-8".equals(Location) ))	locationMaps.air_map1();		
					else if((  "Bahria University".equals(Name)) && ( "Shangrilla Rd, E-8/1 E 8/1 E-8".equals(Location) ))	locationMaps.bu_map1();
					else if((  "National University Of Modern Languages".equals(Name)) && ( "4 Khayaban-e-Johar, H 9/4 H-9".equals(Location) ))	locationMaps.numl_map2();		
					else if((  "National University of Sciences & Technology (NUST)".equals(Name)) && ( "Scholars Ave, H-12".equals(Location) ))	locationMaps.nust_map1();
					else if((  "Pakistan Institute of Engineering & Applied Sciences (PIEAS)".equals(Name)) && ( "Lehtrar Rd, Nilore".equals(Location) ))	locationMaps.pieas_map1();
					else if((  "Riphah International University".equals(Name)) && ( "Peshawar Rd, near Hajj Complex،، I-14".equals(Location) ))	locationMaps.riphah_map1();	
					else if((  "FAST National University of Computer and Emerging Sciences, Islamabad Campus".equals(Name)) && ( "FAST University, 3 A.K. Brohi Road, H-11/4 H 11/4 H-11".equals(Location) ))	locationMaps.fast_map1();
					else if((  "Allama Iqbal Open University, Islamabad Pakistan".equals(Name)) && ( "2 Ashfaq Ahmed Rd, H-8/2 H 8/2 H-8".equals(Location) ))	locationMaps.allama_map1();		
					else if((  "Capital University of Science & Technology (CUST)".equals(Name)) && ( " Islamabad Expressway, Kahuta، Road Zone-V Sihala".equals(Location) ))	locationMaps.cust_map1();
					else if((  "Federal Urdu University of Arts, Sciences & Technology, Islamabad".equals(Name)) && ( "Kuri Model Village, Mozah Mohrian, 5B, near Bahria Enclave Road".equals(Location) ))	locationMaps.urdu_map1();		
					else if((  "Shifa Tameer-e-Millat University".equals(Name)) && ( "Shifa International Hospitals Ltd، Gate No. 1، 4 Pitras Bukhari Rd, H 8/4 H-8".equals(Location) ))	locationMaps.shifa_map2();
					else if((  "Reina Boutique Hotel".equals(Name)) && ( "G6/3".equals(Location) ))	locationMaps.reina_map1();		
			}
			catch(ArrayIndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(loginbtn, "No Rows are Selected");
			}
			}
		
		public void hide() {
			panel_1.setVisible(false);
			panel_2.setVisible(false);
			panel_3.setVisible(false);
			panel_4.setVisible(false);
			panel_5.setVisible(false);
			panel_6.setVisible(false);
			panel_7.setVisible(false);
			panel_8.setVisible(false);
			panel_9.setVisible(false);
		}
		
		public void setMain(String information) {
			if (information == "Airport")
			{this.main.setText(" Airports in Islamabad ");
			hide();
			panel_8.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Location"},
					},
					new String[] {
						"New column", "New column", "New column"
					}
				));
			DB.display_airport(table);}
			else if (information == "Universities")
			{this.main.setText(" Universities in Islamabad ");
			hide();
			this.panel_2.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Location","Contact Number"},
					},
					new String[] {
						"New column", "New column", "New column","New column"
					}
				));
			
			DB.display_universities(table);
			}
			else if (information == "School")
			{this.main.setText(" School and Colleges in Islamabad ");
			hide();
			panel_2.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Location","Contact Number"},
					},
					new String[] {
						"New column", "New column", "New column","New column"
					}
				));
			DB.display_schools(table);
			}
			

			else if (information == "Hostels")
			{this.main.setText(" Hostels in Islamabad ");
			hide();
			panel_2.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Location","Contact Number"},
					},
					new String[] {
						"New column", "New column", "New column","New column"
					}
				));
			DB.display_hostels(table);
			}
			else if (information == "Restaurant")
			{this.main.setText(" Resturants in Islamabad ");
			hide();
			panel_9.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Location","Ambience"},
					},
					new String[] {
						"New column", "New column", "New column","New column"
					}
				));
			DB.display_restaurants(table);
			}
			else if (information == "Hospitals")
			{this.main.setText(" Hospitals in Islamabad ");
			hide();
			panel_7.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Sector","Location","Contact Number"},
					},
					new String[] {
						"New column", "New column", "New column","New column","New column"
					}
				));
			DB.display_hospitals(table);
			}
			else if (information == "Library")
			{this.main.setText(" Libraries in Islamabad ");
			hide();
			panel_2.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Sector","Contact Number"},
					},
					new String[] {
						"New column", "New column", "New column","New column"
					}
				));
			DB.display_library(table);
			}
			else if (information == "ATM")
			{this.main.setText(" ATMs  in Islamabad ");
			hide();
			panel_4.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Location","Timing"},
					},
					new String[] {
						"New column", "New column", "New column","New column"
					}
				));
			DB.display_atm(table);
			}
			if (information == "Hotel")
			{this.main.setText(" Hotels in Islamabad ");
			hide();
			panel_1.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Location","Price","Rating","Contact Number"},
					},
					new String[] {
						"New column", "New column", "New column","New column","New column","New column"
					}
				));
			DB.display_hotels(table);
			}
			else if (information == "Spots")
			{this.main.setText(" Famous Spots in Islamabad ");
			hide();
			panel_3.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Location","Timing","Entry Price"},
					},
					new String[] {
						"New column", "New column", "New column","New column","New column"
					}
				));
			DB.display_spots(table);
			}
			else if (information == "Police Stations")
			{this.main.setText(" Police Stations in Islamabad ");
			hide();
			panel_2.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Location","Contact Number"},
					},
					new String[] {
						"New column", "New column", "New column","New column"
					}
				));
			DB.display_police(table);
			}
			else if (information == "Transport")
			{this.main.setText(" Transport Facilities in Islamabad ");
			hide();
			panel_8.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Station"},
					},
					new String[] {
						"New column", "New column", "New column"
					}
				));
			DB.display_transport(table);
			}
			else if (information == "Shopping")
			{this.main.setText(" Shopping Malls in Islamabad ");
			hide();
			panel_6.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Timing","Location","Contact #"},
					},
					new String[] {
						"New column", "New column", "New column","New column","New column"
					}
				));
			DB.display_malls(table);
			}
			
			else if (information == "Cinema")
			{this.main.setText(" Cinemas in Islamabad ");
			hide();
			panel_5.setVisible(true);
			table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Serial No.", "Name", "Location","Ticket Price","Contact #"},
					},
					new String[] {
						"New column", "New column", "New column","New column","New column"
					}
				));
			DB.display_Cinemas(table);
			}
			
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
		private void showLogin() {
			this.setVisible(false);
			StudentLogin D1 = new StudentLogin();
			D1.setVisible(true);		
			
		}	
}