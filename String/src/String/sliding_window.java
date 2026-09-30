package String;

import java.util.Scanner;

public class sliding_window {


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		        String str1 = scan.nextLine();
		        String str2 =scan.nextLine();//5
		        boolean notSub = true;
		        for(int i=0;i<=(str1.length()-str2.length());i++){
		            String emp="";
		            for(int j=i;j<=(str2.length()-1)+i;j++){
		                emp+=str1.charAt(j);
		            }
		            if(str2.equals(emp)){
		                System.out.println("Its a Subtring");
		                notSub=false;
		                break;
		            }
		            
		        }
		        if(notSub){
		            System.out.println("Not a Substring");
		        }
		        scan.close();
		}
		
	}

		
	
	


