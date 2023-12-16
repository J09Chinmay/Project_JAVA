package OOPs;
class Square{
    int side;
    public int area(){
        return (side*side);
    }
    public int perimeter(){
        return (4*side);
    }
}
class Rectangle{
    private int l;
   private int b;
   public Rectangle(int l,int b){
       this.l=l;
       this.b=b;
   }
    public int area(){
        return (l*b);
    }
    public int perimeter(){
        return (2*l+2*b);
    }

}
public class Geomatry {
    public static void main(String[] args) {
    Square s1=new Square();
    s1.side=9;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    Rectangle r1=new Rectangle(10,20);
//    r1.b=10;
//    r1.l=20;
        System.out.println(r1.area()+" "+r1.perimeter());
    }
}
