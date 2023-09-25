package inheritanceDemo;

public class MethodsDemo {
	
	int x=30;
	String str3="Jdbc";
	
	//method with return value
	
	public int sum()
	{
		int a =10;
		int b=20;
		int result= a+b+x;
		return result;
	}
	
	public String Concat() {
		String str1="selenium";
		String str2="Java";
		String result=str1 + str2+str3;
		return result;
	}
	public void printmethod()
	{
		System.out.println("x value is:" +x);
		System.out.println("str3 is displayed:" +str3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo obj = new MethodsDemo();

		System.out.println(obj.sum());
		System.out.println(obj.Concat());
		obj.printmethod();
		

	}

}
