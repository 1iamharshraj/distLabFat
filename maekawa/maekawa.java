import java.util.*;

public class maekawa {

    static boolean locked = false;
    static Queue<Integer> queue = new LinkedList<>();

    static void request(int przocessId) {
        try {
            if (!locked) {
                locked = true;
                System.out.println("Process " + processId + " gets REPLY");
            } else {
                queue.add(processId);
                System.out.println("Process " + processId + " queued");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void release() {
        try {
            if (!queue.isEmpty()) {
                int next = queue.poll();
                System.out.println("Process " + next + " now gets REPLY");
            } else {
                locked = false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        try {
            request(1);
            request(2);
            release();
            release();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}