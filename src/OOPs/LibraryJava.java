package OOPs;

import java.util.ArrayList;
import java.util.Scanner;

class Library{
//    String[] libBooks=new String[100];
    public ArrayList<String>libBooks=new ArrayList<>();

    String isBook;
    int nBooks=0;
    Scanner sc =new Scanner(System.in);
    void menu(){
        int op;
        System.out.println("1. Add book  \b 2. Show Available Books \n3.Issue book  \b4.Return book");
        System.out.println("Enter Option Number : ");
        op=sc.nextInt();
        if(op==1){
            ask();
        } else if (op==2) {
           showAvailableBooks();
        }
        else if (op==3) {
            issueBook();
        }
        else
            System.out.println("Wrong Option");
//        return or exit .;;.
        System.out.println("1.Back to Option \b 0.Exit");
        int n;
        n=sc.nextInt();
        if(n==1){
            menu();
        }
        else
            System.out.println("Thank you");
    }
    void addBooks(String book){
        this.libBooks.add(book);
        nBooks++;

    }
    void ask(){
        String book;
        int n;
        System.out.print("Enter Number of Books Want to Add");
        n=sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter book name: ");
            book=sc.nextLine();
            addBooks(book);
            if(n==1) {
                System.out.println("Your book is Added....");
            }
            else if(i==n){
                System.out.println(n+" number of books are added..");
            }
        }
    }
    void showAvailableBooks(){
        System.out.println("*************************");
        System.out.println("Available Books Are");
        for (int i = 0; i < this.libBooks.size(); i++) {
            if(this.libBooks.get(i)==null){
                continue;
            }
            System.out.println("*"+this.libBooks.get(i));
        }
        System.out.println("*************************");
    }
    void issueBook(){
        System.out.print("Number of Books to be Issued ");
        int ib=sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < ib; i++) {
            System.out.print("Book "+(i+1)+" name= ");
            this.isBook=sc.nextLine();
            if(check()){
                System.out.println("Book Added");
            }
            else {
                System.out.println("Not found");
            }

        }

    }
    boolean check(){
        for (int j = 0; j < this.libBooks.size(); j++) {
           if(this.libBooks.contains(isBook)){
               this.libBooks.remove(isBook);
               return true;
           }

        }
        return false;
    }


}
public class LibraryJava {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBook
//        Scanner sc= new Scanner(System.in);
        Library lb =new Library();
        lb.menu();

    }
}






















