package p1;

public class Slinheritance extends C1

{
	
	
	void mul (int x , int y)
	
	{
		
		System.out.println(x*y);
		
	}

	public static void main(String[] args) {
	
		
		Slinheritance ob = new  Slinheritance() ;
		
   ob.add(100, 900);
   ob.mul(50, 50);
	}

}

class C1

{
	
	void add(int a, int b)
	
	{
		
		System.out.println(a+b);
		
	}
	
	
}
