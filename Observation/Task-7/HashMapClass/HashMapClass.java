package javapractice;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("HashMap: " + map);

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(3);
        System.out.println("After remove: " + map);

        System.out.println("Contains key 1: " + map.containsKey(1));
        System.out.println("Contains value Apple: " + map.containsValue("Apple"));

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        System.out.println("Size: " + map.size());
        System.out.println("Is Empty: " + map.isEmpty());

        System.out.println("Key 10: " + map.getOrDefault(10, "Not Found"));

        map.clear();
        System.out.println("After clear: " + map);
    }
}/*HashMap: {1=Apple, 2=Banana, 3=Mango}
Value for key 2: Banana
After remove: {1=Apple, 2=Banana}
Contains key 1: true
Contains value Apple: true
Keys: [1, 2]
Values: [Apple, Banana]
Entries: [1=Apple, 2=Banana]
Size: 2
Is Empty: false
Key 10: Not Found
After clear: {}*/
