package Controller;

import java.util.ArrayList;

import Adapter.Adapter;
import Adapter.IAdapter;
import Model.Customer;

public class Controller implements IController{
	private IAdapter adapter;
	
	public Controller() throws ClassNotFoundException
	{
		adapter = new Adapter();
	}
	
	public void addCustomer(Customer c)
	{
		adapter.addCostumer(c);
	}

	@Override
	public ArrayList<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
