package array_problems;

import java.util.Scanner;

public class Task6 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
				
		int oddcount = 0 ;
		int evencount = 0 ;
				int n = scan.nextInt();
				int arr[] = new int[n];
				
				
				for (int i=0 ; i<n ; i++) {
					arr[i] = scan.nextInt();
				}
					
				for (int i=0 ; i<n ; i++) {
				
					
					if(arr[i]%2==0) {
						evencount = evencount + 1 ;
						
					}
					else {
						oddcount=oddcount+ 1;
						
					}
				}
				System.out.println(oddcount);
				System.out.println(evencount);
				
				
}
}