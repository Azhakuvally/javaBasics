package basics_of_java;

public class Ifelseblock {
	
	int a = 5 ;

	public static void main(String[] args) {

		Ifelseblock ob1 = new Ifelseblock () ;
		
		ob1.ifelseblock();
		
		
		//Control will go to all the if else block if the if condition is tru then it will exexute 
		//if it is false then else will execute
		//either if block or else block will execute in if else block.
		
		

	}

	public void ifelseblock ()
	
	{
		
		if(a==5)
		{
			System.out.println("a = 5");
		}
		else
			
		{
			System.out.println("a is not equal to  5");
		}
		
		if(a>9)
			
		{
			System.out.println("a is greater than 9");
		}
		else
			
		{
			System.out.println("a is less than 9");
		}
		
		if(a<10)
		{
			System.out.println("a is less than 10");
		}
		
		else
			
		{
			System.out.println("a is greater than 10");
		}
		
	}
	
}
