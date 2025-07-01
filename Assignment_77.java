package basics_of_java;



public class Assignment_77 {
	
	public static void main (String[] args)
	{
	
       String s = "Anu1234" ;
       
     String A =   s.substring(0, 3) ;
     System.out.println(A);
 
       
       System.out.println(s.indexOf('A') );
       
      int l=  s.length() ;
      
     String s1 = s.toUpperCase() ;
     String s2 = s.toLowerCase() ;
     System.out.println(s2);
      System.out.println(s1);
      
      System.out.println( s1.equals(s2)) ;
      
      System.out.println(s1.equalsIgnoreCase(s2));
    boolean b =   s.contains("1235");
    System.out.println(b);
      
      
       
      System.out.println(l);
      
       String [] Array1 = new String[5 ] ;
       
       int n = Array1.length ;
       
       System.out.println(n);
      
       
	}

}
