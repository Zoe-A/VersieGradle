package week4.megacalc3000plus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MegaCalc3000Plus {

    public static int userInput(){
        boolean check = true;
        int a = 1;

        while (check) try {
            Scanner sc = new Scanner(System.in);
            System.out.println("geef getal");
            a = sc.nextInt();
            check = false;

        } catch (InputMismatchException e) {
            System.out.println("geen geldige waarde");

        }
        return a;

    }

    public static String userBewerking(){
        boolean check = true;
        String bewerking = "foutje";

        while (check) try {
            Scanner sc = new Scanner(System.in);
            System.out.println("geef bewerking");

            BewerkingenEnum.valueOf(bewerking);

            check = false;

        } catch (InputMismatchException e) {
            System.out.println("geen geldige bewerking");

        }
        return bewerking;

    }


    public static void main(String[] args) {

        int a = userInput();
        int b = userInput();

        String bewerking = userBewerking();

        System.out.println(bewerking);












    }

}
