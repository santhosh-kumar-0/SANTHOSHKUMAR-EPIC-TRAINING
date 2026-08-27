package controller;
import java.util.Scanner;

import model.CustomerModel;
public class CustomerController {
	CustomerModel[] cusArr = new CustomerModel[100]; 
	int id = 0;
	
	void createCustomer() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the cusName: ");
		String name = in.nextLine();
		System.out.println("Enter the cusEmail:");
		String email = in.nextLine();
		CustomerModel cm = new CustomerModel(name, email, id);
		cusArr[id++] = cm;
		
	}
}
