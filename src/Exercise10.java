import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(1000)+1;
        System.out.println(secretNumber);

        int counter = 1;
        boolean player1;
        boolean player2;

        while (true){
            System.out.println("Player 1 please guess the secret number: ");
            int player1Guess = scanner.nextInt();
            player1 = guessChecking(secretNumber,player1Guess);
            if (player1){
                break;
            }
            System.out.println("Player 2 please guess the secret number: ");
            int player2Guess = scanner.nextInt();
            player2 = guessChecking(secretNumber,player2Guess);
            if (player2){
                break;
            }
            counter++;

        }

        if (player1){
            System.out.println("Congrats! player 1 is the winner with " + counter +" tryings");
        } else {
            System.out.println("Congrats! player 2 in the winner with " + counter + " tryings");
        }


    }public static boolean guessChecking (int secretNumber , int playerGuess){
        boolean guess = true;
        if (playerGuess > secretNumber){
            guess = false;
            System.out.println("your number is grater");
        }
        else if (playerGuess < secretNumber){
            guess = false;
            System.out.println("your number is lower");
        }
        return guess;
    }
}