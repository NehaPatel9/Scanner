import java.util.Scanner;

public class CheckNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        //if you enter zero it will print The Entered Number is Zero
        if (number==0){
            System.out.println("The Entered Number is Zero");
        }
        //if you enter any number greater than zero it will print The Entered Number is Zero
        else if (number >=1){
            System.out.println("The Entered Number is Positive");
         //if you enter any number less than zero it will print The Entered Number is Zero
        } else {
            System.out.println("The Entered Number is Negative");
        }
    }
}
