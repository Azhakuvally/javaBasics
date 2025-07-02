package p1;

public class EncapsulationProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SensitiveClass obj = new SensitiveClass() ;
		obj.setEmailID("Anu@gmail.com");
		System.out.println(obj.getEmailID());

	}

}


 class SensitiveClass

{
	 
	 private String EmailID = "abc@gmailcom" ;
	 
	 
 public String getEmailID ()
	 
	 {
		return EmailID ;
	 }
	 
	 public void setEmailID(String emailID )
	 
	 {
		 this.EmailID = emailID ;
		 
	 }
	 

	
}
