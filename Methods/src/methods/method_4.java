package methods;

import java.util.Scanner;
//Interview Question — Payment Processing System

//You are working as a Java developer for an e-commerce company. The company wants to develop a payment processing system that supports different types of payments.

//Currently, the system supports:

//Credit Card
//UPI
//Net Banking

//Each payment method has common information such as transaction ID, customer name, and payment amount. However, the way the payment is validated, processed, charged, and rewarded is different for each payment method.

//Your Task

//Design and implement the system using abstraction in Java.

//Create an abstract class called Payment with the following common details:
abstract class Payment{
	int transactionId;
	String name;
	double amount;
	
	Payment(int transactionId,String name,double amount2){
		this.transactionId = transactionId;
		this.name = name;
		this.amount = amount2;
	}
	
	void displaypayment() {
		System.out.println("Transaction Id : "+transactionId);
		System.out.println("Name : "+name);
		System.out.println("Amount : "+amount);
	}
	
	  abstract boolean ValidatingThePayment();
	    abstract void ProcessingThePayment();
	    abstract double CalculatingTheTransactionFee();
	    abstract double CalculatingCashback();
	    abstract double CalculatingTheFinalAmount();
}


	

//Transaction ID
//Customer Name
//Amount

//The class should contain a constructor and a method to display the payment details.

//It should also define abstract methods for:

//Validating the payment
//Processing the payment
//Calculating the transaction fee
//Calculating cashback
//Calculating the final amount

//Create the following subclasses:

class CreditCardPayment extends Payment{
	String cardNo;
	double transfee;
	double cashback;
	double finalamt;
	
    CreditCardPayment(int TransactionId, String CustomerName, double Amount , String card){
        super(TransactionId, CustomerName, Amount);
        this.cardNo = card ;
    }
    @Override
    boolean ValidatingThePayment() {
        if(cardNo.length()==16) {
        	return true;
        }
        else {
        	System.out.println("Invalid Card No ");
        	return false;
        }
    }
    
    void ProcessingThePayment() {
        if(ValidatingThePayment()==true) {
        	CalculatingTheTransactionFee();
        	CalculatingCashback();
        	CalculatingTheFinalAmount();
        }
		
    }
    double CalculatingTheTransactionFee() {
    	transfee = amount * 2/100;
    	System.out.println("Transaction fee: "+ transfee);
        return transfee;
    }
    double CalculatingCashback() {
    	cashback = amount * 5/100;
    	System.out.println("cashback       : "+ cashback);
        return cashback;
    }
    double CalculatingTheFinalAmount() {
    	finalamt = amount +transfee - cashback;
    	System.out.println("Total amount   : "+ finalamt);
    	return finalamt;
    }
}
//CreditCardPayment
//A credit card payment should validate a 16-digit card number.
//Transaction fee: 2% of the amount
//Cashback: 5% of the amount

class NetBankingPayment extends Payment{
	String phno ;
	double transfee;
	double cashback;
	double finalamt;
    NetBankingPayment(int TransactionID, String CustomerName, double Amount ,String phno){
    super(TransactionID, CustomerName, Amount);
    this.phno = phno;
    }
    boolean ValidatingThePayment() {
        if(phno.length()==10) {
        	return true;
        }
        else {
        	System.out.println("Invalid Phone No ");
        	return false;
        }
    }
    
    void ProcessingThePayment() {
        if(ValidatingThePayment()==true) {
        	CalculatingTheTransactionFee();
        	CalculatingCashback();
        	CalculatingTheFinalAmount();
        }
		
    }
    double CalculatingTheTransactionFee() {
    	transfee = amount * 1/100;
    	System.out.println("Transaction fee: "+ transfee);
        return transfee;
    }
    double CalculatingCashback() {
    	cashback = amount * 1/100;
    	System.out.println("cashback       : "+ cashback);
        return cashback;
    }
    double CalculatingTheFinalAmount() {
    	finalamt = amount +transfee - cashback;
    	System.out.println("Total amount   : "+ finalamt);
    	return finalamt;
    }
}

