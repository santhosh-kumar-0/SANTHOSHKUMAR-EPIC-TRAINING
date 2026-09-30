package queue;

import java.util.Scanner;

class QueueImplementation{
    int n=6;
    int[] queue = new int[n];
    int front=-1;
    int rear=-1;
    
    void enQueue(Scanner in){
        if(rear==n-1){
            System.out.println("Queue Overflow");
        }
        else{
            if(front==-1){
                front=0;
            }
            System.out.println("Enter the value: ");
            queue[++rear] = in.nextInt();
        }
        
    }
    
    void deQueue(Scanner in) {
    	if(front==-1) {
    		System.out.println("Queue UnderFlow");
    	}
    	System.out.println(queue[front]);
        front++;
        if(front>rear) {
        	front=-1;
        	rear=-1;
        }
    
    }
    	
    

void displayQueue(Scanner in) {
	if(front==-1) {
		System.out.println("Queue is empty");
	}
	
	for(int i=front;i<=rear;i++) {
		System.out.println(queue[i]);
	}
}

void peek() {
	if(isEmpty()) {
		System.out.println("Stack is Quese");
	}
	else {
		System.out.println(queue[front]);
	}
}

boolean isEmpty() {
	if(front==-1) {
		System.out.println("Is Empty Queue");
		return true;
		
	}
	System.out.println("Is Not Empty Queue");
	return false;
}

}

public class queue_1
{
	public static void main(String[] args) {
		QueueImplementation qi = new QueueImplementation();
		Scanner in = new Scanner(System.in);
		while(true){
		    System.out.println("1)EnQueue\n2)DeQueue\n3)Display\n4)Peek");
		    switch(in.nextInt()){
		        case 1:{
		            qi.enQueue(in);
		            break;
		        }
		        
		        case 2:{
		            qi.deQueue(in);
		            break;
		        }
		        
		        case 3:{
		            qi.displayQueue(in);
		            break;
		        }
		        
		        case 4:{
		            qi.peek();
		            break;
		        }
		        
		        
		        
		       
		        
		    }
		}
	}
}

