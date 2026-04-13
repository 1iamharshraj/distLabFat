import java.io.*;
import java.net.*;
import java.util.*;


public class client{
    public static void main(String args[])throws Exception{
        Socket s = new Socket("localhost",1234);    

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        out.writeInt(3);
        out.writeInt(5);
        
        int res = in.readInt();

        System.out.println(res);
        
        s.close();
    }
}