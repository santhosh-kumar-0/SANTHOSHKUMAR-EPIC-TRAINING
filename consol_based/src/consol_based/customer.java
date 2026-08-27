package consol_based;



import java.util.Scanner;

public class customer {

    String cusName;
    String cusPhNo;
    int cusAge;
    int cusId;

    customer[] cusArr = new customer[100];
    int index = 0;

    // Default Constructor
    customer() {
    }

    // Parameterized Constructor
    customer(String name, String phno, int age, int id) {
        this.cusName = name;
        this.cusPhNo = phno;
        this.cusAge = age;
        this.cusId = id;
    }

    // Create Customer
    void createCustomer() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the customer name: ");
        String name = in.nextLine();

        System.out.print("Enter the customer number: ");
        String phno = in.nextLine();

        System.out.print("Enter the customer age: ");
        int age = in.nextInt();

        customer cus = new customer(
            name,
            phno,
            age,
            index + 1
        );

        cusArr[index] = cus;
        index++;

        System.out.println("Customer Created Successfully");
    }

    // Display Customer
    void displayCustomer() {

        if (index == 0) {
            System.out.println("No Customers Available.");
            return;
        }

        for (int i = 0; i < index; i++) {

            System.out.println("-------------------------");

            System.out.println("Customer ID: " + cusArr[i].cusId);
            System.out.println("Name       : " + cusArr[i].cusName);
            System.out.println("Phone No   : " + cusArr[i].cusPhNo);
            System.out.println("Age        : " + cusArr[i].cusAge);
        }
    }

    // Get Customer By ID
    void getCusById() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Customer Id: ");
        int id = scan.nextInt();

        boolean found = false;

        for (int i = 0; i < index; i++) {

            if (cusArr[i].cusId == id) {

                System.out.println("Name   : " + cusArr[i].cusName);
                System.out.println("Ph No  : " + cusArr[i].cusPhNo);
                System.out.println("Age    : " + cusArr[i].cusAge);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer Not Found");
        }
    }
}
