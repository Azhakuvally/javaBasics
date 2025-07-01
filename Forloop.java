package basics_of_java;

import java.util.Scanner;

public class Forloop {
	
	
	static //Static initialization block
	
	{
		
		
		System.out.println("SIB");
	}
	
	static Scanner sc =  new Scanner (System.in) ;

	public static void main(String[] args) {
		
		square () ;
		sc.close();

	}
	
	
	static void square ()
	
	{
		
		System.out.println("Enter the number");
		int b = sc.nextInt() ;
		
		
		if (b>=1)
		{
		
		for ( int a = 1; a<=b;a++)
			
		{
			System.out.println(a+"-->"+(a*a));
			
		}
		
		}
		
		
		else
			
		{
			
			System.out.println("Wrong input");
		}
	}

}
