package collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class char_and_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> num = new ArrayList<Character>();
		ArrayList<Character> alp = new ArrayList<Character>();
		String str = scan.nextLine();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				num.add(ch);
			}
			else if(Character.isLetter(ch)) {
				alp.add(ch);
			}
		}
		
		Collections.sort(num);
		Collections.reverse(alp);

		
		
		String emp="";
		int alpInd=0,numInd=0;
		
		for(int i=0;i<str.length();i++){
		    if(Character.isDigit(str.charAt(i))){
		       emp+=num.get(numInd);
		        numInd++;
		    }
		    else if(Character.isLetter(str.charAt(i))){
		        emp+=alp.get(alpInd);
		        alpInd++;
		    }
		    else{
		        emp+=str.charAt(i);
		    }
		}
		
		System.out.println(num);
		System.out.println(alp);
		System.out.println(emp);

		
		
		
	}

}
