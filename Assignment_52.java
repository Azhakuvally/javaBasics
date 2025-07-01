package basics_of_java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_52 {

	
	static Scanner S1 = new Scanner(System.in) ;
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
		
		int n = S1.nextInt() ;
		
		double [] array1 = new double[n] ;
		double [] array2 = new double[array1.length] ;
		
		System.out.println("Enter the double values of array");
		for (int i = 0 ,j=n-1; i <=n-1 ; i++ ,j--)
			
		{
			array1[i] = S1.nextDouble() ;
			
			array2[j] = array1[i] ;
		}
		
		System.out.println("input array is -->"+Arrays.toString(array1));
		
		
	System.out.println("Output array is -->"+Arrays.toString(array2));
		

	}

}
