package basics_of_java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_53 {

	static Scanner sc = new Scanner (System.in) ;
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
		int n = sc.nextInt() ;
		int [] mark = new int [n] ;
		
		System.out.println("Enter the arry values");
		int sum  = 0 ;
		for (int i =0;i<n;i++)
			
			
		{
			
			mark[i] = sc.nextInt() ;
			sum = sum +	mark[i] ;
		}
		
		System.out.println("The input array is "+Arrays.toString(mark));
		
		double avg = sum/n ;
		 
		 
		 System.out.println("The average of array values is "+avg);
		 
		
			

	}

}
