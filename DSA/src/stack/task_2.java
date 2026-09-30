package stack;
import java.util.Scanner;


// 3(a) 3(b) 

class StackNode{
	
	String data;
    StackNode next;
    Stack top = null;
    StackNode(String str , StackNode top){
    	this.data=str;
        this.next = top;
    }
    
    StackNode(){
    	
    }
    
    boolean isEmpty(int top){
        if(top==-1){
            return true;
        }
        return false;
    }
    
    boolean isOverFlow(int top,int size){
        if(top==size-1){
            return true;
        }
        return false;
    }
}

public class task_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine(); 
		char[] word = new char[str.length()];
		 
		StackNode si = new StackNode();
		
		//insert
		StackNode top = null;
		for(int i=0;i<str.length();i++) {
			if(str!=null) {
				 StackNode obj = new StackNode(str,top);
		         top= obj;
			}
		}
		
		//display
		StackNode temp = top;
    	while(temp!=null){	
		    System.out.println(temp.data);
		    temp=temp.next;
    }
    	
    	//pop
    	
    	while(true){
    		if(top==null) {
      		  System.out.println("Stack UnderFlow");
      	}
      	else {
      		 
               top=top.next;
               System.out.println("data removed");
      	}
    	}
    	
    	

	}

}
