package p1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Map_Iterate {
	
	
	public static void main (String[] args)
	{
	
	Map<Integer, String> m1 = new HashMap<Integer, String>() ;
	
m1.put(83010, "Anu");
m1.put(99956, "Alwar");
m1.put(89395, "Chocka");
m1.put(94974, "Dinesh");
m1.put(893916, "Azhaku");
m1.put(6282312, "Alwar");

   Set <Integer> s1 = m1.keySet() ;
   
   System.out.println(s1) ;
    
    System.out.println("Iterating keys of a map");
    for(Integer int1 : m1.keySet())
    	
    {
    	System.out.println(int1);
    }
    
    
 Collection <String> co1 =  m1.values() ;
    
    
  System.out.println(co1);
  
  System.out.println("Iterating Values of a map");
  
  for (String str1 : m1.values())
	  
  {
	  System.out.println(str1);
  }
  
  
  System.out.println("Iterating both Values and Keys of a map");
  
  
  
  for( Entry<Integer, String> ent1: m1.entrySet())
	  
  {
	  System.out.println(ent1);
  }
  
  
  System.out.println("Iterating both keys and values of a map using while loop and iterator method");
  
  
  Set<Entry<Integer, String>> se1 =   m1.entrySet() ;
  
  Iterator<Entry<Integer, String>> ite1 = se1.iterator() ;
  
  while (ite1.hasNext())
	  
  {
	  System.out.println(ite1.next());
  }
  
  
  
  
}
	
}
