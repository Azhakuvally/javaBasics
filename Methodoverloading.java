package basics_of_java;

public class Methodoverloading {
	
	//static

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(5,5) ;  // this will call the first add method as both the parameters are of type int
		add(2.5,2.5) ;// this will call the second add method as both the parameters are of type double
		add(2,2.5) ;  //3rd,int and double
		add(2.5,6) ; //4th,double and int
		add( 90,90,3.5) ; //5th int int ,double
		add(.5,.5,5) ;  //6th double, double , int

	}

	
	static void add (int a,int b) 
	
	{
		
		 int sum = a+b ;
		System.out.println(sum);
	}
	
	
	static void add (double a,double b) 
	
	{
		double sum = a+b ;
			System.out.println(sum);
	}
	
	static void add (int a,double b) 
	
	{
		
		double sum = a+b ;
		System.out.println(sum);
		
	}
	
	static void add (double a,int b) 
	
	{
		double sum = a+b ;
		System.out.println(sum);
	}
	
	static void add (int a,int b,double c) 
	
	{
		double sum = a+b+c ;
		System.out.println(sum);
	}
	
	static void add (double a,double b,int c) 
	
	{
		double sum = a+b+c ;
		System.out.println(sum);
	}
	
}
