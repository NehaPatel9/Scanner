import java.util.Scanner;
// This is to confirm your voting eligibility
public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        // you are eligible only if you are at age of 18 or above 18
        if (age < 18) {
            System.out.println("You are NOT eligible for vote ");
        } else {
            System.out.println("You are eligible for vote ");
        }
    }
}