package p1;


import java.util.Stack;
import java.util.Vector;

public class Assignment_101 {

	public static void main(String[] args) {
		
		
		//vector, initial capacity is 10
		
		Vector<Integer> v1 = new Vector<Integer>() ;
		
	v1.addElement(15);
	v1.add(45);
	v1.add(55);
	v1.add(65);
	v1.add(75);
	v1.add(0, 87);
v1.addElement(100);
v1.addLast(81);

System.out.println(v1);

System.out.println("Size is "+v1.size());
System.out.println("Capacity is "+v1.capacity());

v1.add(85);
v1.add(95);
v1.add(105);


//doubles it's capacity when size is 11, that is exceeding the initial capacity

System.out.println("Size is "+v1.size());
System.out.println("NewCapacity is "+v1.capacity()) ;




//Stack


  Stack<String> s1 = new Stack<String>();
  
  System.out.println("Initial Capacity of Stack s1 is"+s1.capacity());
  
  
  s1.add("Ram");
  s1.add("Sam");
  s1.add("Ram");
  s1.add("Sam");
  s1.add("Ram");
  s1.add("Sam");
  s1.add("Ram");
  s1.add("Sam");
  s1.add("Anu");
  
  
  System.out.println(s1);
  
  
  System.out.println("Size of s1 is "+s1.size()) ;
  System.out.println("Capacity of s1 is "+s1.capacity()) ;
  
  
  s1.add("Nithila") ;
  s1.add("Karpakam") ;
  
  System.out.println("Size of s1 is "+s1.size()) ;
  System.out.println("Capacity of s1 is "+s1.capacity()) ;
  

  
 

	}

}
