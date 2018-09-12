import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Clerk implements IClerk{
	
	public Clerk() throws RemoteException
	{
		UnicastRemoteObject.exportObject(this, 0);
	}
	
}
