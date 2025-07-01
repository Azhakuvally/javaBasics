package basics_of_java;

public class Methodoverrid extends Parent1

{

	public static void main(String[] args) {
		
		Methodoverrid ob = new Methodoverrid() ;
         ob.mul(50,2);
	}
	
	
	void mul(int x, int y)
	
	{
		
		System.out.println(x*y) ;
		
	}

}

class Parent1

{
void mul(int x, int y)
	
	{
		System.out.println(x) ;
		
	}
	
}
