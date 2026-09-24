package javacore;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorInterfaces {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> it = list.listIterator();

        // 1. hasNext()
        System.out.println("Has Next: " + it.hasNext());

        // 2. next()
        System.out.println("Next: " + it.next());

        // 3. nextIndex()
        System.out.println("Next Index: " + it.nextIndex());

        // 4. hasPrevious()
        System.out.println("Has Previous: " + it.hasPrevious());

        // 5. previous()
        System.out.println("Previous: " + it.previous());

        // 6. previousIndex()
        System.out.println("Previous Index: " + it.previousIndex());

        // 7. set()
        it.set(15);
        System.out.println("After Set: " + list);

        // 8. add()
        it.add(25);
        System.out.println("After Add: " + list);

        // 9. remove()
        System.out.println("Next: " + it.next());
        it.remove();
        System.out.println("After Remove: " + list);
    }
}/*output
Has Next: true
Next: 10
Next Index: 1
Has Previous: true
Previous: 10
Previous Index: -1
After Set: [15, 20, 30]
After Add: [25, 15, 20, 30]
Next: 15
After Remove: [25, 20, 30]
*/
