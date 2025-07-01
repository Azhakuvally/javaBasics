package basics_of_java;

public class Assignment_61 {

	public static void main(String[] args) {
		
		String S = "I Love Automation Testing" ;
		
		//replace all the capital letters with Special char @
		
	String S1	=S.replaceAll("[A-Z]", "@") ;
	System.out.println(S1);
	
	//replace all the small letters with Special char !
	
	String S2 = S.replaceAll("[a-z]","!") ;
	System.out.println(S2);
	
	//replace all the numeric digit in the string with *
	
	String M = "I was born on 1993" ;
	        String M1 = M.replaceAll("[0-9]", "*") ;
	        
	        System.out.println(M1);

	}

}
