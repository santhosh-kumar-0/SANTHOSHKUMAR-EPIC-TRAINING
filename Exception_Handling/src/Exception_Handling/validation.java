package Exception_Handling;
import java.util.Scanner;
public class validation {

	
	
	    
	    void checkAge(int age) throws ArithmeticException,ArrayIndexOutOfBoundsException{
	        if(age<18){
	    	          throw new ArithmeticException();
	    	  }
	    	        
	    }
		public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    validation m = new validation();
		    for(;;){
		        int age = in.nextInt();
		        
	    	    try{
	    	        m.checkAge(age);
	    	    }
	    	    catch(Exception e){
	    	        System.out.println("Enter the Valid Age");
	    	    }
		    }
			
		}
	

}
