package threads;

public class concepts_2 {
public static void main(String[] args) {
	Thread t1 = new Thread(()->{
		System.out.println("Hello");
	});
	
	Thread t2 = new Thread(()->{
		System.out.println("Hii");
	});
	
	System.out.println("one");
	t1.start();
	t2.start();
	System.out.println("two");
}
}
