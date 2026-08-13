package javaprograms;
class First{
    int a=2;
    void sum()
    {
        System.out.println("sum is:"+(a+5));
    }
}
class Second1 extends First {
    int b=3;
    void display(){

        System.out.println("sum is:"+(b+8));
    }

    public static void main() {
        Second1 s=new Second1();
        s.display();
        s.sum();
        System.out.println("variable is:"+s.a);

    }
}
/*sum is:11
sum is:7
variable is:2*/
