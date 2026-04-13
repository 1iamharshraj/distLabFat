import java.net.*;
import java.io.*;

public class server{
    public static void main(String args[]){
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();

        BufferedReader in = new BufferReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        new Thread(()->{
            try{
                String msg;
                while((msg = in.readLine())!=null){
                    System.out.println("Client : " + msg );
                }

            }catch(Exception e){
                System.out.println(e);
            }

        }).start();

        BufferReader kb = new BufferReader(new InputStreamReader(System.in));
        
        String msg;
        while((msg = kb.readLine()) != null){
            out.println(msg);
        }

        ss.close();
        s.close();

    }
}