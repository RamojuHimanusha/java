package javacore;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
    public static void main(String[] args) {

        SortedSet<Integer> s = new TreeSet<Integer>();

        s.add(40);
        s.add(10);
        s.add(50);
        s.add(20);
        s.add(30);

        System.out.println("Sorted Set: " + s);

        // 1. first()
        System.out.println("First: " + s.first());

        // 2. last()
        System.out.println("Last: " + s.last());

        // 3. headSet()
        System.out.println("Head Set: " + s.headSet(30));

        // 4. tailSet()
        System.out.println("Tail Set: " + s.tailSet(30));

        // 5. subSet()
        System.out.println("Sub Set: " + s.subSet(20, 50));

        // 6. comparator()
        System.out.println("Comparator: " + s.comparator());
    }
}
/*output
Sorted Set: [10, 20, 30, 40, 50]
First: 10
Last: 50
Head Set: [10, 20]
Tail Set: [30, 40, 50]
Sub Set: [20, 30, 40]
Comparator: null
 */
