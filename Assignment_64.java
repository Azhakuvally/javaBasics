package basics_of_java;

public class Assignment_64 {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("India") ;
		s1.append(" is country") ;
		System.out.println(s1);
		s1.insert(8, " my") ;
		System.out.println(s1);
		s1.replace(0, 5, "INDIA") ;
		System.out.println(s1);
		s1.append(53463132) ;
		
		System.out.println(s1);
		
		s1.delete(s1.length()-8, s1.length()) ;
		System.out.println(s1);
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.substring(0, 5));
		
		s1.insert(s1.length(), ", I love india verymuch") ;
		System.out.println(s1);
		
		s1.delete(s1.length()-8, s1.length()) ;
		System.out.println(s1);
		
		s1.reverse() ;
		
		System.out.println(s1);
		
		s1.reverse() ;
		System.out.println(s1);
		s1.append(".");
		System.out.println(s1);
		
		
		
		
		
		

	}

}
