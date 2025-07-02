package p1;


/*
  Interface: PaymentMethod
Method: void pay(double amount)

Method: String getPaymentDetails()

💳 Class: UPIPayment implements PaymentMethod
Private fields:

upiId (e.g., "anu@upi")

accountHolderName

Constructor to set all fields

Implement both methods

💳 Class: CreditCardPayment implements PaymentMethod
Private fields:

cardNumber

cardHolderName

Constructor to set all fields

Implement both methods

🧪 main() method:
Create both payment types

Store in a PaymentMethod[]

Loop and call pay() and getPaymentDetails() polymorphically
 */

public class CreditCardPayment implements PaymentMethod

{

	
public void pay(double amount)
	
	{
	System.out.println("Paying "+amount +  " using CreditCardPayment");
	}
	
	
	public String getPaymentDetails()
	
	{
		
		String maskedcardnumber = "**** **** "+CardNumer.substring(CardNumer.length()-4);
		return "Card number is "+maskedcardnumber+" and Card holder name is "+CardHolderName ;
	}
	
	public String getCardNumer() {
		return CardNumer;
	}



	public String getCardHolderName() {
		return CardHolderName;
	}



	private String CardNumer ;
	private String CardHolderName ;
	
	public CreditCardPayment (String CardNumer,String CardHolderName)
	{
		this.CardNumer = CardNumer ;
		this.CardHolderName = CardHolderName ;
	}
	
	
	
	public static void main(String[] args) {
		
		CreditCardPayment p1 = new CreditCardPayment("12454231321","Ponnambalam") ;
		p1.pay(500);
		System.out.println(p1.getPaymentDetails()) ;
		
		
		
		
		UPIPayment p2 = new UPIPayment ("5148411@upi","Anu") ;
		p2.pay(1000);
		System.out.println(p2.getPaymentDetails());
		

	}




}


class UPIPayment implements PaymentMethod

{
	
    public String getUpiId() {
		return upiId;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	private String upiId  ;
	
	private String accountHolderName ;
	
	
	public UPIPayment(String upiId,String accountHolderName)
	
	{
		
		this.upiId = upiId ;
		this.accountHolderName = accountHolderName ;
		
	}
	
	
	public void pay(double amount)
	
	{
		System.out.println("Paying "+amount +  " using UPI");
		
	}
	
	
	public String getPaymentDetails()
	
	{
		
		String MaskedUPIID = "*****"+upiId.substring(upiId.length()-6);
		return "UPI ID is "+MaskedUPIID+" and Account holder name is "+accountHolderName ;
				
	}


	
	}
	
	



interface PaymentMethod

{
	void pay(double amount) ;

	 String getPaymentDetails() ;
	
	
}
