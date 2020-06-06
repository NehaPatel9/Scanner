import java.util.Scanner;

public class InterChange {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in );
        /*Please enter any two number which you want to
        print interchanged.*/
        System.out.println("Print First Number");
        int a = scanner.nextInt();
        System.out.println("Print Second Number");
        int b = scanner.nextInt();
        // Value of a will be printed at b's place and value of b will be printed at a's place

        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("This is Second Number " + a);
        System.out.println("This is First Number " + b);
    }

}
