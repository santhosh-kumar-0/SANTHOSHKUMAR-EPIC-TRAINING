package number_problems;
import java.util.Scanner;
public class min_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int min = 9;
		
		while(n>0) {
			int digit = n%10;
			if(digit<min) {
				min = digit;
			}
			n=n/10;
		}
		System.out.println(min);
	}
}
