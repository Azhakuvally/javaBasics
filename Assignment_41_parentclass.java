package p1;

import java.util.Scanner;

public class Assignment_41_parentclass {

	
	Scanner sc = new Scanner(System.in) ;
	
	
	public void ifelseBlock ()
	
	{
		System.out.println("Enter any int value");
		int a =sc.nextInt() ;
		
		if (a>=0)
			
		{
			System.out.println("a is greater than or equal to 0");
		}
		
		else
		{
			if (a< 1)
				
			{
				System.out.println("a is less than 1");
			}
			
			
			
		}
		}
		
	
	
	public void ifelseif_Block()
	
	{
		
		System.out.println("Enter any int value");
		int a = sc.nextInt() ;
		if( a >=5 && a<=50)
			
		{
			System.out.println("a is either greater than or equal to 5 or less than or eqal to 50");
		}
		
		else if (a<5)
			
		{
			System.out.println("a is less than 5");
		}
		
		else
			
		{
			System.out.println("a is greater than 50");
		}
		
		
	}

}
