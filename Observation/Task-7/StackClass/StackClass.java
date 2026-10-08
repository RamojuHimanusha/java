package javapractice;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");

        System.out.println("Stack: " + stack);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        System.out.println("Is stack empty: " + stack.empty());

        stack.push("Orange");

        System.out.println("Position of Apple: " + stack.search("Apple"));
    }
}/*Stack: [Apple, Banana, Mango]
Top element: Mango
Popped element: Mango
Stack after pop: [Apple, Banana]
Is stack empty: false
Position of Apple: 3
*/
