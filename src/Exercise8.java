import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int number = selectANumber();
        printStars(number);
    }


    public static int selectANumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number in this range 5=<x=>20");
            number = scanner.nextInt();
        }
        while (number < 5 || number > 20);

        return number;
    }



    public static void printStars(int number) {

        for (int i = 0; i < number; i++){
            for (int j = 0; j < i ;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
