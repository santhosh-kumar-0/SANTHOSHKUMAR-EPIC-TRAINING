package conditional_statement;
import java.util.Scanner;
public class calculator {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter A Value :");
	int a = scan.nextInt();
	System.out.print("Enter B Value :");
	int b = scan.nextInt();
	
	System.out.print("Enter Choice :");
	int choice = scan.nextInt();
	
	switch (choice){
	case 1:
		System.out.println(a+b);
		break;
	case 2 :
		System.out.println(a-b);
		break;
	case 3:
		System.out.println(a*b);
		break;
	case 4:
		System.out.println(a/b);
		break;
	case 5:
		System.out.println(a%b);
		break;
	default :
		System.out.println("invalid ");
	}
}
}
