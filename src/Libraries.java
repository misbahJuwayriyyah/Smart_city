

public class Libraries extends SmartCity{
	private String Contact;
	public Libraries() {
		super();
	}
	public Libraries(String name, String location, String contact) {
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
