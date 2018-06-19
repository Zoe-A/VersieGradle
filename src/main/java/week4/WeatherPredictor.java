package week4;

import java.util.Scanner;

public class WeatherPredictor {

    public static void main(String[] args) {
        System.out.println("Geef de maand aub.");
        Scanner sc = new Scanner(System.in);

        String month = sc.next();

        Months x = Months.valueOf(month.toUpperCase());
        System.out.println("gemregen :  " + x.getGemRegen());
        System.out.println("gemzon : " + x.getGemZon());



    }
}
