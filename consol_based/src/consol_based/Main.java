package consol_based;
import java.util.Scanner;
public class Main {

	

	

	    public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);

	        // Creating Objects
	        customer cus = new customer();
	        product prd = new product();
	        bill bill = new bill();

	        while (true) {

	            System.out.println("\n===== MENU =====");
	            System.out.println("1) Create Customer");
	            System.out.println("2) Display Customer");
	            System.out.println("3) Create Product");
	            System.out.println("4) Display Product");
	            System.out.println("5) Get Cus By Id");
	            System.out.println("6) Get Product By Id");
	            System.out.println("7) Create Bill");
	            System.out.println("8) Display Bill");
	            System.out.println("9) Exit");

	            System.out.print("Enter your choice: ");

	            int n = in.nextInt();

	            switch (n) {

	                case 1:
	                    cus.createCustomer();
	                    break;

	                case 2:
	                    cus.displayCustomer();
	                    break;

	                case 3:
	                    prd.createProduct();
	                    break;

	                case 4:
	                    prd.displayProduct();
	                    break;

	                case 5:
	                    cus.getCusById();
	                    break;

	                case 6:
	                    prd.GetPrdbyID();
	                    break;

	                case 7:
	                    bill.createBill();
	                    break;

	                case 8:
	                    bill.displayBill(prd, cus);
	                    break;

	                case 9:
	                    System.out.println("Program Exited.");
	                    return;

	                default:
	                    System.out.println("Invalid Choice");
	            }
	        }
	    }
	

}
