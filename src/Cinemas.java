

public class Cinemas extends SmartCity {
	private String ticketPrice;
	private String bookingInfo;
	
	public Cinemas() {
		super();
	}

	public Cinemas(String name, String location, String ticketPrice, String bookingInfo) {
		super(name,location);
		this.ticketPrice = ticketPrice;
		this.bookingInfo = bookingInfo;
	}

	public String getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getBookingInfo() {
		return bookingInfo;
	}

	public void setBookingInfo(String bookingInfo) {
		this.bookingInfo = bookingInfo;
	}
	
	

}
