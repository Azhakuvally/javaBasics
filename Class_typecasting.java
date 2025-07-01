package basics_of_java;

public class Class_typecasting extends Parentt

{

	public static void main(String[] args) {
		
		Parentt ob 	= new Class_typecasting() ;//upcasting
		
		ob.minimize(); //through upcasting we can access only parent class properties
		ob.refresh();
		
		Class_typecasting obj = (Class_typecasting) ob ; //downcasting
		
		obj.maximize(); //through downcasting we can access both child class and parent class properties
		obj.minimize();
		obj.refresh();
		obj.reload();

	}
	
	void maximize() 
	
	{
		System.out.println("maximize");
	}
	
	void reload() 
	
	{
		
		System.out.println("reload");
	}

}

class Parentt

{
	
	
	void refresh()
	{
		System.out.println("refresh");
	}
	
	void minimize()
	
	{
		System.out.println("minimize");
	}
	
}
