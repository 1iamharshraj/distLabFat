import java.io.*;
import java.net.*;
import java.util.*;


public class client{
    public static void main(String args[]){
        URL url = new URL("https://github.co.in");
        HttpURLConnection con = new (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getQuerry());
        System.out.println(url.getFile());

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String msg;
        while((msg=in.readLine())!=null){
            System.out.println(msg);
        }

        in.close();

    }
}