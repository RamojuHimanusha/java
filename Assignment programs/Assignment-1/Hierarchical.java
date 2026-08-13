package javaprograms;
class Calculator {
    int a = 10, b = 5;
}

class Add extends Calculator {
    void add() {
        System.out.println("Addition = " + (a + b));
    }
}

class Subtract extends Calculator {
    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Add x = new Add();
        Subtract y = new Subtract();

        x.add();
        y.sub();
    }
}
/*Addition = 15
Subtraction = 5*/
