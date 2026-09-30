package String;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		 for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		 
		 //inverted : 
		 
		 for (int i = n-2; i >= 0; i--) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	}

}
