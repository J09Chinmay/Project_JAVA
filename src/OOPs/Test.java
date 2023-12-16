package OOPs;
abstract class A{
    void display(){
        System.out.println("Hoo");
    }
}
class B extends A {
    void disp2(){
        System.out.println("hioo");
    }
}
public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.disp2();
        b.display();
    }
}
