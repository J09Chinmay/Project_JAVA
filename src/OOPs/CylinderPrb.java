package OOPs;
class Cylinder{
   private int r;
    private int h;
    public Cylinder(int r,int h){
        this.r=r;
        this.h=h;
        System.out.println(r+"= is radius");
        System.out.println(h+"= is height");
    }
    public double surfaceArea(){
        return 2*Math.PI*r*r + Math.PI*2*r*h;
    }
    public double volume(){
        return Math.PI*r*h*r;
    }


}

public class CylinderPrb {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder(4,5);
//        c1.setRH(4,5);
        System.out.println(c1.surfaceArea()+"= area \n"+ c1.volume()+"= volume");
    }
}
