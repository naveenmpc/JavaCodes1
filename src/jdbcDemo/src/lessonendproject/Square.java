package lessonendproject;

public class Square extends Shape {

	
		// TODO Auto-generated method stub
		 private int length;
		  

		    public Square(int length) {
		        this.length = length;
		      
		    }

		    @Override
		    public void displayArea() {
		        System.out.println("Area of the Square: " + calculateArea());
		    }

		    public double calculateArea() {
		        return length * length;
		    }

	}