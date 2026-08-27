package methods;

import java.util.Scanner;

class Customer {
    String cusName;
    String cusPhNo;
    int cusAge;
    int cusId;

    Customer[] cusArr = new Customer[100];
    int index = 0;

    Customer() {
    }

    Customer(String name, String phno, int age, int id) {
        this.cusName = name;
        this.cusPhNo = phno;
        this.cusAge = age;
        this.cusId = id;
    }

    void createCustomer() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the customer name: ");
        String name = in.nextLine();

        System.out.print("Enter the customer number: ");
        String phno ;
        for(;;) {
            phno = in.nextLine();
            
            try {
            	if(phno.length()!=10) {
            		throw new StringIndexOutOfBoundsException();
            	}
            	else {
            		System.out.println("Number is valid");
            		break;
            	}
            }
            catch(Exception e) {
            	System.out.println("Enter the valid Phone Number :");
            }
        }

        System.out.print("Enter the customer age: ");
        int age;
        for(;;) {
            age = in.nextInt();
            
            try {
            	if(age<0) {
            		throw new ArithmeticException();
            	}
            	else {
            		System.out.println("Age is valid");
            		break;
            	}
            }
            catch(Exception e) {
            	System.out.print("Enter the valid age :");
            }
        }

        Customer cus = new Customer(name, phno, age, index + 1);
        cusArr[index++] = cus;

        System.out.println("Customer Created Successfully");
    }

    void displayCustomer() {
        if (index == 0) {
            System.out.println("No Customers Available.");
            return;
        }
        for (int i = 0; i < index; i++) {
           
            System.out.println("Customer ID: " + cusArr[i].cusId);
            System.out.println("Name       : " + cusArr[i].cusName);
            System.out.println("Phone No   : " + cusArr[i].cusPhNo);
            System.out.println("Age        : " + cusArr[i].cusAge);
        }
      
    }

    void getCusById() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Customer Id: ");
        int id = scan.nextInt();


                System.out.println("Name   : " + cusArr[id].cusName);
                System.out.println("Ph No  : " + cusArr[id].cusPhNo);
                System.out.println("Age    : " + cusArr[id].cusAge);

       
    }
}

class Product {
    String proName;
    int prdId;
    String prdExpDate;
    float prdrate;
    int prdstock;

    Product[] prdArr = new Product[100];
    int index = 0;

    Product() {
    }

    Product(String name, int id, String expdate, float rate, int stock) {
        this.proName = name;
        this.prdId = id;
        this.prdExpDate = expdate;
        this.prdrate = rate;
        this.prdstock = stock;
    }

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

        Product prd = new Product(name, index + 1, expdate, prdrate, stock);
        prdArr[index] = prd;
        index++;

        System.out.println("Product Created Successfully ");
    }

    void displayProduct() {
        if (index == 0) {
            System.out.println("No Products Available.");
            return;
        }
        for (int i = 0; i < index; i++) {
        
            System.out.println("Product ID : " + prdArr[i].prdId);
            System.out.println("Name       : " + prdArr[i].proName);
            System.out.println("Exp Date   : " + prdArr[i].prdExpDate);
            System.out.println("Price      : " + prdArr[i].prdrate);
            System.out.println("Stock      : " + prdArr[i].prdstock);

        }
       
    }

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
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not Found");
        }
    }
}

class BillProduct {
    int proId;
    int proQua;
    
    BillProduct[] billproArr = new BillProduct[100];
    
    BillProduct() {
    }

    BillProduct(int id, int qua) {
        this.proId = id;
        this.proQua = qua;
        
    }
}

class Bill {
    int billId;
    int cusId;
    int proId;
    int noOfProduct;
    
    Product pro = new Product();
    Customer cust = new Customer();
    
    BillProduct bpObj;
    Bill[] billArr = new Bill[100];
    int index = 0;

    Bill() {
    }

    Bill(int billId, int cusId, BillProduct bpObj, int noOfProduct ) {
        this.billId = billId;
        this.cusId = cusId;
        this.bpObj = bpObj;
        this.noOfProduct = noOfProduct;
    }

    void createBill() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the customer id: ");
        int id = in.nextInt();

        System.out.print("Enter the no of products: ");
        int n = in.nextInt();

        BillProduct bp = new BillProduct();
        for (int i = 0; i < n; i++) {
        	
            System.out.print("Enter the Product Id: ");
            int proId = in.nextInt();
            
            System.out.print("Enter the Product Quantity: ");
            int proQua = in.nextInt();

            BillProduct bplist = new BillProduct(proId, proQua);
            bp.billproArr[i] = bplist;
        }

        Bill bill = new Bill(index , id, bp, n);
        billArr[index] = bill;
        index++;

        System.out.println("Bill Created Successfully");
    }

    void displayBill(Product pro, Customer cust) {
        
        for (int i = 0; i < index; i++) {
           
            System.out.println("Bill ID       : " + billArr[i].billId);
            System.out.println("Customer ID   : " + billArr[i].cusId);
            System.out.println("Customer Name : " + cust.cusArr[billArr[i].cusId].cusName);
            System.out.println("Customer  : " + cust.cusArr[billArr[i].cusId].cusName);

            
            for (int j = 0; j < billArr[i].noOfProduct; j++) {
                System.out.println("Product ID          : " + billArr[i].bpObj.billproArr[j].proId );
                System.out.println("Product Name        :" + pro.prdArr[proId].proName); 
                System.out.println("Product Rate        :" + pro.prdArr[proId].prdrate); 
                System.out.println("Product Expire Date :" + pro.prdArr[proId].prdExpDate); 
                System.out.println("Quantity            : " + billArr[i].bpObj.billproArr[j].proQua);      
                
                
                
                
            }
        }
       
    }
}

public class methods_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Customer cus = new Customer();
        Product prd = new Product();
        Bill bill = new Bill();

        while (true) {
           
            System.out.println("1) Create Customer");
            System.out.println("2) Display Customer");
            System.out.println("3) Create Product");
            System.out.println("4) Display Product");
            System.out.println("5) Get Cus By Id");
            System.out.println("6) Get Product By Id");
            System.out.println("7) Create Bill");
            System.out.println("8) Display Bill");
           
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
                    bill.displayBill(prd,cus);
                    break;
               
                default:
                    System.out.println("Invalid ");
            }
        }
    }
}