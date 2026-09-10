package javapractice;

public class CastException {
    public static void main(String[] args) {
        Object obj = "Hello";

        try {
            System.out.println("Converting object into Integer");
            Integer num = (Integer) obj;
            System.out.println(num);
        }
        catch (ClassCastException e) {
            System.out.println("Invalid type casting");
        }
    }
}
/*output
Converting object into Integer
Invalid type casting
 */
