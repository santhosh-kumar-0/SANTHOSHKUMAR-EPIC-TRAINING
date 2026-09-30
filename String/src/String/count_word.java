package String;

import java.util.Scanner;

public class count_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		String str = in.nextLine();//abcd
		int[] count = new int[26];
	
		for(int i=0;i<str.length();i++){
			
		    int val = str.charAt(i) - 97;
		    count[val]++;
		    
		}
		System.out.println();
		
 		for(int i=0;i<26;i++){
 		    if(count[i]>0)
 		    System.out.println((char)(i+97)+"->"+count[i]);
 		}

	}

}
