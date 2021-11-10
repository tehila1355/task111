import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial term: ");
        int a1 = scanner.nextInt();
        System.out.println("Enter the difference: ");
        int d = scanner.nextInt();

        int n;
        do {
            System.out.println("Enter the positive number n of terms: ");
            n = scanner.nextInt();
        }while (n <= 0);

        arithmeticProgression(a1,d,n);

    }



    public static void arithmeticProgression (int a1 , int d , int n) {

        int[] set = new int[n];

        for (int i = 1; i < set.length; i++) {
            set [i] = (a1 + (i - 1) * d);
            System.out.print(set[i] + ", ");
        }

        System.out.println(a1 + (n - 1) * d);

    }

}
