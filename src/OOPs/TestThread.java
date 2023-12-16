package OOPs;
public class TestThread {
   public static void main(String[] args) {
Demo o =new Demo();
       Thread t=new Thread(o,"1st");
       Thread t2=new Thread(o,"2nd");
       t.start();
       t2.start();
    }
}
class Demo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        Thread.yield();
        System.out.println(Thread.currentThread());
    }
}
