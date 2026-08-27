package swapping_arrays;
import java.util.Scanner;
public class first_to_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[]  arr = new int[n];
		int temp=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}
		
		temp=arr[0];
		arr[0]=arr[4];
		arr[4]=temp;
		
		for(int array : arr) {
			System.out.print(array + " ");
		}
	}

}
