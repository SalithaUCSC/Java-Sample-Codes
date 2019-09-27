package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new LinkedList<>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();

        queue1.add(1);
        queue1.add(2);

        System.out.println(queue1);

        // more operations on queues
        for (int i = 1; i < 10; i++) {
            queue2.add(i);
        }
        System.out.println(queue2);
        System.out.println(queue2.peek());
        queue2.poll();
        System.out.println(queue2.peek());
    }
}
