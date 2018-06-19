import java.util.Scanner;

public class PrimeNumbersFOUT {
    public static void main(String[] args) {

        double number;
        int deler2 = 2;
        int deler3 = 3;

        System.out.println("Geef een getal om te checken of het een priemgetal is.");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number == 0){
            System.out.println(1);
        }else {
            if ( number % deler2 == 0 || number % deler3 == 0 ){
                System.out.println("Dit is geen priemgetal.");
            }else {
                System.out.println("Dit is een priemgetal.");
            }
        }
    }
}
