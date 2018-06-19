package week2;

public class CalculatePi {
    public static void main(String[] args) {

        long limit = 10;
        int teken = 1;
        double som  = 0;

        for (int i = 1; i <= limit; i += 2 ){
            double term = 1.0 / i * teken;

            teken *= -1;
            /* teken = -teken;*/

            som += term;


        }
        double pi = 4 * som;
        System.out.println(pi);





    }

}
