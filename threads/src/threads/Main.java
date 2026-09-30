//package threads;
//
//class MyData4 extends Thread{
//	public void run() {
//		System.out.println("THREAD IS RUNNING");
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {						//using Thread (class)
//		MyData4 t1 = new MyData4();
//		t1.start();
//		System.out.println("IN MAIN THREAD");
//
//	}
//
//}


package threads;

class MyData4 implements Runnable{
	public void run() {
		System.out.println("THREAD IS RUNNING");
	}
}

public class Main {

	public static void main(String[] args) {
		MyData4 t1 = new MyData4();
		Thread th = new Thread(t1);
		th.start();
		System.out.println("IN MAIN THREAD");

	}

}