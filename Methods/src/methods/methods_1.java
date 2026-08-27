package methods;

public class methods_1 {
	void display(int a , int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
	
	int number(int a) {
		return a*2;
	}
	
 void myName() {
		System.out.println("santhosh");
	}
	
	public static void main(String[] args) {
		methods_1 obj = new methods_1();
		
		obj.display(10,20);
		obj.myName();
		obj.myName();
		obj.number(10);
	}

	
	
	
}
