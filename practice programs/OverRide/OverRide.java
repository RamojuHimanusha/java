package javaprograms;
class A{
    void display1(){
        int b=5,n=5;
        System.out.println("sum is :"+(b+n));

    }
    int sum(int a,int b){
        return a+b;
    }
    void display(){
        System.out.println("hello");
    }
}
class B extends A {
  @override
    void display1(){
        int b=6,n=9;
        System.out.println("sum is:"+(b+n));
    }
  @override
    int sum(int a,int b,int c){
        return a+b+c;
    }
    void superclass(){
        super.display1();

    }
}
public class OverRide {
    public static void main(String[] args) {
        B b=new B();
        b.display1();
        int sum3= b.sum(1,2,3);
        System.out.println("sum is :"+sum3);
        b.superclass();
        int sum=b.sum(1,2);
        System.out.println("sum is:"+sum);
    }
}

