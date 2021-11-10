import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What day are you interested in arriving?");
        int day = scanner.nextInt();


        if (day < 8 && day > 0) {
            if (day != 6 && day != 7) {

                System.out.println("What is the earliest hour you can arrive? ");
                int earlyHour = scanner.nextInt();
                System.out.println("What is the latest hour you can arrive? ");
                int latestHour = scanner.nextInt();

                if (earlyHour >= 0 && earlyHour <= 23 && latestHour >= 0 && latestHour <= 23) {
                    if (earlyHour < latestHour) {
                        if (day == 3){
                            if (earlyHour >= 8 && earlyHour <= 12 && latestHour <= 12) {
                                System.out.println("You appointment has set:)");
                            }else {
                                System.out.println("The office hours on tuesday are 8:00-12:00");

                            }
                        }


                        if (day == 1 || day == 2 || day == 4 || day == 5) {
                                if (earlyHour >= 9 && earlyHour <= 17 &&  latestHour <= 17) {
                                    System.out.println("your appointment has set:)");
                                }else{
                                    System.out.println("The office hours on this day are 9:00-17:00");
                                }

                        }






                    }else{
                        System.out.println("The latest hour needs to be less than early hour.");
                    }



                }else{
                    System.out.println("The hour you chose is not correct.");
                }


            }else{
                System.out.println("We are closed at weekends.");
            }


        }else{
            System.out.println("The day you chose isn't existed.");
        }


    }
}
