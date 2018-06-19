package week4;

import java.text.DecimalFormat;

public class Les {
    public static void main(String[] args) {
        double i = 0.589;

        DecimalFormat s =  new DecimalFormat("#,##0.00");

        String r = s.format(i);

        System.out.println(r);








    }
}
