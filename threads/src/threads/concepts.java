package threads;

class Counters{
	int count=0;
	
	void increment() {
		count++;
	}
}

class MyData5 extends Thread{
	Counter c;//counter obj
	MyData5(Counter c){
		this.c=c;
	}
	
	
	public void run() {
		for(int i=0;i<10;i++) {
			c.increment();
		}
	}
}

public class concepts {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		MyData5 t1 = new MyData5(c);
		MyData5 t2 = new MyData5(c);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println(c.count);
	}

}
