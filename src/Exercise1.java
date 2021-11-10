import java.util.Scanner;

public class Exercise1 {

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            if (number<0) {
                number = number * (-1);
            }
            System.out.println("The absolute value of the number is: " + number);
        }

}
