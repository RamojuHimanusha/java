package javapractice;

interface I2 {
    void add();
}

interface I1 extends I2 {
    void sub();
}

class C1 implements I1 {
    int a = 10, b = 5;
@Override
    public void add() {
        System.out.println("Addition = " + (a + b));
    }
@Override
    public void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    public static void main(String[] args) {
        C1 c = new C1();
        c.add();
        c.sub();
    }
}
