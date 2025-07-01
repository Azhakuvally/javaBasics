package basics_of_java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_51 {

	static Scanner s1 =new Scanner(System.in) ;
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
		
		int n = s1.nextInt() ;
		int [] A = new int[n] ;
		int[] array2 = new int[A.length] ;
		
		System.out.println("Enter the int values in array");
		
		for (int i = 0 ; i<n;i++)
			
		{
			A[i] = s1.nextInt() ;
			
			 
			 array2[i]=A[i];
		}
System.out.println("The input String is -->"+Arrays.toString(A));

 System.out.println("The copied array is ->"+Arrays.toString(array2));
	}

}
