package p1;



abstract class Insta 


{
	
	abstract void authen() ;
	
	abstract void confir() ;
	
	
	
	
	
}




   abstract class Facebook extends Insta

{
	
	
	abstract void login() ;
	
	abstract void logout() ;
	
	
}





public class Gmail extends Facebook


{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gmail ob = new Gmail() ;
		
		ob.authen();
		ob.confir();
		ob.login();
		ob.logout();
		

	}

	@Override
	void login() {
		
		System.out.println('A');
		// TODO Auto-generated method stub
		
	}

	@Override
	void logout() {
		// TODO Auto-generated method stub
		System.out.println('B');
	}

	@Override
	void authen() {
		// TODO Auto-generated method stub
		
		System.out.println('C');
	}

	@Override
	void confir() {
		// TODO Auto-generated method stub
		System.out.println('D');
		
	}

}
