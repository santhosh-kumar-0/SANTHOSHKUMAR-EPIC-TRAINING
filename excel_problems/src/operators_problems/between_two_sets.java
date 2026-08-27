package operators_problems;
import java.util.Scanner;
public class between_two_sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		int count=0;
		
		
//		int m = scan.nextInt();
//		int[] arr2 = new int[m];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
//		for(int j=0;j<m;j++) {
//			arr[j]=scan.nextInt();
//		}
		
		
		
		for(int i=1;i<=n-1;i++) {
			
			for(int j=1;j<=10;j++) {
				System.out.println(j + "X" + arr[1] + "=" + j*arr[1]);
			}

			for(int k=1;k<=10;k++) {
				System.out.println(i + "X" + arr[0] + "=" + k*arr[0]);
			}
		
			
		
//		
//		if(arr1==arr2) {
//			int eq = arr1;
//			System.out.println(eq);
//		}
		
		
		}		
	}

}
