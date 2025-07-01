package basics_of_java;

public class If_elseif_block {
	
	

	//first checks for if condtion if it is tru then it will execute if it is not true, 
	//then it will check for else if block, if it is tru then it will execute if it is not true,then else block will execute
	
	
	public static void main(String[] args) {
		
	int a = 5 ;
	int b = 10 ;
	
		
		
		if(b==10)
			
		{
			System.out.println("b = 10");   //True
		}
		
		else if(a<=b)
			
		{
			System.out.println("a< = b");  //True
		}
		
		
		else 		
		
		{
			System.out.println("Hi");
		}
		
		// if block executes
		
		
		elseifTrue () ;  //if else executes
		elseTrue () ; //else block will execute
		
		
		

	}

	
	
	static void elseifTrue ()
	
	{
		
		
		
		int a = 100 ;
		int b = 200 ;
		
			
			
			if(b==15)
				
			{
				System.out.println("b = 15"); //False
			}
			
			else if(a<=b)
				
			{
				System.out.println("a< = b"); //True
			}
			
			
			else 		
			
			{
				System.out.println("Hi");
			}
		
	}
		
			static void elseTrue ()
			
			{
				
				
				
				int a = 100 ;
				int b = 200 ;
				
					
					
					if(b==15)
						
					{
						System.out.println("b = 15"); //False
					}
					
					else if(a==b)
						
					{
						System.out.println("a< = b"); //False
					}
					
					
					else 		
					
					{
						System.out.println("Hi");
					}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}



