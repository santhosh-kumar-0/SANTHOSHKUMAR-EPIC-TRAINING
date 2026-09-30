package String;

import java.util.Scanner;

public class numberical_symbols
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		int n = str.length();
		int sum=str.charAt(0)-'0';//1;
		int j=1;
		for(int i=(n/2)+1;i<n;i++){
		    switch(str.charAt(i)){
		        case '+':{
		        	sum+=(str.charAt(j)-'0');
		            break;
		        }
		        case '-':{
		            sum-=(str.charAt(j)-'0');
		            break;
		        }
		        case '*':{
		        	sum*=(str.charAt(j)-'0');
		            break;
		        }
		        case '/':{
		        	sum/=(str.charAt(j)-'0');
		            break;
		        }
		        case '%':{
		        	sum%=(str.charAt(j)-'0');
		            break;
		        } 
		    }
		    j++;
		}
		System.out.println("Final Output : " + sum);
	}
}
