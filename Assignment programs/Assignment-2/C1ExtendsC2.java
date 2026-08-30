package javapractice;
class A1{
    int x=5;
    void display1(){
        System.out.println("this is superclass");
    }
    void area(){
        int side=3;
        System.out.println("area of square is:"+(side*side));
    }
}
class B1 extends A1{
    int y=27;
    void display2() {
        System.out.println("this is subclass");
    }
}

public class C1ExtendsC2  {
    public static void main(String[] args) {
        B1 b1=new B1();
                int result=b1.x+b1.y;
                System.out.println("result is:"+result);
                b1.display1();
        b1.display2();
    }

}
