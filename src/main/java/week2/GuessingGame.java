package week2;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int max = 10;
        int min = 5;

                int randy = min + (int) (Math.random() * (max - min));
        System.out.println(randy);

        System.out.print("Please enter a number between " + min + " and " + max + " ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();




        int numberOfGuessesLeft = 2;
        boolean gewonnen = false;

        while (!gewonnen && numberOfGuessesLeft > 0){
            numberOfGuessesLeft--;

            if (number == randy){
            System.out.println("YESS"); break;
            }else{
                System.out.println("Try again");
                number = sc.nextInt();
            }

        }
        if (number != randy){
            System.out.println("GAME OVER");
        }
        System.out.println("Het random getal is " + randy);
    }
}