package basics_of_java;

public class Final_Variable {
	
	final  static double pivalue = 3.14; //final variable global

	public static void main(String[] args) {
		
		
		
		
		final int continents = 7 ; //final variable local
		
		final double evalue = Math.E ; 
		
		System.out.println(pivalue + evalue);
		
		System.out.println(Math.addExact(continents, continents));
		
		
		
		
		
		Final_Variable FV1 = new Final_Variable () ;  
		
		
		
		FV1.add();
		
		FV1.sub();

	}
	
	
	void add ()
	
	{
		
		
		
		
		
		//final double evalue = Math.E ;  //final variable local
		
			
		
		//System.out.println(pivalue + evalue);
		
	//	pivalue = 100 ; // final variable can not be updated
		
	}
	
	
	void sub ()
	
	{
		
		System.out.println(Math.pow(pivalue, pivalue));
		
		
		
	}
	
	

}
