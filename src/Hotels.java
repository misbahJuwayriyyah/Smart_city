

public class Hotels extends SmartCity{
	private String Price;
	private String Ratings;
	private String Contact;
	public Hotels() {
		super();
	}
	public Hotels(String name, String location, String price, String ratings, String contact) {
		super(name,location);
		Price = price;
		Ratings = ratings;
		Contact = contact;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getRatings() {
		return Ratings;
	}
	public void setRatings(String ratings) {
		Ratings = ratings;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	

}
