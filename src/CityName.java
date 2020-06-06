import java.util.Scanner;

public class CityName {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter City Character");
        String cityChar = scanner.next();
        if (cityChar.equals("A") || (cityChar.equals("a"))) {
            System.out.println("Aberdeen");
        } else if(cityChar.equals("B")  || (cityChar.equals("b")) ){
            System.out.println("Birmingham");
        } else if(cityChar.equals("C")  || (cityChar.equals("c")) ){
        System.out.println("Cambridge");
        } else if(cityChar.equals("D")  || (cityChar.equals("d")) ){
        System.out.println("Derby");
        } else if(cityChar.equals("E")  || (cityChar.equals("e")) ){
        System.out.println("Edinburgh");
        } else if(cityChar.equals("F")  || (cityChar.equals("f")) ){
        System.out.println("Farnborough");
        } else {
        System.out.println("Invalid Entry");
        }
    }
}

