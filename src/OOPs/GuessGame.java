package OOPs;

import java.util.Random;
import java.util.Scanner;

class Gamee{
    public int gNum;
    public int input;
    public int noOfGuess=0;

    Gamee(){
        Random rd =new Random();
        this.gNum= rd.nextInt(50,80);
    }
    void takeInput(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Guess the number = ");
        input=sc.nextInt();
    }
    boolean isCorrect(){
        noOfGuess++;
        if(input==gNum){
            System.out.println("Guess correct in "+noOfGuess+" times");
            return true;
        } else if (input<gNum) {
            System.out.println("Low Guess");
        } else {
            System.out.println("High Guess");
        }
        return false;
    }
}
public class GuessGame {
    public static void main(String[] args) {
  /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */
        Gamee g=new Gamee();

        boolean b=false;
        while (!b){
            g.takeInput();
            b=g.isCorrect();
        }
    }
}
