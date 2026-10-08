package javapractice;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");

        System.out.println("LinkedHashSet: " + set);

        set.remove("Banana");
        System.out.println("After remove: " + set);

        System.out.println("Contains Apple: " + set.contains("Apple"));
        System.out.println("Size: " + set.size());

        set.clear();
        System.out.println("After clear: " + set);
    }
}/*LinkedHashSet: [Apple, Banana, Mango]
After remove: [Apple, Mango]
Contains Apple: true
Size: 2
After clear: []*/
