package basics_of_java;

import java.util.Scanner;

public class Assignment_49 {

	
	static Scanner sc = new Scanner(System.in) ;
	public static void main(String[] args) {
		
		System.out.println("Which state are you from?");
		String A =sc.next() ;
		
		
		
		
		switch(A)
		
		{
			
		
			case "Kerala": 
				
			{
				System.out.println("You are in southern part of india");
				
			}
			
			break ;
			
             case "Tamil Nadu": 
				
			{
				System.out.println("You are in souther part of india");
				
			}
			
			break ;
			
             case "Assam": 
 				
 			{
 				System.out.println("You are in north east part of india");
 				
 			}
 			
 			break ;
             case "Jammu": 
 				
 			{
 				System.out.println("You are in northern part of india");
 				
 			}
 			
 			break ;
 			
             case "Gujarath": 
 				
 			{
 				System.out.println("You are in Eastern part of india");
 				
 			}
 			
 			break ;
 			
 			default :
 				
 				System.out.println("Not a valid input");
 				
 				break;
			
		}
		
	}
	

}
