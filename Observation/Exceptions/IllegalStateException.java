package javapractice;

public class IllegalState {

    public static void main(String[] args) {
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);

            sc.close();

            System.out.println(sc.nextLine());
        }
        catch (IllegalStateException e) {
            System.out.println(" Scanner is already closed");
        }
    }
}
/*output
Scanner is already closed
 */
