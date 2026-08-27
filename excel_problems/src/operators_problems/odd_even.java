package operators_problems;
import java.util.Scanner;
public class odd_even {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n%2==0) {
			System.out.println("this is even number");
		}
		else {
			System.out.println("this is odd number");
		}
	}
}
