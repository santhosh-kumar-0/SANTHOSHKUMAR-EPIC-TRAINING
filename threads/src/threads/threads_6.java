package threads;

class MyData9 extends Thread{
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("Inside");
    }
}
public class threads_6
{
	public static void main(String[] args) throws InterruptedException {
		MyData9 t1 = new MyData9();
		MyData9 t2 = new MyData9();
		
		t1.start();//5s
		t2.start();
		Thread.sleep(100);
		System.out.println(t1.getState());//runnable
		System.out.println(t2.getState());//timed waiting
		
		
	}
}
