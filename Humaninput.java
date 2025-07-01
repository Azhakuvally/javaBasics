package basics_of_java;

import java.util.Scanner;

public class Humaninput {
	
 static Scanner sc = new Scanner(System.in);	//Declaring object of the scanner class as static global variable  ,hence can direclty utilized in different static methods

	public static void main(String[] args) {
		
		
		circle() ;
		
		rectangle () ;
		
		square() ;
		
		triangle () ;
	
	sc.close();
		

	}
	
	
	static void circle()
	
	{
		
	
		
        System.out.println("Enter the radius of the circle");
		
		double r = sc.nextDouble() ;
		
		
		double area = Math.pow(r, r)*Math.PI ;
		
		double circumference = 2*Math.PI*r ;
		
		System.out.println("Area of circle is "+ area);
		
		 System.out.println("Circumference of the circle is "+circumference);  
		
	}
	
	
	
	
	static void rectangle ()
	
	{
		
		
		System.out.println("Enter the length of the rectangle");
		
	double L =	sc.nextDouble() ;
	
	System.out.println("Enter the breadth of the rectangle");
	
	double B = sc.nextDouble() ;
	
	double area = L*B ;
	double Circumfernaceofrectangle = 2*(L+B)  ;
	
	System.out.println("Area of the rectangle is "+area);
	
	System.out.println("Circumference of the rectangle is "+Circumfernaceofrectangle);
	
	
		
	}
	
	
	static void square()
	
	{
		
		System.out.println("Enter the length square");
		
	double	L = sc.nextDouble() ;
	
	double area = Math.pow(L, 2) ;
	
	double circm = 4*L ;
	
	
System.out.println("Area of the square is "+area);
	
	System.out.println("Circumference of the square is "+circm);
	
		
		
		
	}
	
	static void triangle ()
	
	{
		
		
	  System.out.println("Enter the length of all the three sides of triangle");
	  
	  double A = sc.nextDouble() ;
	  double B = sc.nextDouble() ;
	  double C = sc.nextDouble() ;
	  
	  double circm = A+B+C ;
	  
	  System.out.println("Circumference of the triangle is "+circm);
	  
	  System.out.println("Enter the length of base of the triangle");
	  
	  double base = sc.nextDouble() ;
	  
	  System.out.println("Enter the length of height of the triangle");
	  
	  double h = sc.nextDouble() ;
	  
	  double area = 0.5*base*h ;
	  
	  System.out.println("Area of the triangle is "+area);
		
	}
	
	
	}
	
	



