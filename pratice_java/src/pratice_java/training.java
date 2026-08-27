package pratice_java;
import java.util.Arrays;
import java.util.Scanner;
public class training {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int rev = 0;
//		while(n>0) {
//			int digit = n%10;
//			rev = rev*10 +digit;      //reverse the number
//			n=n/10;	
//		}
//		System.out.println(rev);
		
		
		
		
//		int n = scan.nextInt();
//		int rev = 0 ; 
//		int temp = n;
//		while(n>0) {
//			int digit = n%10;
//			rev=rev*10+digit;
//			n=n/10;												//palindrome
//		}
//		if(temp==rev) {
//			System.out.println(temp +" This is panindrome");
//		}
//		else {
//			System.out.println(temp +" This is not a palindrome");
//		}
		
		
		
//		int n = scan.nextInt();
//		
//		if(n%2==0) {
//			System.out.println(n + " This is even number");			//even and odd
//		}
//		else {
//			System.out.println(n + " This is odd number");
//		}
		
		
		
		
		
//		int year = scan.nextInt();
//		
//		if(year%400==0) {
//			System.out.println(year + " this is centurion year");
//		}
//		else if(year%4==0){										//Leap year 
//			System.out.println(year + " this is leap year");
//		}
//		else {
//			System.out.println(year + " this is normal year");
//		}
		
		
//		int n = scan.nextInt();
//		
//		int sum = 0;
//		int temp = n;
//		int count =0;
//		while(n>0) {
//			count=count+1;
//			int digit = n%10;
//			
//			sum = sum + digit*count;
//			n=n/10;
//		}															//armstrong number
//		if(sum==temp) {
//			System.out.println("this is armstrong number");
//		}
//		else {
//			System.out.println("this is not a armstrong number");
//		}

		
		int arr[] = {3,2,4,5,1,6};
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
