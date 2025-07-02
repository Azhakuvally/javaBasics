package p1;

public class Adminuser extends user

{
	
	private String adminLevel ;

	public Adminuser(String userID, String UserName, String Email,String adminLevel) {
		super(userID, UserName, Email);
		// TODO Auto-generated constructor stub
		this.adminLevel = adminLevel;
		
	}

	public String getAdminLevel() {
		return adminLevel;
	}

	

	
	
	public static void main(String[] args) {
		
		Adminuser au = new Adminuser("546554","Anu","abcd@gmail.com","Level A") ;
		
		au.displayAdminInfo() ;
		
	
		

	}
	
	public void displayAdminInfo()
	
	{
			System.out.println(getUserID());	
			System.out.println(getUserName());
			System.out.println(getEmail());
			System.out.println(adminLevel);
	}

}


class  user 

{
	public String getUserID() {
		return userID;
	}


	public String getUserName() {
		return UserName;
	}


	public String getEmail() {
		return Email;
	}


	private String userID ;
	
	private String UserName ;
	
	private String Email ;
	
	
	public user (String userID,String UserName,String Email)
	{
		
		      
		this.userID = userID ;
		
		this.UserName =UserName ;
		
		this.Email =Email ;
		
		
	}
	
	
	
	
	
}
