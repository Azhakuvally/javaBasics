package p1;

public class Class5
{

  public static void main(String[] args)
  
  {
	  
	  Class6.login_Facebook();
	  Class6.logout_Facebook();
	  Class6.login_Twitter();
	
  }


}

class Class6

{
	
	public static void login_Facebook()
	
	{
		System.out.println("login_Facebook");
	}
	
	protected static void logout_Facebook()
	
	{
		System.out.println("logout_Facebook");
	}
	
	static void  login_Twitter ()
	
	{
		System.out.println("login_Twitter");
	}
	
	private static void logout_Twitter()
	
	{
		System.out.println("logout_Twitter");
	}
	
	
}
