package hashmap;
import java.util.Scanner;
import java.util.HashMap;

public class occurance_of_the_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		String str =scan.nextLine();
	
		int count =1;
		
		for(int i=0;i<str.length();i++){
			
			if(map.containsKey(str.charAt(i))) {
				int val = map.get(str.charAt(i));
				val=val+1;
				map.put(str.charAt(i), val);
			}
			else {
				 map.put(str.charAt(i), count); 
			}

		}
		
		
		System.out.print(map);


	}

}
