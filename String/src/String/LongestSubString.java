package String;

import java.util.Scanner;

public class LongestSubString
{
	
	
	String str = "10101101011";
    static int longestSubString(String str){
        int max=0;
        
       for(int i=0;i<str.length();i++){
           int sum=0;
           int count = 0;
         
           for(int j=i;j<str.length();j++){
               if(str.charAt(j)=='1'){
                   sum++;
               }
               else{
                   sum--;
               }
               
               if(sum==0){
                   int count1 =((j-i)+1); 
                   if(count1>max){
                       max=count1;
                   }
               }
           }
       }
       return max;
       
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(LongestSubString.longestSubString(str));
	}
}
