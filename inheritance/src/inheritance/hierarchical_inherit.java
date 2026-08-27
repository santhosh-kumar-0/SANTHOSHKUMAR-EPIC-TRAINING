package inheritance;


class A{
	int a =100;
	void printData() {
		System.out.println("class A");
	}
}


class B extends A{
	int b =200;
	void printData(String y , String x) {
		System.out.println("class B");
	}
}


class C extends A{
	int c =300;
	void printData(String z) {
		System.out.println("class C");
	}
}


class D extends B{
	int d = 400;
	
	void printData(String w , String v) {
		System.out.println("Class D");
	}
}


class E extends C{
	int e = 500;
	
	void printData(String u) {
		System.out.println("Class E");
	}
}


class F extends C{
	int f = 600;
	
	void printData(String r , String s) {
		System.out.println("class F");
	}
}


public class hierarchical_inherit {

	public static void main(String[] args) {
		C cobj = new C();
		B bobj = new B();
		
		D dobj = new D();
		E eobj = new E();
		F fobj = new F();
		
		System.out.println(bobj.a);
		bobj.printData();
		
		System.out.println(cobj.a);
		cobj.printData();
		
		System.out.println(dobj.b);
		dobj.printData();
		
		System.out.println(eobj.c);
		eobj.printData();
		
		System.out.println(fobj.c);
		fobj.printData();
		
		
		
		cobj.printData("hello");
		
		bobj.printData("welcome","java");
		
		dobj.printData("welcome","java");
		
		
		eobj.printData("java");
		
		fobj.printData("welcome","java");
	}

}
