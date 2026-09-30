package threads;

class MyData8{
    void display(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("Inside");
    }
}
public class thread_5{
	public static void main(String[] args) {
		MyData8 t1 = new MyData8();
		Thread th = new Thread(()->{
		    t1.display();
		});
		th.start();
		
		
	}
}
