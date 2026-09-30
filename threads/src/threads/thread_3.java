package threads;

class Counter{
	int count=0;
	synchronized void increment() {
		count++;
	}
}

class MyThread extends Thread{
	Counter count;//obj
	MyThread(Counter count){
		this.count = count;
	}
	public void run(){
    	for(int i=0;i<10;i++) {
    		System.out.println("Sleeping");
    		try{
    		    Thread.sleep(1000);						// synchronized is use to run the both the thread into one and give correct answer.
    		}
    		catch(InterruptedException e){
    		    
    		}
    		count.increment();
    	}
	}
}


public class thread_3 {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();      //#100
		MyThread t1 = new MyThread(c);  //#100 -->10-->count=10
		MyThread t2 = new MyThread(c);  //#100 -->10-->count=20
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	    System.out.println(c.count);
	}
}
