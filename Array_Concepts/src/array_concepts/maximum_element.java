package array_concepts;
import java.util.Scanner;
public class maximum_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr=new int[n];
		int max=arr[0];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(max);

		
	}

}
