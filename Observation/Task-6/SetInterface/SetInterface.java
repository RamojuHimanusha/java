package javacore;
import java.util.HashSet;
import java.util.Set;
public class SetInterface {
    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();

        // 1. add()
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(20); 
        System.out.println("Set: " + s);

        // 2. remove()
        s.remove(20);
        System.out.println("After removal: " + s);

        // 3. contains()
        System.out.println("Contains 10: " + s.contains(10));

        // 4. size()
        System.out.println("Size: " + s.size());

        // 5. isEmpty()
        System.out.println("Is empty: " + s.isEmpty());

        // 6. clear()
        s.clear();
        System.out.println("After clear: " + s);
        System.out.println("Is empty: " + s.isEmpty());
    }
/*output
  Set: [20, 10, 30]
After removal: [10, 30]
Contains 10: true
Size: 2
Is empty: false
After clear: []
Is empty: true
*/

