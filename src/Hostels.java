

public class Hostels extends SmartCity{
	private String Contact;
	public Hostels() {
		super();
	}
	public Hostels(String name, String location, String contact) {
		super(name,location);
		Contact = contact;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	

}
