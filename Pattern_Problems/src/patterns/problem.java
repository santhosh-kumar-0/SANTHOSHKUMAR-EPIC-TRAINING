package patterns;

public class problem {
	public static void main(String[] args) {
	      int n = 7;
	      
	      for(int i = 0; i<=n/2;i++){
	    	  int val = 0;
	        for(int j=0;j<=n-1;j++){
	          if(i<=n/2) {
	        	  if(j<=i) {
	        		  System.out.print(++val + " ");
	        	  }else if(i+j>=n) {
		        		  System.out.print(--val+ " ");
	        		  		}  else {
	      	        		  System.out.print(val+ " ");
	      	        	  }       	  
	        }
	      }
	        System.out.println(); 
	    }
	      
	      for(int i = (n/2)-1 ; i<=0 ; i--) {
	    	  
		        for(int j=0;j<=n-1;j++){
		        	int val=0;
		          if(i<=(n/2)) {
		        	  if(j<=i) {
		        		  System.out.print(++val + " ");
		        	  }else if(i+j<=n) {
			        		  System.out.print(--val+ " ");
		        		  		}  else {
		      	        		  System.out.print(val+ " ");
		      	        	  }       	  
		        }
		      }
		        System.out.println(); 
	      }
}
}