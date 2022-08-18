

public class Tour extends Administrator{
	private String Phone;
	public Tour() {
		super();
	}
	//login
	public Tour(String username, String passwords) {
		super(username,passwords);
	}
    //signup
	public Tour(String firstName, String lastName, String username, String passwords,String Phone) {
		super(firstName,lastName,username,passwords);
		this.Phone=Phone;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	

}
