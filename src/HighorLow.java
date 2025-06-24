import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int randomNumber = generator.nextInt(10)+ 1;
        int guess = 0;
        String trash;
        boolean done = false;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();

                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Your guess must be between 1 and 10. Try again.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("Enter a valid integer between 1 and 10.");
            }
        } while (!done);

        System.out.println("The random number was: " + randomNumber);
        if (guess == randomNumber) {
            System.out.println("On the money!");
        } else if (guess < randomNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }
}
