package javapractice;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("List: " + list);

        list.addFirst("Orange");
        list.addLast("Grapes");
        System.out.println("After addFirst/addLast: " + list);

        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.remove(1);
        System.out.println("After remove index 1: " + list);

        list.remove("Mango");
        System.out.println("After removing Mango: " + list);

        System.out.println("Removed first: " + list.removeFirst());
        System.out.println("Removed last: " + list.removeLast());

        list.offer("Pineapple");
        System.out.println("After offer: " + list);

        System.out.println("Poll: " + list.poll());
        System.out.println("Peek: " + list.peek());

        System.out.println("Final list: " + list);
    }
}/*List: [Apple, Banana, Mango]
After addFirst/addLast: [Orange, Apple, Banana, Mango, Grapes]
Element at index 2: Banana
First element: Orange
Last element: Grapes
After remove index 1: [Orange, Banana, Mango, Grapes]
After removing Mango: [Orange, Banana, Grapes]
Removed first: Orange
Removed last: Grapes
After offer: [Banana, Pineapple]
Poll: Banana
Peek: Pineapple
Final list: [Pineapple]
*/
