package stack;
import java.util.Scanner;

class Stack{
	int data;
    Stack next;
    Stack top = null;
    Stack(int data , Stack next){
    	this.data=data;
        this.next = next;
    }
    
    Stack(){
    	
    }
    
    public void push(Scanner in) {
    	
    	System.out.println("Enter a value: ");
         int val = in.nextInt();
         Stack obj = new Stack(val,null);
         
//         Stack obj = new Stack(val,top);
//         top= obj;
         
         if(top==null) {
        	 top=obj;
         }
         else {
        	 obj.next = top;
         }
         top = obj;
        
    }
    

    
    void display() {
    	Stack temp = top;
    	while(temp!=null){	
		    System.out.println(temp.data);
		    temp=temp.next;
    }
    	}

    void pop() {
    	if(top==null) {
    		  System.out.println("Stack UnderFlow");
    	}
    	else {
    		 
             top=top.next;
             System.out.println("data removed");
    	}
    }
    
    void peek() {
    	if(isEmpty()) {
    		System.out.println("Stack is Empty");
    	}
    	else {
    		System.out.println(top.data);
    	}
    }
    
    boolean isEmpty() {
    	if(top==null) {
    		System.out.println("Is Empty Stack");
    		return true;
    		
    	}
    	System.out.println("Is Not Empty Stack");
    	return false;
    }
}


public class stack_using_linked_list {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Stack st = new Stack();
		
		while(true){
		    System.out.println("1)PUSH\n2)DISPLAY\n3)POP\n4)PEEK\n5)ISEMPTY");
		    int n = in.nextInt();
		    switch(n){
		        
    		    case 1:{
    		        st.push(in);
    		        break;
    		    }
    		    
    		    case 2:{
    		        st.display();
    		        break;
    		    }
    		    
    		    case 3:{
    		        st.pop();
    		        break;
    		    }
    		    
    		    case 4:{
    		        st.peek();
    		        break;
    		    }
    		    
    		    case 5:{
    		        st.isEmpty();
    		        break;
    		    }
    		    
    		    default :{
    		    	System.out.println("Invalin option");
    		    }
		    }
	   }
	}
	
}
