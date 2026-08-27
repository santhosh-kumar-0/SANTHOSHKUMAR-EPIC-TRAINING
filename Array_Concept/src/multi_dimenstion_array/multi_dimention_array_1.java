package multi_dimenstion_array;
import java.util.Scanner;
public class multi_dimention_array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the n value :");
		int n = scan.nextInt();
		System.out.print("Enter the m value :");
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		
		System.out.println("Enter the array value :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			 arr[i][j] = scan.nextInt(); 
		}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
