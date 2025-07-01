package basics_of_java;


import java.util.Scanner;

public class Assignment_46 {

	static Scanner sc = new Scanner (System.in) ;
	
	public static void main(String[] args) {
		
		//WAP to calculate age of a person if he enters his DOB.
		
		System.out.println("Enter your year of birth");

		int Yearofbirth = sc.nextInt();
		
			System.out.println("Your Year of birth is "+Yearofbirth);
		
		
			System.out.println("Enter the current year");
			
			int CurrentYear = sc.nextInt() ;
			
			int age = CurrentYear -Yearofbirth ;
			
			System.out.println("Your age is -->" +age);
	
	
	
				
		
	}

}
