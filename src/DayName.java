import java.util.Scanner;

public class DayName {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        //Please enter a number within 1 to 7 only
        System.out.println("Enter a Number to print day name");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else { // if user enter any number other than 1 to 7 below message will display
        System.out.println("Please enter number within 1 to 7");
        }
    }
}
