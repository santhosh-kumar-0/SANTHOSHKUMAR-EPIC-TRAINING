//package threads;
//
//class Foodorder extends Thread{
//	public void run() {
//		try {
//			Thread.sleep(100);
//        }
//        catch(InterruptedException e){
//            
//        }
//        System.out.println("FOOD ORDERED");
//	}
//}
//
//
//class Preparing extends Thread{
//	public void run() {
//		try {
//			Thread.sleep(10000);
//        }
//        catch(InterruptedException e){
//            
//        }
//        System.out.println("FOOD IS PREPARING");
//	}
//}
//
//class Packing extends Thread{
//	public void run() {
//		try {
//			Thread.sleep(2000);
//        }
//        catch(InterruptedException e){
//            
//        }
//        System.out.println("FOOD IS Packed");
//	}
//}
//
//class send extends Thread{
//	public void run() {
//		try {
//			Thread.sleep(10000);
//        }
//        catch(InterruptedException e){
//            
//        }
//        System.out.println("FOOD IS SEND");
//	}
//}
//
//class deliver extends Thread{
//	public void run() {
//		try {
//			Thread.sleep(5000);
//        }
//        catch(InterruptedException e){
//            
//        }
//        System.out.println("ORDER IS DELIVERED");
//	}
//}
//
//
//public class threads8 {
//
//	public static void main(String[] args) throws InterruptedException {
//		Foodorder order = new Foodorder();
//		Preparing pre = new Preparing();
//		Packing pack = new Packing();
//		send sd = new send();
//		deliver deli=new deliver();
//		
//		order.start();
//		pre.start();
//		pre.join();
//		pack.start();
//		sd.start();
//		sd.join();
//		deli.start();
//	}
//
//}
