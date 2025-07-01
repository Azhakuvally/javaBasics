package basics_of_java;

import java.util.Scanner;

public class Palindrom_Class {
	
	static Scanner sc = new Scanner(System.in) ;

	public static void main(String[] args) {
		
        System.out.println("Enter the String value to be reversed");
		String input = sc.next() ;
		
		String output = "" ;
		
		for (int i = input.length() - 1;i>=0 ;i--) 
			
		{
			char a = input.charAt(i) ;
			
			 output =output+a ;
							
			
		}
		
		
		System.out.println("Reversed string of input is ".concat(output));
		
		
		if (input.equalsIgnoreCase(output))
			
		{
			System.out.println("The input String is a pailindrome");
		}
		
		else
		{
			System.out.println("The input String is not a pailindrome");
		}
		
		
	}
	
	

}
