package conditional_statement;
import java.util.Scanner;
public class leap_or_nonleap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if(year%400==0 || year%4==0 && year%100!=0) {
			System.out.print("This is leap year");
		}
		else {
			System.out.print("This is not a Leap year");
		}
	}
}
