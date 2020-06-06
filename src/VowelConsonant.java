import java.util.Scanner;
// Enter any value and the find out if it is Vowel or Consonant, depending on the user input.
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User can enter any alphabet from A to Z
        System.out.println("Please enter a character");
        String character = scanner.next();

        if (character.equals("A") || character.equals("E") || character.equals("I") || character.equals("O") || character.equals("U")) {
            System.out.println("This is Vowel");
            } else if (character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u")) {
                System.out.println("This is Vowel");
            } else System.out.println("This is Consonant");
            }
        }

