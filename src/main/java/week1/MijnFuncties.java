import java.text.DecimalFormat;
import java.util.Scanner;

public class MijnFuncties {
    public static void main(String[] args) {
        double a = 1;
        int b = 2;

        double berekening = a / b;

        /*System.out.println(Math.round(berekening));*/

        DecimalFormat f = new DecimalFormat("#0.00" );
        System.out.println(f.format(berekening));



        String myString = "Dit is een lange tekst die hier alleen maar staat om oefeningen op te maken.";
        String myString2 = "Dit is een lange tekst " +
                "die hier alleen maar staat om oefeningen op te maken.";

        System.out.println(myString);
        System.out.println(myString2);

        System.out.println(myString.toUpperCase());

        System.out.println(myString.substring(53, 61));




        }


    }
