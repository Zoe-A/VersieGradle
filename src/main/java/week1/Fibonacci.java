public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int aantal = 20;

        for (int teller = 1; teller<= aantal; teller++) {

            System.out.print(x + " ");
            System.out.print(y + " ");

            x = y + x;
            y = x + y;


        }

    }
}
