import java.io.*;
import java.util.*;
import java.net.*;


public class server{
    public static void main(String[] args){
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        int a = in.readInt();
        int b = in.readInt();

        int result = a + b;

        out.writeInt(result);

        s.close();
        ss.close();
    }
}