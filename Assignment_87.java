package p1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment_87 {

	public static void main(String[] args) {
		
		
		Set <String>S1 = new HashSet <String> ()  ;
				
				S1.add("Anu");
				S1.add("Ammu");
				S1.add("Anita");
				S1.add("Zara");
				S1.add("Rukku");
				S1.add("Raja");
				
				System.out.println(S1);
				
			Iterator <String> I1	= S1.iterator() ;
			
			while (I1.hasNext()) 
				
			{
				System.out.println(I1.next());
			}

	}

}
