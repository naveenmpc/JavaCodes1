package collectionsDemo;

import java.util.ArrayList;



public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> cities = new ArrayList<>();
		
		cities.add("ap");
		cities.add("bangalore");
		cities.add(1,"tirupathi");
		
		System.out.println(cities.size());
		
		for(String t: cities)
		{
			System.out.println(t);
		}

	}

}
