package Exception_Handling;

import java.util.Scanner;
public class validation_2
{
    
    int checkAge(int age) throws ArithmeticException{
        
    	  return age;      
    }
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    validation_2 m = new validation_2();
	    for(;;){
	        int age = in.nextInt();
	        
    	    try{
    	        m.checkAge(age);
    	        System.out.println(m.checkAge(age)+" Is Valid");
    	        break;
    	    }
    	    catch(Exception e){
    	        System.out.println("Enter the Valid Age");
    	    }
	    }
		
	}
}
