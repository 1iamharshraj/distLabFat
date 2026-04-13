import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class server extends UnicastRemoteObject implements calc {

    protected server() throws RemoteException {
        super();
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public static void main(String[] args) {

        try {

            LocateRegistry.createRegistry(1099);

            Naming.rebind("rmi://localhost/CalcService", new server());

            System.out.println("Server Ready");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}