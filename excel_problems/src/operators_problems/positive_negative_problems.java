package operators_problems;
import java.util.Scanner;
public class positive_negative_problems {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>0) {
			System.out.println(n+" is Positive Number");
		}
		else if(n==0) {
			System.out.println(n+" is Zero");
		}
		else {
			System.out.println(n+ " is Negative Number");
		}
	}
}
