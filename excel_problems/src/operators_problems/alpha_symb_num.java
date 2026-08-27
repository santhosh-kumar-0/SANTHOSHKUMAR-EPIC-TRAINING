package operators_problems;
import java.util.Scanner;
public class alpha_symb_num {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		if(ch>='A' && ch<='z' || ch>='a' && ch<= 'z') {
			System.out.println("this is alphabet");
		}
		else {
			System.out.println("Not an Alphabet");
		}
	}
}
