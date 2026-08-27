//package abstraction;
//
//
//
//abstract class EmpMethods{
//    abstract void paymentCalculation();
//}
//
//class Employee{
//    String empName;
//	public char[] salary;
//    Employee(String n){
//        this.empName = n;
//    }
//    
//}
//
//class FreeLancePayment extends Employee{
//    int salary;
//    FreeLancePayment(String n,int s){
//        super(n);
//        this.salary=s;
//    }
//    
//    int paymentCalculation(int salary) {
//    	int hours = 6;
//    	return salary*hours;
//    }
//    
//}
//class FixedPayment extends Employee{
//    int salary;
//    FixedPayment(String n,int s){
//        super(n);
//        this.salary=s;
//    }
////    int paymentCalculation(int salary) {
////    	
////    	return salary;
////    }
//    
//}
//
//
//public class Main
//{
//	public static void main(String[] args) {
//		
//		Employee emp = new Employee("Santhosh");
//		
//		
//		
//		FreeLancePayment freepay = new FreeLancePayment("santhosh",1000);
//		System.out.println(freepay.empName);
//		System.out.println( freepay.paymentCalculation(1000));
//
//		
//		FixedPayment fixpay = new FixedPayment("santhosh",1000);
//		System.out.println(fixpay.empName);
//
//		System.out.println(fixpay.salary);
//	}
//}
