package p1;

public class UITestCase extends TestCase


{
	
	public UITestCase (String testName )
	
	
	{
		super (testName); 

	}

	public static void main(String[] args) {
		
		UITestCase ob = new UITestCase("Automation") ;
		
		ob.runTest();
		
		
		APITestCase ob1 = new APITestCase("Testing") ;
		
		ob1.runTest();

	}

	
	void runTest() {
		
		 System.out.println(gettestName());
	}

}


class APITestCase extends TestCase
{

	
	public APITestCase (String testName)
	
	{
		super(testName);
	}
	
	
	 public void runTest() {
		 
		 System.out.println(gettestName());
		
		     
	}
	
}





abstract class TestCase 
{
	
	private String testName  ;
	
	abstract void runTest() ;
	
	
	public  TestCase (String testName )
	
	{
		
		this.testName = testName ;
		
	}
	
	
	
	public String gettestName  ()
	
	{
		
		
		return testName ;
		
	}
	
	
	public String printResult()
	
	{
		
		return "Test: " +  testName + "passed" ;
		
	}
	
}