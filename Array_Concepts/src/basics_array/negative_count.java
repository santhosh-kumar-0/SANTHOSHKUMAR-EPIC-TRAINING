package basics_array;
import java.util.Scanner;
public class negative_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int negcount =0;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				negcount++;
			}
		}
		System.out.print(negcount);
		
	}

}
