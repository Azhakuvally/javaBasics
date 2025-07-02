package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class SetProgram {

	public static void main(String[] args) {
		
		
		Set <Integer> set  = new HashSet <Integer> () ;
		set.add(15);
		set.add(15);
		set.add(90);
		set.add(null);
		System.out.println(set);
		System.out.println(set.size());
		
		ArrayList <Integer> list = new ArrayList <Integer>() ;
		
		list.add(50);
		list.add(80);
		list.add(50);
		list.add(70);
		list.add(91);
		
		list.add(70);
		list.add(80);
		list.add(58);
		
		System.out.println(list);
		
		list.remove(1) ;
		
		System.out.println(list);
		
		list.removeFirst() ;
		
		System.out.println(list);
		
		Vector<Integer> v1 = new Vector<Integer>() ;
		
		v1.addElement(80) ;
		
		
		Collection c1 =new ArrayList() ;
		
		
		c1.add(set) ;
		c1.addAll(list);
		System.out.println(c1) ;
		
		
		
		
		
		

	}

}
