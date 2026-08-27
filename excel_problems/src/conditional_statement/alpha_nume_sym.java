package conditional_statement;
import java.util.Scanner;
public class alpha_nume_sym {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		if(ch>='A' && ch<='z' || ch>='a' && ch<= 'z') {
			System.out.println("this is alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("this is number");
		}
		else {
			System.out.println("this is symbol");
		}
	}
}
