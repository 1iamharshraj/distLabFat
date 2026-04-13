import java.io.*;
import java.util.*;
import java.net.*;


public class server{
    public static void main(String[] args){
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        String msg;
        while((msg=in.readLine())!= null){
            System.out.println("Client: " + msg);
            out.println(msg);
        }

        ss.close();
        s.close();
    }
}