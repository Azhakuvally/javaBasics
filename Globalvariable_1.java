package basics_of_java;

public class Globalvariable_1 {
	
	
	static int X = 700 ;
	static int Y = 400 ;

	public static void main(String[] args) {
		
		
		
		Globalvariable_1 ob = new Globalvariable_1 () ;
		ob.add();
		ob.sub();
		ob.mul();
		

	}

	 void add ()
	
	
	
	{
		
		 X = 500 ;   //we can update static global variable without creating object
		 Y = 300 ; 
		 System.out.println(X+Y);
		 
		 
	}
	
	
	void sub ()
	
	{
		
		X =600 ;
		
		 System.out.println(X-Y); //value of Y = 300 , as you have updated the global variable in the previous method.
		
	}
	
	void mul ()
	
	
	{
		
		Y =7 ;
		X =6 ;
		 System.out.println(X*Y);
		
	}
	
}
