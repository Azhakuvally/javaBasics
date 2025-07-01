package basics_of_java;

public class Assignment_28 extends Parentt1

{

	public static void main(String[] args) {
		
		Assignment_28 ob = new Assignment_28() ;
		ob.add();
		ob.login();
		ob.logout();
		
		

	}

	void add ()
	
	{
		int a = 5;
		int b = 10 ;
		System.out.println(a+b);
	}
	
}

class Parentt1 extends Parentt2

{
	
	void login()
	
	{
		System.out.println("login");
	}
	
}

class Parentt2

{
	
	void logout()
	{
		
		System.out.println("logout");
	}
}


