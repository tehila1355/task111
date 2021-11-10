import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int userInput = userInput();

        for (int i = 2; i <= userInput ; i++ ) {
            boolean isPrime = isPrime(i);

            if (isPrime) {
                System.out.print(i + "  ,");
            }
        }

    }



    public static boolean isDivisible(int number, int userInput) {
        boolean prime = true;

        if (userInput % number == 0) {
            prime = false;
        }

        return prime;

    }


    public static boolean isPrime(int userInput) {
        boolean prime;

        for (int i = 2; i < userInput; i++) {

            prime = isDivisible(i, userInput);
            if (!prime) {
                return false;
            }

        }

        return true;
    }


    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Enter a positive number: ");
            userInput = scanner.nextInt();
        }
        while (userInput <= 0);
        return userInput;
    }


}
