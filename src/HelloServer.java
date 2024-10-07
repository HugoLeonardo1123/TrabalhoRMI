import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class HelloServer implements Hello {
	public HelloServer() {}  // Construtor

	public static void main(String[] args) {
		try {
			HelloServer server = new HelloServer();
			Hello stub = (Hello) UnicastRemoteObject.exportObject(server, 0);
			
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Servidor", stub);
			
			System.out.println("Servidor inicializado com sucesso.");
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}

	
	public double soma(double a, double b) throws RemoteException {
		System.out.println("Calculando a soma de: " + a + " + " + b);
		return a + b; // Retorna a soma
	}
}
