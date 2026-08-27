package number_problems;

import java.util.Scanner;

public class Sum_of_digit {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum=0;
		while(n>0) {
			int digit = n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(sum);
			
	}
}
