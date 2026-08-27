package array_concepts;
import java.util.Scanner;
public class minimum_index {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			
			int n = scan.nextInt();
			
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
				System.out.print(arr[i] + " ");
			}
			int min=arr[0];
			int index = 0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];
					index=i;
				}
			}
			
			System.out.println(min);
			System.out.println(index);


			
		}

	}


