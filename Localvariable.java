package basics_of_java;

public class Localvariable {
	
	
	
	int Q = 5 ;
	static int R = 3 ;
	
	

	public static void main(String[] args) {

   int a  = 100 ;
   int Z = 900 ;
		
		System.out.println(a+Z);
		
		Localvariable F1 = new Localvariable () ;
		
		
	 System.out.println(F1.Q+R);
	 
	 add () ;

	}
	
	
	static void add ()
	
	{
		int a = 700 ;
		int Z = 1000 ;
		
		Localvariable F2 = new Localvariable() ;
		
		
		System.out.println(a+Z);
		 System.out.println(F2.Q+R);
		
		
	}

}
