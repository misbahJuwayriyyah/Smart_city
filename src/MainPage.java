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
import java.awt.SystemColor;


public class MainPage extends JFrame {

	
	private static final long serialVersionUID = 6990144475014003772L;
	private static final int SCALE_DEFAULT = 0;
	private JPanel contentPane;
	private JTextArea txtrContactInfo;
	private JTextArea txtrContactInfo_1;
	private JTextArea txtrContactInfo_2;
	private JTextArea txtrContactInfo_3;
	private JTextArea txtrEmailUs;
	private JTextArea txtrContactInfo_4;
	private JTextArea txtrContactInfo_5;
	private JTextArea txtrContactInfo_6;

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextArea txtrWelcomeToThe;
	private JButton btnNewButton;
	private JButton btnStudentLogin;
	private JButton btnTouristLogin;
	private JLabel lblNewLabel_7;
	
	private JLabel lblNewLabel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainPage() {
		//setExtendedState(StudentPortalGUI.MAXIMIZED_BOTH);
				setTitle("Project Smart City");
				setBackground(new Color(0, 0, 0));
				setForeground(Color.WHITE);
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Desktop\\Project Images\\download (2).png"));
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setExtendedState(JFrame.MAXIMIZED_BOTH);
				setBounds(1, 1, 1370, 730);
				contentPane = new JPanel();
				contentPane.setForeground(Color.WHITE);
				contentPane.setBackground(Color.BLACK);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				txtrContactInfo = new JTextArea();
				txtrContactInfo.setText("Contact Info.");
				txtrContactInfo.setEditable(false);
				txtrContactInfo.setLineWrap(true);
				txtrContactInfo.setBackground(SystemColor.inactiveCaption);
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
				txtrEmailUs.setBackground(SystemColor.inactiveCaption);
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
				
				txtrWelcomeToThe = new JTextArea();
				txtrWelcomeToThe.setText("Welcome To The Project Smart City");
				txtrWelcomeToThe.setLineWrap(true);
				txtrWelcomeToThe.setForeground(Color.WHITE);
				txtrWelcomeToThe.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 45));
				txtrWelcomeToThe.setBackground(new Color(0, 0, 0));
				txtrWelcomeToThe.setBounds(371, 168, 624, 55);
				contentPane.add(txtrWelcomeToThe);
				
				
				
				lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\download (6).jpg").getImage().getScaledInstance(155,145,SCALE_DEFAULT)));
				
				lblNewLabel_1.setBounds(342, 374, 155, 145);
				contentPane.add(lblNewLabel_1);
				
				lblNewLabel_5 = new JLabel("New label");
				
				lblNewLabel_5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\download (4).jpg").getImage().getScaledInstance(155,145,SCALE_DEFAULT)));
				lblNewLabel_5.setBounds(602, 374, 155, 145);
				contentPane.add(lblNewLabel_5);
				
				lblNewLabel_6 = new JLabel("");
				
				
				lblNewLabel_6.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\download (5).png").getImage().getScaledInstance(155,145,SCALE_DEFAULT)));
				lblNewLabel_6.setBounds(873, 374, 153, 145);
				contentPane.add(lblNewLabel_6);
				
				btnNewButton = new JButton("Admin Login");
				btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
				btnNewButton.setForeground(new Color(0, 0, 0));
				btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.setBounds(344, 530, 153, 40);
				btnNewButton.addActionListener(e -> {showAdmin();});
				contentPane.add(btnNewButton);
				
				btnStudentLogin = new JButton("Student Login");
				btnStudentLogin.setForeground(new Color(0, 0, 0));
				btnStudentLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
				btnStudentLogin.setBackground(new Color(255, 255, 255));
				btnStudentLogin.setBounds(602, 530, 153, 40);
				btnStudentLogin.addActionListener(e -> {showStudent();});
				contentPane.add(btnStudentLogin);
				
				btnTouristLogin = new JButton("Tourist Login");
				btnTouristLogin.setForeground(new Color(0, 0, 0));
				btnTouristLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
				btnTouristLogin.setBackground(new Color(255, 255, 255));
				btnTouristLogin.setBounds(873, 530, 153, 40);
				btnTouristLogin.addActionListener(e -> {showTourist();});
				contentPane.add(btnTouristLogin);
				
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
				
				lblNewLabel_7 = new JLabel("");
				lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\city-dark-cityscape-night-wallpaper-preview.jpg"));
				lblNewLabel_7.setBounds(323, 100, 778, 205);
				contentPane.add(lblNewLabel_7);
				
				lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\Project Images\\neon-digital-art-simple-background-black-background-cityscape-hd-wallpaper-preview.jpg"));
				lblNewLabel.setBounds(326, 194, 885, 474);
				contentPane.add(lblNewLabel);
				
				
			}

			private void showTourist() {
				this.setVisible(false);
				Tourist T1 = new Tourist();
				T1.setVisible(true);
			}

			private void showStudent() {
				this.setVisible(false);
				StudentG S1 = new StudentG();
				S1.setVisible(true);
				
			}

			private void showAdmin() {
				this.setVisible(false);
				Admin A1 = new Admin();
				A1.setVisible(true);
			}	
		}
 