package javacore;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;
public class ListInterface {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        // 1. add(E e)
        names.add("Anu");
        names.add("Riya");
        names.add("Anu");
        names.add("Kiran");

        System.out.println("After add(): " + names);

        // 2. add(int index, E element)
        names.add(1, "Rahul");

        System.out.println("After add(index, element): " + names);

        // 3. get(int index)
        System.out.println("Element at index 2: " + names.get(2));

        // 4. set(int index, E element)
        names.set(2, "Priya");

        System.out.println("After set(): " + names);

        // 5. remove(int index)
        names.remove(1);

        System.out.println("After remove(): " + names);

        // 6. indexOf(Object o)
        System.out.println("First index of Anu: " + names.indexOf("Anu"));

        // 7. lastIndexOf(Object o)
        System.out.println("Last index of Anu: " + names.lastIndexOf("Anu"));

        // 8. subList(int fromIndex, int toIndex)
        List<String> sub = names.subList(1, 3);

        System.out.println("SubList: " + sub);

        // 9. sort(Comparator)
        names.sort(null);

        System.out.println("After sort(): " + names);
    }
/*output
  After add(): [Anu, Riya, Anu, Kiran]
After add(index, element): [Anu, Rahul, Riya, Anu, Kiran]
Element at index 2: Riya
After set(): [Anu, Rahul, Priya, Anu, Kiran]
After remove(): [Anu, Priya, Anu, Kiran]
First index of Anu: 0
Last index of Anu: 2
SubList: [Priya, Anu]
After sort(): [Anu, Anu, Kiran, Priya]*/
  
}
