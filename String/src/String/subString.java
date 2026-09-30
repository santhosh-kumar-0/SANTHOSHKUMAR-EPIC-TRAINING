package String;
import java.util.Scanner;
public class subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(str.charAt(k) + " ");
				}
				System.out.println();
			}
			System.out.println();

		}
	}

}
