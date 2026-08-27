package java_tasks;
import java.util.Scanner;
public class Task_7 {
	public static void main(String []args) {   //Find Maximum of 3 Numbers (Ternary)
		  Scanner sc = new Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();

	        int max;

	        if (a >= b && a >= c)
	            max = a;
	        else if (b >= a && b >= c)
	            max = b;
	        else
	            max = c;

	        System.out.println("Maximum: " + max);
	        
	        sc.close();
	}

}
