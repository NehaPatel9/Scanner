import java.util.Scanner;

public class MarkSheet {

        //This is Student mark sheet

        public static void main (String [] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = scanner.next();

            System.out.println("Please enter your roll number: ");
            int rollnum = scanner.nextInt();

            System.out.println("Please enter your maths marks: ");
            int maths = scanner.nextInt();

            System.out.println("Please enter your English marks: ");
            int eng = scanner.nextInt();

            System.out.println("Please enter your Science marks: ");
            int sci = scanner.nextInt();
            System.out.println("Name of Student: " + name);
            System.out.println("Roll Number: "+ rollnum);
            System.out.println("Marks scored in Maths" + maths);
            System.out.println("Marks scored in English" + eng);
            System.out.println("Marks scored in Science " + sci);
            // This is total of marks gained in each subjects.
            int total = maths + eng +sci;
            //This is overall percentage
            double percentage = total/3;
            System.out.println("Total marks = " + total);
            System.out.println("Percentage = " + percentage);
            if (percentage <35){
                System.out.println("fail");
            }
            else if(percentage >= 35 && percentage <50) {
                System.out.println("C grade");
            }
            else if(percentage >= 50 && percentage <60) {
                System.out.println("B grade");
            }
            else if(percentage >= 60 && percentage <80) {
                System.out.println("A grade");
            }

            else if(percentage >= 80 && percentage <=100) {
                System.out.println("A+ grade");
            }
            else {
                System.out.println("Invalid entry");

            }
        }
    }
