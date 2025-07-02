package p1;

public class InfoLog extends TestLog

{



	
	public InfoLog(String message) {
		super(message);
		
		
	}



	public String printLog()
	
	{
		return "INFO: "+  getMessage();
	}
	
	

	public static void main(String[] args) {
		
		InfoLog i1 = new InfoLog ("System error") ;
		System.out.println(i1.printLog());
		
		
		ErrorLog e1 = new ErrorLog ("Computing error");
		System.out.println(e1.printLog()) ;
		
		WarningLog w1 = new WarningLog ("Warning error") ;
		System.out.println(w1.printLog()) ;

	}

}


class ErrorLog extends TestLog

{
	
	

	public ErrorLog(String message) {
		super(message);
		
	}
	
public String printLog()
	
	{
		return "ERROR: "+getMessage() ;
	}
	
}


class WarningLog extends TestLog
{

	
	
	public WarningLog(String message) {
		super(message);
		
	}
	
	
	
public String printLog()
	
	{
		return "WARNING: "+getMessage() ;
	}
	
}




