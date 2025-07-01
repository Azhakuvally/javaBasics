package basics_of_java;

public class String_buffer {

	public static void main(String[] args) {
		
		
	 
		StringBuffer s1 = new StringBuffer("Chockalingam") ;
		s1.delete(1, 5) ;
		System.out.println(s1);
		s1.append("G") ;
		System.out.println(s1);
		s1.insert(1, "hock") ;
		System.out.println(s1);
		
		test() ;
		 

	}
	
	static void test()
	
	{
		StringBuffer s1 = new StringBuffer(5);
		s1.append("Ram") ;
		System.out.println(s1);
		s1.append("an") ; 
		System.out.println(s1);
		s1.append("Ayyangar") ; 
		System.out.println(s1);
		System.out.println(s1.capacity());
		s1.ensureCapacity(15);
		s1.append("Sir");
		System.out.println(s1);
	}
	

}
