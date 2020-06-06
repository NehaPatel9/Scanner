import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter employee details
        System.out.println("Enter Employee ID");
        int empID = scanner.nextInt();
        System.out.println("Enter Employee Name");
        String empName = scanner.next();
        // on basis of basic salary HRA, TA,DA,PF will be calculated
        System.out.println("Enter Employee Basic Salary");
        double basicSalary = scanner.nextDouble();
        System.out.println("Employee ID:  "+empID);
        System.out.println("Employee Name: "+empName);
        System.out.println("Enter Employee Basic Salary: "+ basicSalary);

        if(basicSalary <= 0) { //check salary amount is right
            System.out.println("Please enter right amount");
        }else {
            // This is Human Resources Allowance
            double hra = (basicSalary * 10 / 100);
            System.out.println("HRA is 10% of Basic Salary " + hra);
            //This is Dearness Allowance
            double da = (basicSalary * 8 / 100);
            System.out.println("DA is 8% of Basic Salary " + da);
            // This is Travel Allowances
            double ta = (basicSalary * 9 / 100);
            System.out.println("TA is 9% of Basic Salary " + ta);
            //This is Provident Fund
            double pf = (basicSalary * 20 / 100);
            System.out.println("PF is 20% of Basic Salary " + pf);
            double grossSalary = ((basicSalary + hra + da + ta) - pf);
            System.out.println("Gross Salary is addition of Basic Salary + HRA + DA +TA -PF" + " = " + grossSalary);
        }
    }
}
