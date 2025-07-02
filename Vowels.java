package p1;

import java.util.Scanner;

public class Vowels {

	
	static Scanner sc = new Scanner (System.in) ;
	public static void main(String[] args) {
		
		System.out.println("Enter the String Value");
		
		String input = sc.next() ;
		
		char a1 [] =new char [5] ;
		
		a1 [0] = 'a';
		a1[1] = 'e' ;
		a1[2]= 'i' ;
		a1[3]='o';
		a1[4] ='u' ;
		
		
		
		
		for (int j = 0 ; j<a1.length;j++)  
			
		{
			for (int i = 0 ; i<input.length();i++)
				
			{
				if( input.charAt(i)== a1[j])
					
				{
					System.out.println("The given string has vowel "+a1[j]+" in it at the indexing position "+i);
				}
				
				else if(input.charAt(i) != a1[j])
				{
					
					System.out.println("The given string has Consonants char in it at the indexing position "+i);
					
				}
				
			}


	
		}
		
		
		
	

	}

}
