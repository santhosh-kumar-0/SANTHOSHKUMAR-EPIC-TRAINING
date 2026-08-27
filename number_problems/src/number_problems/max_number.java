package number_problems;
import java.util.Scanner;
public class max_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int max = 0;
		
		while(n>0) {
			int digit = n%10;
				if(digit>max) {
					max = digit;
				}
			n=n/10;
		}
		
		System.out.println(max);
	}
}
