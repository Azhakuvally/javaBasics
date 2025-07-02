package p1;

 class Concreteclass1 extends Practice //Concrete class
 
 {

	 public static void main(String[] args) //Concrete method
	
	{
		// TODO Auto-generated method stub
		
		 Concreteclass1 ob = new Concreteclass1() ;
		ob.add();
		ob.sub();

	}

	
	void add() {
		
		System.out.println("logout");
		
	}

	
	void sub() {
		
		System.out.println("Login");
	}

	
	
	
}




 abstract class Practice //abstract class parent class

{
	
	 
	
	
	abstract  void add() ; //abstract methods are always non static
	
	
	
	
	abstract void sub () ;          //abstract method
	
	
	
	
	
	
	
}
