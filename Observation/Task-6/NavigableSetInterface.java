package javacore;
import java.util.NavigableSet;
import java.util.TreeSet;
public class NavigableSetInterface {
    public static void main(String[] args) {

        NavigableSet<Integer> s = new TreeSet<Integer>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        System.out.println("Navigable Set: " + s);

        // 1. lower()
        System.out.println("Lower: " + s.lower(30));

        // 2. floor()
        System.out.println("Floor: " + s.floor(30));

        // 3. ceiling()
        System.out.println("Ceiling: " + s.ceiling(30));

        // 4. higher()
        System.out.println("Higher: " + s.higher(30));

        // 5. pollFirst()
        System.out.println("Poll First: " + s.pollFirst());

        // 6. pollLast()
        System.out.println("Poll Last: " + s.pollLast());

        // 7. descendingSet()
        System.out.println("Descending Set: " + s.descendingSet());

        System.out.println("Final Set: " + s);
    }
}
/*output
Navigable Set: [10, 20, 30, 40, 50]
Lower: 20
Floor: 30
Ceiling: 30
Higher: 40
Poll First: 10
Poll Last: 50
Descending Set: [40, 30, 20]
Final Set: [20, 30, 40]

 */
