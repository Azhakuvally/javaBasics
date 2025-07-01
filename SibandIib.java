package basics_of_java;

public class SibandIib {
	
	static
	{
		
		System.out.println("This is SIB");
	}
	
	
	{
		
		System.out.println("This is IIB");
		
	}

	public static void main(String[] args) {
		
		SibandIib ob = new SibandIib() ;
		
		ob.mul(5, 10);
		add(80,20) ;

	}
	
	SibandIib()
	
	{
		
		System.out.println("This is Constructor");
		
	}
	
	
	
	static void add (int x, int y)
	
	{
		
		int z = x+y;
		System.out.println(z);
		
	}
	
	void mul(int a , int b)
	
	{
		
		int c = a*b ;
		
		System.out.println(c);
		
	}

}
