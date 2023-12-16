package OOPs;

import java.util.Scanner;

class Person{
    int age;
    String name;
    String  Addr;
    public Person( int age,String name,String Addr){
        this.age=age;
        this.name=name;
        this.Addr=Addr;
    }
    public void pr(){
        System.out.println("------------------");
        System.out.println("Age is = "+age);
        System.out.println("Name is = "+name);
        System.out.println("Adders is = "+Addr);
        System.out.println("******************\n");
    }

}
public class PersonDetails {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        Person[] p=new Person[n];
        int age;
        String name;
        String adrs;
        for(int i=0;i<n;i++){
            System.out.print("Enter student "+(i+1)+" name= ");
            name=sc.next();
            sc.nextLine();
            System.out.print("Student's age=");
            age=sc.nextInt();
            sc.nextLine();
            System.out.print("Student's address=");
            adrs=sc.next();
            sc.nextLine();
            p[i]=new Person(age,name,adrs);
            if(i==n-1){
                break;
            }
            System.out.println("Enter next student's details");
        }
        for (int i = 0; i < n; i++) {
            p[i].pr();

        }

    }
}
