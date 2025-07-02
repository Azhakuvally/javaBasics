package p1;



public class Multiinheritance extends Cone


{





	public static void main(String[] args) {
		
		Multiinheritance ob = new Multiinheritance () ;
		
		ob.add(50, 50);
		ob.div(50, 5);
		ob.mul(50, 4);
		ob.mod(100, 10);

	}

}


class Cone extends C2

{
	
	
	void add(int a , int b)
	
	{
		System.out.println(a+b);
		
	}
	
}


class C2 extends C3
{
	
	void mul (int a , int b)
	
	{
		System.out.println(a*b);
		
		
	}
	
}



class C3 extends C4

{
	
	void mod(int a , int b)
	
	{
		
		System.out.println(a%b);
		
	}
	
	
}


class C4
{
	
	void div(int a , int b)
	
	{
		System.out.println(a/b);
		
		
	}
	
}