package array_concepts;
import java.util.Scanner;
public class swap_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int temp=0;
		
		temp=n;
		n=m;
		m=temp;
		
		System.out.println(n);
		System.out.println(m);

	}

}
