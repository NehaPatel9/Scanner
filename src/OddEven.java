import java.util.Scanner;

public class OddEven {
    //This programme is for Ternary Operator
        public static void main (String []args){
            Scanner scanner = new Scanner(System.in);

            //Check first value entered is Odd or even
            System.out.println("Please enter first number");
            int number1 = scanner.nextInt();
            String result1 = (number1%2 == 0) ? "This is even number" : "This is odd number";
            System.out.println(result1);

            //Check first value entered is Odd or even
            System.out.println("Please enter second number");
            int number2 = scanner.nextInt();
            String result2 = (number2%2 == 0) ? "This is even number" : "This is odd number";
            System.out.println(result2);
        }
    }
