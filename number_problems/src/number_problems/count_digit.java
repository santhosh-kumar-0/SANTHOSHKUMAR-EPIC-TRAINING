package number_problems;
import java.util.Scanner;
public class count_digit {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int count = 0;
	while(n>0) {
		int digit = n%10;
		count=count+1;
		n=n/10;
	}
	System.out.println(count);
}
}
