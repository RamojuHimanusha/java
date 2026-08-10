package javaprograms;
abstract class A3{
    int x=3;
    void addition() {
        int a=2,b=3;
        System.out.println("sum is:"+(a+b));
    }
    abstract void display();

    abstract void display2();
}
public class Abstraction extends A3 {
    void display() {
        System.out.println("body of display");
    }
    void display2() {
        int c=6,d=7;
        System.out.println("subtraction is:"+(c-d));
    }
    public static void main(String[] args) {
        Abstraction a=new Abstraction();
        a.display2();
        a.display();
        a.addition();

    }


}
