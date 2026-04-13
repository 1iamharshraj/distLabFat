import java.rmi.*;

public interface calc extends Remote{
    int add(int a, int b) throws RemoteException
}