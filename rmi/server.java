import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class server extends UnicastRemoteObject implements Calc {

    protected server() throws RemoteException {
        super();
    }

    // 🔹 TASK
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public static void main(String[] args) {

        try {

            LocateRegistry.createRegistry(1099);

            Naming.rebind("rmi://localhost/CalcService", new CalcImpl());

            System.out.println("Server Ready");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}