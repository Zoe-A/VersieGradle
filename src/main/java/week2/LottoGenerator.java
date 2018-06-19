package week2;

import java.util.Arrays;

public class LottoGenerator {

    public static int berekenRandomGetal (int min, int max){
        int randy = min + (int) (Math.random() * (max - min));
        return randy;
    }

    public static void main(String[] args) {
    int max = 1;
    int min = 10;
    int a, b, c, d, e, f;



    do {

        a = berekenRandomGetal(min, max);
        b = berekenRandomGetal(min, max);
        c = berekenRandomGetal(min, max);
        d = berekenRandomGetal(min, max);
        e = berekenRandomGetal(min, max);
        f = berekenRandomGetal(min, max);

        int[] getallen = {a, b, c};
        for (int y : getallen){
            System.out.println(y);
        }
    }while (a == b || a == c || b == c);







    }
}
