package p1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment_105 {

	public static void main(String[] args) {
		
		
		//List
		
		List <Integer> a = new LinkedList <Integer> () ;
		
		List<Integer> synchlist = Collections.synchronizedList(a) ;
		
		synchlist.add(15);
		synchlist.add(35);
		synchlist.add(45);
		synchlist.add(78);
		synchlist.add(89);
		
		System.out.println(synchlist);
		
		//set
		
		
		Set <Integer> b = new HashSet <Integer>() ;
		Set synchset = Collections.synchronizedSet(b) ;
		
		synchset.add(150);
		synchset.add(500);
		synchset.add(864);
		
		System.out.println(synchset);
		
		
		Map <String,String> c = new LinkedHashMap<String,String> () ;
		Map <String,String>synchmap = Collections.synchronizedMap(c);
		
		synchmap.put("Java", "Lang");
		synchmap.put("Selenium", "Tool") ;
		synchmap.put("GitHub", "CodeRepository");
		synchmap.put("gitbash", "Terminal");
		synchmap.put("jenkins", "CI CD Tool");
		synchmap.put("Ecclipse", "Editor Tool");
		
		System.out.println(synchmap);

	}

}
