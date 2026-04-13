import java.io.*;
import java.net.*;

public class client{
    public static void main(String args[])throws Exception{
        Socket s = new Socket("localhost",1234);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);


        new Thread(()->{
            try{
                String msg;
                while((msg = in.readLine())!=null){
                    System.out.println("Server : " + msg );
                }

            }catch(Exception e){
                System.out.println(e);
            }

        }).start();

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        
        String msg;
        while((msg = kb.readLine()) != null){
            out.println(msg);
        }

        s.close();
    }
}