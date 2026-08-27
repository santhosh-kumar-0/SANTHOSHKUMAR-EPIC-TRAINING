package conditional_statement;
import java.util.Scanner;
public class odd_even_number {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n%2==0) {
			System.out.print("Even Number");
		}
		else {
			System.out.println("odd number");
		}
	}
		
	}

