package javapractice;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");
        System.out.println("Vector: " + vector);

        vector.addElement("Orange");
        System.out.println("After addElement: " + vector);

        System.out.println("Element at index 1: " + vector.get(1));

        vector.set(1, "Grapes");
        System.out.println("After set: " + vector);

        vector.remove(0);
        System.out.println("After remove: " + vector);

        vector.removeElement("Mango");
        System.out.println("After removeElement: " + vector);

        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Contains Orange: " + vector.contains("Orange"));
    }
}/*Vector: [Apple, Banana, Mango]
After addElement: [Apple, Banana, Mango, Orange]
Element at index 1: Banana
After set: [Apple, Grapes, Mango, Orange]
After remove: [Grapes, Mango, Orange]
After removeElement: [Grapes, Orange]
Size: 2
Capacity: 10
Contains Orange: true
*/
