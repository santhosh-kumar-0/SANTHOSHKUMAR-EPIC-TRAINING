package number_problems;
import java.util.Scanner;

public class gcd_lcm_program {
	


	public class lcm_and_gcd {
	     public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        int x = a;
	        int y =b ;
	        while(y!=0){
	           int temp =y;
	           
	            y=x%y;
	            x=temp;
	        }

	        int gcd = x;
	            int lcm = (a*b) / gcd ;

	           System.out.println("The GCD number is "+gcd);
	            System.out.println("The LCM number is "+lcm);
	            
	        }
	       
	    }


}
