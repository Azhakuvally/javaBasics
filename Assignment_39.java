package basics_of_java;

public class Assignment_39 extends abstr1

{

	public static void main(String[] args) {
		
		Assignment_39 ob = new Assignment_39() ;
		ob.loginGmail();
		ob.logoutGmeail();
		ob.loginFacebook();
		ob.logoutFacebook();
		ob.loginInsta();
		ob.logoutInsta();
		ob.loginTwitter();
		ob.logoutTwitter();
		ob.loginNaukri();
		ob.logoutNaukri();

	}

	
	void loginGmail() {
		
		System.out.println("loginGmail");
	}

	
	void logoutGmeail() {
		
		System.out.println("logoutGmeail");
	}

	
	void loginFacebook() {
		
		System.out.println("loginFacebook");
	}


	void logoutFacebook() {
		
		System.out.println("logoutFacebook");
		
	}

	
	void loginInsta() {
		
		System.out.println("loginInsta");
	}

	
	void logoutInsta() {
		
		System.out.println("logoutInsta");
	}


	void loginTwitter() {
		
		System.out.println("loginTwitter");
		
	}

	
	void logoutTwitter() {
		
		System.out.println("logoutTwitter");
	}
	
	
	}

abstract class abstr1

{
	abstract void loginGmail() ;
	abstract void logoutGmeail() ;
	abstract void loginFacebook() ;
	abstract void logoutFacebook();
	abstract void loginInsta() ;
	abstract void logoutInsta() ;
	abstract void loginTwitter() ;
	abstract void logoutTwitter() ;
	
	void loginNaukri()
	
	{
		System.out.println("loginNaukri");
	}
	
	
	void logoutNaukri()
	
	{
		System.out.println("logoutNaukri");
	}
	
	
}
