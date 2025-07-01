package basics_of_java;

import java.util.Scanner;

public class Assignment_30 {
	
	static Scanner sc = new Scanner ( System.in) ;

	public static void main(String[] args) {
		
System.out.println(Math.PI);
max(0,0);
abs() ;
random() ;

	}
	
	static void max(int a,int b)
	
	{
		System.out.println("Enter 2 integers to find maximum");
		b = sc.nextInt() ;
		a=sc.nextInt() ;
		System.out.println(Math.max(a, b)) ;
	}

	
	static void abs()
	
	{
		
		System.out.println("Enter a negative value");
		double a = sc.nextDouble() ;
		
		System.out.println(Math.abs(a)) ;
	}
	
	static void random()
	
	{
		System.out.println(Math.random());
	}
	
	
	
}
