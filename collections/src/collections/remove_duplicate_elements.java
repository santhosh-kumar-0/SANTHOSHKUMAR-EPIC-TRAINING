package collections;
import java.util.Scanner;
import java.util.ArrayList;
public class remove_duplicate_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> li = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Array size :");
		int n = scan.nextInt();
		
		System.out.print("Enter the Array values :");
		for(int i=0;i<n;i++) {
			li.add(scan.nextInt());
			
		}
		
		for(int i=0;i<n;) {
			if(li.contains(li.get(i)) && li.indexOf(li.get(i))!=i) {
				li.remove(i);
				n--;
			}
			else {
				i++;
			}
		}
		
		System.out.println(li); 
		
		
//		System.out.println(li.contains(10));    ---> showing the value is present or absent ----if present comes true or absent it comes false 
		

	}

}
