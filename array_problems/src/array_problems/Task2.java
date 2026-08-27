package array_problems;


import java.util.Scanner;


public class Task2 {
	public static void main (String[] arg) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		
		int sum=0;
		
		for(int i=0 ; i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0 ; i<n;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
	}
}
