package javaprograms;
class FirstA{
    void display(){
        System.out.println("hello");
    }
    int sum(int a,int b) {
        return a+b;
    }
}
class SecondA extends FirstA {
    void display2() {
        System.out.println("java program");
    }
    int sub(int c,int d) {
        return c-d;
    }
}
class ThirdA extends SecondA {
    void display3() {
        System.out.println("arrays");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        ThirdA t=new ThirdA();
        t.display();
        t.sub(2, 7);
    }

}



