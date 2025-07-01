package basics_of_java;

import java.util.Arrays;
import java.util.Scanner;



public class Stringmethods {
	static Scanner sc =new Scanner (System.in) ;

	public static void main(String[] args) {
		String A ="   I am Azhakuvally Ponnambalam    " ;
		
		String B = A.trim() ;
		
		System.out.println(B);
		
		String C = A.replace("I am", "") ;
		
		//System.out.println(C);
		
		String D = A.replace('a','z').trim() ;
		
		System.out.println(D);
		
		boolean E = A.matches("A(.*)") ;
		
		System.out.println(E);
		
		
		boolean F = A.matches("(.*)vally(.*)") ;
		
		System.out.println(F);
		
		String [] Z = A.trim().split("") ;
		
		System.out.println(Arrays.toString(Z));
		
		
		String N = "I am an Indian" ;
	               
		               
	String [] n = 	N.split("", 2) ;
	
	String [] m = N.split(" ") ;
	System.out.println(Arrays.toString(n));
	System.out.println(Arrays.toString(m));
		
		 boolean v = N.matches("..............") ;
		 
		 String g = "Anu" ;
		 
		boolean l =  g.matches("...") ;
		 
		 System.out.println(l);
		 System.out.println(v);
		

	}

}
