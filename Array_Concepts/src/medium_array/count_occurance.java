package medium_array;
import java.util.Scanner;
public class count_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int count = 0;
		int m = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			if(arr[i]==m) {
				count++;
			}
		}
		System.out.print(count);
	}

}
