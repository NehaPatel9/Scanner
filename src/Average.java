import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Average of Five Numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int num2 = scanner.nextInt();
        System.out.println("Enter Third Number");
        int num3 = scanner.nextInt();
        System.out.println("Enter Fourth Number");
        int num4 = scanner.nextInt();
        System.out.println("Enter Fifth Number");
        int num5 = scanner.nextInt();
        //This is Average of all Five numbers entered
        int average = ((num1 +num2+num3+num4+num5)/5);
        /*This condition is to use If - else condition
        otherwise zero can be taken if really required*/
        if (num1 != 0 || num2 != 0 || num3 != 0 || num4 != 0 || num5 != 0){
            System.out.println("This is invalid number");
        } else
            System.out.println("Average of Total Number =  " + average);
    }
}