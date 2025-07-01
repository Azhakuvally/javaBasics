package basics_of_java;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_2_array {

	static Scanner sc = new Scanner(System.in) ;
	public static void main(String[] args) {
		
		
		System.out.println("Enter the size of the first array");
		
		int n = sc.nextInt() ;
		int [] array1 = new int [n] ;
		
		
		System.out.println("Enter the size of the second array");
		
		int m = sc.nextInt() ;
		int [] array2 = new int [m] ;
		int [] mergedarray = new int [n+m] ;
		
		System.out.println("Enter the values in first array");
		for (int i = 0;i<n;i++)
		{
			array1[i] = sc.nextInt() ;
			mergedarray[i] = array1[i] ;
		}

		
		System.out.println("Enter the values in second array");
		for (int j = 0;j<m;j++)
		{
			array2[j] = sc.nextInt() ;
			
			mergedarray[n+j] = array2[j] ;
		}
		
		System.out.println("First array is "+Arrays.toString(array1));
		System.out.println("Second array is "+Arrays.toString(array2));
		System.out.println("Merged array is "+Arrays.toString(mergedarray));
		
		
		
		
		
		
	}

}
