package threads;


class Food extends Thread{
	public void run() {
		System.out.println("FOOD IS PREPARING");
		try {
			Thread.sleep(10000);
        }
        catch(InterruptedException e){
        	  
        }
		System.out.println("FOOD IS PACKED");  
	}
}

class Foodorder extends Thread{
	public void run() {
		
		try {
			Thread.sleep(20000);
        }
        catch(InterruptedException e){
        	  
        }
		System.out.println("ORDER IS DELIVERED");  
	}
}


public class try1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("FOOD IS ORDERED");
		Food f=new Food();
		f.start();
		f.join();
		Thread.sleep(2000);
		System.out.println("FOOD IS SEND");
		Foodorder fo = new Foodorder();
		fo.start();
	}

}
