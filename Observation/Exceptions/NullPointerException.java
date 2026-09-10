package javapractice;

public class NullException {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("Finding string length");
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println(" String value is null");
        }
    }
}
/*output
Finding string length
 String value is null
 */
