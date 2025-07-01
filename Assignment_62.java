package basics_of_java;

import java.util.Arrays;

public class Assignment_62 {

	public static void main(String[] args) {
		
		String A = "          Automation Testing is so easy        " ;
		
		String B = A.trim() ;
        System.out.println(B);
        
        Assignmet_63() ;
	}
	
	
	
	public static void Assignmet_63()
	
	{
		
		String A = "All indiand are brothers and sisters" ;
		
		boolean b = A.matches("(.*)sisters") ;
		System.out.println(b);
		
	String [] A1 =	A.split(" ") ;
	
	System.out.println(Arrays.toString(A1));
		

}
	
}
