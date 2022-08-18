

public class ShoppingMalls extends SmartCity{
	private String Timing;
	private String Contact;
	public ShoppingMalls() {
		super();
	}
	public ShoppingMalls(String name, String location, String timing, String contact) {
		super(name,location);
		Timing = timing;
		Contact = contact;
	}
	public String getTiming() {
		return Timing;
	}
	public void setTiming(String timing) {
		Timing = timing;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	
}
