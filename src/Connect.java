
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Connect {
	static Connection con;
	public static Connection createC() {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			String url="jdbc:mysql://localhost:3306/smartStorage";
			String name="root";
			String password="misbah.bese21seecs";
			con=DriverManager.getConnection(url, name, password);
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return con;
	}

}
