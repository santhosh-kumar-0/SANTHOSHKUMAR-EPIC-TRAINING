package conditional_statement;
import java.util.Scanner;
public class validate_time {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hours = scan.nextInt();
		int minutines = scan.nextInt();
		
		
		int hr = 24;
		int min = 60;
		
		if(hr>=hours && min>=minutines) {
			System.out.println("Time is valid");
		}
		else {
			System.out.println("Time is invalid");;
		}
	}
}
