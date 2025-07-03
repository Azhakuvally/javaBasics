package p2;

import p3.Classs2;// what happens to methods if out side the package being subclass(inheritance)

public class Classs1 extends Classs2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classs1 ob = new Classs1() ;
		ob.add();
		ob.sub();
		//ob.mul() ; can't access default
		//ob.div() ; can't access private
	}

}
