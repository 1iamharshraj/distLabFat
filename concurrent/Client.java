import java.util.*;
import java.io.*;
import java.net.*;


public class Client{
    public static void main(String args[]){
        try{
        Socket s = new Socket("localhost", 1234);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter   out = new PrintWriter(s.getOutputStream(),true);
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        String msg;
        while((msg = kb.readLine())!=null){
            out.println(msg);
            System.out.println(in.readLine());
        }
        s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}