package p1;

import java.util.Scanner;

public class Assertkeyproblem {
	
	static Scanner sc = new Scanner (System.in) ;

	public static void main(String[] args) {
		
		
		System.out.println(calculateDiscountPrice () );

	}
	
	public static int calculateDiscountPrice ()
	
	{
		
		System.out.println("Enter the price");
		int price = sc.nextInt() ;
		
		assert price>0 :"Entered price is less than 0" ;
		
		System.out.println("Enter the discount price");
		
		int discountprice = sc.nextInt() ;
			
		
		assert  discountprice>0 :"Entered discount price is less than zero";
		
		assert discountprice<price :"Discount price is greater than price which is not allowed";
			
		
		int finalprice = price-discountprice ;
		
		return finalprice  ;
		
	}

}
