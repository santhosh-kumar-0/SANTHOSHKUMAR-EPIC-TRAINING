package consol_based;


import java.util.Scanner;

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

public class bill {

    int billId;
    int cusId;
    int noOfProduct;

    BillProduct bpObj;

    bill[] billArr = new bill[100];
    int index = 0;

    bill() {
    }

    bill(int billId, int cusId, BillProduct bpObj, int noOfProduct) {
        this.billId = billId;
        this.cusId = cusId;
        this.bpObj = bpObj;
        this.noOfProduct = noOfProduct;
    }

    // Create Bill
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

        bill bill = new bill(
            index,
            id,
            bp,
            n
        );

        billArr[index] = bill;
        index++;

        System.out.println("Bill Created Successfully");
    }

    // Display Bill
    void displayBill(product pro, customer cust) {

        if (index == 0) {
            System.out.println("No Bills Available.");
            return;
        }

        for (int i = 0; i < index; i++) {

            System.out.println("-------------------------------");
            System.out.println("Bill ID       : " + billArr[i].billId);
            System.out.println("Customer ID   : " + billArr[i].cusId);

            // Find Customer
            boolean customerFound = false;

            for (int c = 0; c < cust.index; c++) {

                if (cust.cusArr[c].cusId == billArr[i].cusId) {

                    System.out.println(
                        "Customer Name : " + cust.cusArr[c].cusName
                    );

                    System.out.println(
                        "Phone No      : " + cust.cusArr[c].cusPhNo
                    );

                    customerFound = true;
                    break;
                }
            }

            if (!customerFound) {
                System.out.println("Customer Not Found");
            }

            System.out.println("-------------------------------");

            // Display Products
            for (int j = 0; j < billArr[i].noOfProduct; j++) {

                int productId =
                    billArr[i].bpObj.billproArr[j].proId;

                int quantity =
                    billArr[i].bpObj.billproArr[j].proQua;

                boolean productFound = false;

                for (int p = 0; p < pro.index; p++) {

                    if (pro.prdArr[p].prdId == productId) {

                        System.out.println(
                            "Product ID          : " + pro.prdArr[p].prdId
                        );

                        System.out.println(
                            "Product Name        : " + pro.prdArr[p].proName
                        );

                        System.out.println(
                            "Product Rate        : " + pro.prdArr[p].prdrate
                        );

                        System.out.println(
                            "Product Expire Date : " + pro.prdArr[p].prdExpDate
                        );

                        System.out.println(
                            "Quantity            : " + quantity
                        );

                        productFound = true;
                        break;
                    }
                }

                if (!productFound) {
                    System.out.println(
                        "Product ID " + productId + " Not Found"
                    );
                }

                System.out.println("-------------------------------");
            }
        }
    }
}
