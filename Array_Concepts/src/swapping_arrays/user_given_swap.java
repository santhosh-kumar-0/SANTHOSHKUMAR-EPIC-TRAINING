package swapping_arrays;
import java.util.Scanner;
public class user_given_swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr = new int[n];
		int temp=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
		for(int array : arr) {
			System.out.print(array + " ");
		}
		
	}
}
