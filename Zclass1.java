package p1;

public class Zclass1 extends Zclass2

{

	public static void main(String[] args) {
		
   //upcasting
		
	//	Zclass2 ob 	= (Zclass2)new Zclass1() ; //explicitely
		
		
		Zclass2  ob = new Zclass1() ;
		
		ob.add(); //using upcasting we can access parent class methods
		//ob.mul() ;// using upcating we cant access child class variable
		
		Zclass1 obj = (Zclass1)  ob ;//downcasting ,using which we can access properties of both child class and super class
		
		obj.add();
		obj.mul();
		
	}
		
		void mul()
		
		{
			
			int a =10;
			int b = 20 ;
			int c=a*b ;
			System.out.println(c);
			
		}
		
	

}
