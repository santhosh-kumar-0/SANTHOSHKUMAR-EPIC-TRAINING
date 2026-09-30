//
////reverse double_linked_list
//
//
//package double_linked_list;
//
//class Node{
//	int data;
//	Node next;
//	Node prev;
//	
//	Node(Node prev,int data,Node next){
//		this.next = next;
//		this.data=data;
//		this.prev = prev;
//	}
//}
//
//public class double_linked_list_1 {
//
//	public static void main(String[] args) {
//	
//		Node obj1 = new Node(null,10,null);
//		Node head = obj1;
//		
//		
//		Node obj2 = new Node(null,20,null);
//		obj2.prev=obj1;
//		obj1.next=obj2;
//		
//		
//		Node obj3 = new Node(null,30,null);
//		
//		obj3.prev=obj2;
//		obj2.next=obj3;
//		Node tail = obj3;
//		
//		Node temp = tail;
//		
//		
//		while(temp!=null){
//		    System.out.println(temp.data);
//		    temp = temp.prev;
//		}
//		
//		
//	}
//
//}
