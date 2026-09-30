package String;
import java.util.Scanner;
import java.util.Arrays;
public class anagram {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String str1 = in.nextLine();
	        String str2 = in.nextLine();
	        char[] strArr1 = str1.toCharArray();
	        char[] strArr2 = str2.toCharArray();
	        Arrays.sort(strArr1);
	        Arrays.sort(strArr2);
	        String convStr1 = Arrays.toString(strArr1); 
	        String convStr2 = Arrays.toString(strArr2); 
	        if(convStr1.equals(convStr2)){
	            System.out.println("Its an Anagram");
	        }
	        else{
	            System.out.println("Not an Anagram");
	        }
			}
		
	
}
