package p1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment_88 {

	public static void main(String[] args) {
	
		
		Vector <Integer> V1 = new Vector <Integer> () ;
		
		V1.add(15);
		V1.add(85);
		V1.add(65);
		V1.add(74);
		V1.add(63);
		V1.add(74);
		V1.add(28);
		V1.addElement(90);
		System.out.println(V1);
		
		
		//Iterator
		
	Iterator<Integer> I1	=  V1.iterator() ;
	
	System.out.println("Iterating using Iterator");
	
	while(I1.hasNext())
		
	{
		System.out.println(I1.next());
	}
	
	System.out.println("Iterating using List Iterator");
	
	 ListIterator <Integer>  L1 = V1.listIterator() ;
	
	System.out.println("Forward Iteration");
	
	while(L1.hasNext())
		
	{
		System.out.println(L1.next());
	}

	System.out.println("Backward Iteration");
	
   while(L1.hasPrevious())
		
	{
		System.out.println(L1.previous());
	}
	
   
   System.out.println("Iterating using Enumeration");
   
   
  Enumeration  <Integer> E1 =  V1.elements() ;
   
  while(E1.hasMoreElements())
		
 	{
 		System.out.println(E1.nextElement());
 	}
  
	}

}
