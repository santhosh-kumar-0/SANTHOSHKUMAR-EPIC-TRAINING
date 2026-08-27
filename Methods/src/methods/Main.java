package methods;

class Customer {

    String cusName;

    Customer(String name) {
        this.cusName = name;
    }
}

public class Main {

    public static void main(String[] args) {

        Customer cus = new Customer("Dharaneesh");

        System.out.println(cus.cusName);
    }
}