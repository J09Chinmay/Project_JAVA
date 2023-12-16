import java.io.DataInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {
//        System.out.println("hi");
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Which num:");
//        int x=sc.nextInt();
        DataInputStream d = new DataInputStream(System.in);
        int x;
        x=Integer.parseInt(d.readLine());

        System.out.println(x);
    }
}