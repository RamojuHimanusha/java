package javacore;
import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMapInterfaces  {
    public static void main(String[] args) {

        NavigableMap<Integer, String> m =
                new TreeMap<Integer, String>();

        m.put(10, "Apple");
        m.put(20, "Banana");
        m.put(30, "Cherry");
        m.put(40, "Mango");
        m.put(50, "Grapes");

        System.out.println("Navigable Map: " + m);

        // 1. lowerKey()
        System.out.println("Lower Key: " + m.lowerKey(30));

        // 2. floorKey()
        System.out.println("Floor Key: " + m.floorKey(30));

        // 3. ceilingKey()
        System.out.println("Ceiling Key: " + m.ceilingKey(30));

        // 4. higherKey()
        System.out.println("Higher Key: " + m.higherKey(30));

        // 5. firstEntry()
        System.out.println("First Entry: " + m.firstEntry());

        // 6. lastEntry()
        System.out.println("Last Entry: " + m.lastEntry());

        // 7. pollFirstEntry()
        System.out.println("Poll First: " + m.pollFirstEntry());

        // 8. pollLastEntry()
        System.out.println("Poll Last: " + m.pollLastEntry());

        System.out.println("Final Map: " + m);
    }
}/*output
Navigable Map: {10=Apple, 20=Banana, 30=Cherry, 40=Mango, 50=Grapes}
Lower Key: 20
Floor Key: 30
Ceiling Key: 30
Higher Key: 40
First Entry: 10=Apple
Last Entry: 50=Grapes
Poll First: 10=Apple
Poll Last: 50=Grapes
Final Map: {20=Banana, 30=Cherry, 40=Mango}*/
