 package p1;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
	
		
		
		 Map <Integer , String> m1 = new HashMap<Integer , String> () ;
		 
		 m1.put(100, "Anu") ;
		 m1.put(99, "Chocka");
		 m1.put(98, "Nithila") ;
		 m1.putIfAbsent(95, "Mangai") ;
		 m1.put(101, "Anu") ;
		 m1.put(91, "Chocka");
		 m1.put(90, "Nithila") ;
		 m1.putIfAbsent(9, "Mangai") ;
		 System.out.println(m1);
		 
				 
		boolean b1 =  m1.containsKey(91) ;
		
		System.out.println(b1);
		
		boolean b2 = 	m1.containsValue("Mangai") ;
		 
		System.out.println(b2);
		
		m1.remove(91);
		System.out.println(m1);
		
		m1.remove(101, "Anu");
		System.out.println(m1);
		
		m1.replace(99, "Dinesh") ;
		
		System.out.println(m1);
		
		m1.replace(99, "Dinesh", "Chockalingam") ;
		 
		System.out.println(m1);
		
		System.out.println(m1.get(100));
		
		System.out.println(m1.size()) ;
		
		System.out.println(m1.get(95)) ;
	}

}
