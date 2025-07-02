package p1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Assignment_89 {

	public static void main(String[] args) {
		
		
		//Array List
		
		ArrayList<Integer> a1 = new ArrayList<Integer> () ;
				
		a1.add(25);
		a1.add(25);
		a1.add(0, 100);
		a1.add(50);
		a1.add(150);
		a1.add(250);
		a1.add(350);
		
		System.out.println(a1);
		
		
		Iterator<Integer>  F1 = a1.iterator() ;
		
		while (F1.hasNext())
			
		{
			System.out.println(F1.next());
		}
			
		
	ListIterator <Integer>  f2 = 	a1.listIterator() ;
	
	while (f2.hasNext())
		
	{
		System.out.println(f2.next());
	}
	
	while(f2.hasPrevious())
		
	{
		System.out.println(f2.previous());
	}
	
	
	Collections.sort(a1);
	
	System.out.println(a1);
	
	
	
	//Vector
	
	Vector <Integer> v1 = new Vector<Integer> () ;
	
	v1.add(15);
	v1.add(87);
	v1.add(15);
	v1.add(25);
	v1.add(87);
	v1.add(96);
	v1.add(25);
	v1.add(87);
	
	System.out.println(v1);
	
	v1.add(1, 69);
	System.out.println(v1);
	
	Collections.sort(v1);
	
	
	//LinkedList
	
	LinkedList<Integer> l2 = new LinkedList () ;
	
	l2.add(1);
	l2.add(5);
	l2.add(69);
	l2.add(1);
	l2.add(5);
	
	System.out.println(l2);
	
	Collections.sort(l2);
	
	System.out.println(l2);
	
	
	//Stack
	
	
	Stack<Integer> s1  = new Stack <Integer>() ;
	 s1.add(58);
	 s1.add(68);
	 s1.add(48);
	 s1.add(31);
	 s1.add(58);
	 s1.add(68);
	 s1.add(48);
	 s1.add(31);
	// s1.add(null);
	 s1.add(0, 1);
	
	 System.out.println(s1);
		
		Collections.sort(s1);
		
		System.out.println(s1);
		
		//PriorityQueue
		
		PriorityQueue <Integer> p1 = new PriorityQueue<Integer>() ;
		
		p1.add(15);
		p1.add(25);
		p1.add(15);
		p1.add(60);
		
		//p1.add(null);
		System.out.println(p1);
		 
	Iterator  <Integer> I1 =	p1.iterator() ;
	
	while(I1.hasNext())
		
	{
		System.out.println(I1.next());
	}
	
	
	
	
            Enumeration e1 = v1.elements() ;            
            while (e1.hasMoreElements())
            	
            {
            	System.out.println(e1.nextElement());
            }
		
            
            //ArrayDeque
		
            ArrayDeque  <Integer>d1 = new ArrayDeque <Integer> () ;
		
		d1.add(51);
		d1.add(45);
		d1.add(87);
		d1.add(96);
		d1.add(32);
		d1.add(74);
		d1.add(51);
		d1.add(45);
		d1.add(87);
		d1.add(96);
		d1.add(32);
		d1.add(74);
		
	
		System.out.println(d1);
		
		
		//HashSet
		
		HashSet <Integer> h1 = new HashSet <Integer>() ;
		
		h1.add(15);
		h1.add(69);
		h1.add(15);
		h1.add(96);
		h1.add(82);
		//h1.add(null);
		System.out.println(h1);
		
		
		//LinkedHashSet
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>() ;
		lh.add(15);
		lh.add(16);
		lh.add(89);
		lh.add(48);
		lh.add(28);
		lh.add(28);
		lh.add(15);
		lh.add(null);
		lh.add(null);
	
		
		
		System.out.println(lh);
		
		//TreeSet
		
		TreeSet <Integer> ts = new TreeSet<Integer> () ;
		
		ts.add(15);
		ts.add(85);
		ts.add(36);
		ts.add(15);
		ts.add(85);
		ts.add(36);
		ts.add(100);
	
		
		for(int i = 0 ; i<5;i++)
			
		{
			System.out.println(i);
		}
		
		System.out.println(ts);
		
	}

}
