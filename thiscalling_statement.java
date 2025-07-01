package basics_of_java;

import java.util.Scanner;

public class thiscalling_statement {

	static Scanner sc = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		new thiscalling_statement(5,5) ;

	}
	
	thiscalling_statement(int a , int b)
	
	{
		this("and","has");
		System.out.println("Enter 2 integers");
		a = sc.nextInt() ;
		b = sc.nextInt() ;
		System.out.println(a+b);
	}
	
	thiscalling_statement(String a , String b)
	
	{
		this (0.5f,98769876987542545l);
		System.out.println("Enter 2 string values");
		a=sc.next() ;
		b=sc.next() ;
		
		System.out.println(a+b);
	}
	
	
	
	thiscalling_statement(float X, long Y)
	
	{
		
		System.out.println("Enter one float value and one long value");
		
		X = sc.nextFloat() ;
		Y= sc.nextLong() ;
		
		System.out.println(X+Y);
	}
	

}
