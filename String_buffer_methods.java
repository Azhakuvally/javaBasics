package basics_of_java;

public class String_buffer_methods {

	public static void main(String[] args) {
		add() ;
		 StringBuffer sb = new StringBuffer("Automation") ;
		 sb.append(" Testing") ;
		 
		// System.out.println(sb);
		 
		 sb.insert(18, " is easy") ;
		 
		// System.out.println(sb);
		 
		 
		 
		 
		 StringBuffer s1 = new StringBuffer ("Ram hari") ;
		 
		 s1.replace(0, 3, "anu") ;
		// System.out.println(s1);
		 
		 s1.reverse() ;
		// System.out.println(s1) ;
		 
		 s1.capacity() ;
		 System.out.println(s1);
		 
		 s1.ensureCapacity(16);
		 
		 System.out.println(s1);
		 
		 s1.reverse() ;
		 System.out.println(s1);
		 
		 
		
		
	}
	
	
	 static void add()
	
	{
		 
		 StringBuffer s1= new StringBuffer(50) ;
		 s1.append('D') ;
		 
		 System.out.println(s1);
		 
		 s1.ensureCapacity(49);
		
	}

}
