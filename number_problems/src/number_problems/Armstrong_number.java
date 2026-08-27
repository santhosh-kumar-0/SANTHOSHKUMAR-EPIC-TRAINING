package number_problems;
import java.util.Scanner;
public class Armstrong_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int temp = n;
		int count = 0;

		while(temp > 0) {
		    
		    temp = temp / 10;
		    count++;
		}
	
		temp = n;
		int sum = 0;
		
		while(temp > 0) {
		    int digit = temp % 10;
		    int power = 1;

		    for (int i = 1; i <= count; i++) {
		        power = power * digit;
		    }
		    sum = sum + power;
		    
		    temp = temp / 10;
		}
		if(sum == n) {
		    System.out.println("Armstrong Number");
		}
		else {
		    System.out.println("Not Armstrong Number");
		}
	}
}
