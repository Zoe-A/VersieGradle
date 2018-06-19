package week2;

public class FaculteitVerbetering {
    public static void main(String[] args) {
        int n = 5;
        int product = 1;

        while ( n > 1){
            product = product * n;
            n--;
            System.out.println("n: " + n + ", product: " + product);
        }
        System.out.println(product);
    }
}
