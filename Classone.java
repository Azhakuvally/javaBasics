package p1;

public class Classone implements Interface1 //Child class always should be public in nature

{
 static Classone ob =new Classone() ;


	public static void main(String[] args) {
		

		
			ob.add() ;
			ob.sub();
	}


	@Override
	public void add() {
		System.out.println('A');
		
	}


	@Override
	public void sub() {       //the imported methods are from interface those are public in nature , hence here also public is displaying for method
		System.out.println('B');
		
	}

}




 interface Interface1 {

	
	void add() ;//abstract methods in interface hence no need to use abstract key word
	void sub() ;//public by default
	
}



