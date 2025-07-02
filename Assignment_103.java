package p1;

import java.util.Collections;

import java.util.Set;


public class Assignment_103 {

	public static void main(String[] args) {
		
		
		//singleton
		
		
		Set <String>set = Collections.singleton("Java");
		
		System.out.println(set);
		
		try
		{
		set.add(".Net");
		}
		
		catch(java.lang.UnsupportedOperationException exp1)
		
		{
			System.out.println("Handled the exception");
		}
		
		
	}

}
