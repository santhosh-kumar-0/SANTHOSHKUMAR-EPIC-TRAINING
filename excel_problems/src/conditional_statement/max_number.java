package conditional_statement;
import java.util.Scanner;
public class max_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int max = 0;
		int min = 9;
		while(n>0) {
			int digit = n%10;
				if(digit>max) {
					max = digit;
				}
				else if(digit<min) {
					min = digit;
				}
				
			n=n/10;
		}
		
		System.out.println(min);
		System.out.println(max);
	}
}
