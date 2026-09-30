package circle_linked_list;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	Node head;
	Node tail;
	   
	Node(int data, Node next){
		this.data = data;
		this.next=next;
	}
	
	Node(){
		
	}
	
	void insertData(Scanner in) {
		System.out.println("Enter the number of Data: ");
		int n=in.nextInt();
		
		for(int i=0;i<n;i++){
            int val = in.nextInt();
            Node obj = new Node(val,null);
            if(head == null){
                head = obj;
            }
            else{
                tail.next = obj;
            }
            tail = obj;
            obj.next = head;
        }
			
		}
	
	void displayData(){
    	
    	Node temp = head;
    	
    	 do {
    	        System.out.println(temp.data);
    	        temp = temp.next;

    	    } while (temp != head);
}
	
	
	void insertAnode(Scanner in) {
		 System.out.println("Enter the value: ");
       int val = in.nextInt();
       System.out.println("Enter the position: ");
       int pos = in.nextInt();
       
       Node newNode = new Node(val,null);
       
       if(pos==1) {
    	   newNode.next=head;
    	   head = newNode;
    	   tail.next=head;
       }
       
       else {
    	   Node temp = head;
    	   
    	   for(int i=0;i<pos-2;i++){ 
               temp=temp.next;
               
               if(tail==temp){
                   tail = newNode;
                   tail.next = head;
               }    
         }   
    	   newNode.next = temp.next;
         temp.next = newNode;
      }  
	}
	
	
	void deleteNode(Scanner scan) {
		System.out.println("Enter the position : ");
		int pos = scan.nextInt();
		
		  
		if(pos==1) {
			head=head.next;
			return;
		}
		
		else {
			Node temp = head;
			for(int i=0;i<pos-2;i++) {
				temp = temp.next;
			}
			
			if(tail==temp) {
				tail=temp;
				
			}
			temp.next = temp.next.next;	
		}
	}
	
	}



public class circle_linked_list_1 {
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		 Node node = new Node();
		 
		 while(true) {
			 
			 System.out.println("1.Insert the data ");
			 System.out.println("2.Display data ");
			 System.out.println("3.Insert A Node data ");
			 System.out.println("4.Delete data ");
			 int choice = in.nextInt();
			 
			 switch(choice) {
			 
			 case 1: {
				 node.insertData(in);
				 break;
			 }
			 
			 case 2: {
				 node.displayData();
				 break;
			 }
			 
			 case 3: {
				 node.insertAnode(in);
				 break;
			 }
			 
			 case 4: {
				 node.deleteNode(in);
				 break;
			 }
			 }
		 }
		 
		
		 
	}
}
