package array_problems;

import java.util.Scanner;

public class Task24 {
public static void main(String[] arg) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a array1 size:");
	
	int i ;
	int j ;
	
	int n = scan.nextInt();
	int arr1[] = new int[n];
	for ( i=0 ; i<arr1.length ; i++) {
		arr1[i] = scan.nextInt();
	}
	
	System.out.println("enter a array2  size: ");
	int m = scan.nextInt();
	int arr2[] = new int[m];
	
	for ( j=0 ; j<arr2.length ; j++) {
		arr2[j] = scan.nextInt();
		}
	
	for ( i=0 ; i<arr1.length ; i++) {
		for ( j=0 ; j<arr2.length ; j++) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i] + " ");
			}
		}
	}
}
}
