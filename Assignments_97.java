package p1;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Assignments_97 {

	public static void main(String[] args) {

		
		Map <Integer , String> mp1 = new TreeMap <Integer , String>() ;
		
		mp1.put(12, "Vishnu") ;
		
		mp1.put(28, "Jishnu");
		
		mp1.put(19, "Arun");
		
		mp1.put(3, "Ishaan");
		
		mp1.put(15, "Rama");
		
		mp1.put(13, "Anand");
		
		mp1.put(36, "Sangeetha");
		
		
		 Set<Entry<Integer,String>> s1= mp1.entrySet() ;
		 
		 Iterator<Entry<Integer,String>> i1 = s1.iterator() ;
		 
		 while(i1.hasNext())
			 
		 {
			 System.out.println(i1.next());
		 }
		
		
	}

}
