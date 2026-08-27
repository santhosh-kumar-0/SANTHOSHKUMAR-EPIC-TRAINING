package basics_array;

import java.util.Scanner;

public class odd_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int count =0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		System.out.print(count);
		
	}

}
