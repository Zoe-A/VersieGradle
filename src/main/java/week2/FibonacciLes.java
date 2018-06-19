package week2;

public class FibonacciLes {
    public static void main(String[] args) {

        int n = 30;
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 0; i <= n; i++) {
            int som = a + b;
            System.out.print(som + " ");
            a = b;
            b = som;
        }


    }
}
