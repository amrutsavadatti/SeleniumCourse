package test;


public class LoginInfo {
	public String name;
	//	public String password;
	private String password;
	public int salary;
	// protected int salary;
	// default int salary;

	
	
	public LoginInfo(String name, String password, int sal)
	{
		this.name = name;
		this.password = password;
		salary = sal;
	}
	public void LoginReply()
	{
		System.out.println("welcome " + name);
	}
	
}