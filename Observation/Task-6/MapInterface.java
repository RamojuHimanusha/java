package javacore;
import java.util.Map;
import java.util.LinkedHashMap;
public class MapInterfaces {
    public static void main(String[] args) {

        Map<Integer, String> m = new LinkedHashMap<Integer, String>();

        // 1. put()
        m.put(1, "Apple");
        m.put(2, "Banana");
        m.put(3, "Cherry");
        m.put(4, "Mango");
        System.out.println("Map: " + m);

        // 2. get()
        System.out.println("Get: " + m.get(2));

        // 3. remove()
        System.out.println("Removed: " + m.remove(3));
        System.out.println("After removal: " + m);

        // 4. containsKey()
        System.out.println("Contains Key: " + m.containsKey(1));

        // 5. containsValue()
        System.out.println("Contains Value: " + m.containsValue("Mango"));

        // 6. keySet()
        System.out.println("Keys: " + m.keySet());

        // 7. values()
        System.out.println("Values: " + m.values());

        // 8. entrySet()
        System.out.println("Entries: " + m.entrySet());

        // 9. size()
        System.out.println("Size: " + m.size());

        // 10. isEmpty()
        System.out.println("Is Empty: " + m.isEmpty());

        // 11. clear()
        m.clear();
        System.out.println("After Clear: " + m);
        System.out.println("Is Empty: " + m.isEmpty());
    }
}/*output
Map: {1=Apple, 2=Banana, 3=Cherry, 4=Mango}
Get: Banana
Removed: Cherry
After removal: {1=Apple, 2=Banana, 4=Mango}
Contains Key: true
Contains Value: true
Keys: [1, 2, 4]
Values: [Apple, Banana, Mango]
Entries: [1=Apple, 2=Banana, 4=Mango]
Size: 3
Is Empty: false
After Clear: {}
Is Empty: true*/
