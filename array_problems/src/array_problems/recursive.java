package array_problems;

public class recursive {

	
	
	public static void main(String[] arg) {
		int[] n = {1,2,3,4,5};
		int i =0;
		rec(n , i);
	}
	public static void rec(int[] n , int i) {
		
		if(i==n.length) {
			return ;
		}
		
//		System.out.println("*");  
		System.out.println(n[i]); 
		rec(n,i+1); //output : 120
		
//		System.out.println("#");    //output : ****####
		System.out.println(n[i]);     // output : 54322345
	}

//	public static void funct_name() {
//		System.out.println("*");
//		funct_name();
//		
//	}
	
	}
