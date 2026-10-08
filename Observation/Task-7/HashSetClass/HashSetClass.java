package javapractice;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");

        System.out.println("HashSet: " + set);

        set.remove("Banana");
        System.out.println("After remove: " + set);

        System.out.println("Contains Apple: " + set.contains("Apple"));
        System.out.println("Size: " + set.size());
        System.out.println("Is Empty: " + set.isEmpty());

        set.clear();
        System.out.println("After clear: " + set);
    }
}/*HashSet: [Apple, Mango, Banana]
After remove: [Apple, Mango]
Contains Apple: true
Size: 2
Is Empty: false
After clear: []
*/
