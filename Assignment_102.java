package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment_102 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer> (Arrays.asList(15,25,35,45,55,65,75,85,95,95,25,15,45)) ;
		
	System.out.println(Collections.min(list));	
	System.out.println(Collections.max(list));
	System.out.println(Collections.frequency(list, 45));
	
	Collections.sort(list);
	System.out.println(list);
	
	Collections.reverse(list);
	System.out.println(list);
	
	Collections.shuffle(list);
	System.out.println(list);
	
	Collections.sort(list);
	System.out.println(list);
	int a = Collections.binarySearch(list, 25);
	
	System.out.println(a);
	
	Collections.rotate(list, 2); //clockwise
	
	System.out.println(list);
	
	Collections.rotate(list, -3); //AntiClockwise
	
	System.out.println(list);
	
	System.out.println(list.size()) ;
	
	
	List<Integer> list2 =new ArrayList<Integer>(Arrays.asList(150,250,350));
	
	System.out.println(list2.size() );
	
	Collections.copy(list, list2);
	System.out.println(list);
	
	System.out.println(list.size()) ;
	
	boolean b = Collections.disjoint(list, list2) ;
	System.out.println(b);
	
	Collections.replaceAll(list, 45, 450) ;
	System.out.println(list);
	
	Collections.fill(list, 0);
		
	System.out.println(list);
	}

}
