abstract class Payment{
    int TransactionId;
    String CustomerName;
    double Amount;
    Payment(int TransactionId, String CustomerName, double Amount){
        super();
        this.TransactionId = TransactionId;
        this.CustomerName = CustomerName;
        this.Amount = Amount;
    }
    void displayPaymentDetails(){
        System.out.println("TransactionID : " + this.TransactionId);
        System.out.println("CustomerName : " + this.CustomerName);
        System.out.println("Amount : " + this.Amount);
    }
    abstract boolean ValidatingThePayment();
    abstract double ProcessingThePayment();
    abstract double CalculatingTheTransactionFee();
    abstract double CalculatingCashback();
    abstract double CalculatingTheFinalAmount();
}
class CreditCardPayment extends Payment{
    CreditCardPayment(int TransactionId, String CustomerName, double Amount){
        super(TransactionId, CustomerName, Amount);
    }
    @Override
    boolean ValidatingThePayment() {
        return true;
    }
    double ProcessingThePayment() {
        return ValidatingThePayment() ? 1.0 : 0.0;
    }
    double CalculatingTheTransactionFee() {
        return this.Amount * 2;
    }
    double CalculatingCashback() {
        return this.Amount * 5;
    }
    double CalculatingTheFinalAmount() {
        return this.Amount + CalculatingTheTransactionFee() - CalculatingCashback();
    }
}
class UPIPayment extends Payment{
    UPIPayment(int TransactionID, String CustomerName, double Amount){
        super(TransactionID, CustomerName, Amount);
    }
    @Override
    boolean ValidatingThePayment(){
        return true;
    }
    double ProcessingThePayment() {
        return ValidatingThePayment() ? 1.0 : 0.0;
    }
    double CalculatingTheTransactionFee() {
        return this.Amount * 2;
    }
    double CalculatingCashback() {
        return this.Amount * 5;
    }
    double CalculatingTheFinalAmount() {
        return this.Amount + CalculatingTheTransactionFee() - CalculatingCashback();
    }
}
class NetBankingPayment extends Payment{
    NetBankingPayment(int TransactionID, String CustomerName, double Amount){
    super(TransactionID, CustomerName, Amount);
    }
    @Override
    boolean ValidatingThePayment(){
        return true;
    }
    double ProcessingThePayment() {
        return ValidatingThePayment() ? 1.0 : 0.0;
    }
    double CalculatingTheTransactionFee() {
        return this.Amount * 2;
    }
    double CalculatingCashback() {
        return this.Amount * 5;
    }
    double CalculatingTheFinalAmount() {
        return this.Amount + CalculatingTheTransactionFee() - CalculatingCashback();
    }
}
public class payment{
    public static void main(String[] args){
        CreditCardPayment  C =
        new CreditCardPayment(101, "Luffy", 100);
        UPIPayment U =
        new UPIPayment(101, "Luffy", 100);
        NetBankingPayment N =
        new NetBankingPayment(101, "Luffy", 100);
        C.displayPaymentDetails();
        System.out.println("Final Amount : " + C.CalculatingTheFinalAmount());
        U.displayPaymentDetails();
        System.out.println("Final Amount : " + U.CalculatingTheFinalAmount());
        N.displayPaymentDetails();
        System.out.println("Final Amount : " + N.CalculatingTheFinalAmount());
    }
}















// Interview Question — Payment Processing System

// You are working as a Java developer for an e-commerce company. The company wants to develop a payment processing system that supports different types of payments.

// Currently, the system supports:

// Credit Card
// UPI
// Net Banking

// Each payment method has common information such as transaction ID, customer name, and payment amount. However, the way the payment is validated, processed, charged, and rewarded is different for each payment method.

// Your Task

// Design and implement the system using abstraction in Java.

// Create an abstract class called Payment with the following common details:

// Transaction ID
// Customer Name
// Amount

// The class should contain a constructor and a method to display the payment details.

// It should also define abstract methods for:

// Validating the payment
// Processing the payment
// Calculating the transaction fee
// Calculating cashback
// Calculating the final amount

// Create the following subclasses:

// CreditCardPayment

// A credit card payment should validate a 16-digit card number.

// Transaction fee: 2% of the amount
// Cashback: 5% of the amount
// UPIPayment

// A UPI payment should validate the UPI ID.

// Transaction fee: 0.5% of the amount
// Cashback: 2% of the amount
// NetBankingPayment

// A net banking payment should validate the account number.

// Transaction fee: 1% of the amount
// Cashback: 1% of the amount

// The final amount should be calculated as:

// Amount + Transaction Fee − Cashback

// In the main() method, create objects using parent-class references and demonstrate that the appropriate implementation is executed for each payment type.

// Restrictions
// Do not create objects directly for the abstract class.
// Do not implement the payment-specific logic inside the Payment class.
// Use method overriding.
// Do not use instanceof.
// Do not use a large if-else or switch to identify the payment type.
// Your design should allow another payment type to be added later without modifying the existing payment classes.