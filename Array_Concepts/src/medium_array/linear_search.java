package medium_array;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		
		int m = scan.nextInt();
		boolean found = false;
		for(int i=0;i<n;i++) {
			if(arr[i]==m) {
				System.out.print(i);
				found = true;
				break;
			}
			
		}
		if(!found){
			System.out.print("index.out.print");
		}
		
	}

}
