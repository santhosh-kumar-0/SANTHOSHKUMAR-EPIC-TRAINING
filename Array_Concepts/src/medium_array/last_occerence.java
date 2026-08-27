package medium_array;

import java.util.Scanner;
import java.util.Scanner
public class last_occerence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		int m = scan.nextInt();
		int last=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==m) {
				last=i;
			}
			
		}
		
			System.out.print(last);
		
		
		
	}

}
