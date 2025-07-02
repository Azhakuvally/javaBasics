package p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment_86 {

	public static void main(String[] args) {
		
		
		Set <Integer> s1 = new HashSet <Integer> () ;
		
	s1.add(50) ;
	s1.add(85) ;
	s1.add(87);
	s1.add(94);
	s1.add(47) ;
	s1.add(47) ;
	s1.add(36);
	s1.add(25);
	s1.add(14);
	s1.add(14);
	s1.add(34);
	s1.add(200);
	
	System.out.println(s1);
	
	 Iterator <Integer> I1 = s1.iterator() ;
	 
	 while (I1.hasNext() == true)
		 
	 {
		 System.out.println(I1.next());
	 }

	}

}
