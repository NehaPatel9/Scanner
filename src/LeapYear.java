import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Year should be four digit whole number only
        System.out.println("Enter a Calender Year");
        int CalenderYear = scanner.nextInt();
        //This are conditions for a Leap Year
        {
            //check year is Leap year or not
            if (CalenderYear % 4 == 0 && CalenderYear % 100 != 0 || CalenderYear % 400 == 0) {
                System.out.println(CalenderYear + " is Leap Year");
            } else {
                System.out.println(CalenderYear + " is common Year");
            }
        }
    }
}