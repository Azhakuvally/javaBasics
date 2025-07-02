package p1;

import java.util.Scanner;

//Scanner class , method overriding, super key word.

public class Class3 extends Class4

{
	static Scanner sc = new Scanner(System.in) ;
	static Class3 ob1 = new Class3() ;
	 
	
 public static void main(String[] args)
 
 {
	 
	 ob1.add();
	 
 }
	
 
  void add () // method name and signature (Return type and parameter ) are same as that of parent class method)
  
  {
	  
	  super.add(); // we use super key word to overcome method overriding.
	  System.out.println("Enter 2 integers");
	  
	  int a = sc.nextInt() ;
	  int b = sc.nextInt() ;
	  
	  
	  int c = a+b ;
	  
	  System.out.println(c);
	  
  }
	

} 
