package rotation_concepts;

import java.util.Arrays;
import java.util.Scanner;

public class left_to_right2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int rot = scan.nextInt();
		int[] arr = new int[size];
		
		
		
		int n = arr.length;
		for(int i=n-rot;i<n;i++) {
				arr[i]=scan.nextInt();
			
		}
		
		for(int i=0;i<rot+1;i++) {
				arr[i]=scan.nextInt();
				
			}
		
		System.out.print(Arrays.toString(arr));
	}

}
