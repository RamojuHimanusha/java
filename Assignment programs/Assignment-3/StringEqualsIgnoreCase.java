package javapractice;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "java program";
        String s2 = "JAVA PROGRAM";

        System.out.println("Equal = " + s1.equalsIgnoreCase(s2));
    }
}
/*OUTPUT
Equal = true*/
