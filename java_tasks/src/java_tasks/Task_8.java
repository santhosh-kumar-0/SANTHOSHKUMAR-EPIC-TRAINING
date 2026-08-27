package java_tasks;
import java.util.Scanner;
public class Task_8 {
	public static void main(String []args) {  //Check Positive or Negative
		 Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        if (n > 0)
	            System.out.println("Positive");
	        else if (n < 0)
	            System.out.println("Negative");
	        else
	            System.out.println("Zero");

	        sc.close();
	        
	}

}
