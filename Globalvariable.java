package basics_of_java;

//updating non static global method

public class Globalvariable {
	
	 int a =100; //non static global variable
	int b = 200 ; //non static global variable
	
	static int p =500 ;
	static int q = 150 ;

	public static void main(String[] args) {		
		
		Globalvariable g1 = new Globalvariable() ;  /*we are creating object to update the global variable 
		                                            because the global variable of this class is non static
	                                         	                                            */
		
		//g1.a = 500 ;
		//g1.b = 700 ;  
		//	System.out.println(g1.a);
	//	System.out.println(g1.b);
		//g1.multi();
		
		//add() ;
		g1.sub();
		//g1.mul();	

	}
	
	
	void multi()
	
	{
		
		System.out.println(p+q);
		
	}
	
    static void add()
    
    {
    
    	
    	Globalvariable g2 = new Globalvariable () ; /*we are creating object to update the global variable 
                                                    because the global variable of this class is non static */
        
    	
    	                                               
    	
    	g2.a = 60 ; 
    	
    	g2.b = 50 ;
    	
    	System.out.println(g2.a+g2.b);
    	
    	System.out.println(p+q);
    	
    	p =8000 ;
    	q = 1 ;
    }
    
    void sub () // non static
    
    {
    	//Globalvariable g3 = new Globalvariable () ;/*we are creating object to update the global variable 
                                                     //because the global variable of this class is non static */
    	//g3.a = 1500 ;
    	//g3.b = 500 ;
    	
    	System.out.println(a-b); 
    	System.out.println(p-q);    	
    }
    
    
    void mul()
    
    {
    	Globalvariable g4 = new Globalvariable () ;  /*we are creating object to update the global variable 
                                                       because the global variable of this class is non static */
    	g4.a = 5 ;
    	g4.b = 6 ;
    	
    	System.out.println(g4.a*g4.b);
    }

}
