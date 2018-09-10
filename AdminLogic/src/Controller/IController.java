package Controller;

import java.util.ArrayList;

import Model.Customer;

public interface IController {

	public void addCustomer(Customer c);
	public ArrayList<Customer> getAllCustomers();
	
}
