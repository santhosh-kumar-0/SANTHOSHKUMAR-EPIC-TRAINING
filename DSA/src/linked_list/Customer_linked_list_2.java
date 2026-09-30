//package linked_list;
//
//import java.util.Scanner;
//
//
//class Customer{
//    String cusName;
//    String cusEmail;
//    Node li;
//    
//    Customer(Node li){
//        this.li = li;
//    }
//    
//    Customer(String name,String email){
//        this.cusName = name;
//        this.cusEmail = email;
//    }
//    
//    void createCustomer(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the customer Name: ");
//        String name = in.nextLine();
//        System.out.print("Enter the customer Email: ");
//        String email = in.nextLine();
//        Customer cus = new Customer(name,email);
//        
//        li.insertData(in,cus);
//        
//    }
//    
//    void displayCustomer() {
//    	li.displayData();
//    }
//    
//    void updateCustomer() {
//    	li.insertANode();
//    }
//    
//    void deleteCustomer() {
//    	li.deleteANode();
//    }
//    
//    
//}
//
//class Node{
//    Customer data;
//    Node next;
//    Node head = null,tail=null;
//    
//    Node(Customer data,Node add){
//        this.data=data;
//        this.next = add;
//    }
//   
//
//	Node(){
//        
//    }
//    
//    
//    void insertData(Scanner in,Customer cus){
//        
//            
//                Node obj = new Node(cus,null);
//                if(head==null){
//                    head = obj;
//                    tail=obj;
//                }
//                else{
//                    tail.next = obj;
//                    tail=obj;
//                }
//    }
//    
//    
//    void displayData(){
//        	Node temp = head;
//    		while(temp!=null){
//		    System.out.println("Name :"+temp.data.cusName);
//		    System.out.println("Email ID :" +temp.data.cusEmail);//40
//		    temp=temp.next;//null
//		}
//    }
//
//	
//    
//     void insertANode(){
//    	 Scanner in = new Scanner(System.in);
//         System.out.print("Enter the Name: ");
//         String name = in.nextLine();//55
//         
//         System.out.print("Enter the Email ID: ");
//         String email = in.nextLine();
//         
//         System.out.print("Enter the position: ");
//         int pos = in.nextInt();//4
////        
//         Customer cus = new Customer(name,email);
//         Node newNode = new Node(cus,null);//8000
//         if(pos==1){
//             newNode.next = head;
//             head = newNode;
//         }
//         else{
//             Node temp = head;//1000
//         //          0<2
//         for(int i=0;i<pos-2;i++){
//             temp=temp.next;
//             //i=0==>temp=2000;
//             //i=1==>temp=3000;
//         }
//         //temp=3000;
//         if(temp.next == null){
//             tail = newNode;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//         }
////        
//     }
//    
//    
//     void deleteANode(){
//    	 
//    	 Scanner in = new Scanner(System.in);
//         System.out.print("Enter the position: ");
//         int pos = in.nextInt();//1
//         Node temp = head;//1000
//         if(pos==1){
//             head = temp.next;
//         }
//         
//         else{
//            
//             for(int i=0;i<pos-2;i++){
//                 temp=temp.next;
//                
//             }
//             
//             //temp=1000
//             if(temp.next.next == null){
//                 tail = temp;
//             }
//             
//             temp.next = temp.next.next;
//            
//         }
//         //temp.next = 3000
//     }
//    
//   
//    
//}
//public class Customer_linked_list_2
//{
//	public static void main(String[] args) {
//		
//		 Node li = new Node();
//		 Customer cus = new Customer(li);
//		
//	    Scanner in = new Scanner(System.in);
//	    
//	    while(true) {
//	    	 System.out.println("1.Create Customer");
//	 	    System.out.println("2.Display Customer");
//	 	   System.out.println("3.Update Customer");
//	 	  System.out.println("4.Delete Customer");
//	 	 System.out.println("---------------------------------");
//	 	    System.out.print("Enter the choice : ");
//	 	    int choice = in.nextInt();
//	    	switch(choice) {
//	    	case 1:{
//	    		cus.createCustomer();
//	    		break;
//	    	}
//	    	case 2:{
//	    		 cus.displayCustomer();
//	    		  break;
//	    	}
//	    	case 3:{
//	    		 cus.updateCustomer();
//	    		  break;
//	    	}
//	    	case 4:{
//	    		cus.deleteCustomer();
//	    		break;
//	    	}
//	    	}
//	    	System.out.println();
//	    }
//	    
//	    
//	}
//}
