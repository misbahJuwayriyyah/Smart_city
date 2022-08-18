

public class Schools extends SmartCity{
	private String Contact;
	public Schools() {
		super();
	}
	public Schools(String name, String location, String contact) {
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
