package hashmap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class unique_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		  
		
		HashSet<Integer> set = new HashSet<Integer>();	
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		ArrayList<Integer> li = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			li.add(scan.nextInt());	
		}
		
		for(int val : li){
	        if(!set.add(val)){
	        	set1.add(val);
	           set.remove(val);
	        }
	    }
		
		li.removeAll(set1);
		
		System.out.println(set);
		System.out.println(set1);
		System.out.println(li);
		
	}

}
