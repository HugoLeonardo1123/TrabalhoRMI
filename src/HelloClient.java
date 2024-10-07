import java.rmi.registry.*;
import java.util.Scanner;

public class HelloClient {
	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry("localhost");
			Hello stub = (Hello) registry.lookup("Servidor");
			
			Scanner scanner = new Scanner(System.in); // Para ler a entrada do usuário
			System.out.print("Digite o primeiro número: ");
			double a = scanner.nextDouble();
			System.out.print("Digite o segundo número: ");
			double b = scanner.nextDouble();
			
			// Chama o método do servidor e imprime a soma
			double resultado = stub.soma(a, b);
			System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
			
			scanner.close(); // Fecha o scanner
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
}
