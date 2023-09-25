package inheritanceDemo;

public class Homepage extends Base {
	public void Homepagetest()
	{
		System.out.println("testing the homepage:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating obj for homepage
		
		Homepage obj=new Homepage();
		obj.openbrowser("chrome");
		login("admin", "Password");
		obj.Homepagetest();
		obj.logout();
		
	}

}
