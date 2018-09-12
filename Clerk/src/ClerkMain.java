import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class ClerkMain {
	
	public static void main(String[] args) {
		try {
			IClerk sir = (IClerk) Naming
					.lookup("rmi://localhost:1097/clerk");
			//code here
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
