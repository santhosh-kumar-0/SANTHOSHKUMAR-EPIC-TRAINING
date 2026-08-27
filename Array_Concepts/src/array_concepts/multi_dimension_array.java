package array_concepts;
import java.util.Scanner;
public class multi_dimension_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int oddcount = 0;
		int evencount =0;
		
		System.out.print("enter the size of N:");
		int n = scan.nextInt();
		System.out.print("enter the size of M:");
		int m = scan.nextInt();
		int[][]arr = new int[n][m];
		
		System.out.println("--------------------------------------------------");

		System.out.println("Enter array values :");

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("multidimentional array:");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("ODD & EVEN COUNT OF THE ARRAY :");

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j]%2==0){
					evencount+=1;
				}
				else {
					oddcount+=1;
				}
			}
			
		


		}
		System.out.println("multidimenstional array even count :" + evencount);
		System.out.println("multidimenstional array odd count :" + oddcount);
		
		
	}
}
