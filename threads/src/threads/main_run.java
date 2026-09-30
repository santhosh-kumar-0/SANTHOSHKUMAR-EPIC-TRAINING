//package threads;
//
//class Mydata extends Thread{
//	public void run() {
//		for(int i=1;i<5;i++) {
//			System.out.println("Run" +i);
//			try {
//				Thread.sleep(1000);
//			}
//			catch(Exception e) {
//				System.out.println();
//			}
//		}
//	}
//}
//
//class Mydata1 extends Thread{
//	public void run() {
//		for(int i=1;i<5;i++) {
//			System.out.println("Run 2 : " +i);
//			try {
//				Thread.sleep(2000);
//			}
//			catch(Exception e) {
//				System.out.println();
//			}
//		}
//	}
//	
//}
//
//public class main_run {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		Mydata t1 = new Mydata();
//		t1.start();
//		t1.join();
//		
//		Mydata1 t2 = new Mydata1();
//		t2.start();
//		t2.join();
//		
//		for(int i=1;i<5;i++) {
//			System.out.println("Main" +i);
//		}
//		
//		
//
//	}
//
//}













package threads;

class Mydata implements Runnable{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("Run" +i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println();
			}
		}
	}
}

class Mydata1 implements Runnable{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("Run 2 : " +i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println();
			}
		}
	}
	
}

public class main_run {

	public static void main(String[] args) throws InterruptedException {
		
		Mydata t1 = new Mydata();
		
		Thread th1 = new Thread(t1);
		
		th1.run();
		th1.join();
		
		Mydata1 t2 = new Mydata1();
		
		Thread th2 = new Thread(t2);
		th2.run();
		th2.join();
		
		for(int i=1;i<5;i++) {
			System.out.println("Main" +i);
		}
		
		

	}

}

