package javacore;
import java.util.Queue;
import java.util.LinkedList;
public class QueueInterface {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<Integer>();

        // 1. add()
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Queue: " + q);

        // 2. offer()
        q.offer(40);
        System.out.println("After offer: " + q);

        // 3. remove()
        System.out.println("Removed: " + q.remove());
        System.out.println("Queue: " + q);

        // 4. poll()
        System.out.println("Polled: " + q.poll());
        System.out.println("Queue: " + q);

        // 5. element()
        System.out.println("Element: " + q.element());

        // 6. peek()
        System.out.println("Peek: " + q.peek());

        System.out.println("Final Queue: " + q);
    }
}/*output
Queue: [10, 20, 30]
After offer: [10, 20, 30, 40]
Removed: 10
Queue: [20, 30, 40]
Polled: 20
Queue: [30, 40]
Element: 30
Peek: 30
Final Queue: [30, 40]
*/
