import java.util.Scanner;

public class Exercise4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        double a = scanner.nextInt();
        System.out.println("Enter b");
        double b = scanner.nextInt();
        System.out.println("Enter c");
        double c = scanner.nextInt();
        double delta = ((Math.pow(b,2) - 4 * a * c));

        if (delta < 0) {
            System.out.println("No solution was found for the quadratic equation.");

        }else if (delta > 0) {
            System.out.println("Two solutions to the equation were found:");
            System.out.println("x1= "+ (-b + Math.sqrt(delta)) / 2 * a);
            System.out.println("x2= "+ (-b - Math.sqrt(delta)) / 2 * a);


        }else{
            System.out.println("Only one solution was found:");
            System.out.println("x= " + -b / 2 * a);

        }




    }
}

