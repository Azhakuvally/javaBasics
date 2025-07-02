package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Assignment_81 {

	public static void main(String[] args) {
		
		List <Boolean> L1 = new ArrayList <Boolean> (); // upcasting
		
		L1.add(true);
		L1.add(false);
		L1.add(true);
		L1.add(false);		
		L1.add(true);
		L1.add(false);
		L1.add(true);
		L1.add(false);
		L1.add(true);
		L1.add(false);
		L1.add(true);
		L1.add(false);
	
		
		
	 Iterator<Boolean>  I1 = L1.iterator() ;
	 
	 while(I1.hasNext())
		 
	 {
		 System.out.println(I1.next());
	 }
		

	}

}
