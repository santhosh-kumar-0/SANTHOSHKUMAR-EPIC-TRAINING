package String;

import java.util.Scanner;

public class word_count {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();//abcd
		int[] count = new int[26];
		int val = 0;
	
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				 val = str.charAt(i) -'a';
			}else {
				val = str.charAt(i) -'A';
			    
			}
			count[val]++;
		   
		}
		System.out.println();
		
		for(int i=0;i<str.length();i++){
			int val;
			if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				 val = str.charAt(i) -'a';
			}else{
				val = str.charAt(i) -'A';
			}
			
		    if(count[val]>0){
		        System.out.println(str.charAt(i)+" - "+count[val]);
		        count[val] = 0;
		    }
		}
//		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)>='Z') {
				if(count[val]>1) {
					System.out.println(str.charAt(i));
					count[str.charAt(i)-'A']=0;
				}
			}
			else {
				if(count[val]>1) {
					System.out.println(str.charAt(i));
					count[str.charAt(i)-'a']=0;
			}
		}
	}
}
}