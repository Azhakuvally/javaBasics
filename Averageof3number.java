package basics_of_java;

import java.util.Scanner;

public class Averageof3number {
	
	static Scanner sc = new Scanner (System.in) ;

	public static void main(String[] args) {
		
		
		//new Averageof3number (0,null ) ;
		
		//avg () ;
		
		//Personaldetails () ;
		
		//citizen() ;
		
		citizenship () ;
		

	}
	
	
	Averageof3number(int a, String b)
	
	{
		
		System.out.println("Enter your name");
		b =sc.next() ;
		
		System.out.println("Enter your age") ;
		
		a = sc.nextInt() ;
		
		System.out.println("Hi "+b+" Your age is "+a);
		
		
		
		
	}
	
	

	static void avg ()
	
	{
		System.out.println("Enter a");
		
		double a = sc.nextDouble() ;
		System.out.println("Enter b");
		double b = sc.nextDouble() ;
		System.out.println("Enter c");
		double c = sc.nextDouble() ;
		
		double avg = (a+b+c)/3 ;
		
		System.out.println("The avg of three numbers is "+avg);
		
	}
	
	static void Personaldetails ()
	
	{
		System.out.println("Enter your name");
		
		String a = sc.next() ;
		
		System.out.println("Age");
		
		Double age = sc.nextDouble() ;
		
		
		System.out.println("Enter your Salary");
		
		Double sal = sc.nextDouble() ;
		
		System.out.println("Hi "+a+" your age is "+age+" and your salary is "+sal);
		
		
	}
	
	
	static void citizen()
	
	{
		
		System.out.println("Are you born in India?") ;
		boolean A = sc.nextBoolean() ;
		
		if(A==true)
			
		{
			System.out.println("You are an Indian citizen");
			
		}
		
		
		else 
		{
			System.out.println("How long you been staying in India(in years)");
			
			double B = sc.nextDouble() ;
			
			if (B>=30)
				
			{
			
			System.out.println("You can apply for citizenship");
			
			
			}
			
			
			if (B<30)
				
				
			{
				
				System.out.println("Only those who stay in India for more than 30 years can only apply for citizenship");
				
			}
			
			

			
			
		}
		
			
			
		}
		

	
	static void citizenship ()
	
	
	{
		
		System.out.println("Are you born in India?");
	String A = 	 sc.next() ;
		
		
		if ( A.equals("Yes")|A.equals("yes"))
			
			
		{
			
			
		 System.out.println("You are indian citizen");	
		 
		 
		}
		
		
		else
			
		{
			
			System.out.println("You are not an indian citizen");	
		}
		
		
		
	}
	
		
		
	}
	
	
	



