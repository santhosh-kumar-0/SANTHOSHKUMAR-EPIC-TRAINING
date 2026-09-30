//package double_circle_linked_list;
//
//import java.util.Scanner;
//
//class Node{
//    int data;
//    Node prev,next;
//    Node head=null , tail= null;
//    public Node(Node prev,int data,Node next){
//        this.data = data;
//        this.prev = prev;
//        this.next = next;
//    }
//    
//    Node(){
//    	
//    }
//    
//    
//    public void insertData(Scanner in){
//        System.out.println("Enter the no of data: ");
//        int n = in.nextInt();
//        for(int i=0;i<n;i++){
//            
//            int val = in.nextInt();
//            Node obj = new Node(null,val,null);
//            
//            if(head==null){
//                head=obj;
//                
//            }
//            else{
//                tail.next=obj;
//                obj.prev=tail;
//            }
//            tail=obj;
//            obj.next=head;
//            head.prev=obj;
//           
//        }
//    }
//    
//    
//    void displayData() {
//    	Node temp = head;
//    	
//   	 do {
//   	        System.out.println(temp.data);
//   	        temp = temp.next;
//
//   	    } while (temp != head);
//
//		
//    }
//    
//    
//    void insertHead(Scanner in) {
//    	
//    }
//    
//    
//    void insertANode(Scanner in) {
//    	
//    	 boolean flag = true;
//    	 
//    	System.out.println("Enter the data :");
//    	int val = in.nextInt();
//    	Node newNode = new Node(null,val,null);
//    	
//    	System.out.println("Enter the position :");
//    	int pos = in.nextInt();
//    	
//    	if(pos==1) {
//     	   newNode.next=head;
//     	   head = newNode;
//     	   tail.next=head;
//        }
//    	
//    	 else{
//	            
//	            Node temp = head;
//	            for(int i=0;i<pos-2;i++){
//	                temp = temp.next;
//	            }
//	            
//	            if(temp.next==null){
//	                temp.next = newNode;
//	                newNode.prev = temp;
//	                tail = newNode;
//	            }
//	            else{
//	                newNode.prev = temp;
//	                newNode.next = temp.next;
//	                temp.next.prev = newNode;
//	                temp.next = newNode;
//	            }
//	        }
//    }
//    
//    void deleteNode(Scanner scan) {
//		System.out.println("Enter the position : ");
//		int pos = scan.nextInt();
//		
//		
//		if(pos==1) {
//			head=head.next;
//			return;
//		}
//		
//		else {
//			Node temp = head;
//			for(int i=0;i<pos-2;i++) {
//				temp = temp.next;
//			}
//			
//			if(tail==temp) {
//				tail=temp;
//				
//			}
//			temp.next = temp.next.next;
//			
//		}
//	}
//    
//}
//
//public class double_circle_linked_list
//{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		Node node = new Node();
//		
// while(true) {
//			 
//			 System.out.println("1.Insert the data ");
//			 System.out.println("2.display data ");
//			 System.out.println("3.Insert A Node data ");
//			 System.out.println("4.Delete data ");
//			 int choice = scan.nextInt();
//			 
//			 switch(choice) {
//			 
//			 case 1: {
//				 node.insertData(scan);
//				 break;
//			 }
//			 
//			 case 2: {
//				 node.displayData();
//				 break;
//			 }
//			 
//			 case 3: {
//				 node.insertANode(scan);
//				 break;
//			 }
//			 
//			 case 4: {
//				 node.deleteNode(scan);
//				 break;
//			 }
//			 default:{
//				 System.out.println("Invalid option");
//			 }
//			 
//			 
//			 }
//		 }
//		
//	}
//}
