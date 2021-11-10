import java.util.Scanner;

public class Exercise2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        sum = sum % 2;
        if (sum == 0) {
            System.out.println("The sum is even.");
        }else {
            System.out.println("The sum is odd.");
        }

    }
}






