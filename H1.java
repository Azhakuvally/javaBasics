package p1; //within the package access specifier

import java.util.Scanner;

public class H1

{

	public static void main(String[] args) {

		Second_class OB =new Second_class() ;
		OB.add();
		OB.sub();
		OB.mul();
		//OB.mod() ; protected method is not accessible within the package but in different class
		
		

	}
	
	
}
	
	
	class Second_class
	
	{
	
		Scanner sc = new Scanner (System.in) ;
		
		
		
		public void add()
		
		{
			
			System.out.println("Enter 2 integers to be added");
			
			int a = sc.nextInt() ;
			
			int b = sc.nextInt() ;
			
			
			//double r =sc.nextDouble() ;
			
		
		System.out.println(a+b);
		
		
		
		
		}
		
		
		protected void sub()
		
		{
			System.out.println("Enter 2 integers to be subtracted");
			
			
             int a = sc.nextInt() ;
			
			int b = sc.nextInt() ;
			
			System.out.println(a-b);
		}
		
		
		
		
		void mul()
		
		
		{
			
			System.out.println("Enter 2 integers to be multiplied");
			
			
            int a = sc.nextInt() ;
			
			int b = sc.nextInt() ;
			
			System.out.println(a*b);
			
		}
		
		private void mod()
		
		{
			System.out.println("Enter 2 integers to find the divider");
			
            int a = sc.nextInt() ;
			
			int b = sc.nextInt() ;
			
			System.out.println(a%b);
			
			
		}
		
	}


