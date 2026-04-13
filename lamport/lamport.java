import java.util.*;

public class lamport {

    static int clock = 0;

    static PriorityQueue<Integer> queue = new PriorityQueue<>();

    static void request(int processId) {
        try {
            clock++;
            queue.add(clock);

            System.out.println("Process " + processId +
                    " requests CS at time " + clock);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void enterCS(int processId) {
        try {
            if (!queue.isEmpty()) {
                int top = queue.peek();

                System.out.println("Process " + processId +
                        " enters CS at time " + top);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void release(int processId) {
        try {
            queue.poll();

            System.out.println("Process " + processId +
                    " releases CS");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        try {
            request(1);
            request(2);

            enterCS(1);
            release(1);

            enterCS(2);
            release(2);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}