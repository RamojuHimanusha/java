package javapractice;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("Banana");
        deque.addLast("Mango");

        System.out.println("Deque: " + deque);

        deque.offerFirst("Apple");
        deque.offerLast("Orange");

        System.out.println("After offerFirst/offerLast: " + deque);

        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());

        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        System.out.println("Final Deque: " + deque);
    }
}/*Deque: [Banana, Mango]
After offerFirst/offerLast: [Apple, Banana, Mango, Orange]
Poll First: Apple
Poll Last: Orange
Peek First: Banana
Peek Last: Mango
Final Deque: [Banana, Mango]
*/
