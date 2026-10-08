package javapractice;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("List: " + list);

        list.add(1, "Orange");
        System.out.println("After inserting: " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, "Grapes");
        System.out.println("After set: " + list);

        list.remove(1);
        System.out.println("After remove index 1: " + list);

        list.remove("Mango");
        System.out.println("After removing Mango: " + list);

        System.out.println("Contains Apple: " + list.contains("Apple"));
        System.out.println("Size: " + list.size());
        System.out.println("Is Empty: " + list.isEmpty());

        list.add("Apple");
        System.out.println("Index of Apple: " + list.indexOf("Apple"));
        System.out.println("Last Index of Apple: " + list.lastIndexOf("Apple"));

        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " + list);

        list.clear();
        System.out.println("After clear: " + list);
    }
}
/*List: [Apple, Banana, Mango]
After inserting: [Apple, Orange, Banana, Mango]
Element at index 2: Banana
After set: [Apple, Orange, Grapes, Mango]
After remove index 1: [Apple, Grapes, Mango]
After removing Mango: [Apple, Grapes]
Contains Apple: true
Size: 2
Is Empty: false
Index of Apple: 0
Last Index of Apple: 2
Sorted list: [Apple, Apple, Grapes]
After clear: []*/
