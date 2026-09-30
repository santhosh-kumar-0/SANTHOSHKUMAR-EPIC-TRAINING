package threads;

class Order{
	 synchronized void updateStatus(String status) {
	        System.out.println(status);
	    }
}

class Orderplace implements Runnable {

    Order order;

    Orderplace(Order order) {
        this.order = order;
    }

    public void run() {
        order.updateStatus("Payment Processing");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        order.updateStatus("Payment complete");
    }
}


class OrderDelivery extends Thread {

    Order order;

    OrderDelivery(Order order) {
        this.order = order;
    }

    public void run() {
        order.updateStatus("Order is Being Shipped");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        order.updateStatus("ORDER DELIVERED");
    }
}


public class Food_Deliveried_system {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Order order = new Order();

        System.out.println("ORDERED PLACED");
        
        Orderplace placed = new Orderplace(order);
        
        OrderDelivery delivery = new OrderDelivery(order);
        
        Thread t1 = new Thread(placed);

        t1.start();
        
        t1.join();
        
        delivery.start();
        
        delivery.join();
        
        System.out.println("Thank you for ordering!");
	}

}
