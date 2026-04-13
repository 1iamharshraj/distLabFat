import java.io.*;
import java.net.*;


public class client{
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost",1234);

            //Stream setup
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            out.println("hello server");

            s.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}