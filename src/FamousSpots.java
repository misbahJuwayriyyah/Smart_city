

public class FamousSpots extends SmartCity {
	private String Timing;
	private String PriceForEntry;
	public FamousSpots() {
		super();
	}
	public FamousSpots(String name, String location, String timing, String priceForEntry) {
		super(name,location);
		Timing = timing;
		PriceForEntry = priceForEntry;
	}
	public String getTiming() {
		return Timing;
	}
	public void setTiming(String timing) {
		Timing = timing;
	}
	public String getPriceForEntry() {
		return PriceForEntry;
	}
	public void setPriceForEntry(String priceForEntry) {
		PriceForEntry = priceForEntry;
	}
	

}