class UPIPayment extends Payment{
	double transfee;
	double cashback;
	double finalamt;
	String upiId;
    UPIPayment(int TransactionID, String CustomerName, double Amount, String upiId){
        super(TransactionID, CustomerName, Amount);
        this.upiId = upiId;
    }
    @Override
    void ProcessingThePayment() {
        if(ValidatingThePayment()==true) {
        	CalculatingTheTransactionFee();
        	CalculatingCashback();
        	CalculatingTheFinalAmount();
        }
		
    }
    double CalculatingTheTransactionFee() {
    	transfee = amount * 0.5/100;
    	System.out.println("Transaction fee : "+ transfee);
        return transfee;
    }
    double CalculatingCashback() {
    	cashback = amount * 2/100;
    	System.out.println("cashback        : "+ cashback);
        return cashback;
    }
    double CalculatingTheFinalAmount() {
    	finalamt = amount +transfee - cashback;
    	System.out.println("Total amount    : "+ finalamt);
    	return finalamt;
    }
	@Override
	boolean ValidatingThePayment() {
		if(upiId.length()<=20) {
			return true;
		}
		else {
			System.out.println("Enter the correct upi Id");
			return false;
		}
		
		
	}
}
//UPIPayment
//A UPI payment should validate the UPI ID.
//Transaction fee: 0.5% of the amount
//Cashback: 2% of the amount

//NetBankingPayment
//A net banking payment should validate the account number.
//Transaction fee: 1% of the amount
//Cashback: 1% of the amount
//The final amount should be calculated as:
//Amount + Transaction Fee − Cashback
//In the main() method, create objects using parent-class references and demonstrate that the appropriate implementation is executed for each payment type.
//Restrictions
//Do not create objects directly for the abstract class.
//Do not implement the payment-specific logic inside the Payment class.
//Use method overriding.
//Do not use instanceof.
//Do not use a large if-else or switch to identify the payment type.
//Your design should allow another payment type to be added later without modifying the existing payment classes.
public class method_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CHOOSE THE MODE OF PAYMENTS METHODS :");
		System.out.println("------------------------------------");
		
		System.out.println("1)Credit Card Payment");
		System.out.println("2)Net Banking Payment");
		System.out.println("3)UPI Payment");
		
		
		
		int choice = scan.nextInt();
		
		switch (choice) {
		

		case 1:
		    System.out.println("=========== Credit Card Payment ===========");  
		    
		    
		    System.out.print("Enter Payment ID   : ");
		    int transactionId = scan.nextInt();
		    scan.nextLine(); 

		    System.out.print("Enter Customer Name: ");
		    String name = scan.nextLine();

		    System.out.print("Enter Amount       : ");
		    double amount = scan.nextDouble();
		    scan.nextLine(); 

		    System.out.print("Enter Card Number  : ");
		    String cardNumber = scan.nextLine();
		    
		    CreditCardPayment C = new CreditCardPayment(transactionId, name, amount, cardNumber);
		    C.ProcessingThePayment();
		    System.out.println();

		    break;

		case 2:
		    System.out.println("=========== Net Banking Payment ===========");
		    
		    System.out.print("Enter Transaction ID  : ");
		    int transactionId1 = scan.nextInt();
		    scan.nextLine(); 

		    System.out.print("Enter Customer Name   : ");
		    String name1 = scan.nextLine();

		    System.out.print("Enter Amount          : ");
		    double amount1 = scan.nextDouble();
		    scan.nextLine(); 

		    System.out.print("Enter Phone Number     : ");
		    String phoneno = scan.nextLine();

		    NetBankingPayment N =
		        new NetBankingPayment(transactionId1, name1, amount1, phoneno);

		    N.ProcessingThePayment();
		    System.out.println();

		    break;

		case 3:
		    System.out.println("=========== UPI Payment ===========");

		    System.out.print("Enter Transaction ID   : ");
		    int transactionId2 = scan.nextInt();
		    scan.nextLine(); 

		    System.out.print("Enter Customer Name    : ");
		    String name2 = scan.nextLine();

		    System.out.print("Enter Amount           : ");
		    double amount2 = scan.nextDouble();
		    scan.nextLine(); 

		    System.out.print("Enter Phone Number     : ");
		    String upiId = scan.nextLine();
		    
		    UPIPayment upi =
		        new UPIPayment(transactionId2,name2,amount2,upiId);

		    upi.ProcessingThePayment();
		    System.out.println();

		    break;

		default:
		    System.out.println("Invalid choice");
		}

			
		
		

	 			
	}
	

}
