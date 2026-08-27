package consol_based;



	import java.util.Scanner;

	public class product {

	    String proName;
	    int prdId;
	    String prdExpDate;
	    float prdrate;
	    int prdstock;

	    product[] prdArr = new product[100];
	    int index = 0;

	    // Default Constructor
	    product() {
	    }

	    // Parameterized Constructor
	    product(String name, int id, String expdate, float rate, int stock) {
	        this.proName = name;
	        this.prdId = id;
	        this.prdExpDate = expdate;
	        this.prdrate = rate;
	        this.prdstock = stock;
	    }

	    // Create Product
	    void createProduct() {

	        Scanner in = new Scanner(System.in);

	        System.out.print("Enter the product name: ");
	        String name = in.nextLine();

	        System.out.print("Enter the product exp-date: ");
	        String expdate = in.nextLine();

	        System.out.print("Enter the product rate: ");
	        float prdrate = in.nextFloat();

	        System.out.print("Enter the product Stock: ");
	        int stock = in.nextInt();

	        product prd = new product(
	            name,
	            index + 1,
	            expdate,
	            prdrate,
	            stock
	        );

	        prdArr[index] = prd;
	        index++;

	        System.out.println("Product Created Successfully");
	    }

	    // Display Product
	    void displayProduct() {

	        if (index == 0) {
	            System.out.println("No Products Available.");
	            return;
	        }

	        for (int i = 0; i < index; i++) {

	            System.out.println("-------------------------");

	            System.out.println("Product ID : " + prdArr[i].prdId);
	            System.out.println("Name       : " + prdArr[i].proName);
	            System.out.println("Exp Date   : " + prdArr[i].prdExpDate);
	            System.out.println("Price      : " + prdArr[i].prdrate);
	            System.out.println("Stock      : " + prdArr[i].prdstock);
	        }
	    }

	    // Get Product By ID
	    void GetPrdbyID() {

	        Scanner in = new Scanner(System.in);

	        System.out.print("Enter Product ID: ");
	        int id = in.nextInt();

	        boolean found = false;

	        for (int i = 0; i < index; i++) {

	            if (prdArr[i].prdId == id) {

	                System.out.println("Name    : " + prdArr[i].proName);
	                System.out.println("Exp Date: " + prdArr[i].prdExpDate);
	                System.out.println("Price   : " + prdArr[i].prdrate);
	                System.out.println("Stock   : " + prdArr[i].prdstock);

	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Product Not Found");
	        }
	    }
	
}
