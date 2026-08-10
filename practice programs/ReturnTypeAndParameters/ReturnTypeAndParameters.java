package javaprograms;
class A1 {
    int x = 20;

    int squareroot(int a) {
        return a * a;
    }

    void sum() {
        int a = 24, b = 45;
        System.out.println("sum is" + (a + b));
    }
}
    class B1{
        int y=10;
        void display(){
            int c=30;
            int d = 45;
            System.out.println("sub is:"+(c-d));
        }
    }
public class ReturnTypeAndParameters {
    public static void main() {
        A1 a=new A1();
        System.out.println(a.x);
        int res=a.squareroot(5);
        System.out.println("res is :"+res);
        a.sum();
        B1 b=new B1();
        b.display();
    }
}

