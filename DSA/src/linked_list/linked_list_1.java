//package linked_list;
//
//import java.util.Scanner;
//
//class Node{
//    int data;
//    Node next;
//    Node head = null,tail=null;
//    
//    Node(int data,Node add){
//        this.data=data;
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
//        if(pos==1){
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
//        //temp=3000;
//        newNode.next = temp.next;
//        temp.next = newNode;
//        }
//        
//    }
//    
//    
//    
//    
//    
//}
//public class linked_list_1
//{
//	public static void main(String[] args) {
//	    
//	 
//	    Scanner in = new Scanner(System.in);
//	    
//	    
//	    
//	    Node node = new Node();
//	    
//		node.insertData(in);
//        node.displayData();
//        node.insertANode(in);
//        node.displayData();
//	}
//}
