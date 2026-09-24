package javacore;
import java.util.Deque;
import java.util.ArrayDeque;
public class DequeInterface {
    public static void main(String[] args) {

        Deque<Integer> d = new ArrayDeque<Integer>();

        // 1. addFirst()
        d.addFirst(20);

        // 2. addLast()
        d.addLast(30);
        System.out.println("Deque: " + d);

        // 3. offerFirst()
        d.offerFirst(10);

        // 4. offerLast()
        d.offerLast(40);
        System.out.println("After offer: " + d);

        // 5. removeFirst()
        System.out.println("Remove First: " + d.removeFirst());

        // 6. removeLast()
        System.out.println("Remove Last: " + d.removeLast());
        System.out.println("Deque: " + d);

        // 7. pollFirst()
        d.addFirst(10);
        System.out.println("Poll First: " + d.pollFirst());

        // 8. pollLast()
        d.addLast(40);
        System.out.println("Poll Last: " + d.pollLast());

        // 9. peekFirst()
        System.out.println("Peek First: " + d.peekFirst());

        // 10. peekLast()
        System.out.println("Peek Last: " + d.peekLast());

        System.out.println("Final Deque: " + d);
    }
}
/*output
Deque: [20, 30]
After offer: [10, 20, 30, 40]
Remove First: 10
Remove Last: 40
Deque: [20, 30]
Poll First: 10
Poll Last: 40
Peek First: 20
Peek Last: 30
Final Deque: [20, 30]
 */
