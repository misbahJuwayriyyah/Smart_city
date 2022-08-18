

public class Airport extends SmartCity{
	private String Contact;
	public Airport() {
		super();
	}
	public Airport(String name, String location, String contact) {
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
