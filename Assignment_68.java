package basics_of_java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_68 {

	public static void main(String[] args) {
		
		
	
		
		System.out.println("Enter the size of the array");
		try
		{
			Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
         int [] array1 = new int [n] ;
		
		System.out.println("Enter the elements of array1");
		
		for(int i = 0 ; i<n;i++)
			
		{
			array1[i] = sc.nextInt() ;
			
		}

		System.out.println(Arrays.toString(array1));
		
		}
		
		catch (InputMismatchException e1) 
		{
			System.out.println("Handled the InputMismatchException");
		}
		
		
		catch (NegativeArraySizeException e2) 
		{
			System.out.println("Handled the NegativeArraySizeException");
		}
		
		
		
	}

}
