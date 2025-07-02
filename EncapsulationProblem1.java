package p1;

public class EncapsulationProblem1 {

	public static void main(String[] args) {
		
		
		 Bank b1 = new Bank( "Anu","5423156456",25000) ;
		
		b1.deposit(500) ;
		
		System.out.println(b1.getBalance() );
		
		System.out.println(b1.getaccountHolderName());
		
		System.out.println(b1.getaccountNumber());

	}
	
	
	

}

class Bank
{
	private String accountNumber = "1234567890" ;
	
	
	private  String accountHolderName = "Anushmitha" ;
	
	private  double balance = 2500 ;
	
	public Bank(String accountHolderName,String accountNumber , double initialbalance )
	{
		
		this.accountHolderName = accountHolderName ;
		
		this.accountNumber = accountNumber ;
		
		this.balance = initialbalance ;
		
	}
	
	
	public String getaccountNumber()
	
	{
		return accountNumber ;
		
	}
	
	
	public String getaccountHolderName()
	
	{
		return accountHolderName ;
	}
	
	
	public double getBalance()
	
	{
		
		return balance ;
	}
	
	
	
	

	
	public void deposit (double amount)
	
	{
		if(amount>0)
		{
			double newbalance = balance+amount ;
			
			this.balance = newbalance ;
			
		}
		
		else
		{
			System.out.println("Invalid amount");
		}
		
		
	}
	
	public void withdraw(double amount)
	
	{
		if(balance>=amount)
		{
		
			double newbalance = balance - amount ;
			this.balance = newbalance ;
			
		}
		
		else
		{
			System.out.println("Invalid amount");
		}
		
		
	}
	
	
	
	
	
}