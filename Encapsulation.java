package p1;

public class Encapsulation {

	public static void main(String[] args) {
		
		Employee ob = new Employee(589641,"Azhakuvally",98000) ;
		
		System.out.println(ob.getEmployeeID());
		System.out.println(ob.getEmployeeName());
		System.out.println(ob.getSalary());
		

	}

}


class Employee 
{
	private int EmployeeID = 5641231;
	private String EmployeeName = "Anu";
	private double Salary =25000;
	
	
	public Employee(int EmployeeID,String EmployeeName,double Salary)
	
	{
		this.EmployeeID = EmployeeID ;
		this.EmployeeName = EmployeeName ;
		this.Salary = Salary ;
		
		
		
	}
	
	
	public int getEmployeeID ()
	
	{
		return EmployeeID ;
	}
	
public String getEmployeeName ()
	
	{
		return EmployeeName ;
	}

public double getSalary ()

{
	return Salary ;
}
}