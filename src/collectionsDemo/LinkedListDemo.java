package collectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList <String> cities = new LinkedList<>();
		
		cities.add("ap");
		cities.add("bangalore");
		cities.add(1,"tirupathi");
		System.out.println(cities.size());
		
	Iterator itr=cities.iterator();
	
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
		
		
	}
	
	}
	
}
