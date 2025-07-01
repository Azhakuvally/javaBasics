package basics_of_java;

import java.util.Date;

public class Assignment_47 {

	public static void main(String[] args) {
		
		
		Date d1= new Date () ;
		Date d2 = new Date(d1.getTime()+(1000l*60*60*24*30));
		String CurrentDate= d2.toString();
		
		String CurrentMonth = CurrentDate.substring(4,7) ;
		String Currentdate = CurrentDate.substring(8,10) ;
		String Currentyear = CurrentDate.substring(CurrentDate.length()-4) ;
		
		String output = CurrentMonth.concat(Currentdate).concat(Currentyear) ;
		
		System.out.println(output);

	}

}
