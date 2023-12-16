public class A {
    public static void main(String[] args) {
        int a[]=new int[5];
       a[1]=78;
       a[0]=3;

        for(int i=0;i<a.length;i++){
            a[i]=i+89;
            System.out.println(a[i]);
        }
    }
}