package javaPrograms;

public class ConstructorDemo {
	
	public  ConstructorDemo()
	{
		System.out.println("This is default constructor");
	}
	 public  ConstructorDemo(int a)
	  {
		  System.out.println("this is parametrised constructor:");
		  System.out.println("this is parametrised constructor value a is:" +a);
	  }
  public  ConstructorDemo(int a,int b)
  {
	  System.out.println("this is parametrised constructor:");
	  System.out.println("this is parametrised constructor value a is:" +a);
	  System.out.println("this is parametrised constructor value b is:"+b);


  }
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo obj=new ConstructorDemo();
		ConstructorDemo obj2=new ConstructorDemo(103);
		ConstructorDemo obj3=new ConstructorDemo(10,20);
		
  
	}

}
