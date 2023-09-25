package inheritanceDemo;

public class MethodsParameter {
	public void login(String Username,String Password)
	{
		System.out.println("Enter Username:"+Username);
		System.out.println("Enter Password:"+Password);
		System.out.println("Click login button");
	}
	public void Composemail(String message)
	{
		System.out.println("Enter message:\n" +message);
	}
	public void logout()
	{
		System.out.println("signout");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 MethodsParameter obj=new MethodsParameter();
		
		obj.login("Naveen","Naveen@123");
		obj.Composemail("hi navi");
		obj.logout();

	}

}
