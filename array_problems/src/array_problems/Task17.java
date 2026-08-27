package array_problems;
import java.util.Scanner;
public class Task17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int positivecount =0 ;
		int negativecount = 0;
		int zero = 0;
		
		System.out.println("Enter the size of the array : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter of the array : ");
		for(int i=0 ; i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0 ; i<n;i++) {
			if(arr[i]>0) {
				positivecount = positivecount + 1;
			}
			else if(arr[i]<0){
				negativecount = negativecount + 1;
			}
			else {
				zero = zero + 1 ;
			}
			
		}
		
		System.out.println("positive : " +positivecount);
		System.out.println("Negative :" +negativecount);
		System.out.println("zero :" +zero);
		
	}

}
