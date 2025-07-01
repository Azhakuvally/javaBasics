package basics_of_java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_59 {

	static Scanner sc = new Scanner(System.in) ;
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		
		String input = sc.next() ;
		
		char [] a1 = input.toCharArray() ;
		
		System.out.println(Arrays.toString(a1));
		
		int countofalphas = 0 ;
		int countofnumeric = 0 ;
		int countofspace = 0;
		
		for (int i = 0 ; i <a1.length;i++)
		{
			
			 boolean b1 = Character.isAlphabetic(a1[i]) ;
			
			 if (b1==true)
				 
			 {
				 countofalphas++ ;
				 
			 }
			 
			boolean b2 = Character.isDigit(a1[i]) ;
			 
			if (b2==true)
				
			{
				countofnumeric++ ;
			}
			 
			 
			 boolean b3= Character.isWhitespace(a1[i]) ;
			 
			 if(b3==true)
				 
			 {
				 countofspace++ ;
			 }
			
		}
		
		int countofspecialchar = a1.length - (countofalphas+countofnumeric+countofspace ) ;

		
		System.out.println("Number of alphabets in the given string is "+countofalphas);
		System.out.println("Number of numeric digit in the given string is "+countofnumeric);
		System.out.println("Number of spaces in the given string is "+countofspace);
		System.out.println("Number of special character in the given string is "+countofspecialchar);
		
		
	}

}
