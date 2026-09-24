package javacore;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionInterface {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();

        // add(E e)
        c.add("Apple");
        c.add("Banana");
        c.add("Mango");

        System.out.println("Collection: " + c);

        // addAll(Collection c)
        Collection<String> c2 = new ArrayList<>();
        c2.add("Orange");
        c2.add("Grapes");

        c.addAll(c2);
        System.out.println("After addAll: " + c);

        // contains(Object o)
        System.out.println("Contains Mango: " + c.contains("Mango"));

        // containsAll(Collection c)
        System.out.println("Contains all c2: " + c.containsAll(c2));

        // size()
        System.out.println("Size: " + c.size());

        // isEmpty()
        System.out.println("Is Empty: " + c.isEmpty());

        // remove(Object o)
        c.remove("Banana");
        System.out.println("After remove Banana: " + c);

        // removeAll(Collection c)
        c.removeAll(c2);
        System.out.println("After removeAll: " + c);

        // iterator()
        System.out.println("Using Iterator:");
        Iterator<String> it = c.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // clear()
        c.clear();
        System.out.println("After clear: " + c);

        // isEmpty() after clear
        System.out.println("Is Empty: " + c.isEmpty());
    }
}
