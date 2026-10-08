package javapractice;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.offer(10);
        queue.add(20);
        queue.add(5);

        System.out.println("PriorityQueue: " + queue);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);

        queue.remove(20);
        System.out.println("After remove 20: " + queue);

        System.out.println("Contains 30: " + queue.contains(30));
        System.out.println("Size: " + queue.size());
    }
}
/*PriorityQueue: [5, 10, 20, 30]
Peek: 5
Poll: 5
After poll: [10, 30, 20]
After remove 20: [10, 30]
Contains 30: true
Size: 2
