package basics_of_java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_56 {

	
	static Scanner sc = new Scanner(System.in) ;
	public static void main(String[] args) {
	
		
		System.out.println("Enter two string values to be tested whether it is anagram");
		
		String A = sc.next() ;//heart
		String B = sc.next() ;//earth
		
		
		
		if (A.length() != B.length())
			
		{
			System.out.println("The two input Strings are not anagram");
		}
		
		
		
		
	char [] a1=	A.toCharArray() ;
	char [] b1= B.toCharArray() ;
	
	Arrays.sort(a1); //sorted
	Arrays.sort(b1); //sorted
	
	System.out.println(a1);//aehrt
	System.out.println(b1);//aehrt
	
	
	System.out.println(Arrays.toString(a1));//[a,e,h,r,t]
	System.out.println(Arrays.toString(b1)) ;//[a,e,h,r,t]
	
	if(Arrays.equals(a1, b1) == true) //we have to use equals method of arrays class to check whether 2 arrays are equal
		
	{
		System.out.println("These Strings are anagram");
	
	
		}
		
	
	else
	{
		System.out.println("These Strings are not anagram");
		
	}

	}
}


