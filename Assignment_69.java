package basics_of_java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_69 {

	public static void main(String[] args) {
		
		try
		{
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the long value");
		
		long x = sc.nextLong() ;
		
		try
		{
			
			System.out.println("Enter the size of the array1");
		int n = sc.nextInt() ;
		int [] array1 = new int[n] ;
		
		System.out.println("Enter the elements of array1");
		
		for (int i = 0 ; i<n ;i++)
			
		{
			array1[i] = sc.nextInt() ;
		}
		
		System.out.println(x);
		
		System.out.println(Arrays.toString(array1));
		
		sc.close();
		
		}
		
		catch(NegativeArraySizeException n1) 
		{
			System.out.println("Handled NegativeArraySizeException");
		}
		}
		
		catch (InputMismatchException e1)
		{
			System.out.println("Handled InputMismatchException");
		}
		
		finally
		{
			System.out.println("Terminate connectivity to database");
		}

	}

}
