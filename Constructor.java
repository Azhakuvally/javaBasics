package basics_of_java;

public class Constructor {

	public static void main(String[] args) {
		
		//Constructor c1 =new Constructor(2.5,2.5) ; //jus creating a object is required, no need to call it will automatically execute
		
		
		
	
		
		new Constructor () ;//this the another way of creating an object to call the constructor
		new Constructor () ;//we can create objects multiple time to call the constructor multiple time
		new Constructor () ;
		new Constructor () ;
		new Constructor () ;
		new Constructor () ;
		          
		new Constructor (7 ,8) ;
		new Constructor (5,5) ;
		new Constructor (10,10) ;
		new Constructor (1.5,5.5) ;
		
		
		new Constructor(2.5,2.5) ; // when overloading concept comes to picture we call call method or constructor by differentiating different set of data types in the paranthesis
		
		new Constructor(true) ;
		new Constructor (false) ;
		
		
		
	}
	
	
	Constructor ()   //constructors are always non static 
	
	{
		System.out.println("Good Morning");
		
	}

	
	Constructor (int a , int b)  //Constructor overloading
	
	
	{
		
		
		System.out.println(a+b);
		
			
		
	}
	
	Constructor (double a, double b)   //Constructor overloading
	
	{
		System.out.println(a+b);
		
		
		
		

		
	}
	
	
	
	
	Constructor (boolean b)

	{
		System.out.println(b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
