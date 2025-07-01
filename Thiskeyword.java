package basics_of_java;



public class Thiskeyword {
	
	
	int a = 10 ;
	String S = "Indians are great" ;
	char C = 'C' ;

	public static void main(String[] args) {
		
		Thiskeyword ob = new Thiskeyword() ;
		ob.thiss(5, "I'am indian", 'F');
		
		
		

	}
	
	
	void thiss(int num,String T,char O)
	
	{
		
			
		this.a =num ;//assigning local variable to global variable
		
		this.S = T ;
		
		this.C = O ;
		
		   
		
		
		System.out.println(a);
		System.out.println(S);
		System.out.println(C);
	}

}
