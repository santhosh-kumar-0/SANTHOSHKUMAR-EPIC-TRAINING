package number_problems;
import java.util.Scanner;
public class Perfect_number {
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int sum = 0;

	        for (int i = 1; i < n; i++) {
	            if (n % i == 0) {
	                sum = sum + i;
	            }
	        }
	        if (sum == n) {
	            System.out.println("Perfect Number");
	        } else {
	            System.out.println("Not Perfect Number");
	        }

	    }
	}

