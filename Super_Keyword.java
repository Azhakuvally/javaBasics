package basics_of_java;

public class Super_Keyword extends parent1

{

	public static void main(String[] args) {
		
		Super_Keyword o1 = new Super_Keyword() ;
		o1.add(15, 15);
		o1.mul(1, 20);
	}
	
	void add (int a,int b)//1st
	
	{
		System.out.println(a+b);
		super.add(25, 20);
	}

}

class parent1 extends Parent2

{
	void add(int a,int b)//2nd
	
	{
		
		System.out.println(b);
	}
	
	void mul(int a, int b)//3rd
	
	{
		System.out.println(a);
		super.mul(20, 10);
	}
	
}


class Parent2

{
	
void mul(int a, int b)//4th
	
	{
		System.out.println(a*b);
		
	}
}
