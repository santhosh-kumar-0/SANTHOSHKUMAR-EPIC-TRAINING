package number_problems;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp = n;
		int rev = 0;
		
		while(n>0) {
			int digit = n%10;
			rev = rev*10 + digit;
			n=n/10;
		}
		
		
		if(rev==temp) {
			System.out.println("this is palindrome");
			
		}
		else {
			System.out.println("this is not a palindrome");
		}
		
	}
}
