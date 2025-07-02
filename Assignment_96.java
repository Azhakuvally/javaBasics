package p1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment_96 {
	
	public static void main(String[] args) {
		
		LinkedHashMap <String , Integer> lm = new LinkedHashMap<String , Integer>() ;
		
		lm.put("Anu", 830106) ;
		lm.put("Dinesh", 893954) ;
		lm.put("Nithila", 574255);
		lm.put("Alwar", 6282310);
		lm.put("Chocka", 949747);
		System.out.println(lm);
		
		lm.putIfAbsent("Chocka", 949747);
		lm.putIfAbsent("Nithanya", 2198798);
		lm.putIfAbsent("Ramani", 830106) ;
		System.out.println(lm);
		
	Map <String,Integer> map = new LinkedHashMap<String,Integer>() ;
		
		map.put("Male",54841) ;
		map.put("Female",54545646);
		map.put("TransGender",4564654) ;
		map.put("Infant",545644) ;
		
		
		lm.putAll(map);
		
		System.out.println(lm);
		
		
		boolean b1 = lm.equals(map) ;
		
		System.out.println(b1);
		
		lm.remove("Infant") ;
		
		System.out.println(lm);
		
		lm.remove("Female", 54545646);
		
		System.out.println(lm);
		
		lm.replace("TransGender", 45646666);
		
		System.out.println(lm);
		
		lm.replace("Dinesh", 893954, 89395479);
		
		System.out.println(lm);

		boolean b2 = lm.containsKey("Dinesh") ;

		System.out.println(b2);
		
		boolean b3 = lm.containsValue(89395479);
		
		System.out.println(b3);


		System.out.println(lm.size());
		
		
		System.out.println(lm.get("Anu"));
		
	}

}
