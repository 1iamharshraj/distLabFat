import java.net.*;
import java.io.*;
import java.util.*;


public class client{
    public static void main(String[] arg)throws Exception{
        Socket s = new Socket("localhost", 1234);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter   out = new PrintWriter(s.getOutputStream(),true);

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        String msg;
        while((msg = kb.readLine())!=null){
            out.println(msg);
            System.out.println("Server: " + in.readLine());
        }

        s.close();

    }
}