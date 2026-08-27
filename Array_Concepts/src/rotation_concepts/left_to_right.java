package rotation_concepts;
import java.util.Scanner;
public class left_to_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		
		
		int rot = scan.nextInt();
		int k=0;
		
		while(k<rot) {
			int temp = arr[0];
			for(int i=0;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			
			arr[n-1]=temp;
			k++;
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
