package basics_of_java;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date d = new Date() ;
		
		long time = d.getTime() ;
		System.out.println(time);
		
		Date d2 = new Date(d.getTime()+(1000*60*60*24*4)); //future date
		
		Date d3 = new Date(d.getTime() - (1000*60*60*24*4) ) ; //past time
		
		System.out.println(d2);
		
		System.out.println(d3);
		
		String humantime = d2.toString() ;
		
		System.out.println(humantime);
		
		String Date = humantime.substring(8, 10) ;
		
		System.out.println(Date);
		
		String month = humantime.substring(4, 7) ;
		
		System.out.println(month);
		
		String year = humantime.substring(humantime.length()-4) ;
		
		System.out.println(year);
		
		String format1 = Date.concat(month).concat(year) ;
		System.out.println(format1);
		
		String format2 =Date.concat("-").concat(month).concat("-").concat(year) ;
		
		
		System.out.println(format2);
		
		String format3 = Date.concat("/").concat(month).concat("/").concat(year) ;
		
		System.out.println(format3);
	}

}
