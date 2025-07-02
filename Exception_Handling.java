package p1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
	
	static Scanner sc = new Scanner (System.in) ;
public static void main(String[] args) 
	{	
	
	StringBuffer str = new StringBuffer( "Anu") ;
	
	
	 
	 System.out.println("Enter the value of a");
	 
	 try {
		int a = sc.nextInt() ;
        int b = 2;
		
		int c = a+b ;
		System.out.println(c);	
		
	 }
	 
	 catch (InputMismatchException c1)
	 {
		System.out.println("Handled the exception"); 
	 }
		
		 System.out.println("Enter the size of the array");
			try {
		 int n = sc.nextInt() ;
		 int [] a1 = new int [n] ;
		 System.out.println("Enter the elements of the array");
		 for(int i =0 ; i<n;i++)
			 
		 {
			 a1[i] = sc.nextInt() ;
		 }
		 
		 System.out.println(Arrays.toString(a1));
			}
			
			catch (InputMismatchException c2)
			
			{
				System.out.println("Handled the InputMismatchException"); 
			}
			
	catch (NegativeArraySizeException c3)
			
			{
				System.out.println("Handled the NegativeArraySizeException"); 
			}
			
			
			
			 
	 
	 
	
	 
	
	 finally
	 
	 {
		 System.out.println("Hello");
	 }
		
	 }	
		
		
			
		
	
	

}
