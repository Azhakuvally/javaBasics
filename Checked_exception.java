package basics_of_java;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class Checked_exception {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, MalformedURLException {
		
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\chock\\Desktop\\Assignment 59_64\\.docx") ;
		
		URL u1 = new URL("https://www.youtube.com/") ;
		
		for(int i = 0 ; i<= 10 ;i++)
			
		{
			
			Thread.sleep(2000);
			
			System.out.println(i);
			
		}

	}

}
