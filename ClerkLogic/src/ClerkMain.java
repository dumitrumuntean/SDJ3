import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ClerkMain {
	
	public static void main(String[] args) {
		try
		{
			Registry rg = LocateRegistry.createRegistry(1097);
			IClerk clerk = new Clerk();
			rg.rebind("clerk", clerk);
			System.out.println("Starting clerk server...");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
