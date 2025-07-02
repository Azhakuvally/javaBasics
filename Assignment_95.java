package p1;


import java.util.LinkedHashMap;
import java.util.Map;


public class Assignment_95 {

	public static void main(String[] args) {
		
		
		
		Map <Character , String> map = new LinkedHashMap<Character , String>() ;
		
		map.put('M', "Male") ;
		map.put('F', "Female");
		map.put('T', "TransGender") ;
		map.put('I', "Infant") ;
		map.put('G', "Girl");
		map.put('B', "Boy");
		map.put(null, null);
		map.put(null, "Don'tknow") ;
		map.put(null, "UNKNOWN");
		System.out.println(map);
		
		

	}

}
