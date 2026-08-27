package medium_array;
import java.util.Scanner;
public class index_occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		int m = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			if(arr[i]==m) {
				System.out.print(i);
				return;
			}
			
		}
		
			System.out.print(-1);
		
		
		
	}

}
