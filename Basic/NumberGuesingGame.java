import java.util.Scanner;
import java.util.Random; //Helps you generate a random Number

public class NumberGuesingGame {
  public static void main(String[] args) {

    Random random = new Random();

    int randNum = random.nextInt(100) + 1;
    int Guess = 0;

    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        System.out.println("Guess a number(1 - 100): ");
        int GuessNum = sc.nextInt();

        if (GuessNum > randNum) {
          System.out.println("Go Lower");
          Guess++;
        } else {
          System.out.println("Go Higher");
          Guess++;
        }

        if (GuessNum > 100 || GuessNum < 1) {
          System.out.println("Invalid Number");
        }

        if (randNum == GuessNum) {
          System.out.println("You got it right!!");
          System.out.println("Guess Count: " + Guess);
          break;
        }
      }
    }
  }
}