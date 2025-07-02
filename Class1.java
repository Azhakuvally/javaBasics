package p1;

public class Class1 extends Class2

{

	 //super key word
	
	
	public static void main(String[] args) {
		
		// we can call the non static methods of parent class with the use of object created for child class
		
		Class1 obj = new Class1() ; 
		
	obj.A1(5, 10);
		obj.sub(10.5,0.5) ;
		
	}
	
	void A1 (int x, int y)
	
	{
		
		
		
		 System.out.println(x) ;	//5
		 
		 super.A1(60, 40);//100
		 
	}
	
	void sub(double a , double b)
	
	{
		
		super.sub(20.5,0.5);//10.25(a*b)
		
		 System.out.println(a-b) ;//10
		
	}
	

	
}
