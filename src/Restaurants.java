

public class Restaurants extends SmartCity{
	private String Ambiance;
	public Restaurants() {
		super();
	}
	public Restaurants(String name, String location, String ambiance) {
		super(name,location);
		Ambiance = ambiance;
	}
	public String getAmbiance() {
		return Ambiance;
	}
	public void setAmbiance(String ambiance) {
		Ambiance = ambiance;
	}
	

}
