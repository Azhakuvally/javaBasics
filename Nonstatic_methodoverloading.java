package basics_of_java;

public class Nonstatic_methodoverloading {
	
	
	// method overloading permits similar method name for multiple methods, but data type of arguments and its order of occurance is different

	public static void main(String[] args) {
		
		
		Nonstatic_methodoverloading nm1 = new Nonstatic_methodoverloading () ;
		nm1.mul(5, 5); // calling first mul method as both variable are of int type
		nm1.mul(0.6, 0.6, 1);
		nm1.mul(2, 2, .5);
		nm1.mul(.5, .5);
		nm1.mul(2, 2, 2);

	}
	
	void mul(int a,int b)
	
	{
		int ans = a*b ;
		System.out.println(ans);
		
	}


	void mul(double a, double b,int c)
	
	{
		double ans = a*b*c ;
		System.out.println(ans);
		
	}
	void mul(int a, int b ,double c)
	
	{
		double ans = a*b*c ;
		System.out.println(ans);
		
	}
	void mul(double a,double b)
	
	{
		double ans = a*b ;
		System.out.println(ans);
		
	}
	void mul(int a,int b,int c)
	
	{
		
		int ans = a*b*c ;
		System.out.println(ans);
		
		
	}
	
}
