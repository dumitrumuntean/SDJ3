import java.rmi.Naming;

import Controller.Controller;
import Controller.IController;

public class AdminMain {

	public static void main(String[] args) {

		try {
			AdminInterface sir = (AdminInterface) Naming
					.lookup("rmi://localhost:1099/admin");
			IController controller = new Controller();
			controller.openApp();
			System.out.println("Admin started .. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
