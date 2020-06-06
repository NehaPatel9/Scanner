import java.util.Scanner;

public class PassOverall {

        //This is Student mark sheet

        public static void main (String [] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = scanner.next();

            System.out.println("Please enter your roll number: ");
            int rollnum = scanner.nextInt();

            // enter marks obtained in each subject
            System.out.println("Please enter your maths marks: ");
            int maths = scanner.nextInt();
            System.out.println("Please enter your English marks: ");
            int eng = scanner.nextInt();
            System.out.println("Please enter your Science marks: ");
            int sci = scanner.nextInt();
            int total = maths + eng +sci;
            double percentage = total/3;
            System.out.println("Name of Student: " + name);
            System.out.println("Roll Number: "+ rollnum);
            System.out.println("Marks scored in Maths" + maths);
            System.out.println("Marks scored in English" + eng);
            System.out.println("Marks scored in Science " + sci);
            System.out.println("Total marks = " + total);
            System.out.println("Percentage = " + percentage);
            /* If a student score below 35 marks in any subject his
               overall result will be fail.
             */
            if (percentage <35 || maths<35 || eng<35 || sci <35){
                System.out.println("fail");
            } else if(percentage >= 35 && percentage <50) {
                System.out.println("C grade");
            } else if(percentage >= 50 && percentage <60) {
                System.out.println("B grade");
            } else if(percentage >= 60 && percentage <80) {
                System.out.println("A grade");
            } else if(percentage >= 80 && percentage <=100) {
                System.out.println("A+ grade");
                // any marks entered above 100 will not be considered for calculation
            } else {
                System.out.println("Invalid entry");
            }
        }
}
