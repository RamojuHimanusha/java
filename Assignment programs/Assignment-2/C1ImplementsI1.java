package javapractice;
interface I1 {
    int x=65;
    void add();
}

class C1 implements I1 {
    int a = 10, b = 5;

    @Override
    public void add() {
        System.out.println("Addition = " + (a + b));
    }


    public static void main(String[] args) {
        C1 c = new C1();
        c.add();
        System.out.println(c.x);
    }
}
