package basics_of_java;

import java.util.Scanner;

public class Assignment_45 {

	
	static Scanner sc = new Scanner(System.in) ;
	public static void main(String[] args) {
		
		System.out.println("Enter the string to be reversed");
		String userinput =sc.next() ;
		
		String output = "" ;
		
		for (int i = userinput.length() -1; i >= 0; i--)
			
		{
			char C = userinput.charAt(i) ;
			output = output+ C ;
			
		}
	
System.out.println(output);
	}

}
