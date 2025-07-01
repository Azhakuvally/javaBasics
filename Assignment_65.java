package basics_of_java;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Assignment_65 {

	public static void main(String[] args) throws MalformedURLException, FileNotFoundException {
		
   
		int a =1;
		int b =0;
		
		if (a==b)
		{
		
		throw new MalformedURLException("Hello World") ;
		}
		
		else
		{
			throw new FileNotFoundException() ;
		}
		
	}

}
