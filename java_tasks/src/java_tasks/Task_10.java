package java_tasks;
import java.util.Scanner;
public class Task_10 {

	public static void main(String[] args) {      //Swap Two Numbers Using Temporary Variable
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();

	}

}
