import java.util.Scanner;
/* You can do Addition/Subtraction/
multiplication and division of any two number
 */

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Number");
        int num1 = scanner.nextInt();
        System.out.println("Please Enter Second Number");
        int num2 = scanner.nextInt();
        // Enter Arithmetic symbol as per your requirement
        System.out.println("Please Enter Arithmetic Symbol from + , - ,*, / ");
        String symbol = scanner.next();
        System.out.println("Symbol" + symbol);
        int result=0;
        if (symbol.equals("+")) {
            result = num1 + num2;
            System.out.println("This is addition of: " + num1 + " and " + num2 + " = " + result);
        } else if (symbol.equals("-")) {
                result = num1 - num2;
                System.out.println("This is Subtraction of: " + num1 + " and " + num2 + " = " + result);
        } else if (symbol.equals("*")) {
                    result = num1 * num2;
                    System.out.println("This is multiplication  of: " + num1 + " and " + num2 + " = " + result);
        } else if (symbol.equals("/")) {
                        result = num1 / num2;
                        System.out.println("This is division of: " + num1 + " and " + num2 + " = " + result);
        }
    }
}
