package basics_of_java;

public class Assignment_33 implements Int1

{

	public static void main(String[] args) {
		Assignment_33 ob = new Assignment_33() ;
ob.add();
ob.sub();
ob.mul();
ob.mod();
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul");
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		
		System.out.println("mod");
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

}

interface Int1 extends Int2


{
	void add() ;
	void sub() ;
	
}

interface Int2

{
	
	void mul() ;
	void mod() ;
	
}

