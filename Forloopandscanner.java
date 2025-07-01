package basics_of_java;

import java.util.Scanner;

public class Forloopandscanner {
	
	static Scanner sc = new Scanner (System.in) ;

	public static void main(String[] args) {
		
		//year() ;
		//age () ;
		ticket() ;

	}
	
	
	static void year()
	
	
	{
		
		System.out.println("Enter the Year of born");
		
	
	for( int a = sc.nextInt() ; a<=2025;a++)
			
	{
		
		if(a<2026)
			{
			System.out.println(a);
			}
	
			else
				
			{
				System.out.println("invalid input");
			}
			
		}
		
	
		
		}
		
		
	
	
	static void age ()
	
	{
		System.out.println("Enter the Year of born");
		int a = sc.nextInt() ;
		int age = 2025-a ;
		System.out.println("Your age is "+age);
		
	}
	
	
	static void ticket()
	
	{
		System.out.println("Enter your age");
		
		int a =sc.nextInt() ;
		
		
		
	if (a>0)
	{
		
		System.out.println("Are you female or trans gender?");
		System.out.println("Are you differently abled?");
		
		
		boolean b = sc.nextBoolean() ;
		boolean c = sc.nextBoolean() ;
		
				
	
	if((b==false)&&(c==false) )	
	{
		if(a<5 && a>=0)   //only one if can be true at a time
			
		{
			System.out.println("No fare should be collected");
		}
		
		if(a <18 && a>=5)
			
			
		{
			System.out.println("Student only half fare should be collected");
			
		}
		if (a>=18 && a<60)
			
			
		{
			System.out.println("Full fare should be collected");
		}
		
		
		if (a>=60)
			
			
		{
			System.out.println("Senoir citizen only half fare should be collected");
			
		}
		
		
	
		
	}
	
	 if(b|c == true)
		
	{
		System.out.println("No fare should be collected");
		
	}
	 
	 
	}
	  
	else
			
		{
		
			System.out.println("invalid input");
		}
	 
					
		
	}
	
	}


