import java.rmi.*;

public class client {
    public static void main(String[] args) {

        try {
            Calc obj = (Calc) Naming.lookup("rmi://localhost/CalcService");

            int result = obj.add(5, 3);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}