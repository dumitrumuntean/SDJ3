import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AdminMain {
	public static void main(String[] args) {
		
		try
		{
			Registry rg = LocateRegistry.createRegistry(1099);
			IDatabase dbs = (IDatabase) Naming
					.lookup("rmi://localhost:1098/dbs");
			AdminInterface admin = new Admin();
			rg.rebind("admin", admin);
			System.out.println("Starting server...");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
