import java.rmi.*;
 
public interface Hello extends Remote {
  
   public double soma(double a, double b) throws RemoteException;
}

