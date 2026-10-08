package javapractice;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "Mango");
        map.put(10, "Apple");
        map.put(50, "Orange");
        map.put(20, "Banana");
        map.put(40, "Grapes");

        System.out.println("TreeMap: " + map);

        System.out.println("Value for key 20: " + map.get(20));

        map.remove(30);
        System.out.println("After remove: " + map);

        System.out.println("Contains key 40: " + map.containsKey(40));
        System.out.println("Contains value Apple: " + map.containsValue("Apple"));

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        System.out.println("Higher than 20: " + map.higherKey(20));
        System.out.println("Lower than 40: " + map.lowerKey(40));

        System.out.println("Ceiling of 25: " + map.ceilingKey(25));
        System.out.println("Floor of 25: " + map.floorKey(25));

        System.out.println("Entries: " + map.entrySet());
    }
}/*TreeMap: {10=Apple, 20=Banana, 30=Mango, 40=Grapes, 50=Orange}
Value for key 20: Banana
After remove: {10=Apple, 20=Banana, 40=Grapes, 50=Orange}
Contains key 40: true
Contains value Apple: true
First Key: 10
Last Key: 50
Higher than 20: 40
Lower than 40: 20
Ceiling of 25: 40
Floor of 25: 20
Entries: [10=Apple, 20=Banana, 40=Grapes, 50=Orange]*/
