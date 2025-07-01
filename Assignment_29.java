package basics_of_java;

import java.util.Scanner;

public class Assignment_29 {

	static Scanner sc = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		
add();
sub();
mul();
min();
	}
	
	



	static void add ()
{
	System.out.println("Enter 2 integers to be added");
	int a = sc.nextInt() ;
	int b = sc.nextInt() ;
	System.out.println(Math.addExact(a, b));
	
	
}

static void sub()

{
	System.out.println("Enter 2 integers to be subtracted");
	int a = sc.nextInt() ;
	int b = sc.nextInt() ;
	System.out.println(Math.subtractExact(a, b));
	
}

static void mul ()

{
	System.out.println("Enter 2 integers to be multiplied");
	int a = sc.nextInt() ;
	int b = sc.nextInt() ;
	System.out.println(Math.multiplyExact(a, b) );
	
}


static void min()

{
	System.out.println("Enter 2 integers to find minimum");
	int a = sc.nextInt() ;
	int b = sc.nextInt() ;
	System.out.println(Math.min(a, b) );
	
}

}