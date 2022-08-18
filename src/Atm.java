
public class Atm extends SmartCity{
	private String Timing;
	public Atm() {
		super();
	}

	public Atm(String name, String location, String timing) {
		super(name,location);
		Timing = timing;
	}

	public String getTiming() {
		return Timing;
	}

	public void setTiming(String timing) {
		Timing = timing;
	}
	
	

}
