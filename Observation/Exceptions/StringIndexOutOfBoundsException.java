package javapractice;

public class StringException {
    public static void main(String[] args) {
        String str = "Hello";

        try {
            System.out.println("Accessing character from string");
            System.out.println(str.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(" String index is out of bounds");
        }
    }
}
/*output
Accessing character from string
 String index is out of bounds
 */
