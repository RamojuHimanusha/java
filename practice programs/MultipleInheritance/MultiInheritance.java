package javaprograms;
interface M1{
    int x = 20;
    void display1();
}
interface M2{
    int y=10;
    void display2();
}
public class MultipleInheritance implements M1,M2 {
    @Override
public void display1() {
    System.out.println("hello");

}

    @Override
    public void display2() {
        System.out.println("bye");


    }

    public static void main() {


        MultipleInheritance m1 = new MultipleInheritance();
        System.out.println("result is:"+ M1.x);
      m1.display1();
    }
}

