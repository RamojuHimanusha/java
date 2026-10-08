package javapractice;

import java.util.Collections;
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Mango");

        System.out.println("Hashtable: " + table);

        System.out.println("Value for key 2: " + table.get(2));

        table.remove(3);
        System.out.println("After remove: " + table);

        System.out.println("Contains key 1: " + table.containsKey(1));
        System.out.println("Contains value Apple: " + table.containsValue("Apple"));

        System.out.println("Keys: " + Collections.list(table.keys()));
        System.out.println("Values: " + Collections.list(table.elements()));

        System.out.println("Size: " + table.size());
        System.out.println("Is Empty: " + table.isEmpty());
    }
}/*Hashtable: {3=Mango, 2=Banana, 1=Apple}
Value for key 2: Banana
After remove: {2=Banana, 1=Apple}
Contains key 1: true
Contains value Apple: true
Keys: [2, 1]
Values: [Banana, Apple]
Size: 2
Is Empty: false
*/
