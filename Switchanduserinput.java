package basics_of_java;

import java.util.Scanner;

public class Switchanduserinput {

	Scanner sc = new Scanner(System.in) ;
	public static void main(String[] args) {
		Switchanduserinput ob = new Switchanduserinput() ;
		ob.display();

	}
	
	void display ()
	{
		
		System.out.println("Enter any one number 1 or 2 or 3");
		
		int a = sc.nextInt() ;
	switch(a)
	
	{
	case 1 :{
		System.out.println("A");
	}
	
	break ;
	
	case 2 :
	{
		System.out.println("B");
	}
	
	break ;
	
	case 3 :
		
	{
		System.out.println("C");
	}
	
	break ;
	
	default :
	{
		System.out.println("not a valid input");
		
	}
	
	
	}
	
	}

}
