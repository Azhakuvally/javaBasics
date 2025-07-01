package basics_of_java;


public class Numberofalphabertsinastring {

	public static void main(String[] args) {
		
		String input = "I am a super mom born on 24-09-1993" ;
		
		char [] a1 =input.toCharArray() ;
		
		//System.out.println(Arrays.toString(a1));
		
		int countalpha = 0 ;
		int countnumeric = 0 ;
		int countofspace = 0 ;
		
		for (int i = 0 ; i<a1.length;i++)
		{
			
			boolean b1 = Character.isAlphabetic(a1[i]);
			
			if(b1==true )
				
			{
				countalpha++ ;
			}
			
			boolean b2 = Character.isDigit(a1[i]) ;
			
			if (b2 == true)
				
			{
				countnumeric++ ;
			}
		
			
			
			boolean b3 = Character.isWhitespace(a1[i]);
			
			if (b3==true)
				
			{
				
				countofspace++ ;
			}
			
			
			
			
		}
		
		int countodspecialchar = a1.length - ( countalpha+countnumeric+countofspace) ;
		
		System.out.println("Count of alphabets in the given String is equal to "+countalpha);
		
		System.out.println("Count of numeric digits in the given String is equal to "+countnumeric);
		
		System.out.println("Count of spaces in the given String is equal to "+countofspace);
		  
		System.out.println("Count of special charachters in the given String is equal to "+countodspecialchar);
	}
	

}
