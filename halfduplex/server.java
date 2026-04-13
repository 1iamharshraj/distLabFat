import java.io.*;
import java.net.*;


public class server{
    public static void main(String args[]){
       try{
       ServerSocket ss = new ServerSocket(1234);
       Socket s = ss.accept();

       BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
       PrintWriter out = new PrintWriter(s.getOutputStream(),true);

       String msg = in.readLine();
       System.out.println("Client: " + msg);

       out.println("Hello Client");

       ss.close();
       s.close();
       }catch(Exception e){
        System.out.println(e);
       }
    }
}