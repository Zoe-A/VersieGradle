package week2;

import java.util.Scanner;

public class Faculteit {
    public static void main(String[] args) {

    int n ;

    System.out.print("Geef een getal waarvan je de faculteit wil berekenen. ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    long result = n;
    long verm = n - 1;

    while (0 < verm){
         result = result*verm;
         verm--;
    }

    System.out.println("De faculteit van "+ n + " is "+ result);

    /* als result en verm gedefinieerd ald double dan eindigd uitkomst op "8E9". Waarom?
    Wetenschappelijke notatie E9 = 10^9. Double geeft een kommagetal tot een tiende macht.

    De format van een uitkomst forceren:
    System.out.format("result% f,s);

    Floaty numbers geen goed idee voor berekeningen in loop. Kleine afrondingsfouten worden elke loop uitvergroot.
    Overflowissues oplossen met floaties is overflowissues vervangen door afrondings issues.*/

    }
}
