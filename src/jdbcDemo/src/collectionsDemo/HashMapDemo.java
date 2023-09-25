package collectionsDemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashMap<String, Integer> td = new HashMap<>();
		
		td.put("Ram", 12345);  // storing kay and value
		td.put("Marc", 35345);
		td.put("John", 5345);
		td.put("Jaya", 5345);
		td.put("James", 34535);
		
		
		  for(Entry m: td.entrySet()) 
		  { 
			  System.out.println(m.getKey() + " - " + m.getValue());
		  }
		 
		// a key and value is called as Entry and we use entry interafce
		// it has an EntrySet method which return values as a Se
		// remove methods
		
		td.remove("Marc"); // Remves the key marc and its value
		

	}

	}

