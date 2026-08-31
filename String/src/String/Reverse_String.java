package String;
//import java.util.Scanner;
//public class Reverse_String {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//			    Scanner in = new Scanner(System.in);
//				String str = in.nextLine();//Hello
//				String empStr = "";
//				for(int i=str.length()-1;i>0;i++){
//				    empStr+=str.charAt(i);
//				    empStr+=" ";
//				}
//				System.out.println(empStr);
//			}
//		
//
//
//	
//
//}

import java.util.Scanner;

public class Reverse_String
{
    static String reverseString(String str){
    	String empStr = "";
    	 for(int i=str.length()-1;i>=0;i--){
			    empStr+=str.charAt(i);
    	 }
			System.out.println(empStr);
			return empStr;
    	
    }
    
       
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Reverse_String.reverseString(str);
	}
}