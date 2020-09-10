import java.util.Random;
import java.util.Scanner;

public class GuessGameChallenge {
    public static void main(String[] args) {

        System.out.println("please input your name:");

        // receive the user's name
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();

        // say some greeting to user
        System.out.println("Hello " + username);

        // ask for start the game
        System.out.println("Do you want to play? Please inout Yes or No");

        String askUser = scanner.next();

        if (askUser.equalsIgnoreCase("yes")) {

            Random random = new Random();
            int x = random.nextInt(20) + 1; // from 1 to 20
            System.out.println("The random number is " + x);

            // make a random number and save in an integer called X
            System.out.println("Please enter a number between 1 to 20");
            int inputedNum = scanner.nextInt();

            int timesTried = 0;
            boolean hasWon = false;
            boolean shouldFinish = false;

            while (!shouldFinish) {
                if (timesTried >= 4) {
                    shouldFinish = true;
                    hasWon = false;
                    continue;
                }
                if (inputedNum < x) {
                    System.out.println("Please guess higher");
                    inputedNum = scanner.nextInt();
                    timesTried++;
                } else if (inputedNum == x) {
                    System.out.println("Congradulation You WIN");
                    hasWon = true;
                    shouldFinish = true;
                } else {
                    System.out.println("Guess lower");
                    inputedNum = scanner.nextInt();
                    timesTried++;
                }
            }

            if (hasWon) {
                System.out.println("Congratulation, You have guessed the number in " + timesTried + " time");
            } else {
                System.out.println("Game Over");
                System.out.println("the number was " + x);
            }

        } else {
            return;
        }

    }
}
