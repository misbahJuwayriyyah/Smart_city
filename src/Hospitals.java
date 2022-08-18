

public class Hospitals extends SmartCity{
	private String Sector;
	private String Contact;
	public Hospitals() {
		super();
	}
	public Hospitals(String name, String sector, String location, String contact) {
		super(name,location);
		Sector = sector;
		Contact = contact;
	}
	public String getSector() {
		return Sector;
	}
	public void setSector(String sector) {
		Sector = sector;
	}	
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	

}
