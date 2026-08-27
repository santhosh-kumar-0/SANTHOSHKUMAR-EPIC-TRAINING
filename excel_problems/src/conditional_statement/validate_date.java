package conditional_statement;
import java.util.Scanner;
public class validate_date {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int date = scan.nextInt();
	int month = scan.nextInt();
	int year = scan.nextInt();
	
	int dd=31;
	int mm = 12;
	int yy = 2100;
	if(dd>=date && mm>=month && yy>=year ) {
		System.out.print("valid Dob");
	}
	else {
		System.out.print("Dob is invalid");
	}
	
}
}
