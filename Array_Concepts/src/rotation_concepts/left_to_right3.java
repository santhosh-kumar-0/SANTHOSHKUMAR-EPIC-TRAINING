package rotation_concepts;

import java.util.Scanner;

public class left_to_right3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int rot = scan.nextInt();
		int[] arr = new int[size];
		
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			arr[(i+(n-rot))%n]=scan.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
