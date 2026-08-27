package multi_dimenstion_array;

import java.util.Scanner;

public class sum_of_two_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the n value :");
		int n = scan.nextInt();
		System.out.print("Enter the m value :");
		int m = scan.nextInt();
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];

		
		System.out.println("Enter the array value :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			 arr1[i][j] = scan.nextInt(); 
		}
		}
		
		System.out.println("Enter the array value :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			 arr2[i][j] = scan.nextInt(); 
		}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr1[i][j] = arr1[i][j]+arr2[i][j];
		        System.out.print(arr1[i][j]+" ");

			}
			System.out.println();
		}
		
		

		

	}

}
