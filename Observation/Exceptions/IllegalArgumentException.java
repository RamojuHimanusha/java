package javapractice;
public class ArgumentException {
    public static void main(String[] args) {

        Thread thread = new Thread();

        try {
            System.out.println("Setting thread priority");

            thread.setPriority(15);

            System.out.println("Priority set successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Program ended.");
        }
    }
}
/*output
Setting thread priority
Program ended.
 */
