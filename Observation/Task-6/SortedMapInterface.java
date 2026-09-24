import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
    public static void main(String[] args) {

        SortedMap<Integer, String> m =
                new TreeMap<Integer, String>();

        m.put(10, "Apple");
        m.put(20, "Banana");
        m.put(30, "Cherry");
        m.put(40, "Mango");
        m.put(50, "Grapes");

        System.out.println("Sorted Map: " + m);

        // 1. firstKey()
        System.out.println("First Key: " + m.firstKey());

        // 2. lastKey()
        System.out.println("Last Key: " + m.lastKey());

        // 3. headMap()
        System.out.println("Head Map: " + m.headMap(30));

        // 4. tailMap()
        System.out.println("Tail Map: " + m.tailMap(30));

        // 5. subMap()
        System.out.println("Sub Map: " + m.subMap(20, 50));

        // 6. comparator()
        System.out.println("Comparator: " + m.comparator());
    }
}
/*output
  Sorted Map: {10=Apple, 20=Banana, 30=Cherry, 40=Mango, 50=Grapes}
First Key: 10
Last Key: 50
Head Map: {10=Apple, 20=Banana}
Tail Map: {30=Cherry, 40=Mango, 50=Grapes}
Sub Map: {20=Banana, 30=Cherry, 40=Mango}
Comparator: null*/
