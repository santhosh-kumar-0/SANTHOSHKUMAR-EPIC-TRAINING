package double_circle_linked_list;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node head=null,tail=null;
    
    public Node(){
        
    }
    
    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    
    void insertData(Scanner in){
        System.out.println("Enter the number of data: ");
        int n = in.nextInt();
        
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
    
    public void insertInHead(int val){  
        Node newNode = new Node(data,head);
        head = newNode;
        tail.next = head;
    }
    
    public void insertInMiddle(int val,Node temp){
        Node newNode = new Node(val,null);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void insertInTail(int val){
        Node newNode = new Node(val,head);
        tail.next = newNode;
        tail=newNode;
    }
    
    
    void insertDataByPosition(Scanner in){
        boolean flag = true;
        
        System.out.println("Enter the value: ");
        int val = in.nextInt();
        
        System.out.println("Enter the position: ");
        int pos = in.nextInt();
        
        Node temp = head;
        for(int i=0;i<pos-2;i++){
            if(temp.next!=head){
                temp=temp.next;
            }
            else{
                flag = false;
                break;
            }
        }
        
        if(flag){
            
            if(pos==1){
                insertInHead(val);
            }
            else if(temp.next == head){
                insertInTail(val);
            }
            else{
                insertInMiddle(val,temp);
            }
        }
        else{
            System.out.println("Invalid Position");
        }
    }
    
    
    void display(){
        Node temp = head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=head);
    }
}


public class double_circle_linked_list_2
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);  
	    Node node = new Node();
	    
	    while(true) {
	    	System.out.println("1.Insert The Data");
	    	System.out.println("2.Display The Data");
	    	System.out.println("3.Insert An Node");
	    	
	    	int choice = in.nextInt();
	    	
	    	switch(choice) {
	    	
	    	case 1:{
	    		node.insertData(in);
		        break;
		    }
		    
	    	case 2:{
	    		node.display();
	    		break;
	    	}
		    case 3:{
		    	node.insertDataByPosition(in);
		        break;
		    }
		    
	    	}
	    }
	}
}
