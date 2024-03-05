import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int dice1 = 0;
        int dice2 = 0;
        int sum = 0;
        int point = 0;
        String playAgain;
        boolean done = false;

        do {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            sum = dice1 + dice2;
            System.out.println("Rolling the dice...");
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
            if (sum == 7 || sum == 11 ) {
                System.out.println("You won with a natural! ");
                done = true;
            }
            else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You crapped out!");
                done = true;
            }
            else {
                point = sum;
                System.out.println("Your point is " + point);
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = in.nextLine();

            if (playAgain.equalsIgnoreCase("Y")) {
                done = false;
            }
            else {
                done = true;
                System.out.println("Thanks for playing!");
            }
        } while (!done);
    }
}