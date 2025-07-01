package basics_of_java;

public class Nested_if_else_if_block {

	public static void main(String[] args) {
		
		
		// firstC1iftrue () ;
		
		// firstC1elseifTrue() ;
		
		//firstC1elseTrue() ;
		
		citizenship() ;
		
		
		//p1else() ;
}
	
		
	
	public static void firstC1iftrue ()
	
	
	{
		
		
		int a =100 ;
		int b =200 ;
		
		if(a<=b) //p1if
			
		{
			
			
			
				
				
				if(b==200)  //C1if
					
				{
					System.out.println("b = 200");   //True
				}
				
				else if(a<=b) //C1 elseif
					
				{
					System.out.println("a< = b");  //True //but will not execute
				}
				
				
				else 	//c1else	
				
				{
					System.out.println("Hi");
				}
			
		
			
		}
		
		else //P1else
			
		{
			System.out.println("Bye");
		}
	}
	
	
	
	
	public static void firstC1elseifTrue()
	
	
	{
		
		int a =100 ;
		int b =200 ;
		
		if(a<=b) //p1if
			
		{
			
			
			
				
				
				if(b==300)  //C1if   //false //will not execute
					
				{
					System.out.println("a==300");  
				}
				
				else if(a<=b) //C1 elseif  //True ,will execute because C1 if was false
					
				{
					System.out.println("a< = b");  
				}
				
				
				else 	//C1else	
				
				{
					System.out.println("Hi");  
				}
			
		
			
		}
		
		else //p1else
			
		{
			System.out.println("Bye");
		}
		
		
	}
		
		public static void firstC1elseTrue()
		
		
		{
			
			int a =100 ;
			int b =200 ;
			
			if(a<=b) //p1if //true
				
			{
				
				
				
					
					
					if(b==300)  //C1if   //false //will not execute
						
					{
						System.out.println("a==300");  
					}
					
					else if(a==b) //C1 elseif  //false and will not execute
						
					{
						System.out.println("a< = b");  
					}
					
					
					else 	//C1else	executing because parent if is true
					
					{
						System.out.println("Hi");  
					}
				
			
				
			}
			
			else //p1else
				
			{
				System.out.println("Bye");
			}
		
		
		
		
		
	}
	
	
		
public static void p1else()
		
		
		{
			
			int a =100 ;
			int b =200 ;
			
			if(a==b) //p1if //true
				
			{
				
				
				
					
					
					if(b==300)  //C1if   //false //will not execute
						
					{
						System.out.println("a==300");  
					}
					
					else if(a==b) //C1 elseif  //false and will not execute
						
					{
						System.out.println("b ==600");  
					}
					
					
					else 	//C1else	executing because parent if is true
					
					{
						System.out.println("Hi");  
					}
				
			
				
			}
			
			else //p1else
				
			{
				System.out.println("Bye"); // will execute because parent if was false control directly comes to parent else
			}
		
		
		
		
		
	}
	
		
	

 protected static void citizenship()
 
 
 
 
 {
	 
	 int a = 10 ;
	 
	 boolean B = false ;
	 boolean C = true ;
	 
	 if (a > 9) //Parent if
		 
		
		 
	 {
		
		 if(a>1)  //child if
			 
			 
		 {
			 if(a>15) //C1
				 
			 {
				 if(a>1) //Grand child if
					 
				 {
					 if (a>11)
					 {
						 System.out.println("a=10"); //Great grand child if
					 }
					 else
						 
					 {
						 System.out.println("a==10"); //Great grand child else
						 
					 }
				 }
				 
				 else //Grand child else
					 
				 {
					 
				 }
			 }
			 
			 
			 else // C1 else
			 {
				 System.out.println(C); 
			 }
			 
			 
		 }
		 
		 else // Child else
		 
		 {
			 System.out.println(B);
			 
		 }
		 
		 
		 
	 }
	 
	 
	 else // Parent else
		 
	 {
		 System.out.println("Parent else");
	 }
	 
	 
	 
	 
 }




}
