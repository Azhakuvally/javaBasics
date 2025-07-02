package p1;

import java.util.Scanner;

public class Assignment_40_parentclass {
	
	static Scanner sc = new Scanner(System.in) ;
	
	public static void forrloop()
	
	{
		
		System.out.println("Enter the the int value");
		
		int a = sc.nextInt() ;
		
		for(int i = a ;i<100;i++)
			
		{
			System.out.println(i);
			
		}
		
	}
	
	
	protected static void switchcase()
	
	{
        System.out.println("Enter the value 1 or 2");
		
		int a = sc.nextInt() ;
		
		
		switch(a)
		
		{
		case 1:
		{
			System.out.println("Case1");
		}
		
		break;
		
		
		case 2:
		{
			System.out.println("Case2");
		}
		
		break;
		
		default :
		{
			
			System.out.println("Invalid ");
		}
		
		}
		
	}

}
