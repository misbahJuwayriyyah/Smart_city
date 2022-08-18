

public class Stu extends Administrator{
	private String Phone;
	public Stu() {
		super();
	}
	//login
	public Stu(String username, String passwords) {
		super(username,passwords);
		
	}
    //signup
	public Stu(String firstName, String lastName, String username, String passwords, String phone) {
		super(firstName,lastName,username,passwords);
		this.Phone = phone;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	

}
