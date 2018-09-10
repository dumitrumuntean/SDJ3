import java.rmi.Remote;
import java.rmi.RemoteException;


import java.util.ArrayList;

import Model.Customer;


public interface AdminInterface extends Remote{
	
	public void addCustomer(Customer customer) throws RemoteException;
	public ArrayList<Customer> getAllCustomers() throws RemoteException;
}
