package basics_of_java;

import java.util.Arrays;
import java.util.Scanner;

public class Array_problem2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Enter the size of the array");
		
		int size = sc.nextInt() ;
		
		String [] name = new String [size] ;
		
		System.out.println("Enter the String value to be place inside the array");
		
		for (int i =0;i<size;i++)
		{
			name[i] = sc.next();
		}
		
		System.out.println("The output String array is ".concat(Arrays.toString(name)));
  sc.close();
	}
	
	

}
