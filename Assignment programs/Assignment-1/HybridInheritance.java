package javaprograms;
class Number {
    int a = 10, b = 5;

    void add() {
        System.out.println("Addition = " + (a + b));
    }
}

interface Math {
    void multiply();
}

class Calculate extends Number implements Math {
    public void multiply() {
        System.out.println("Multiplication = " + (a * b));
    }
}

class Result extends Calculate {
    void subtract() {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Result r = new Result();

        r.add();
        r.multiply();
        r.subtract();
    }

}/*Addition = 15
Multiplication = 50
Subtraction = 5*/
