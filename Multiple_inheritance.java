package p1;

public class Multiple_inheritance implements I1,I2



  
{

	public static void main(String[] args) {
		
		Multiple_inheritance ob = new Multiple_inheritance();
		
		ob.add();
		ob.sub();
		ob.concat();
		ob.sum();
		ob.total(5, 5) ;
		
	

	}

	@Override
	public byte add() {
		System.out.println('A');
		return 0;
	}

	@Override
	public float sub() {
		System.out.println('B');
		return 0;
	}

	@Override
	public String concat() {
		System.out.println('C');
		return null;
	}

	@Override
	public boolean sum() {

		System.out.println('D');
		return false;
	}

	@Override
	public float total(int a, int b) {

		System.out.println(a+b);

		return 0;
	}

}


interface I1

{
	int a = 5 ;//public static and final
	

	
	String concat() ;
	boolean sum() ;
	
	float total (int a, int b) ;
	
}


interface I2


{
	
	byte add () ;
	float sub () ;
	
}