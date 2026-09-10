package javapractice;

public class NegativeArray {
    public static void main(String[] args) {
        try {
            System.out.println("Creating array");
            int arr[] = new int[-5];
        }
        catch (NegativeArraySizeException e) {
            System.out.println(" Array size cannot be negative");
        }
    }
}
/*output
Creating array
 Array size cannot be negative
 */
