import java.io.*;
import java.net.*;

public class sever{
	public static void main(String args[]){
		try{
			ServerSocket ss = new ServerSocket(1234);
			Socker s = ss.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out = new PrintWriter(s.getOutputStream(),true);

			String msg = in.readLine();
			System.out.println("Client: " + msg);


			s.close();
			ss.close();

			}
		catch(Exception e){
			System.out.println(e);
			}
	}
}
