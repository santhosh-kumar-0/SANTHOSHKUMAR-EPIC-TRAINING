package stack;

import java.util.Scanner;

class StackImplementation{
    int n = 10;
    int[] stack = new int[n];
    int top = -1;
    //push
    public void push(Scanner in){
        System.out.println("Enter a value: ");
        int val = in.nextInt();
        if(top==n-1){
            System.out.println("Stack Overflow");
        }
        else{
            top++;//0123456789
            stack[top] = val;
        }
        
    }
    //pop
    public void pop(){
        if(top==-1){
            System.out.println("Stack UnderFlow");
        }
        else{
            System.out.println(stack[top]);
            top--;
        }
    }
    
    
    void display() {
    	for(int i=top;i>=0;i--) {
    		System.out.println(stack[i]);
    	}	
    }
    
    void peek() {
    	if(isEmpty()) {
    		System.out.println("Stack is Empty");
    	}
    	else {
    		System.out.println(stack[top]);
    	}
    }
    
    
    boolean isEmpty() {
    	if(top==-1) {
    		return true;
    	}
    	return false;
    }
    //peak
    //isEmpty
    //display
}


public class stack_1
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StackImplementation si = new StackImplementation();
		while(true){
		    System.out.println("1)PUSH\n2)POP\n3)DISPLAY\n4)EMPTY\n5)PEEK");
		    int n = in.nextInt();
		    switch(n){
		        
    		    case 1:{
    		        si.push(in);
    		        break;
    		    }
    		    case 2:{
    		        si.pop();
    		        break;
    		    }
    		    case 3:{
    		        si.display();
    		        break;
    		    }
    		    
    		    case 4:{
    		        si.isEmpty();
    		        break;
    		    }
    		    
    		    case 5:{
    		        si.peek();
    		        break;
    		    }
		    }
		}
	}
}
