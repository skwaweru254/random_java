
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random digit = new Random();
        Scanner reader = new Scanner(System.in);
        int number = digit.nextInt(1000);

        System.out.println("Guess a number!\n");
        int guess = reader.nextInt();
        System.out.println("You guessed number " + guess + "\n");
        if (guess == number) {
            System.out.println("Congratulations!");
        } else if (guess < number) {
            System.out.println("Your guess is smaller!\n");
        } else {
            System.out.println("You guess is bigger!\n");
        }
    }
}
