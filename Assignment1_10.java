package basics_of_java;

public class Assignment1_10 {
	
	
	public static void main(String[] args) {		
				
		 assignMent1 () ;
		assignMent2 () ;
	
		 System.out.println ("Assignment 3 and 4") ;		
		 
		add();
		
		sub () ;
		
		mul () ;
		
		quotient () ;
		 reminder () ;		
		 
		 ifblock() ;		 
		
		 ifelseBlock () ;
		 
		 ifelseifBlock () ;
		 
		 nestedifelseBlock () ;	 
		 
		 assignment10 () ;
		 
		 logicalOperators() ;
		 
	}
	
	
	//WAP to print your name
	static void assignMent1 ()
	
	{
		
		
				System.out.println ("Assignment 1") ;
				
				System.out.println("My name is Azhakuvally Ponnambalam");
		
	}
	
	//Declare and initialize the variables for all datatypes.
	
	static void assignMent2 ()
	
	
	{
				
System.out.println ("Assignment 2") ;
		
		
		byte a = 1 ;
		short b = 25;
		int c = 50;
		long d = 344453984750937422l;
		double e = 1.654564564564564564564564645234567895 ;
		float f = 2.056f;
		char g = 'A' ;
		String h  = "India" ;
		boolean I  = true ;		
		
		
		
		System.out.println("byte datatype "+a);
		System.out.println("short datatype "+b);
		System.out.println("int datatype "+c);
		System.out.println("long datatype "+d);
		System.out.println("double datatype "+e);
		System.out.println("float datatype "+f);
		System.out.println("char datatype "+g);
		System.out.println("String datatype "+h);
		System.out.println("boolean datatype "+I);
		
		
	}
	
	
	

	//Call Static Methods inside the main method
	
	//Write a program on +,-,*,/ and % operators
	
	static void add ()
	
	{
		int a ;
		int b ;
		a = 5;
		b= 10 ;
		int c = a+b ;
		
		
		System.out.print("The sum is equal to ") ;
		System.out.println(c);
		
		
	}
	
	
	
  static void sub ()
	
	{
	  int a ;
	  
	  int b ;
		a = 60;
		b= 120 ;
		int c = a-b ;
		
		
		System.out.print("The subtraction is equal to ") ;
		System.out.println(c);
		
		
	}
	
  static void mul ()
	
	{
	  int a ;
	  
	  int b ;
		a = 60;
		b= 120 ;
		int c = a*b ;
		
		
		System.out.print("The product of 60 by 120 is equal to ") ;
		System.out.println(c);
		
		
	}
  
  
  static void quotient ()
	
	{
	  int a ;
	  
	  int b ;
		a = 600;
		b= 120 ;
		int c = a/b ;
		
		
		System.out.print("The quotient is ") ;
		System.out.println(c);
		
		
	}
  
  static void reminder ()
  
	{
		  int a ;
		  
		  int b ;
			a = 601;
			b= 120 ;
			int c = a%b ;
			
			
			System.out.print("The reminder is ") ;
			System.out.println(c);
			
			
		}
  
  //Write a Program on If else Block
  
  static void ifblock()
  
  
  
  {
	  System.out.println ("Assignment 5") ;
	  
	  int a  = 99 ;
	  
	  if (a==99)
		  
	  {
		  System.out.println("a=99"); 
	  }
	  
	  if(a>=10)
		  
		  
	  {
		  System.out.println("a is greater than or equal to 99"); 
	  }
	  
	  
	  
	  if (a<=100)
		  
		  
	  {
		  
		  System.out.println("a is lesser than or equal to 100"); 
	  }
	  
	  
	  if(a !=10)
		  
		  
	  {
		  System.out.println("a is not equal to 10"); 
	  }
	  
	  
	  
                   }
  
  //Write a Program on If else Block
  
  static void ifelseBlock ()
  
  
  
  {
	  System.out.println ("Assignment 6") ;
	  
	  int a = 100 ;
	 if(Math.incrementExact(a) ==101) 
	 
	 {
	 
	 System.out.println("The i++ of a is equal to 101"  ) ;
	 
	 
	 }
	 
	 else 
		 
	 {
		 System.out.println("Wrong answer"  ) ;
		 
	 }
	 
	 
  }
	  
  //Write a Program on If else if Block
  
	  static void ifelseifBlock ()
	  
	  {
		  
		  int q =100 ;
		  
		  System.out.println ("Assignment 7") ;
		  
		  if(Math.addExact(50, 50) > q)
			  
		  {
			  System.out.println("if block is true"  ) ;
		  }
		  
		  else if(Math.max(99, 100)>= q)
			  
		  {
			  System.out.println("else if block is true" ) ;
		  }
		  
		  
		  else
			  
			  
		  {
			  System.out.println("else block is true" ) ;
		  }
		  
	  }
	  
	
	//Write a Program on nested if Else Block_Case
	  
	  static void nestedifelseBlock ()
	  
	  {
		  
		  int independenceyearofindia = 1947 ;
		  
		  
		  if(independenceyearofindia >= 1940)
			  
		  {
			
			  
			  System.out.println ("Assignment 8") ;
			  
			  if(independenceyearofindia >= 1941)
			  {
				  
				  System.out.println ("Independence of india was after 1941") ;
				  
			  }
			  if(independenceyearofindia >= 1942)
				  
			  {
				  
				  System.out.println ("Independence of india was after 1942") ;
				  
			  }
			  else if (independenceyearofindia == 1947)
			  
			  {
				  
				  System.out.println ("Independence of india was on 1947") ;
				  
			  }
			  
			  else
				  
			  {
				  System.out.println ("Not fount") ;
			  }
			  
			  
			  
			  
			  
		  }
		  
		  else if (independenceyearofindia == 1948)
			  
		  {
			  System.out.println ("Independence of india was on 1948") ;  
		  }
		  
		  else
			  
		  {
			  System.out.println ("Not fount") ;
		  }
		  
	  }
	  
	  
	  
	  static void assignment10 ()
	  
	  {
		  
		  System.out.println("Assignment 10") ;
		  
		  
		  int age = 50 ;
		  
		  int mineligibleagetovote = Math.incrementExact(17) ;
		  
		  
		  if(age >=mineligibleagetovote)
			  
		  {
			  System.out.println("This person is eligible to vote.") ; 
		  }
		  
		  else
			  
		  {
			  System.out.println("This person is not eligible to vote.") ; 
		  }
		  
		  
	  }
	  
	  
	  static void logicalOperators()
	  
	  {
		  
		  System.out.println( "Assignment 9" );  
		
		  
		  int a = 5 ;
		  int b = 5;
		  int c = a & b ;
		  
		  System.out.println( a+"="+b+"="+c );
		  
		  
		 
		  
	  }
	  
	  
  }
  
  
  
