import java.util.Scanner;

public class Exercise5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int again;
        do {
            System.out.println("Enter the type of worker; 0= minor worker, 1= senior worker");
            int type = scanner.nextInt();
            System.out.println("Enter the number of working hours in the last month:");
            int workingHours = scanner.nextInt();
            System.out.println("Enter the number of days he reached his daily destination:");
            int dailyDestination = scanner.nextInt();

            System.out.println("The salary is: " + payment (workingHours, dailyDestination , type));

            System.out.println("If you want to calculate the salary of another employee, enter 1");
            again = scanner.nextInt();
        }

        while (again == 1);



    }


    public static int payment (int workingHours, int dailyDestination, int type) {
        int i = 1;

        if (type == 0){
            int salary0 = 50 * workingHours + 250 * dailyDestination;
            return salary0;
        }else if (type == 1){
            int salary1 = 200 * workingHours + 250 * dailyDestination;
            return salary1;
        }else{
            System.out.println("The numbers are incorrect.");
        }
        return i;

    }






}
