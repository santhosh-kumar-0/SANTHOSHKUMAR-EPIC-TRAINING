package threads;

class MyData10{
    synchronized void display(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("Inside");
    }
}
public class threads_7
{
	public static void main(String[] args) {
		MyData10 t1 = new MyData10();
		Thread th1 = new Thread(()->{
		    t1.display();
		});
		Thread th2 = new Thread(()->{
		    t1.display();
		});
		th1.start();
		th2.start();
		System.out.println(th1.getState());
		System.out.println(th2.getState());
		
		
	}
}
