package basics_of_java;

public class Supercallingstate extends CL1

{

	public static void main(String[] args) {
		new Supercallingstate() ;

	}
	
	Supercallingstate()
	
	{
		
		System.out.println("This is constructor of Supercallingstate");
		
		
	}
	

}


class CL1 extends CL2

{
	
	CL1()
	
	{
		
		System.out.println("This is constructor of CL1");
		
	}
	
	
}



class CL2 extends CL3

{
	
	CL2()
	
	{
		
		System.out.println("This is constructor of CL2");
		
	}
	
	
}


class CL3 extends CL4


{
	
	CL3()
	
	
	{
		System.out.println("This is constructor of CL3");
		
	}
	
	
	
}




class CL4

{
	
	CL4()
	
	{
		
		System.out.println("This is constructor of CL4");
		
	}
	
	
	
}



