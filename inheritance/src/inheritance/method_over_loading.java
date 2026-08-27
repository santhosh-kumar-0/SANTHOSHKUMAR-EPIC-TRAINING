package inheritance;

//class MyData{
//	void display(int a) {
//		System.out.println("One");
//	}
//	void display(int a,int b) {
//		System.out.println("two");
//	}
//	void display(int a, int b , int c) {
//		System.out.println("three");
//	}
//}
//public class method_over_loading {
//	public static void main(String[] args) {					// over loading
//		MyData obj = new MyData();
//		obj.display(10);
//		obj.display(10,20);
//		obj.display(10,20,30);
//	}
//}

//class MyData1{
//	void display() {
//		System.out.println("one");
//	}
//}

//class MyData2 extends MyData1{
//	void display() {
//		System.out.println("two");
//	}
//}
//																//method overriding + runtime polymorphism
//public class method_over_loading{
//	public static void main(String[] args) {
//		MyData1 obj = new MyData2();
//		obj.display();
//	}
//}
//


//class Employee{
//	String name;
//	
//	Employee(String name){
//		this.name = name;
//	}
//}
//class Payment extends Employee{
//	int salary;
//	Payment(String name , int salary){
//		super(name);
//		this.salary = salary;
//	}
//}
//public class method_over_loading
//{
//	public static void main(String[] args) {				//using the super keyword
//		Payment ptm = new Payment("santhosh",1000);
//		System.out.println(ptm.name);
//		System.out.println(ptm.salary);
//
//	}
//}