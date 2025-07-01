package Constructor;



public class Chaining 

{
	
	//this calling statement is used to call multiple constructors of a same class with single object
	

	public static void main(String[] args) {
		
		 new Chaining(7) ;
		 
	}

	Chaining()
	
	{
		this(false); //this calling statement should always be the first line in every constructor
		System.out.println('Z'); //n-1
		
	}
	
	
	
	Chaining(int a)
	
	{
		
		this() ;
		
		System.out.println('A');//final, n
		
		
	}
	
	Chaining (boolean H)
	
	{
		this('A') ;
		
		System.out.println('B'); //n-2
		
	}
	
	Chaining (char G)
	
	{
	 
		this(5.7f) ;
		
		
		System.out.println('C'); //n-3
		
	}
	
	
	Chaining(float a)
	
	{
		
		
		System.out.println('D') ;//n-4           
		
	}
	
	
}
