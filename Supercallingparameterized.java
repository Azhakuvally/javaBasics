package basics_of_java;

public class Supercallingparameterized  extends Cla1


{

	public static void main(String[] args) {
		
		new Supercallingparameterized(5,5) ;

	}
	
	Supercallingparameterized(int a ,int b)
	
	{
		super(0.5f,5) ;
		System.out.println(a+b);//4th-->n-3
	}

}


class Cla1 extends Cla2

{
	
	Cla1(float a,int x )
	
	{
		super(25.5f,25.5f) ;
		
		System.out.println(a+x);//3rd-->n-2
	}
}

class Cla2 extends Cla3

{
	Cla2(float a ,float b)
	
	{
		super('X') ;
		System.out.println(a+b); //2nd -->n-1
	}
	
}



class Cla3 

{
	Cla3(char T)
	
	{
		
		System.out.println(T); //1st -->n
	}
	
}

