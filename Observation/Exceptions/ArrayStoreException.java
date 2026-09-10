package javapractice;

public class StoreException {
    public static void main(String[] args) {
        Object arr[] = new String[2];

        try {
            System.out.println("Storing value in array");
            arr[0] = 100;
        }
        catch (ArrayStoreException e) {
            System.out.println(" Wrong type of value stored in array");
        }
    }
}
/*output
Storing value in array
 Wrong type of value stored in array
 */
