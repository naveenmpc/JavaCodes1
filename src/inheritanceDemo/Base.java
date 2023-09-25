package inheritanceDemo;

public class Base {
	
	 	
	public void openbrowser(String browser)
	{
		System.out.println("open the browser:" +browser);
	}
	public static void login(String Username,String Password)
	{
		System.out.println("Enter Username:"+Username);
		System.out.println("Enter Password:"+Password);
		System.out.println("Click login button");
	}
	
	public void logout()
	{
		System.out.println("signout");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
