package basics_array;
import java.util.Scanner;
public class print_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
	
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
	
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 

		scan.close(); 
	}

}
}
