package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class largest_sec_largest {

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
		
		System.out.println(li);
		
		
		int max=Integer.MIN_VALUE;
		int sec_lar=0;
		int trd_lar = 0;
		
		for(int i=0;i<n;i++) {
			if(max<li.get(i)) {
				trd_lar = sec_lar;
				sec_lar=max;
				max=li.get(i);
				
				
			}
			else if(li.get(i)<max && sec_lar<li.get(i)) {
				sec_lar=li.get(i);
			}
			else if(li.get(i)<max && sec_lar<li.get(i) && trd_lar<li.get(i)) {
				trd_lar=li.get(i);
			}
			
		}
		System.out.println("largest value :" +max);
		System.out.println("second largest value :" +sec_lar);
		System.out.println("third largest value :" +trd_lar);
		
	}

}
