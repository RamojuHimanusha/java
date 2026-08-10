package javaprograms;
class first {
    int x = 25;

    void display() {
        int a = 4, b = 5;
        System.out.println("sum is :" + (a + b));
    }

    int sub(int c, int d) {
        return c - d;
    }
}
    class Second{
        void display2(){
             int side=26;
             int area=side*side;
             System.out.println("area os square is:"+area);
        }
        void display3(){
            System.out.println("second class");
        }
    }


public class MutipleClass {
    public static void main() {
        first f=new first();
        f.display();
       int res= f.sub(2,6);
       System.out.println("result is :"+res);
        Second s=new Second();
        s.display2();
        s.display3();
    }
}
