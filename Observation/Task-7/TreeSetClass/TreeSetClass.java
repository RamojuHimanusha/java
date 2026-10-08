package javapractice;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(40);

        System.out.println("TreeSet: " + set);

        set.remove(20);
        System.out.println("After remove: " + set);

        System.out.println("Contains 30: " + set.contains(30));

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        System.out.println("Higher than 30: " + set.higher(30));
        System.out.println("Lower than 30: " + set.lower(30));

        System.out.println("Ceiling of 25: " + set.ceiling(25));
        System.out.println("Floor of 25: " + set.floor(25));

        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("Poll Last: " + set.pollLast());

        System.out.println("Final TreeSet: " + set);
    }
}/*TreeSet: [10, 20, 30, 40, 50]
After remove: [10, 30, 40, 50]
Contains 30: true
First: 10
Last: 50
Higher than 30: 40
Lower than 30: 10
Ceiling of 25: 30
Floor of 25: 10
Poll First: 10
Poll Last: 50
Final TreeSet: [30, 40]*/
