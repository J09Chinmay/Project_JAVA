package OOPs;
class pen{
    String name;
    String color;
    int l;


    void print(){
        int size=(l*2)/4;
        System.out.println("Name of pen is "+name+". Color is "+color+". Size is "+size);
    }
    void printName(){
        System.out.println(this.name);
    }
}
public class FirstTry {
    public static void main(String[] args) {

    pen p1=new pen();
    p1.color="red";
    p1.name="Cm";
    p1.l=10;
    p1.print();
    p1.printName();

    pen p2=new pen();
    p2.color="rred";
    p2.name="MC";
    p2.l=20;
    p2.print();
    p2.printName();
    }
}
