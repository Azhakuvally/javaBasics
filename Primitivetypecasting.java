package basics_of_java;

public class Primitivetypecasting {

	public static void main(String[] args) 
	{
		//Problem 1 int into long
		
			int a=100;
	long converted_value=	a;//Widening
	//implicit syntax
		
		System.out.println(converted_value);
		
		long converted_value1=(long)a;//Widening
		//explicitly syntax
			
			System.out.println(converted_value1);
		
		//Problem 2: byte into double
			
		byte b=100;
		
	double convrerted_value2=	b; //widening
			System.out.println(convrerted_value2);
		
		//Problem 3: double into int
			double wt=86.6;
			
			int converted_weight=(int)			wt;//this is NArrowing
			System.out.println(converted_weight);
			
			
		//problem 4: int into byte
			//Narrowing
			//olny ecp
	//byte left				int right
			
			
			int x = 100;
			byte converted_val = (byte)x ;
			System.out.println(converted_val);
			
			//problem 5:short into long
			
			short y = 30 ;
			
			long coverted_y= y ;
			System.out.println(coverted_y) ;
			
			//problem 6 :long into short (narrowing)
			
			long z = 634976539756l;
			short r =(short) z ;
			System.out.println(r);
					
			//problem 7 : long into double //widening
			
			long l = 54353696987677834l ;
			double d =l ;			
			System.out.println(d) ;
			
			//problem 8 :float into long (Narrowing)			
			float t = 2.345f ;
			long g =(long)t ;			
			
			System.out.println(g) ;
			
			
			byte z1 = 100 ;
			
			long s1 = z1 ;
			
			System.out.println(s1);
			
			
			//convertinf int to byte//narrowing
			
			int f= 10;
			
			byte q = (byte) f ;
			
			System.out.println(q);
			
	}

}
