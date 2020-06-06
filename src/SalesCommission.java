import java.util.Scanner;

public class SalesCommission {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter Sales ID");
        int id = scanner.nextInt();
        System.out.println("Enter Sellers Name ");
        String name = scanner.next();
        System.out.println("Enter Sales Amount");
        double salesAmount= scanner.nextDouble();
        System.out.println("Enter Basic Salary");
        double basicSalary= scanner.nextDouble();

        System.out.println("Sales ID:  "+ id);
        System.out.println("Sellers Name: " + name);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: "+ basicSalary);

        if (salesAmount >= 50000){
            System.out.println("Commission = " + salesAmount*35/100);
        } else if (salesAmount >= 30000){
            System.out.println("Commission = " + salesAmount*20/100);
        } else if (salesAmount >= 20000){
            System.out.println("Commission = " + salesAmount*10/100);
        } else if (salesAmount >= 10000){
            System.out.println("Commission = " + salesAmount*5/100);
        } else if (salesAmount < 10000){
            System.out.println("Commission = " + salesAmount*2/100);
        }
    }
}

