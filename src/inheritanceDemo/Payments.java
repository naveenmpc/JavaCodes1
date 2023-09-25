package inheritanceDemo;

public class Payments extends Homepage {
	
	public void payments()
	{
		System.out.println("testing for payments page");
	}
	// thi class child to homepage and grand child to base class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payments obj=new Payments();
		obj.openbrowser("chrome");
		login("admin", "Password");
		obj.Homepagetest();
		obj.payments();
		obj.logout();

	}

}
