package javaprograms;
class GetSet {
    int a;
    float b;
    char c;
    String s;

    public int getA() {

        return a;
    }
    public void setA(int a){
        this.a=a;
    }
    public float getB(){
        return b;
    }
    public void setB(float b){
        this.b=b;
    }
    public char getC(){
        return c;
    }
    public void setC(char c){
        this.c=c;
    }
    public String getS(){
        return s;
    }
    public void setS(String s){
        this.s=s;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        GetSet gs=new GetSet();
        gs.setS("ANUSHA");
        System.out.println("result"+(gs.getS()));

    }

}
