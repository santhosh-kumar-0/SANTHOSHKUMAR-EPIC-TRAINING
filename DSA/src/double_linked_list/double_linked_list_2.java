package double_linked_list;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node prev;
	Node head;
	Node tail;
	Node(Node prev,int data,Node next){
		this.next = next;
		this.data=data;
		this.prev = prev;
		}
	
	Node(){
		
	}
	
	void insertData(Scanner in) {
		System.out.println("Enter the number of Data: ");
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			int val = in.nextInt();
			Node obj = new Node(null,val,null);
			
			if(head==null) {
				head = obj;
			}
			else {
				obj.prev = tail;
				tail.next = obj;
			}
			tail = obj;
		}
	}
	
	
	void displayData() {
		Node temp = head;
		while(temp!=null){
		     System.out.print(temp.data + " "); 
		    temp = temp.next;
		}
		System.out.println();
	}
	
	
	void insertANode(Scanner in) {
	
	        System.out.println("Enter the data: ");
	        int val = in.nextInt();
	        Node newNode = new Node(null,val,null);
	        System.out.println("Enter the position: ");
	        int pos = in.nextInt();//4
	        if(pos==1){
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	        else{
	            
	            Node temp = head;
	            for(int i=0;i<pos-2;i++){
	                temp = temp.next;
	            }
	            
	            if(temp.next==null){
	                temp.next = newNode;
	                newNode.prev = temp;
	                tail = newNode;
	            }
	            else{
	                newNode.prev = temp;
	                newNode.next = temp.next;
	                temp.next.prev = newNode;
	                temp.next = newNode;
	            }
	        }
	    
//		
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
	
	void reverseData() {
		Node temp = tail;
		
		while(temp!=null){
		    System.out.print(temp.data + " ");
		    temp = temp.prev;
		  
		}
		System.out.println();
	}
	
}


public class double_linked_list_2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		Node node = new Node();
		
		while(true) {
			System.out.println("1.Inserting A Data");
			System.out.println("2.Displaying A Data");
			System.out.println("3.Insert the data in the middle");
			System.out.println("4.Deleting A Data");
			System.out.println("5.Reverse A Data");
		int choice = scan.nextInt();
		
		switch(choice) {
		
		case 1:{
			node.insertData(scan);
			break;
		}
		case 2:{
			node.displayData();
			break;
		}
		case 3:{
			node.insertANode(scan);
			break;
		}
		case 4:{
			node.deleteNode(scan);
			break;
		}
		case 5:{
			node.reverseData();
			break;
		}
		
		
		
		}

		
		
		
		
		
	
	}

}
}