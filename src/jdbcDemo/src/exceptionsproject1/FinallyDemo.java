package exceptionsproject1;

public class FinallyDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// finally block
		// any code in this block will definattly execute even if you handel the error or not handel
		// try and catch will occur together
		// finally is not mandetory, if you have statement that have to compulsory executed in a program like
		
		int i = 9;
		int j = 0;
		try {
		
		
         System.out.println("result" + i/j);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println("please do not give 0 as value of j");
		}
		
		
//	System.out.println("result" + i/j);
	System.out.println("result for addition" + i+j);
	System.out.println("result for multiplication" + i*j);
	System.out.println("result substaction" + (i-j));

		

		
	}
}

	