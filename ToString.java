package basics_of_java;

import java.util.Arrays;
import java.util.Scanner;

public class ToString {

	
	static Scanner sc = new Scanner (System.in) ; 
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
		int n = sc.nextInt() ;
		
		System.out.println("Enter the size of the array2");
		int m = sc.nextInt() ;
		
		System.out.println("Enter the size of the array3");
		int o = sc.nextInt() ;
		
		byte [] array1 = new byte [n] ;
		byte [] array2 = new byte [m] ;
		byte [] array3 = new byte [o] ;
		
		
		System.out.println("Enter the elements of the array1");
		
		for (int i = 0; i<n ; i++)
			
		{
			
			array1[i] = sc.nextByte() ;
		
		
			
		}
		
		
		
		
		
	System.out.println("Enter the elements of the array2");
		
		for (int j = 0; j<m ; j++)
			
		{
			
			array2[j] = sc.nextByte() ;
			
		}
		
	System.out.println("Enter the elements of the array3");
		
		for (int k = 0; k<o ; k++)
			
		{
			
			array3[k] = sc.nextByte() ;
			
			
		}
		
		
		
		for (int l = 0 ; l <n; l++)
		{
			
			for (int x = 0 ; x<m ; x++)
			{
				
			if (	array1[l] == array2[x] )
				
				
			{
				for (int y = 0 ; y<o ; y++)
					
				{
					if(array2[x]==array3[y])
						
					{
						System.out.println("The common elements between Array1 , array2 and Array 3 is "+array3[y]);
					}
					
				}
			}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		System.out.println("The given input array1 is "+Arrays.toString(array1));
		System.out.println("The given input array2 is "+Arrays.toString(array2));
		System.out.println("The given input array3 is "+Arrays.toString(array3));
		
		
		
	}

}
