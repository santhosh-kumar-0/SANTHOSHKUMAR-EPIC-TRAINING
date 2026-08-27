package number_problems;
import java.util.Scanner;
public class Strong_number {
	public static void main(String[] arg) {
		 Scanner scan = new Scanner(System.in);

	        int n = scan.nextInt();

	        int temp = n;

	        int sum = 0;

	        while (temp > 0) {

	            int digit = temp % 10;

	            int fact = 1;

	            for (int i = 1; i <= digit; i++) {

	                fact = fact * i;

	            }

	            sum = sum + fact;

	            temp = temp / 10;

	        }

	        if (sum == n) {

	            System.out.println("Strong Number");

	        } else {

	            System.out.println("Not Strong Number");

	        }

	}
}
