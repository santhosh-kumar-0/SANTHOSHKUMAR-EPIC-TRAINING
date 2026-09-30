//package linked_list;
//
//import java.util.Scanner;
//
//class Customer{
//	String cusName;
//	String cusEmail;
//	
//	Customer(){
//		
//	}
//	
//	Customer(String name , String email){
//		this.cusName = name ;
//		this.cusEmail = email;
//	}
//	
//	void createCustomer() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the Name :");
//		String name = scan.nextLine();
//		
//		System.out.println("Enter the Email :");
//		String email = scan.nextLine();
//		
//		Customer cus = new Customer(name,email);
//		
//		
//	}
//	
//	public void displayCustomer() {
////		Customer cus = new Customer();
//		System.out.println(cusName);
//		System.out.println(cusEmail);
//	}
//}
//
//
//class Node{
//    Customer data;
//    Node next;
//    Node head = null,tail=null;
//    
//    Node(Customer val,Node add){
//        this.data=val;
//        this.next = add;
//    }
//    
//    Node(){
//        
//    }
//    
//    
//    void insertData(Scanner in){
//        System.out.println("Enter the no of Data: ");
//            int n = in.nextInt();//3-->10,20,30
//            for(int i=0;i<n;i++){
//                int val = in.nextInt();//10
//                Node obj = new Node(val,null);
//                if(head==null){
//                    head = obj;
//                    tail=obj;
//                }
//                else{
//                    tail.next = obj;
//                    tail=obj;
//                }
//            }
//    }
//    
//    void displayData(){
//        	Node temp = head;
//    		while(temp!=null){
//    			
//		    System.out.println(temp.data);//40
//		    temp=temp.next;//null
//		}
//    }
//    
//    void insertANode(Scanner in){
//        System.out.println("Enter the value: ");
//        int val = in.nextInt();//55
//        System.out.println("Enter the position: ");
//        int pos = in.nextInt();//4
//        
//        Node newNode = new Node(val,null);//8000
//        if(pos==0){
//            newNode.next = head;
//            head = newNode;
//        }
//        else{
//            Node temp = head;//1000
//        //          0<2
//        for(int i=0;i<pos-2;i++){
//            temp=temp.next;
//            //i=0==>temp=2000;
//            //i=1==>temp=3000;
//        }
//         if(tail==temp){
//               tail = newNode;
//           }
//        //temp=3000;
//        newNode.next = temp.next;
//        temp.next = newNode;
//          
//        }
//        System.out.println("Head: "+ head.data);
//        System.out.println("Tail: "+ tail.data);
//    }
//    
//    
//    void deleteNode(Scanner in){
//        System.out.println("Enter the position: ");
//        int pos = in.nextInt();
//        
//        if(pos==0){
//            head=head.next;
//            return;
//        }
//        
//        Node temp = head;
//        for(int i=0;i<pos-2;i++){
//            temp=temp.next;
//        }
//        
//        if(temp.next.next==null) {
//        	tail = temp;
//        }
//        temp.next = temp.next.next;
//        
//        
//        System.out.println("Head: "+ head.data);
//        System.out.println("Tail: "+ tail.data); 
//    }
//    
////    void reverseNode() {
////    	Node temp = tail;
////		while(temp!=null){
////	    System.out.println(temp.data);//40
////	    temp=temp.next;//null
////    }
////}
//    
//    
//}
//public class Customer_linked_list
//{
//	public static void main(String[] args) {
//	    
//		Customer cus = new Customer();
//		
//		cus.createCustomer();
//		cus.displayCustomer();
//	    Scanner in = new Scanner(System.in);
//	    
//	    
//	    
//	    Node node = new Node();
//	    
//		node.insertData(in);
//        node.displayData();
//        
//        node.insertANode(in);
//        node.displayData();
//        
//        node.deleteNode(in);
//        node.displayData();
//        
////        node.reverseNode();
//	}
//}
