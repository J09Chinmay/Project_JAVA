public class APp {

        public static void main(String[] args) {
            X Ob=new X();
            Thread t=new Thread(Ob);
            t.start();
            System.out.println("the end");
        }

}
class X implements Runnable{
public void run(){
   for(int i=1;i<=10;i++){
       System.out.println(i);
   }
    System.out.println("End Thread");
}
}
