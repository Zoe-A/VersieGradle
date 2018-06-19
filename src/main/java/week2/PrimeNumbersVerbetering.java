package week2;

public class PrimeNumbersVerbetering {
    public static void main(String[] args) {
        int n = 13;
        int kandidaat = 2;
        boolean isPriem = true;

        while (kandidaat < n){
            int r = n % kandidaat;
            if (r == 0) {
                isPriem = false;
            }
            kandidaat++;
        }
        if (isPriem){
            System.out.println("PRIEM");
        }else{
            System.out.println("NIET PRIEM");
        }
    }
}

/* Werkt, maar inefficient. Vb kleine optimalisatie: (kandidaat < n/2) */