package javaprograms;
public class Constructor {
    int rollno;
    float marks;
    String name;
    public Constructor(String n,int b,float c){
        this.name=n;
        this.rollno=b;
        this.marks=c;
    }
    void display(){
        System.out.println("hello");
        System.out.println("the rollno is:"+rollno);
        System.out.println("the nameis:"+name);
        System.out.println("marks is:"+marks);
    }
    public static void main() {
        Constructor c=new Constructor("priya",109,250);
        c.display();

    }
}


