package basics_of_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Program {

	public static void main(String[] args) {
		
		
		 List <Double>L1 = new ArrayList <Double>() ;
		 
		 L1.add(null) ;
		 L1.add(6.5);
		 L1.add(6.8) ;
		 
		 System.out.println(L1);
		 
		 ListIterator <Double> i1 = L1.listIterator() ;
		 System.out.println("forward Iteration of the list");
		 while(i1.hasNext())
			 
		 {
			 System.out.println(i1.next());
		 }
		 
		 System.out.println("Backward Iteration of the list");
		 
 while(i1.hasPrevious())
			 
		 {
			 System.out.println(i1.previous());
		 }
 
 
	Iterator i2	=  L1.iterator() ;
	
	while (i2.hasNext())
	{
		System.out.println(i2.next());
	}

}
	
}
