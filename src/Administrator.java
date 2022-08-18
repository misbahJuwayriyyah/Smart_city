

public class Administrator implements ID{
	private String firstName;
	private String lastName;
	private String username;
	private String passwords;
	public Administrator() {
		super();
	}
	//login
	public Administrator(String username, String passwords) {
		super();
		this.username = username;
		this.passwords = passwords;
	}
	public Administrator(String firstName, String lastName, String username, String passwords) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.passwords = passwords;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	
	
	

}
