package basics_of_java;

public class String_Class {

	public static void main(String[] args) {
		
		
		String a = "I Love Automation Testing" ;
		
		String b = a.toUpperCase() ;
		System.out.println(b);
		
		String c = a.toLowerCase() ;
		System.out.println(c);
		
		int d = a.length() ;
		System.out.println(d);
		
		String e = a.substring(3) ;
		System.out.println(e);
		
		String f = a.substring(0, 6) ;
		
		System.out.println(f);
		
		boolean g = a.equals("I Love Automation Testing") ;
		System.out.println(g);
		
		boolean h = a.equalsIgnoreCase("i love automation testing") ;
		System.out.println(h);
		
		boolean i = a.contains("Love") ;
		
		System.out.println(i);
		
		String j = " very much" ;
		
		String k = a.concat(j) ;
		System.out.println(k);
		
		char l = a.charAt(5) ;
		System.out.println(l);
		
		int m = a.indexOf('a') ;
		
		System.out.println(m);
		
		
		String n = "welcome to java" ;
		
		String o = ((n.replace('w', 'W')).replace('t', 'T')).replace('j', 'J') ;
			
		
		System.out.println(o);
		
	
	
	}

}
