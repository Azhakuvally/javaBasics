package basics_of_java;

public class Assignment_34 extends absclass

{

	public static void main(String[] args) {
		
		Assignment_34 ob = new Assignment_34() ;
		ob.login_gmail();
		ob.logout_gmail();
		login_facebook() ;
		logout_facebook() ;
	}

	
	void login_gmail() {
		
		System.out.println("login_gmail");
	}

	
	void logout_gmail() {
		
		System.out.println("logout_gmail");
	}
	
	
	

}



abstract class absclass // 2 abstract and 2 concrete methods, so 50% abstraction
{
	
	
  abstract	void login_gmail () ;
  abstract void logout_gmail () ;
	
  static void login_facebook() //abstract class can have concrete methods also
	
	{
	  System.out.println("login_facebook");
		
	}
	
	
	static void logout_facebook()
	
	{
		
		System.out.println("logout_facebook");
	}
}