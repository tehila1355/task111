import java.util.Scanner;

public class Exercise3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter three numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();


        int min = Math.min(number1,Math.min(number2,number3));
        int max = Math.max(number1,Math.max(number2,number3));
        int mid = (number1 + number2 + number3) - (min+max);

        System.out.println("the order of the numbers is: " + max +", " +mid+", "+min);
    }
}


