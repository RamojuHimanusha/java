package javapractice;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("LinkedHashMap: " + map);

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(1);
        System.out.println("After remove: " + map);

        System.out.println("Contains key 2: " + map.containsKey(2));

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());
    }
}/*LinkedHashMap: {1=Apple, 2=Banana, 3=Mango}
Value for key 2: Banana
After remove: {2=Banana, 3=Mango}
Contains key 2: true
Keys: [2, 3]
Values: [Banana, Mango]
Entries: [2=Banana, 3=Mango]
*/
