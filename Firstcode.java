package basics_of_java;

public class Firstcode {

//Arithmetic operators ;
	
	
	
	public static void main(String[] args) {
	
		
		Firstcode ob = new Firstcode() ;
		ob.name();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
		ob.mod();
		ob.condition();
			
		
	}
		
	
	public  void add()
	{

		int a = 50 ;
		int b = 50 ;
		
		
	System.out.print("The sum is ");
		 System.out.println(a+b);
}
	
private	 void div ()
	
	{
		double a = 45;
		double b = 20 ;
		double c = a/b ;
		
		
		System.out.println(c);
		
	}
	
	
protected void sub()

	
	{
		int a = 10;
		int b =5;
		int c = a-b ;
		
		 System.out.println(c);
		
	}
	


 void mod()

{
	byte a = 50;
	byte b = 4 ;
	int c = a%b ;
	
	System.out.println(c);
	
	
}
	

 void mul()

{
	
	double a = 1.5 ;
	float b = 1.5f ;
	
	double c = a*b ;
	
	
	
	
	System.out.println(c) ;
	
	
}

 void name ()

{
	
	String A = "I will be a good automation tester" ;
	
	System.out.println(A);
	
	
}


 void condition ()


{
	
	byte age = 20 ;
	boolean A = true ;
	boolean B = false ;
	
	if(age >=18)  
		
	{
		System.out.println(A);
	}
	
	else 
		
		
		System.out.println(B);
	
}


}




