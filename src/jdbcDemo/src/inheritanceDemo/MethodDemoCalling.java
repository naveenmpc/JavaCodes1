package inheritanceDemo;

public class MethodDemoCalling {
	
	public void login()
	{
		System.out.println("Enter Username:");
		System.out.println("Enter Password:");
		System.out.println("Click login button");
	}
	public void Composemail()
	{
		System.out.println("Enter message");
	}
	public void logout()
	{
		System.out.println("signout");
	}

	public static void main(String[] args) {
		
		MethodDemoCalling obj=new MethodDemoCalling();
		
		obj.login();
		obj.Composemail();
		obj.logout();
	}

}
