package java_tasks;
import java .util.Scanner;
public class Task_4 {

	public static void main(String[] args) {  //Divide a Number by 2
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number : ");
	        int n = sc.nextInt();
	        int m = n<<1;
	        System.out.print("Multiply a Number by 2 is:" +m);
	        sc.close();
	}

}
