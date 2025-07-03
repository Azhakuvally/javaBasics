package p2;

public class C2_child extends C1_parent

{
 int a = 50 ;
	
	
	public static void main(String[] args) {
	
		
		C1_parent ob = (C1_parent)new C2_child () ; //explicit upcasting
		ob.add();
		ob.sub();
		
		
		C2_child o1 = (C2_child) ob ; //explicit downcasting
		
		
		

	}

	
	void mul (int s )

	{
		int z = s*10 ;
		this.a  =z ;
		
		System.out.println(a);
	}
	void add ()
	
	{
		
		
		int a = 5 ;
	   int 	b = 10 ;
		int c = a+b ;
		System.out.println(c);
		super.add();
	}
	
	void mod (int x , int y)
	
	{
		int z = x*y ;
	this.a=	z ;
	
	System.out.println(a);
		
	}
	
}
