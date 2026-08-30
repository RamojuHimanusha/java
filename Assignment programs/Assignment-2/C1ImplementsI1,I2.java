package javapractice;
interface I1 {
    void add();
}

interface I2 {
    void mul();
}

class C1 implements I1, I2 {
    int a = 20, b = 5;
@Override
    public void add() {
        System.out.println("Addition = " + (a + b));
    }
@Override
    public void mul() {
        System.out.println("Multiplication = " + (a * b));
    }
}

    public static void main(String[] args) {
        C1 c = new C1();
        c.add();
        c.mul();
    }

