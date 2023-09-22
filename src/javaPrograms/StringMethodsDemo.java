package javaPrograms;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title="Simplilearn is good course";
		
		if(title.contains("good"))
		{
			System.out.println("Title is valid.test case  passed");
		}
		else
		{
			System.out.println("Title is not valid.test case not passed");
		}
		if(title.equals("Simplilearn is good course"))
		{
			System.out.println("Title is valid.test case  passed");
		}
		else
		{
			System.out.println("Title is not valid.test case not passed");
		}
	
		String title2="Practice labs Java";
		
		String result=title2.substring(14);
		
		if(result.equals("Java")) 
		{
			System.out.println("Title is valid.test case  passed");
		}
		else
		{
			System.out.println("Title is not valid.test case failed");
		}
}
}
