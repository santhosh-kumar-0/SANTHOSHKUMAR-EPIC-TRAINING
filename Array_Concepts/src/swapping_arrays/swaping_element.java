package swapping_arrays;
import java.util.Scanner;
public class swaping_element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int[] arr=new int[n];
		
		int temp=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("----------------------After swapping array : ");
		temp = arr[1];
		arr[1]=arr[3];
		arr[3]=temp;
		
		for(int array : arr)
		System.out.print(array + " ");

		
		
	}
}
