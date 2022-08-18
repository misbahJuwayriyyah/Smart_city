

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;





public class DB {
	/////////////////////////////////admin//////////////////////////////////////////////////
	//admin login
	public static ResultSet admin(ID admin) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from admin where USERNAME = ? and PASSWORDS = ?");
        pst.setString(1, admin.getUsername());
        pst.setString(2, admin.getPasswords());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	
	//update tables
	//check info
	//airport
	public static ResultSet check_airport(SmartCity airport) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from airport where AIRPORT = ? and LOCATION = ?");
        pst.setString(1, airport.getName());
        pst.setString(2, airport.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//atm
	public static ResultSet check_atm(SmartCity atm) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from atm where ATMS = ? and LOCATION = ?");
        pst.setString(1, atm.getName());
        pst.setString(2, atm.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	
        	
        }
		return rs;
	}
	//cinemas
	public static ResultSet check_cinema(SmartCity cinema) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from cinemas where CINEMAS = ? and LOCATION = ?");
        pst.setString(1, cinema.getName());
        pst.setString(2, cinema.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//famous spots
	public static ResultSet check_spots(SmartCity spots) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from famous_spots where FAMOUS_SPOTS = ? and LOCATION = ?");
        pst.setString(1, spots.getName());
        pst.setString(2, spots.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//hospitals
	public static ResultSet check_hospitals(SmartCity hospital) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from hospitals where HOSPITALS = ? and LOCATION = ?");
        pst.setString(1, hospital.getName());
        pst.setString(2, hospital.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//hostels
	public static ResultSet check_hostels(SmartCity hostels) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from hostels where HOSTELS = ? and LOCATION = ?");
        pst.setString(1, hostels.getName());
        pst.setString(2, hostels.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//hotels
	public static ResultSet check_hotels(SmartCity hotel) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from hotels where HOTELS = ? and LOCATION = ?");
        pst.setString(1, hotel.getName());
        pst.setString(2, hotel.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//library
	public static ResultSet check_library(SmartCity library) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from libraries where LIBRARIES = ? and LOCATION = ?");
        pst.setString(1, library.getName());
        pst.setString(2, library.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//police stations
	public static ResultSet check_police(SmartCity police) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from police where POLICE_STATIONS = ? and LOCATION = ?");
        pst.setString(1, police.getName());
        pst.setString(2, police.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//restaurants
	public static ResultSet check_restaurants(SmartCity rest) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from restaurants where RESTAURANTS = ? and LOCATION = ?");
        pst.setString(1, rest.getName());
        pst.setString(2, rest.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//schools
	public static ResultSet check_schools(SmartCity school) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from schools where SCHOOLS_AND_COLLEGES = ? and LOCATION = ?");
        pst.setString(1, school.getName());
        pst.setString(2, school.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//shopping malls
	public static ResultSet check_malls(SmartCity mall) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from shopping_malls where SHOPPING_MALLS = ? and LOCATION = ?");
        pst.setString(1, mall.getName());
        pst.setString(2, mall.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//transport
	public static ResultSet check_transport(SmartCity trans) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from transport where BUSES = ? and STATIONS = ?");
        pst.setString(1, trans.getName());
        pst.setString(2, trans.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//universities
	public static ResultSet check_university(SmartCity uni) {
		ResultSet rs = null;
		try {
		Connection con=Connect.createC();
		PreparedStatement pst = con.prepareStatement("select * from universities where UNIVERSITIES = ? and LOCATION = ?");
        pst.setString(1, uni.getName());
        pst.setString(2, uni.getLocation());
        rs = pst.executeQuery();
        }catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Something went wrong");
        	
        }
		return rs;
	}
	//add info
	//airport
	public static boolean addAirport(Airport airport) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into airport(AIRPORT,LOCATION,CONTACT) values (?,?,?)");
			pst.setString(1, airport.getName());
			pst.setString(2, airport.getLocation());
			pst.setString(3, airport.getContact());
			pst.executeUpdate(); valid=true;
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
			
		}
		return valid;	
	}
	//atm
	public static boolean addAtm(Atm atm) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into atm(ATMS,LOCATION,TIMINGS) values (?,?,?)");
			pst.setString(1, atm.getName());
			pst.setString(2, atm.getLocation());
			pst.setString(3, atm.getTiming());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
			
		}
		return valid;	
	}
	//Cinemas
	public static boolean addCinemas(Cinemas cinema) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into cinemas(CINEMAS,LOCATION,TICKET_PRICE,BOOKING_INFO) values (?,?,?,?)");
			pst.setString(1, cinema.getName());
			pst.setString(2, cinema.getLocation());
			pst.setString(3, cinema.getTicketPrice());
			pst.setString(4, cinema.getBookingInfo());
			pst.executeUpdate();
			valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
			
		}
		return valid;	
	}
	//famous spots
	public static boolean addSpot(FamousSpots spots) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into famous_spots(FAMOUS_SPOTS,LOCATION,TIMING,PRICE_FOR_ENTRY) values (?,?,?,?)");
			pst.setString(1, spots.getName());
			pst.setString(2, spots.getLocation());
			pst.setString(3, spots.getTiming());
			pst.setString(4, spots.getPriceForEntry());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
			
		}
		return valid;	
	}
	//Hospitals
	public static boolean addHospitals(Hospitals hospital) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into hospitals(HOSPITALS,SECTOR,LOCATION,CONTACT) values (?,?,?,?)");
			pst.setString(1, hospital.getName());
			pst.setString(2, hospital.getSector());
			pst.setString(3, hospital.getLocation());
			pst.setString(4, hospital.getContact());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//Hostels
	public static boolean addHostels(Hostels hostel) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into hostels(HOSTELS,LOCATION,CONTACT) values (?,?,?)");
			pst.setString(1, hostel.getName());
			pst.setString(2, hostel.getLocation());
			pst.setString(3, hostel.getContact());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//Hotel
	public static boolean addHotels(Hotels hotel) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into hotels(HOTELS,LOCATION,PRICE,RATING,CONTACT) values (?,?,?,?,?)");
			pst.setString(1, hotel.getName());
			pst.setString(2, hotel.getLocation());
			pst.setString(3, hotel.getPrice());
			pst.setString(4, hotel.getRatings());
			pst.setString(5, hotel.getContact());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//libraries
	public static boolean addLibraries(Libraries library) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into libraries(LIBRARIES,LOCATION,CONTACT) values (?,?,?)");
			pst.setString(1, library.getName());
			pst.setString(2, library.getLocation());
			pst.setString(3, library.getContact());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//police stations
	public static boolean addPolice(Police police) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into police(POLICE_STATIONS,LOCATION,CONTACT) values (?,?,?)");
			pst.setString(1, police.getName());
			pst.setString(2, police.getLocation());
			pst.setString(3, police.getContact());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//Restaurants
	public static boolean addRestaurant(Restaurants restaurant) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into restaurants(RESTAURANTS,LOCATION,AMBIANCE) values (?,?,?)");
			pst.setString(1, restaurant.getName());
			pst.setString(2, restaurant.getLocation());
			pst.setString(3, restaurant.getAmbiance());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//schools
	public static boolean addSchool(Schools school) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into schools(SCHOOLS_AND_COLLEGES,LOCATION,CONTACT) values (?,?,?)");
			pst.setString(1, school.getName());
			pst.setString(2, school.getLocation());
			pst.setString(3, school.getContact());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//shopping malls
	public static boolean addMall(ShoppingMalls mall) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into shopping_malls(SHOPPING_MALLS,LOCATION,TIMING,CONTACT) values (?,?,?,?)");
			pst.setString(1, mall.getName());
			pst.setString(2, mall.getLocation());
			pst.setString(3, mall.getTiming());
			pst.setString(4, mall.getContact());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//universities
	public static boolean addUniversities(Universities uni) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into universities(UNIVERSITIES,LOCATION,CONTACT) values (?,?,?)");
			pst.setString(1, uni.getName());
			pst.setString(2, uni.getLocation());
			pst.setString(3, uni.getContact());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//transport
	public static boolean addTransport(Transport transport) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("insert into transport(BUSES, STATIONS) values (?,?)");
			pst.setString(1, transport.getName());
			pst.setString(2, transport.getLocation());
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//delete info
	//airport
	public static boolean dltairport(String airport,String Location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from airport where AIRPORT = ? AND LOCATION = ?");
			pst.setString(1, airport);
			pst.setString(2, Location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//atm
	public static boolean dltatm(String atm, String Location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from atm where ATMS = ? AND LOCATION = ?");
			pst.setString(1, atm);
			pst.setString(2, Location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//cinemas
	public static boolean dltCinema(String cinema, String Location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from cinemas where CINEMAS = ? AND LOCATION = ?");
			pst.setString(1, cinema);
			pst.setString(2, Location);
			pst.executeUpdate(); 
			valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//famous spots
	public static boolean dltSpot(String spot) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from famous_spots where FAMOUS_SPOTS = ? ");
			pst.setString(1, spot);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//hospitals
	public static boolean dltHospital(String hospital, String location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from hospitals where HOSPITALS = ? AND LOCATION =? ");
			pst.setString(1, hospital);
			pst.setString(2, location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//hostels
	public static boolean dltHostels(String hostel, String location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from hostels where HOSTELS = ? AND LOCATION =? ");
			pst.setString(1, hostel);
			pst.setString(2, location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//hotels
	public static boolean dltHotels(String hotel, String location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from hotels where HOTELS = ? AND LOCATION =? ");
			pst.setString(1, hotel);
			pst.setString(2, location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//libraries
	public static boolean dltLibraries(String library, String location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from libraries where LIBRARIES = ? AND LOCATION =? ");
			pst.setString(1, library);
			pst.setString(2, location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//police stations
	public static boolean dltPolice(String police, String location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from police where POLICE_STATIONS = ? AND LOCATION =? ");
			pst.setString(1, police);
			pst.setString(2, location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//restaurants
	public static boolean dltRest(String restaurant, String location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from restaurants where RESTAURANTS = ? AND LOCATION =? ");
			pst.setString(1, restaurant);
			pst.setString(2, location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//schools
	public static boolean dltSchools(String school, String location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from schools where SCHOOLS_AND_COLLEGES = ? AND LOCATION =? ");
			pst.setString(1, school);
			pst.setString(2, location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//shopping malls
	public static boolean dltMalls(String mall, String location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from shopping_malls where SHOPPING_MALLS = ? AND LOCATION =? ");
			pst.setString(1, mall);
			pst.setString(2, location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//transport
	public static boolean dltTransport(String transport, String station) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from transport where BUSES = ? AND STATIONS =? ");
			pst.setString(1, transport);
			pst.setString(2, station);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}
	//universities
	public static boolean dltUniversities(String uni, String location) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from universities where UNIVERSITIES = ? AND LOCATION =? ");
			pst.setString(1, uni);
			pst.setString(2, location);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
		return valid;	
	}

	//Display tables
	//airport
	public static void display_airport(JTable table) {
		Connection con=Connect.createC();
		String q="select * from airport";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//Atm
	public static void display_atm(JTable table) {
		Connection con=Connect.createC();
		String q="select * from atm";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//Cinemas
	public static void display_Cinemas(JTable table) {
		Connection con=Connect.createC();
		String q="select * from cinemas";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//FamousSpots
	public static void display_spots(JTable table) {
		Connection con=Connect.createC();
		String q="select * from famous_spots";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//hospitals
	public static void display_hospitals(JTable table) {
		Connection con=Connect.createC();
		String q="select * from hospitals";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(3),rs.getString(5)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//hostels
	public static void display_hostels(JTable table) {
		Connection con=Connect.createC();
		String q="select * from hostels";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//hotels
	public static void display_hotels(JTable table) {
		Connection con=Connect.createC();
		String q="select * from hotels";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//libraries
	public static void display_library(JTable table) {
		Connection con=Connect.createC();
		String q="select * from libraries";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//police stations
	public static void display_police(JTable table) {
		Connection con=Connect.createC();
		String q="select * from police";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//restaurants
	public static void display_restaurants(JTable table) {
		Connection con=Connect.createC();
		String q="select * from restaurants";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//schools
	public static void display_schools(JTable table) {
		Connection con=Connect.createC();
		String q="select * from schools";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//shopping malls
	public static void display_malls(JTable table) {
		Connection con=Connect.createC();
		String q="select * from shopping_malls";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//transport
	public static void display_transport(JTable table) {
		Connection con=Connect.createC();
		String q="select * from transport";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//universities
	public static void display_universities(JTable table) {
		Connection con=Connect.createC();
		String q="select * from universities";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//nice :)
	///Records
	//students sign up and delete
	public static void display_students_signup(JTable table) {
		Connection con=Connect.createC();
		String q="SELECT MAX(N) FROM student";
		String sql="SELECT MAX(Q) FROM records_stu";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			PreparedStatement s=con.prepareStatement(sql);
			ResultSet rt=s.executeQuery();
			
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next() && rt.next()) {
				model.addRow(new String[] {String.valueOf(rs.getInt(1)),String.valueOf(rt.getInt(1))});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//with username
	public static void display_students_use(JTable table) {
		Connection con=Connect.createC();
		String q="SELECT * FROM student";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(4)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	public static void display_students_dlt(JTable table) {
		Connection con=Connect.createC();
		String q="SELECT * FROM records_stu";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
		}
	}
	//tourist sign up and delete
	public static void display_tourist_signup(JTable table) {
		Connection con=Connect.createC();
		String q="SELECT MAX(O) FROM tourist";
		String sql="SELECT MAX(R) FROM records_tour";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			PreparedStatement s=con.prepareStatement(sql);
			ResultSet rt=s.executeQuery();
			
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next() && rt.next()) {
				model.addRow(new String[] {String.valueOf(rs.getInt(1)),String.valueOf(rt.getInt(1))});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
			
		}
	}
	//with username
	public static void display_tourist_use(JTable table) {
		Connection con=Connect.createC();
		String q="SELECT * FROM tourist";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(4)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
			
		}
	}
	public static void display_tourist_dlt(JTable table) {
		Connection con=Connect.createC();
		String q="SELECT * FROM records_tour";
		try 
		{
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new String[] {rs.getString(1),rs.getString(2)});
			}
		}catch(Exception t) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
			
		}
	}
	//delete account
	public static boolean dltAdmin(String username, String password) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("delete from admin where USERNAME = ? AND PASSWORDS =? ");
			pst.setString(1, username);
			pst.setString(2, password);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
			
		}
		return valid;	
	}
	//change password
	public static boolean admin_password(String old_password, String new_password,String username) {
		boolean valid=false;
		try {
			Connection con=Connect.createC();
			PreparedStatement pst=con.prepareStatement("update admin set PASSWORDS=REPLACE(PASSWORDS,?,?) WHERE USERNAME=?");
			pst.setString(1, old_password);
			pst.setString(2, new_password);
			pst.setString(3, username);
			pst.executeUpdate(); valid=true;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Something went wrong");
			
		}
		return valid;	
	}
	////////////////////////////////////////Student/////////////////////////////////////////////////
	//student login
		public static ResultSet student_login(Stu student) {
			ResultSet rs = null;
			try {
			Connection con=Connect.createC();
			PreparedStatement pst = con.prepareStatement("select * from student where USERNAME = ? and PASSWORDS = ?");
	        pst.setString(1, student.getUsername());
	        pst.setString(2, student.getPasswords());
	        rs = pst.executeQuery();
	        }catch(Exception e) {
	        	JOptionPane.showMessageDialog(null,"Something went wrong");
	        	
	        }
			return rs;
		}
		//check_student
		public static ResultSet student_check(String username) {
			ResultSet rs = null;
			try {
			Connection con=Connect.createC();
			PreparedStatement pst = con.prepareStatement("select * from student where USERNAME = ?");
	        pst.setString(1, username);
	        rs = pst.executeQuery();
	        }catch(Exception e) {
	        	JOptionPane.showMessageDialog(null,"Something went wrong");
	        	
	        }
			return rs;
		}
		
		//student sign-up
		public static boolean student_signup(Stu student) {
			boolean valid=false;
			try {
			Connection con=Connect.createC();
			PreparedStatement pst = con.prepareStatement("insert into student(FIRST_NAME,LAST_NAME,USERNAME,PASSWORDS,PHONE) values (?,?,?,?,?)");
			pst.setString(1,student.getFirstName());
			pst.setString(2,student.getLastName());
			pst.setString(3,student.getUsername());
			pst.setString(4,student.getPasswords());
			pst.setString(5,student.getPhone());
	        pst.executeUpdate(); valid=true;
	        valid=true;
	        }catch(Exception e) {
	        	JOptionPane.showMessageDialog(null,"Something went wrong");
	        	
	        }
			return valid;
		}
		//deleting student
		public static boolean dltStudent(String username,String password) {
			boolean valid=false;
			try {
				Connection con=Connect.createC();
				PreparedStatement pst=con.prepareStatement("delete from student where USERNAME = ? AND PASSWORDS = ?");
				pst.setString(1, username);
				pst.setString(2, password);
				pst.executeUpdate(); valid=true;
				PreparedStatement s=con.prepareStatement("insert into records_stu(username) values (?)");
				s.setString(1,username);
				s.executeUpdate(); valid=true;
				valid=true;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Something went wrong");
				
			}
			return valid;	
		}
		
		//display tables are done
		//change student password -checks first using login
		public static boolean stu_password(String old_password, String new_password,String username) {
			boolean valid=false;
			try {
				Connection con=Connect.createC();
				PreparedStatement pst=con.prepareStatement("update student set PASSWORDS=REPLACE(PASSWORDS,?,?) WHERE USERNAME=?");
				pst.setString(1, old_password);
				pst.setString(2, new_password);
				pst.setString(3, username);
				pst.executeUpdate(); valid=true;
				valid=true;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Something went wrong");
				
			}
			return valid;	
		}
		//change student phone -checks login first
		public static boolean stu_phone(String old_phone, String new_phone,String username) {
			boolean valid=false;
			try {
				Connection con=Connect.createC();
				PreparedStatement pst=con.prepareStatement("update student set PHONE=REPLACE(PHONE,?,?) WHERE USERNAME=?");
				pst.setString(1, old_phone);
				pst.setString(2, new_phone);
				pst.setString(3, username);
				pst.executeUpdate(); valid=true;
				valid=true;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Something went wrong");
				
			}
			return valid;	
		}
		//check phone
		public static ResultSet check_phone(String username,String number) {
			ResultSet rs = null;
			try {
			Connection con=Connect.createC();
			PreparedStatement pst = con.prepareStatement("select * from student where USERNAME = ? and PHONE = ?");
	        pst.setString(1, username);
	        pst.setString(2, number);
	        rs = pst.executeQuery();
	        }catch(Exception e) {
	        	JOptionPane.showMessageDialog(null,"Something went wrong");
	        	
	        }
			return rs;
		}
		/////////////////////////////////////tourist//////////////////////////////////////////////
		//tourist login
		public static ResultSet tourist_login(Tour tourist) {
			ResultSet rs = null;
			try {
			Connection con=Connect.createC();
			PreparedStatement pst = con.prepareStatement("select * from tourist where USERNAME = ? and PASSWORDS = ?");
	        pst.setString(1, tourist.getUsername());
	        pst.setString(2, tourist.getPasswords());
	        rs = pst.executeQuery();
	        }catch(Exception e) {
	        	JOptionPane.showMessageDialog(null,"Something went wrong");
	        	
	        }
			return rs;
		}
		//check_tourist
		public static ResultSet tour_check(String username) {
			ResultSet rs = null;
			try {
			Connection con=Connect.createC();
			PreparedStatement pst = con.prepareStatement("select * from tourist where USERNAME = ?");
	        pst.setString(1, username);
	        rs = pst.executeQuery();
	        }catch(Exception e) {
	        	JOptionPane.showMessageDialog(null,"Something went wrong");
	        	
	        }
			return rs;
		}
		
		//tourist sign-up
		public static boolean tourist_signup(Tour tourist) {
			boolean valid=false;
			try {
			Connection con=Connect.createC();
			PreparedStatement pst = con.prepareStatement("insert into tourist(FIRST_NAME,LAST_NAME,USERNAME,PASSWORDS,PHONE) values (?,?,?,?,?)");
			pst.setString(1,tourist.getFirstName());
			pst.setString(2,tourist.getLastName());
			pst.setString(3,tourist.getUsername());
			pst.setString(4,tourist.getPasswords());
			pst.setString(5,tourist.getPhone());
	        pst.executeUpdate(); valid=true;
	        valid=true;
	        }catch(Exception e) {
	        	JOptionPane.showMessageDialog(null,"Something went wrong");
	        	
	        }
			return valid;
		}
		//deleting tourist
		public static boolean dlttourist(String username,String password) {
			boolean valid=false;
			try {
				Connection con=Connect.createC();
				PreparedStatement pst=con.prepareStatement("delete from tourist where USERNAME = ? AND PASSWORDS = ?");
				pst.setString(1, username);
				pst.setString(2, password);
				pst.executeUpdate(); valid=true;
				PreparedStatement s=con.prepareStatement("insert into records_tour(username) values (?)");
				s.setString(1,username);
				s.executeUpdate(); valid=true;
				valid=true;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Something went wrong");
				
			}
			return valid;	
		}
		//change tourist password -checks first using login
				public static boolean tour_password(String old_password, String new_password,String username) {
					boolean valid=false;
					try {
						Connection con=Connect.createC();
						PreparedStatement pst=con.prepareStatement("update tourist set PASSWORDS=REPLACE(PASSWORDS,?,?) WHERE USERNAME=?");
						pst.setString(1, old_password);
						pst.setString(2, new_password);
						pst.setString(3, username);
						pst.executeUpdate(); valid=true;
						valid=true;
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null,"Something went wrong");
					}
					return valid;	
				}
				//change tourist phone -checks login first
				public static boolean tour_phone(String old_phone, String new_phone,String username) {
					boolean valid=false;
					try {
						Connection con=Connect.createC();
						PreparedStatement pst=con.prepareStatement("update tourist set PHONE=REPLACE(PHONE,?,?) WHERE USERNAME=?");
						pst.setString(1, old_phone);
						pst.setString(2, new_phone);
						pst.setString(3, username);
						pst.executeUpdate(); valid=true;
						valid=true;
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null,"Something went wrong");
					}
					return valid;	
				}
		
	

//check phone
		public static ResultSet check_phonetour(String username,String number) {
			ResultSet rs = null;
			try {
			Connection con=Connect.createC();
			PreparedStatement pst = con.prepareStatement("select * from tourist where USERNAME = ? and PHONE = ?");
	        pst.setString(1, username);
	        pst.setString(2, number);
	        rs = pst.executeQuery();
	        }catch(Exception e) {
	        	JOptionPane.showMessageDialog(null,"Something went wrong");
	        	
	        }
			return rs;
		}
}
///////////////////////////////////////ALHAMDULILLAH////////////////////////////////
	
	
	
	
	
	
	
	
	
	



