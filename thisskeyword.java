package basics_of_java;

import java.util.Scanner;

public class thisskeyword {

	int a  =100;
	int b = 200 ;
	 Scanner sc = new Scanner(System.in) ;
	public static void main(String[] args) {
	
		
		thisskeyword ob = new thisskeyword() ;
		ob.add (0 ,0) ;
	}

	
	public void add (int x ,int y)
	
	{
		
		System.out.println("Enter 2 int values") ;
		
		x = sc.nextInt() ;
		y = sc.nextInt() ;
		this.a =x ;
		this.b = y ;
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
}
