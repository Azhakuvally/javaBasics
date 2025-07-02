package p1;

public class tets_c1 {

	public static void main(String[] args) {
		
		
		String Input = "Selenium" ;
		String Output = "";
		
		for (int i = Input.length()-1 ; i >=0 ; i--)
			
		{
			Output = Output+Input.charAt(i) ;
		}

		
		System.out.println(Output);
		
	}

}
