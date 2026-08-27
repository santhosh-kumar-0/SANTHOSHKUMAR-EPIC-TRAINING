package array_problems;
import java.util.Scanner;
public class try1 {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//	       int n = scan.nextInt();
//	       
//	      for (int i = 1; i<=n ; i++){
//	        int iter = i;
//	        
////	        	System.out.print(num);
//	        	
//	            for(int j=1;j<=i;j++){
//	                System.out.print(iter + " ");
//	                
//	            iter = iter + (n-j);
//	            
//	            }  
//	            System.out.println();
//	    
//	    }
		
Scanner scan = new Scanner(System.in);
        
       
        int k =0;
        
        int n = scan.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        
        for(int i =0 ; i<arr.length ;i++){  
        if(arr[i]!=0){
            arr[k++]=arr[i]; 
        }
        }
        for(int i = k ; i<arr.length ;i++) {
        	arr[i]=0; 
        }
        for(int i : arr) {
        	System.out.print(i + " ");
        }
       
}
}
