package basics_of_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionProgram {

	public static void main(String[] args) {
		
		

	ArrayList<String> a4 = new ArrayList<String> () ;
	
	a4.add("Chocka") ;
	a4.add("JINK" ) ;
	a4.add("Ammu") ;
	a4.add("Bhijju") ;
	
	System.out.println(a4);

		a4.lis

	ListIterator <String> i2 = a4.listIterator() ;
	
	System.out.println("forward iteration");

while (i2.hasNext())
{
	System.out.println(i2.next()) ;
}
			
System.out.println("Backward iteration");
while(i2.hasPrevious())
	
{
	System.out.println(i2.previous());
}

		System.out.println(a4.lastIndexOf("Ammu"));

	}

}
