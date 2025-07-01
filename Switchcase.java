package basics_of_java;

import java.util.Scanner;

public class Switchcase {
	
	static Scanner sc = new Scanner (System.in) ;

	public static void main(String[] args) {
		
		
		switch(4)
		
		
		{
		
		case 1 :System.out.println("Chrome");
		
		break ;
		
		
		case 2 :System.out.println("Mozilla");
		break ;
		
		case 3 :System.out.println("Edge");
		
		break ;
		
		
		case 4 :System.out.println("Safari");
		break ;
		
		case 5 :System.out.println("Operamini");
		break ;
		
		
		default :System.out.println("invalid input");
		
		System.out.println("1 for Chrome");
		System.out.println("2 for Mozilla");
		System.out.println("3 for Edge");
		System.out.println("4 for Safari");
		System.out.println("5 for Operamini");
		
		}

		Switchcase ob = new Switchcase() ;
		//ob.Swuchhu();
		
		ob.swiztch();
		
	}
	
	
	
	
	
	public void Swuchhu ()
	
	{
		 int a = 5 ;
		switch(267)
		
		{
		
		case 1 : if(a>1)
			
		{
			System.out.println("a is greater than 1");
		}
		
		else
			
		{
			System.out.println("a is less than 1");	
		}
		
		break ;
		
		
         case 2 : if(a>4)
			
		{
			System.out.println("a is greater than 4");
		}
		
		else
			
		{
			System.out.println("a is less than 4");	
		}
		
		break ;
		
		
		
		default :System.out.println("Default");	
		
		
		
		}
		
	}
	
	
	void swiztch()
	
	{
		
		
		System.out.println("Press 1 for Anu");
		System.out.println("Press 2 for Abhi");
		System.out.println("Press 3 for Sanjana");
		
		int a = sc.nextInt() ;
		
		switch(a)
		
		{
		case 1 : 
			
			System.out.println("Anu");
		
		break ;
		
		
		case 2 :
			System.out.println("Abhi");
			break;
			
		case 3 :
			
			System.out.println("Sanjana");
			break ;
		
			default :  System.out.println("invalid");
		
	}
	
}
	
	
}


