package basics_of_java;

public class Reverse_String {

	public static void main(String[] args) {
		
      String A = "Azhakuvally Ponnambalam" ;
      
     int b= A.length() -1 ;
      
     // System.out.println(b);
      
      for (int i = b; i>=0 ;i--)
    	  
      {
    	  char value = A.charAt(i) ;
    	  
    	  String output = ""+value ;
    	  System.out.print(output);
      }
      
	}
}