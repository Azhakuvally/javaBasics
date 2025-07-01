package basics_of_java;

public class Multiple_inheri implements  Interface1 , Interface2

{

	public static void main(String[] args) {
		Multiple_inheri ob = new Multiple_inheri() ;
		ob.add();
		ob.sub() ;
		ob.mul();
		ob.div() ;

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("div");
	}

}
	
	interface Interface1
	
	{
		
		void add() ;
		void sub() ;
		
		
	}
	
	
	
	interface Interface2
	
	{
		void mul() ;
		void div() ;
		
	}

