

public class Police extends SmartCity{
	private String Contact;
	public Police() {
		super();
	}
	public Police(String name, String location, String contact) {
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
