//package threads;
//
//class Counter{
//	int count=0;
//	public void incrementCount() {
//		count++;
//	}
//}
//
//class MyThread extends Thread{
//	Counter count;//obj
//	MyThread(Counter count){
//		this.count = count;
//	}
//	public void run(){
//    	for(int i=0;i<10;i++) {
//    		count.incrementCount();
//    	}
//	}
//}
//
//
//public class thread_2 {
//
//	public static void main(String[] args) {
//		Counter c = new Counter();
//		MyThread t1 = new MyThread(c); 
//		MyThread t2 = new MyThread(c); 
//		t1.start();
//		t2.start();
//	    System.out.println(c.count);
//	}
//
//}
