package lessonendproject;

public class Rectangle extends Shape {

		// TODO Auto-generated method stub
		 private int length;
		    private int width;

		    public Rectangle (int length, int width) {
		        this.length = length;
		        this.width = width;
		    }

		    public void displayArea() {
		        System.out.println("Area of the Rectangle: " + calculateArea());
		    }

		    public double calculateArea() {
		        return length * width;
		    }

	}