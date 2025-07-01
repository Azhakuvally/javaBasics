package basics_of_java;

import java.util.Arrays;
import java.util.Scanner;

public class Array_problem {
	
	static Scanner sc =new Scanner (System.in) ;
	
	

	public static void main(String[] args) {
		
		array () ;
		
		System.out.println("Enter the size of the array");
		
		int size = sc.nextInt() ;
		int [] age = new int [size] ;
		
		System.out.println("Enter the values in array");
		
		for(int i = 0; i<=size-1 ; i++)
			
		{
			
			
			age[i] = sc.nextInt() ;
			
		}
		System.out.println(Arrays.toString(age));

	}

	public static void array ()
	
	{
		char [] alpha = new char [4] ;
		
		alpha[0] = 'j';
		alpha[1] = 'k';
		alpha[2] ='l';
		alpha [3] ='i' ;
		
		
		System.out.println(Arrays.toString(alpha));
		
	
	
}
}
