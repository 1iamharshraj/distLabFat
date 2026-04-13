import java.io.*;
import java.net.*;
import java.util.*;

public class Server{
    public static void main(String args[])throws IOException{
        try{
        ServerSocket ss = new ServerSocket(1234);
        while(true){
        Socket s = ss.accept();


        new Thread(()->{
            try{
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter   out = new PrintWriter(s.getOutputStream(),true);
            String msg;
            while((msg = in.readLine())!=null){
                out.println(msg);
                System.out.println(msg);
            }
            }catch(IOException e){
                System.out.println("invalid input");
            }

        }).start();
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}