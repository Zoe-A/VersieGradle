
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        System.out.print("Wat is je naam? ");

        Scanner nameScanner = new Scanner(System.in);
        String nameString = nameScanner.next();

        System.out.println("Hello "+ nameString);

        int leeftijd;
        int jaar = 2018;

        System.out.println("In welk jaar ben jij geboren?");
        Scanner zaza = new Scanner(System.in);
        int geboortejaar = zaza.nextInt();

        leeftijd = jaar - geboortejaar;
        System.out.println("Jij bent nu " + leeftijd);
    }
}
