package basics_array;
import java.util.Scanner;

public class count_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int zerocount =0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				zerocount++;
			}
		}
		System.out.print(zerocount);
	}

}
